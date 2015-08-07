import java.text.NumberFormat;


public class Product {
	private String code;
	private String description;
	private double price;
	String priceTotal;
	
	public Product(String c, String d, double p){
		code = c;
		description = d;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		price = p;
		priceTotal = currency.format(price);
		
	}


	public String getCode() {
		return code;
	}


	public String getDescription() {
		return description;
	}


	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return code + " " + description + " " + priceTotal;
	}

}