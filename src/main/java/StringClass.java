
public class StringClass extends Inheritance

{
	@Override
	public int methodoverlaoding(int a, int b)
	{
		int c=a+b;
		return a ;
	}
	@Override
	public int methodoverlaoding(int a, int b,int c)
	{
		  c=a+b;
		return c ;
	}
	
	
	public void Stringmethod2() 
	{
		System.out.println("Chetan");
	}
	public void Stringmethod3() 
	
	{
		System.out.println("Harshada");
		
	}
	public void stringmethod1() {
	String st1 = "This World is Very Nice";
	  String st2 = " And Beautiful.";
	  
	  //Comparing two strings. Return true If both match else return false.
	  System.out.println("st1 equals to st2? -> "+st1.equals(st2));
	  
	  //Concatenates st2 with st1.
	  System.out.println("Concatenation of st1 and st2 Is -> "+st1.concat(st2));
	  
	  //Retrieve the 9th Indexed character from string.
	  System.out.println("Character at Index 9 Is -> "+st1.charAt(9));
	  
	  //Find the length of string.
	  System.out.println("Length Of St1 -> "+st1.length());
	  
	  //Converting whole string In lower case.
	  System.out.println("String In Lowercase -> "+st1.toLowerCase());
	  
	  //Converting whole string In upper case.
	  System.out.println("String In uppercase -> "+st1.toUpperCase());
	  
	  //Retrieve the Index of first 'i' character.
	  System.out.println("Index of 1st charater i Is -> "+st1.indexOf('i'));
	  
	  //Retrieve the index of 2nd most 'i' character.
	  System.out.println("Index of 2nd charater i Is -> "+st1.indexOf('i', 3));
	  
	  //Retrieve the Index of word 'Very' from string.
	  System.out.println("Index of word Very Is -> "+st1.indexOf("Very"));
	  
	  //Converting value From int to string.
	  int j = 75;
	  String val2 = String.valueOf(j);
	  System.out.println("Value Of string val2 Is -> "+val2);
	  
	  //Converting string to integer.
	  String val1="50";
	  int i = Integer.parseInt(val1);
	  System.out.println("Value Of int i Is -> "+i);
	  
	  //Print the String starting from 5th Index to 12th Index.
	  System.out.println("Retrieving sub string from string -> "+st1.substring(5, 13));
	  
	  //Split string. 
	  String splt[] = st1.split("Very");
	  System.out.println("String Part 1 Is -> "+splt[0]);
	  System.out.println("String Part 2 Is -> "+splt[1]); 

	                //Trim String.
	  System.out.println("Trimmed st2 -> "+st2.trim()); 
	 }
}

/*		If you will look at above example, I have prepared different examples of string method to take some action or we can say operations on string. Sort explanation of all above string methods are as bellow.
	Two String Comparison
	To compare two strings, we can use syntax like st1.equals(st2). It will return True If both strings are same else It will return False.
	Two String Concatenation
	Syntax st1.concat(st2) will concatenate st1 with st2.
	Retrieving Character from Index
	Syntax st1.charAt(9)) will retrieve the character from string st1 located at 9th Index. Index Starts from 0.
	Length Of String
	st1.length() will return lenght of string st1.
	Convert String In Lower Case Letters
	st1.toLowerCase() will convert whole string letters In lower case.
	Convert String In UpperCase Letters
	st1.toUpperCase() will convert whole string letters In upper case.
	Retrieving Index Of 1st most character
	st1.indexOf(‘i’) will retrieve Index of first most character ‘i’ from string.
	Retrieving Index Of 2nd most character
	st1.indexOf(‘i’, 3)) will retrieve Index of second most character ‘i’ from string. 3 described the from Index means It will start finding character ‘i’ from Index 3. First ‘i’ has Index 2 so we need to use 3 to find 2nd most character.
	Retrieving Index Of specific word from string
	st1.indexOf(“Very”) will retrieve index of word ‘Very’ from string.
	Convert from Integer To String
	String.valueOf(j) will convert value of ‘j’ from int to string.
	Convert from String To Integer
	Integer.parseInt(val1) will conver value of ‘val1’ from string to int.
	Retrieving sub string from string
	Syntax st1.substring(5, 13) will retrieve string from Index 5 To Index 13.
	Split String
	String splt[] = st1.split(“Very”) will split string st1 from word ‘Very’ and store both strings In array.
	Trim String
	If string has white space at beginning or end of the string then you can use trim function like st2.trim() to remove that white space.


*/