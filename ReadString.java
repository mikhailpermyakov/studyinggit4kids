package tests;

import java.io.* ;

public class ReadString {
	
	public static void main( String[] args ) { 
		
		
		System.out.print( "������� �������� ������ �����: " ) ;
		
		
		InputStreamReader isr =
				new InputStreamReader( System.in ) ;
		
		BufferedReader buffer = new BufferedReader( isr ) ;
		String input = "" ;
		
		try
		{
		input = buffer.readLine() ;
		buffer.close() ;
		}
		catch ( IOException e )
		{
		System.out.println( "��������� ������ �����" ) ;
		}
		
		
		System.out.println( "\n�������, �� ������� " + input ) ;
	}

}
