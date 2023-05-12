package com.masai.day_02.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Use foreach() method and Consumer interface implementation
public class PredicateConsumerDemo {
	static void displayCountryList(List<Country> list) {
		Consumer<Country> con = (Country name)-> System.out.print(name);
		list.forEach(con);
	};

	static List<Country> filterCountry(List<Country> list, Predicate<Country> filterByArea) {
		
		List<Country> filteredCountries = new ArrayList<>();
	    for (Country country : list) {
	        if (filterByArea.test(country)) {
	            filteredCountries.add(country);
	        }
	    }
	    return filteredCountries;	
	};

	public static void main(String args[]) {
		List<Country> countryList = new ArrayList<>();
		// Add countries from Asia
		countryList.add(new Country("China", "Asia", 9596961));
		countryList.add(new Country("Japan", "Asia", 377975));
		countryList.add(new Country("India", "Asia", 3287263));
		countryList.add(new Country("Russia", "Asia", 17098246));

		// Add countries from Europe
		countryList.add(new Country("Belgium", "Europe", 30528));
		countryList.add(new Country("Denmark", "Europe", 43094));
		countryList.add(new Country("Germany", "Europe", 357168));
		countryList.add(new Country("Norway", "Europe", 385203));

		// Add countries from Africa
		countryList.add(new Country("Egypt", "Africa", 1010408));
		countryList.add(new Country("Morocco", "Africa", 446300));
		countryList.add(new Country("South Africa", "Africa", 1221037));
		countryList.add(new Country("Kenya", "Africa", 580367));

		Scanner sc = new Scanner(System.in);
		int choice = -1;
		do {
			System.out.println("1. By Area Range");
			System.out.println("2. By content in country name");
			System.out.println("3. By continent name");
			System.out.println("4. Clear Filter ");
			System.out.println("5. Print Country List");
			System.out.println("0. Exit");
			System.out.print("Enter selection ");
			choice = sc.nextInt();
			// write code here as per the instructions given below
			switch (choice) {
		    case 1:
		        System.out.print("Enter minimum area: ");
		        double minArea = sc.nextDouble();
		        System.out.print("Enter maximum area: ");
		        double maxArea = sc.nextDouble();
		        Predicate<Country> areaFilter = c -> c.getArea() >= minArea && c.getArea() <= maxArea;
		        List<Country> filteredByArea = filterCountry(countryList, areaFilter);
		        displayCountryList(filteredByArea);
		        break;

		    case 2:
		        System.out.print("Enter any character/string that country name has: ");
		        sc.nextLine();
		        String searchString = sc.nextLine();
		        Predicate<Country> nameFilter = c -> c.getCountryName().contains(searchString);
		        List<Country> filteredByName = filterCountry(countryList, nameFilter);
		        displayCountryList(filteredByName);
		        break;

		    case 3:
		    	
		        System.out.print("Enter continent name: ");
		        sc.nextLine();
		        String continentName = sc.nextLine();
		        Predicate<Country> continentFilter = c -> c.getContinentName().equals(continentName);
		        List<Country> filteredByContinent = filterCountry(countryList, continentFilter);
		        displayCountryList(filteredByContinent);
		        break;
	        case 4:
	            // Clear all filters
	           System.out.println("Filter cleared! you can add filter from start");
	            break;

	        case 5:
	            // Print the country list
	            displayCountryList(countryList);
	            break;

	        case 0:
	            System.out.println("Exiting program...");
	            break;

	        default:
	            System.out.println("Invalid choice. Please try again.");
	            break;
	    
		}

			
		} while (choice != 0);
		
		sc.close();
	}
}
