package vending;

import java.util.*;

public class Validator {
	static Scanner s = new Scanner (System.in);
	 
		public static String get_String(String prompt) {
	    String s = "";
	    boolean isValid = false;
	    Scanner sc = new Scanner(System.in);
	    while (!isValid){ // loops until user enters a non-blank line

	    System.out.print(prompt);
	    s = sc.nextLine();
	    if (!s.equals(""))
	    isValid = true;
	}

	    return s;

	}
	       
	public static String getString(String prompt)
    {

            String s = null;
            boolean isValid = false;
            while (!isValid)

       {
            s = get_String(prompt);
            if (s.compareTo("Y") == 0 || s.compareTo("y") == 0 || s.compareTo("N") == 0 || s.compareTo("n") == 0)
            isValid = true;
            else
            System.out.println("\nError! Entry must be 'y' or 'n'. Try again.");
       }

            return s;
     }
	//pick one of the 9 products
	public static int getValidNumberInRange (int min, int max)
	{
		int input = s.nextInt();
		while (input <1 || input > 9)
		{
			System.out.println("Please put a number within range!");
			input = s.nextInt();
			s.nextLine();
		}
		
		return input;
		}
	//would you like to buy(1) or learn more about an item (2)
	public static int getValidNumberInRange1 (int min, int max)
	{
		int input = s.nextInt();
		while (input <1 || input > 2)
		{
			System.out.println("Please enter either 1 or 2!");
			input = s.nextInt();
			s.nextLine();
		}
		
		return input;
		}	
	}

