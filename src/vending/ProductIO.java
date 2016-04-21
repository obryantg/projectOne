package vending;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.lang.reflect.Array;
//import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
//import java.util.Scanner;

public class ProductIO {

	public static void writeToFile(ArrayList<VendingDan> list) {
		

		Path productList = Paths.get("ProductList.txt");
		File productFile = productList.toFile();

		try {
			PrintWriter out = new PrintWriter(productFile);
			for(VendingDan d: list)
			out.println(d.getItem()+","+d.getPrice()+","+d.getQty());
			

			out.close();

		} catch (IOException e) {

			e.printStackTrace();
			
		}

	}

	public static ArrayList<VendingDan> readfromFile() throws IOException {
		Path productPath = Paths.get("productList.txt");
		File productFile = productPath.toFile();
		// try {
		FileReader fr = new FileReader(productFile);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		ArrayList<VendingDan> vItems = new ArrayList<>();

		while (line!= null) {
			
			String[] items = line.split(",");
			int count = 0;
			try {
				String itemName = items[0];
				double itemPrice = Double.parseDouble(items[1]);
				int itemQuantity = Integer.parseInt(items[2]);

				vItems.add(new VendingDan(itemName, itemPrice, itemQuantity));
				count ++;
				line= br.readLine();
				
			} catch (Exception e) {
				System.out.println("Bad item in file " + productFile + " on row " + (count + 1) + ".");
				// while (line !=null)
				// {
				// skips lines that are blank until end
				// if (! line.equals(""))
				// System.out.println(line);
				// line = br.readLine(); //read another line
			}
			
		}
		// catch (IOException e)
		// {
		// System.out.println(e);
		br.close();
return vItems;
	}
}
