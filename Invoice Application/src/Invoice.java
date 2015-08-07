import java.text.NumberFormat;
import java.util.*;
public class Invoice {
	
	private ArrayList<LineItem> lineItems = new ArrayList<LineItem>();
	
	public Invoice(){}
	
	public void addItem(LineItem lineItem){
		lineItems.add(lineItem);
	}
	
	
	
	@Override
	public String toString() {
		String s="";
		for(LineItem l : lineItems){
			s+=l;
		}
		return s;
	}

	//public ArrayList getLineItems(){
		
	//}
	
	public double getInvoiceTotal(){
		double sum = 0;
		for (LineItem l : lineItems) {
			sum += (l.getProduct().getPrice() * l.getQuantity());
		}
		return sum;
	}

	
	
	public String getFormattedTotal(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		double d = getInvoiceTotal();
		String grandTotal = currency.format(d);
		return grandTotal;
		
	}
}
