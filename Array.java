package tests;

public class Array {
	
	public static void main (String[] args){
		
		String[] s = {"Java is", " a good", " language"};
		
		int[] num = new int[3];
		int[][] twodim = {{5,50},{4,40},{3,30},{2,20},{0},{9,90,900},{}};
		int[][] twodim2 = new int[1][1];
		
		s[1] = " the best";
		num[0] = 100;
		num[1] = 200;
		
		System.out.println("the length of the string array is " + s.length);
		System.out.println("the length of the int array is " + num.length);
		System.out.println("the length of the int array twodim is " + twodim.length);
		
	//	System.out.println(s[0] + s[1] + s[2]);
	//	System.out.println(num[0] + ", " + num[1] + ", " + num[2]);
		System.out.println(twodim[6]);
		
	}

}
