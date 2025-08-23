package OOP_LAB_05;
class Order{
	
	void printDetails() {
		
		System.out.println("Name Of Customer : HAWRSHA");
		System.out.println("Customer ID : 128193918");
		System.out.println("Price : $1999");
		System.out.println("Delivery Date : 29/08/25");
		
	}
}

class OnlineOrder extends Order{
	
	
	void printDetails() {
		
		super.printDetails();
		System.out.println("Product Name : Height Growth Serum");
		System.out.println("Product Quantity : 10");
		
	}
			
}
public class Super_Keyword {
	
	public static void main(String args[]) {
		
		OnlineOrder o = new OnlineOrder();
		o.printDetails();
	}

}
