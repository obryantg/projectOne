package vending;
import java.io.*;
import java.util.Scanner;

public class VendingDan {
	private Item[] inventory;  //Array of Item objects in machine
		
	public VendingDan extends ProductIO {
	    //Open the file to read with the scanner
	    File productFile = new File(ProductList.txt);
	    Scanner scan = new Scanner(ProductList.txt);

	    //Determine the total number of items listed in the file
	    int totalItem = 0;
	    while (scan.hasNextLine()){
	        scan.nextLine();
	        totalItem++;
	    } 
	    inventory = new Item[totalItem];
	    scan.close();

	    //Open the file again with a new scanner to read the items
	    scan = new Scanner(file);
	    int itemQuantity = -1;
	    double itemPrice = -1;
	    String itemDesc = "";
	    int count = 0;
	    String line = "";

	    //Read through the items in the file to get their information
	    //Create the item objects and put them into the array of stock
	    while(scan.hasNextLine()){
	        line = scan.nextLine();
	        String[] tokens = line.split(",");
	        try {
	            itemDesc = tokens[0];
	            itemPrice = Double.parseDouble(tokens[1]);
	            itemQuantity = Integer.parseInt(tokens[2]);

	            inventory[count] = new Item(itemDesc, itemPrice, itemQuantity);
	            count++;
	        } catch (NumberFormatException nfe) {
	            System.out.println("Bad item in file " + ProductList.txt + 
	                    " on row " + (count+1) + ".");
	        }
	    } //End while another item in file
	    scan.close();

	    //Initialize the money data variable.
	    money = 0.0;
	} //End VendingMachine constructor

	} //End VendingMachine class definition
	    
	



		
	

	

