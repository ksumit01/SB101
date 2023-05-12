package com.masai.day_02.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class RunnerDemo {

		public static void main(String[] args) {
		    List<String> city = new ArrayList<>(Arrays.asList("Delhi", "Mumbai", "Lucknow",
		    		"Ahmedabad", "Manali"));
		
		
		
		 PrintList printList = (cityList) -> {
			 Consumer<String> consumer = (c) -> System.out.println(c);
	            cityList.forEach(consumer);
	        };

	        printList.display(city);
		
	        
		}
}
