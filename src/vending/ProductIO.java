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
import java.util.Scanner;

public class ProductIO {

	public static void writeToFile() {
		Scanner sc = new Scanner(System.in);

		Path productList = Paths.get("ProductList.txt");
		File productFile = productList.toFile();

		try {
			PrintWriter out = new PrintWriter(productFile);
			// out.println("Product List: "
			// + "\n1. Kamel's 'so easy' chews"
			// + "\n2. Damien's down under suprise"
			// + "\n3. Kim's 'hyped up' energy bar"
			// + "\n4. Grand Circus peanuts"
			// + "\n5. Aaron's Big Dawg Bar"
			// + "\n6. Broderick Tower Bites"
			// + "\n7. Greg's Honey Bun"
			// + "\n8. B'Nastee's Red Hat"
			// + "\n9. Bubble Gum");
			// try {
			// FileWriter out = new FileWriter(productFile,true);
			// System.out.print("Item List: ");
			// input = sc.nextLine();
			// out.append(input + "\n");
			// System.out.println("Entry Saved");

			out.close();

		} catch (IOException e) {

			e.printStackTrace();
			sc.close();
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

		while (br.readLine() != null) {
			br.readLine();
			String[] items = line.split(",");
			int count = 0;
			try {
				String itemDesc = items[0];
				double itemPrice = Double.parseDouble(items[1]);
				int itemQuantity = Integer.parseInt(items[2]);

				vItems.add(new VendingDan(itemDesc, itemPrice, itemQuantity));

			} catch (Exception e) {
				System.out.println("Bad item in file " + productFile + " on row " + (count + 1) + ".");
				// while (line !=null)
				// {
				// skips lines that are blank until end
				// if (! line.equals(""))
				// System.out.println(line);
				// line = br.readLine(); //read another line
			}
			br.close();
		}
		// catch (IOException e)
		// {
		// System.out.println(e);
return vItems;
	}
}
