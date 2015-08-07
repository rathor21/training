import java.util.*;

public class InvoiceApp {

	public static void main(String[] args) {
		ProductDB productDB = new ProductDB();

		String c = "", another = "";
		int q = 0;
		boolean next = false, check = false;
		Scanner keyboard = new Scanner(System.in);
		Invoice invoice = new Invoice();
		do {
			do {
				System.out.println("Enter product code: ");
				c = keyboard.next();
				check = Validator.checkCode(c);
			} while (check == false);
			Product p = productDB.getProduct(c);
			boolean choice = false;
			do {
				try {
				System.out.println("Enter quantity: "); // prompt for quantity
				choice = false;
					q = keyboard.nextInt();
					
				} catch (InputMismatchException e) {
					System.out.println("Invalid input.");
					keyboard.nextLine();
					choice = true;
				}catch (ArithmeticException e) {
					System.out.println("Invalid input.");
					keyboard.nextLine();
					choice = true;
				}

				finally {
					System.out.println("Product Entered");
				}
			} while (choice == true );

			LineItem lineItem = new LineItem(p, q); // make Line Item out of
													// product and quantity
			invoice.addItem(lineItem);// add Line Item to Invoice
			System.out.println("Another item? (y/n)");
			another = keyboard.next();
			if (another.equalsIgnoreCase("y")) {
				next = true;
			} else if (another.equalsIgnoreCase("n")) {
				next = false;
			}

		} while (next == true); // repeat until told to exit

		// after the loop print out Invoice
		System.out.println(invoice);
		invoice.getInvoiceTotal();
		System.out.println("Grand Total: " + invoice.getFormattedTotal());
		
	}

}
