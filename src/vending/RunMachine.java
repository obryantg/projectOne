package vending;

import java.util.Scanner;

public class RunMachine {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the DNG Vending Machine would here are the items for sale!");
		ProductIO.readfromFile();
		System.out.println("Would you like to learm more about these items(1) or purcahse an item(2)");
		int input = 0;
		input = Validator.getValidInt1(1, 2);
		sc.nextLine();
		
		switch (input)
		{
			case 1:			
				System.out.println("this is where the itemDescriptionFile should go");
				break;
		
		    case 2:
		    	
		    	
		    	break;
		    	
		    }
		
		
		
		sc.close();
	}

}
