package com.cog.java8.mapFilterReduce;

import java.util.List;

import com.cog.java8.Employee;
import com.cog.java8.Utils;
/**
 * <b>MapFilterReduceDemo1</b> 
 * This class explains the map filter reduce example using <b>stream</b>.
 * It converts collection into stream, map for ages, apply filter for age greater then 25
 * and print the ages.
 *   
 * @author Sarfaraz
 *
 */
public class MapFilterReduceDemo1 {

	public static void main(String[] args) {
		final List<Employee> employees = Utils.getEmployees();

		employees.stream()
				.map(e -> e.getAge())
				.filter(age -> age > 25)
				.forEach(System.out::println);
	}

}
