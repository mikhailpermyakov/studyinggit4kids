package tests;

public class Convert {

	
	
		public static void main ( String[] args ) { 
			
			float daysFloat = 365.25f ;
			String weeksString = "52" ;
			
			int daysInt = (int) daysFloat ;
			int weeksInt = Integer.parseInt( weeksString ) ;
			
			int week = ( daysInt / weeksInt ) ;
			System.out.println( "Дней в неделе: " + week ) ;
			
			String fs = Float.toString(daysFloat);
			
			System.out.println(fs);
			
			float ffs = Float.parseFloat(fs);
			
			System.out.println(ffs * 2);
			
		}
		
}
