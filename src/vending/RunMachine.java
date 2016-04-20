package vending;

import java.util.Scanner;

public class RunMachine {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the DNG Vending Machine would here are the items for sale!");
		ProductIO.readfromFile();
		System.out.println("Would you like to buy item(1) or learn more about an item(2)");
		int input = 0;
		input = sc.nextInt();
		sc.nextLine();
		
		switch (input)
		{
			case 1:			
				
				break;
		
		    case 2:
		    	
		    	
		    	break;
		    	
		    }
		
		
		
		sc.close();
	}

}
