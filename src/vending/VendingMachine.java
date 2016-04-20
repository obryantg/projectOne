package vending;

import java.util.Scanner;

public class VendingMachine {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the DNG Vending Machine");
		ProductIO.readfromFile();
		
		
		
		sc.close();
	}

}
