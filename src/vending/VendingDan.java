package vending;


public class VendingDan {
		
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	String item;
	double price;
	int qty;
	public VendingDan(String item, double price, int qty) {
		super();
		this.item = item;
		this.price = price;
		this.qty = qty;
	}
	
	
}


	



		
	

	

