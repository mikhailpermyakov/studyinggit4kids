package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamR {
	public static void main(String[] args) throws IOException {
		
		/**InputStreamReader isr = new InputStreamReader(System.in);
		
		while (true){
			
			int symb = isr.read();
			System.out.println((char)symb);
		}/**/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true){
			int stroka = reader.read();
			System.out.print((char)stroka);
		}
		
	}

}
