package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int num_customers = scan.nextInt();
		String[] output = new String[num_customers];

		for (int i = 0; i < num_customers; i++) {
			String current_item_and_name = "";
			String first_name = scan.next();
			char first_initial = first_name.charAt(0);
			current_item_and_name += first_initial + ". " + scan.next() + ": ";
			
			int num_items = scan.nextInt();
			double sum = 0.0;
			
			for (int k = 0; k < num_items; k++) {
				double price = scan.nextDouble();
				int quantity = scan.nextInt();
				String item = scan.next();
				double itemTotal = quantity * price;
				sum += itemTotal;
				
			}
			
			String item_to_string = String.format("%.2f", sum);
			current_item_and_name += item_to_string;
			output[i] = current_item_and_name;
		}
		for (int i = 0; i < output.length; i++) {
		System.out.println(output[i]);		

		}
		scan.close();
		
	}
}
