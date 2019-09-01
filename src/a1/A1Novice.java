package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numOfCustomers = scan.nextInt();
		String[] output = new String[numOfCustomers];
		
		
		for (int i = 0; i < numOfCustomers; i++) {
			String current = "";
			String firstName = scan.next();
			char firstInitial = firstName.charAt(0);
			current += firstInitial + ". " + scan.next() + ": ";
			
			int num_of_items = scan.nextInt();
			double sum = 0.0;
			
			for (int k = 0; k < num_of_items; k++) {
				double price = scan.nextDouble();
				int quantity = scan.nextInt();
				String item = scan.next();
				double itemTotal = quantity * price;
				sum += itemTotal;
				
			}
			
			String itemToString = String.format("%.2f", sum);
			
			current += itemToString;
			output[i] = current;
		}
		for (int i = 0; i < output.length; i++) {
		System.out.println(output[i]);		

		}
		scan.close();
		
	}
}
