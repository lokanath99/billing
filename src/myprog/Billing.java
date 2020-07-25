package myprog;

import java.util.Scanner;

public class Billing {
static Cashier c;
static CustomerDtl cu;
static private Item i[]=new Item[100];
static int itemcount=0;
static int add;
static double total;

public static void main(String args[]) {
System.out.println("enter the Cashier details :");
Scanner sc=new Scanner(System.in);
System.out.println("name\t\tId");
c=new Cashier(sc.next(),sc.nextInt());
System.out.println("enter the customer detail:");
System.out.println("name\t\tphone\t\tGstno");
cu=new CustomerDtl(sc.next(),sc.nextDouble(),sc.nextInt());

System.out.println("enter 1 to add item to the bill /0 to exit billing ");
add=sc.nextInt();
do {
	
	itemcount++;
	System.out.println("enter the item details:");
	System.out.println("itemname \t\t Quantity\t\t prise\t\tdiscount ");
	i[itemcount]=new Item(sc.next(), sc.nextInt(), sc.nextFloat(), sc.nextFloat());
	i[itemcount].TotalPriseCalculator();
	System.out.println("enter 1 to add item to the bill /0 to exit billing ");
	 add=sc.nextInt();

}while(add==1);{
System.out.println("billing ended ");
}
System.out.println("-------------------------------------------");
System.out.println("cashiter");
c.Cadisplay();
System.out.println("-------------------------------------------");
System.out.println("customer:");
cu.cusprint();
System.out.println("-------------------------------------------");
System.out.println("ItemName\tquantity\tDiscount\tprise");
for(int j=1;j<=itemcount;j++) {
	i[j].PrintItemInfo();
}
System.out.println(itemcount+"total items purchased");
System.out.println("-------------------------------------------");
System.out.print("total:\t\t");
total=0;
for(int j=1;j<=itemcount;j++) {
	total+=i[j].getTotalprise();
}
System.out.println(total);
sc.close();
}


}
