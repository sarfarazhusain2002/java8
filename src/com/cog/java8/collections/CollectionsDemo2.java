package com.cog.java8.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cog.java8.Account;
import com.cog.java8.Employee;
import com.cog.java8.Utils;
/**
 * <b>CollectionsDemo2</b> This class have a simple Lambda expression
 * examples.
 * <ul>
 * <li><b>EXAMPLE 1 :</b> Iterate over collection using JAVA 8 Lambda Expression.</li>
 * <li><b>EXAMPLE 2 :</b> Using <b>getOrDefault</b> in collection.</li>
 * <li><b>EXAMPLE 3 :</b> Using <b>putIfAbsent</b> in collection.</li>
 * </ul>
 * 
 * @author Sarfaraz
 *
 */
public class CollectionsDemo2 {

	public static void main(String[] args) {
		final Map<Account, List<Employee>> eMap = Utils.getEmployeesForAccounts();

		/////////////// EXAMPLE 1 - ITERATE USING LAMBDA ///////////////
		eMap.forEach((account, employees) -> System.out.println(account + ":" + employees));
		/////////////// EXAMPLE 1 - END ///////////////
		
		
		
		/////////////// EXAMPLE 2 - GET DEFAULT ///////////////
		final Account account5 = new Account("Account5");
		final List<Employee> account5Employees = eMap.getOrDefault(account5, new ArrayList<>());
		account5Employees.forEach(System.out::println); // Nothing will print here
		System.out.println(account5Employees.size()); // '0'

		final Account account1 = new Account("Account1");
		eMap.getOrDefault(account1, new ArrayList<>());
		eMap.get(account1).forEach(System.out::println);
		/////////////// EXAMPLE 2 - END ///////////////
		
		
		
		/////////////// EXAMPLE 3 - PUT IF ABSENT ///////////////
		final Account account2 = new Account("Account2");
		eMap.putIfAbsent(account2, new ArrayList<>());
		eMap.get(account2).add(new Employee(1010, "Ajeya", 36));
		eMap.get(account2).forEach(System.out::println);
		/////////////// EXAMPLE 3 - END ///////////////
	}

}
