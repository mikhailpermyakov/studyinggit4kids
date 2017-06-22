package tests;

import java.io.* ;


public class ListFiles {
	
	public static void main(String[] arg){
		
		File dir = new File( "E:\\GoogleDisk\\java\\coursera\\workspace\\ooj\\src\\tests" ) ;
		if ( dir.exists() )
		{
		String[] files = dir.list() ;
		System.out.println( files.length + " файлов найдено..." ) ;
		for ( int i = 0 ; i < files.length ; i++ )
		{
		System.out.println( files[i] ) ;
		}
		}
		else
		{ System.out.println( "Каталог не найден." ) ;}
	}

}
