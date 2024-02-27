package modulo13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order2;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus2;

public class Program03 {
	public static void main(String [] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus2 status = OrderStatus2.valueOf(sc.next());
		
		Order2 order2 = new Order2(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter #" + i + "item data: ");
			
			System.out.print("Product name: ");
			String nameProduct = sc.next();
			
			sc.nextLine();
			
			System.out.print("Product price: ");
			Double priceProduct = sc.nextDouble();
			
			Product product = new Product(nameProduct, priceProduct);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, priceProduct, product);
			
			order2.addItem(orderItem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order2);
		
		sc.close();
	}

}
