import java.util.*;
import java.text.*;
import Client;
import Order;
import OrderStatus;
import OrderItem;
import Product;

public class Main
{
	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name  = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status ");
		
		String status = sc.nextLine();
		OrderStatus oStatus = OrderStatus.valueOf(status);
		Date dateMoment = new Date();
		
		Order order = new Order (dateMoment, oStatus, client);
		
		System.out.print("How many itens to this order? ");
		int numberItens = sc.nextInt();
		
		for (int i = 1; i <= numberItens; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.println("Product price: ");
			Double price = sc.nextDouble();
			Product product = new Product (nameProduct, price);
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem item = new OrderItem(quantity, price, product);
			order.addItem(item);
			
		}
		
		
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order Moment: " + order.getDate());
		System.out.println("Order Status: " + order.getStatus().toString());
		System.out.println("Client: " + client.getName() + " " + client.getBirthDate().toString() + " " + client.getEmail());
		System.out.println("Order Itens: ");
		
		for (int i = 0; i <= order.getOrderItList().size(); i++) {
			order.getOrderItList().get(i).toString();
			
		}
		System.out.println("Total Price: $" + order.total());
		
		
		
		sc.close();
			
		}
		
		
		

		
	

}
