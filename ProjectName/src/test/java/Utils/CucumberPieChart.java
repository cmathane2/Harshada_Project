package Utils;

import java.io.File;
import java.io.FileReader;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartUtils;
import org.jfree.data.general.DefaultPieDataset;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CucumberPieChart {

    public static String generateChart() {
        String jsonFile = "target/cucumber.json";
        int passed = 0, failed = 0, skipped = 0;

        try {
            JSONParser parser = new JSONParser();
            JSONArray arr = (JSONArray) parser.parse(new FileReader(jsonFile));

            for (Object feature : arr) {
                JSONArray elements = (JSONArray) ((JSONObject) feature).get("elements");

                for (Object scenarioObj : elements) {
                    JSONObject scenario = (JSONObject) scenarioObj;
                    JSONArray steps = (JSONArray) scenario.get("steps");

                    boolean failedFlag = false;
                    boolean skippedFlag = false;

                    for (Object stepObj : steps) {
                        JSONObject step = (JSONObject) stepObj;
                        JSONObject result = (JSONObject) step.get("result");
                        String status = (String) result.get("status");

                        if ("failed".equals(status)) {
                            failedFlag = true;
                            break;
                        }
                        if ("skipped".equals(status)) {
                            skippedFlag = true;
                        }
                    }

                    if (failedFlag) failed++;
                    else if (skippedFlag) skipped++;
                    else passed++;
                }
            }

            // 👇 Ensure folder exists
            String outputDir = "target/reports";
            new File(outputDir).mkdirs();

            // Create dataset
            DefaultPieDataset dataset = new DefaultPieDataset();
            dataset.setValue("Passed", passed);
            dataset.setValue("Failed", failed);
            dataset.setValue("Skipped", skipped);

            // Create chart
            JFreeChart chart = ChartFactory.createPieChart(
                    "Cucumber Test Results",
                    dataset,
                    true,
                    true,
                    false
            );

            // Save chart
            String output = outputDir + "/cucumber-pie-chart.png";
            ChartUtils.saveChartAsPNG(new File(output), chart, 600, 400);

            return output;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
