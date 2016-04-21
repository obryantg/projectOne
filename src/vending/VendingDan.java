package vending;


public class VendingDan {
		
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getDesc() {
		return desc;
	}

	public void setDesc(double desc) {
		this.desc = desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	String item;
	double desc;
	int qty;
	public VendingDan(String item, double desc, int qty) {
		super();
		this.item = item;
		this.desc = desc;
		this.qty = qty;
	}
	
	
}


	



		
	

	

