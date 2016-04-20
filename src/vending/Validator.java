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
	
	
public static int readValidInt() {
	while (!s.hasNextInt()) {
		s.nextLine();
		System.out.print("Please make a valid selection! Enter a number: ");
	}
	int x = s.nextInt();
	s.nextLine();
	return x;
}
// item selection 9 options
public static int getValidInt(int min, int max) {
	int input = readValidInt();
	while (input < min || input > max) {
		System.out.print("Please put a number within range! (1-9): ");
		input = readValidInt();
	}
	return input;
}
//beginning menu option
public static int getValidInt1(int min, int max) {
	int input = readValidInt();
	while (input < min || input > max) {
		System.out.print("Please select option number '1' or '2': ");
		input = readValidInt();
	}
	return input;
}
}
