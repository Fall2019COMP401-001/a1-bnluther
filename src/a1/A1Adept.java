package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int num_of_items = scan.nextInt();
		String[] products = new String[num_of_items];
		double prices[] = new double[num_of_items];
		double whole_total = 0.0;
		
		
		for (int i = 0; i < num_of_items; i++) {
			products[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
	
		int num_of_customers = scan.nextInt();
		String[] customers = new String[num_of_customers];
		double[] customer_total = new double[num_of_customers];
		
		
		for (int k = 0; k < num_of_customers; k++) {
			String name = getName(scan.next(), scan.next());
			
			double customerTotal = 0.0;
			int cusItems = scan.nextInt();
			for (int j = 0; j < cusItems; j++) {
				int quantity = scan.nextInt();
				String item_name = scan.next();
				double itemPrice = getPrice(products, prices, item_name);
				customerTotal += (quantity * itemPrice);
			}
			
			
			whole_total += customerTotal;
			customers[k] = name;
			customer_total[k] = customerTotal;
		}
		
		

		String max_name = customers[0];
		double max = customer_total[0];
		
		
		for (int j = 0; j < num_of_customers; j++) {
			if (customer_total[j] > max) {
				max = customer_total[j];
				max_name = customers[j];
			}
		}
		
		
		System.out.println("Biggest: " + max_name + "(" + String.format("%.2f", max) + ")");
		

		String min_name = customers[0];
		double min = customer_total[0];
		for (int h = 0; h < num_of_customers; h++) {
			if (customer_total[h] < min) {
				min = customer_total[h];
				min_name = customers[h];
			}
		}
		
		
		System.out.println("Smallest: " + min_name + "(" + String.format("%.2f", min) + ")");
		
		
		double average = whole_total / num_of_customers;
		System.out.println("Average: " + String.format("%.2f", average));
		
		scan.close();
		
	}

	public static double getPrice(String[] products, double[] prices, String itemName) {
		double price = 0.0;
		
		for (int i = 0; i < products.length; i++) {
			if (itemName.equals(products[i])) {
				price = prices[i];
			}
		}
		return price;
	}

	public static String getName(String first, String second) {
		String result = ""; 
		result += first + " " + second + " ";
		return result;
		
	}
}
