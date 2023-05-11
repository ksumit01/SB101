package com.masai.q2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
//		public Product(int productId, String productName, int quantity, int price) {
		List<Product> product = new ArrayList<>();
		product.add(new Product(1, "Product A", 10, 100));
		product.add(new Product(2, "Product B", 5, 200));
		product.add(new Product(3, "Product C", 20, 200));
		product.add(new Product(4, "Product D", 5, 300));
		product.add(new Product(5, "Product E", 10, 200));
		
		Collections.sort(product, new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				if (p1.getPrice() != p2.getPrice()) {
                    return Integer.compare(p2.getPrice(), p1.getPrice()); // sort by price (descending)
                } else if (p1.getQuantity() != p2.getQuantity()) {
                    return Integer.compare(p2.getQuantity(), p1.getQuantity()); // sort by quantity (descending)
                } else if (!p1.getProductName().equals(p2.getProductName())) {
                    return p2.getProductName().compareTo(p1.getProductName()); // sort by product name (descending)
                } else {
                    return Integer.compare(p2.getProductId(), p1.getProductId()); // sort by product id (descending)
                }
				
            }
			
		});
		
		for(Product p: product) {
			System.out.println(p);
		}
	}
}
