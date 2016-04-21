package vending;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RunMachine {
		
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the DNG Vending Machine! Here are the items for sale!");
		String cont="y";
		do{
		ProductIO.readfromFile();
		System.out.println("Would you like to learn more about these items(1) or purchase an item(2)");
		int input = 0;
		input = Validator.getValidInt1(1, 2);
					
		switch (input)
		{
			case 1:			
				try (BufferedReader br = new BufferedReader(new FileReader("ItemDescriptionFile"))) {
					   String line = null;
					   while ((line = br.readLine()) != null) {
					       System.out.println(line);
					       
					   }
					   
					}				
				break;
		
		    case 2:
		    	
		    	
		    	break;
		    	
		    }
		
		System.out.println("Would you like to continue shopping? (y/n)");
		cont = sc.next();
		}
		
		while (cont.equalsIgnoreCase("y"));
		
		System.out.println("Bye Felicia!!!!!!!!!!!");
		sc.close();
	}
}
	
	/*private static char[] PrintWriter(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/