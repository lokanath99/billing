package myprog;


public class Item {
	
	
	
	private String ItemName;
	private int Quantity;
	private float Prise;
	private float Discount;
	private float totalprise;
	private float quantprise;

	Item(String Name,int Qunty,float i,float discount){
		ItemName=Name;
		Quantity=Qunty;
		Prise=i;
		Discount=discount;
	}	
	void TotalCalculator() {
			this.setQuantprise(Prise*Quantity);
	}
	void TotalPriseCalculator() {
		this.TotalCalculator();
		this.setTotalprise(quantprise-(Discount/100));
	}
	void PrintItemInfo() {
		System.out.println(ItemName+"\t"+Quantity+"\t"+Discount+"\t"+Prise+"\t"+totalprise);
		
	}
	
	public float getQuantprise() {
		return quantprise;
	}

	public void setQuantprise(float quantprise) {
		this.quantprise = quantprise;
	}

	public float getDiscount() {
		return Discount;
	}

	public void setDiscount(float discount) {
		Discount = discount;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public float getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public float getPrise() {
		return Prise;
	}

	public void setPrise(float prise) {
		Prise = prise;
	}
	
	public float getTotalprise() {
		return totalprise;
	}

	public void setTotalprise(float totalprise) {
		this.totalprise = totalprise;
	}


}
