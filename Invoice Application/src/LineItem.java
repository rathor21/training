import java.text.NumberFormat;



public class LineItem {
	Product product;
	int quantity;
	double total;
	String totalString;
	double grandTotal;
	
	public LineItem(Product p, int q){
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	 try {
		quantity=q;
		product=p;
		total=quantity*p.getPrice();
		totalString = currency.format(total);
	 } catch (ArithmeticException e){
		 System.out.println("Invalid Quantity");
	 }
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotal() {
		return total;
	}

	@Override
	public String toString() {
		//System.out.println(total);
		return "" + product.toString() + " " + quantity + " " + totalString + "\n";
	
	
}
}