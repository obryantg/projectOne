package vending;
import java.text.DecimalFormat;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.Scanner;

public class RunMachine {
		
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the DNG Vending Machine! Here are the items for sale!");
		String cont="y";
		do{
			System.out.println("Items:"
					 + "\n1. Kamel's 'so easy' chews"
					 + "\n2. Damien's down under suprise"
					 + "\n3. Kim's 'hyped up' energy bar"
					 + "\n4. Grand Circus peanuts"
					 + "\n5. Aaron's Big Dawg Bar"
					 + "\n6. Broderick Tower Bites"
					 + "\n7. Greg's Honey Bun"
					 + "\n8. B'Nastee's Red Hat"
					 + "\n9. Bubble Gum");
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
		    	System.out.println("Enter the number of the item you want to purcahse!(1-9)");
		    	input= sc.nextInt();
		    	sc.nextLine();
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
	
/*   CALCULATE CHANGE
DecimalFormat df = new DecimalFormat("####0.00");
double itemPrice = .95; // set price to see if calculations work
System.out.println ("You owe $" + df.format(itemPrice)+".");
System.out.println ("This machine only accepts $1 bills. Enter payment amount:");
double dollar = sc.nextDouble();
double change = dollar - itemPrice;
System.out.println("Your change is: " + df.format(change)+ " cents");


*/



	/*private static char[] PrintWriter(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/