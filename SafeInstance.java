package tests;

public class SafeInstance {
	
	public static void main(String[] args){
		
		CarIncaps Porsche = new CarIncaps() ;
		Porsche.setCar( "Porsche" , "�������" , "����" ) ;
		Porsche.getCar() ;
		
		CarIncaps Bentley = new CarIncaps() ;
		Bentley.setCar( "Bentley" , "�������" , "�����" ) ; 
		Bentley.getCar() ;
		
	}

}
