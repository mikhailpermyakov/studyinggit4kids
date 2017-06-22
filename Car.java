/**
*new comment 1
*new comment 2
**/
package tests;

public class Car {
	
	private String maker ;
	private String color ;
	private String bodyType ;
	
	public Car()
	{
	maker = "Porsche" ;
	color = "Серебристый" ;
	bodyType = "Купе" ;
	}

	private String accelerate()
	{
	String motion = "Ускоряется..." ;
	return motion ;
	}
	
	public void setCar( String brand , String paint , String style )
	{
	maker = brand ;
	color = paint ;
	bodyType = style ;
	}
	
	public void getCar()
	{
	System.out.println( maker + " цвет " + color ) ;
	System.out.println( maker + " тип кузова " + bodyType ) ;
	System.out.println( maker + " " + accelerate() + "\n" ) ;
	}
	
}
