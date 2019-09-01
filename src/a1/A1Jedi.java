package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		int items = scan.nextInt();
		String[] products = new String[items];
		int[] customers_bought = new int[items];
		int[] quantity_bought = new int[items];
		
		
		for (int i = 0; i < items; i++) {
			products[i] = scan.next();
			scan.nextDouble();
		}
		
		int customers = scan.nextInt();
		
		
		for (int i = 0; i < customers; i++) {
			scan.next();
			scan.next();
			int items_bought = scan.nextInt();
			boolean[] appears = new boolean[items];
			
			
			for (int j = 0; j < items_bought; j++) {
				int quantity = scan.nextInt();
				String product = scan.next();
				quantity_bought[find_index(product, products)] += quantity;
				appears[find_index(product, products)] = true;
			}
			
			
			for (int j = 0; j < items; j ++) {
				if (appears[j]) {
					customers_bought[j]++;
				}
			}
		
		}
		for (int i = 0; i < items; i++) {
			if (customers_bought[i] == 0) {
				System.out.println("No customers bought " + products[i]);
			} else {
				System.out.println(customers_bought[i] + " customers bought " + quantity_bought[i] + " " + products[i]);
				
			}
		}
		scan.close();
	}
	
	public static int find_index(String s, String[] a) {
		
		for (int i = 0; i < a.length; i++) {
			if(s.equals(a[i])) {
				return i;
			}
		}
		return -1;
	}
}
