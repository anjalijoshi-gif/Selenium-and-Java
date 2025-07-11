
public class DifferentWayTowriteStrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cString is object // String literal
		
		String aa1 = "Java Selenium testing";
		
		String aa2 = "Java Selenium testing";
		
		//new 
		String str = new String("Hello");

		
		String s = "Anjali QA Automation";
		String[] splittedString = s.split("QA");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for(int i = 0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
