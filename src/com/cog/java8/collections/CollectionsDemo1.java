package com.cog.java8.collections;

import java.util.List;

import com.cog.java8.Employee;
import com.cog.java8.Utils;

/**
 * <b>CollectionsDemo1</b> This class have a simple Lambda expression
 * examples.
 * <ul>
 * <li><b>EXAMPLE 1 :</b> Iterate over collection using JAVA 7 WAY.</li>
 * <li><b>EXAMPLE 2 :</b> Iterate over collection using JAVA 8 Lambda Expression.</li>
 * <li><b>EXAMPLE 3 :</b> Iterate over collection using JAVA 8 Method Reference.</li>
 * <li><b>EXAMPLE 4 :</b> Remove object from collection using Lambda Expression.</li>
 * <li><b>EXAMPLE 5 :</b> Replace all objects within a collection using Lambda Expression.</li>
 * </ul>
 * 
 * @author Sarfaraz
 *
 */
public class CollectionsDemo1 {

	public static void main(String[] args) {
		
		final List<Employee> employees = Utils.getEmployees();
		
		////////////// EXAMPLE 1 - JAVA 7 WAY ////////////////////
		for(Employee employee : employees){
			System.out.println(employee);
		}
		//////////////EXAMPLE 1 - END ////////////////////
		
		
		///////////// EXAMPLE 2 - USING LAMBDA ////////////////////
		employees.forEach(e -> System.out.println(e));
		//////////////EXAMPLE 2 - END ////////////////////
		
		
		
		///////////// EXAMPLE 3 - USING METHOD REFERENCE ////////////////////
		employees.forEach(System.out::println);
		//////////////EXAMPLE 3 - END ////////////////////
		
		
		
		///////////// EXAMPLE 4 - REMOVE ////////////////////
		employees.removeIf(e -> e.getName().equalsIgnoreCase("Sarfaraz"));
		employees.forEach(System.out::println);
		//////////////EXAMPLE 4 - END ////////////////////
		
		
		///////////// EXAMPLE 5 - REPLACE ALL ////////////////////
		final List<String> names = Utils.getNames();
		names.replaceAll(name -> name.toUpperCase());
		names.forEach(System.out::println);
		//////////////EXAMPLE 5 - END ////////////////////
	}

}
