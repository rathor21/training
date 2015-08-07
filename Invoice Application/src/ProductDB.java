import java.util.ArrayList;


public class ProductDB {
	private ArrayList<Product> products = new ArrayList<Product>();
	
	public ProductDB(){
		products.add(new Product("AP", "Apple", 2.00));
		products.add(new Product("OR", "Orange", 1.50));
		products.add(new Product("BA", "Banana", .50));
		products.add(new Product("PE", "Peach", 3.00));
		products.add(new Product("KI", "Kiwi", 5.00));
	}
	
	public Product getProduct(String c){
		
		for (int i = 0; i < products.size(); i++){
			Product prod=products.get(i);
			if (c.equalsIgnoreCase(prod.getCode())){
				return prod;
			}
		}
		return null;		
		}
	
	
	
}
