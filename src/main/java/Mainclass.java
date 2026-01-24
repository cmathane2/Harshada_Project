import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public 
class Mainclass {

	public static void main(String[] args) {
		
		LunchTheBowser browser = new LunchTheBowser();
		//browser.Lunchbrowers();//
		StringClass str = new StringClass();
		str.stringmethod1();
		browser.print();
		StringClass obj = new StringClass();
		obj.method2();
		Inheritance obj2 = new Inheritance();
		obj2.method1();
		
		ClassNew obj3 = new ClassNew();
		
		}

}

