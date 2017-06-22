package tests;

public class Conditions {
	
	
	public static void main (String[] args){
		int n1 = 1234;
		int n2 = 9921;
		
		String result;
		
		result = (n1 %2 ==0) ? "Even" : "Odd";
		System.out.println(n1 + " is " + result);
		
		result = (n2 %2 ==0) ? "Even" : "Odd";
		System.out.println(n2 + " is " + result);
	}

}
