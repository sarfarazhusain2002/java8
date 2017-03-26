package com.cog.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

	public static List<Employee> getEmployees() {
		final List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1000, "Yogesh", 32));
		employees.add(new Employee(1001, "Sarfaraz", 35));
		employees.add(new Employee(1002, "Gokul", 30));
		employees.add(new Employee(1003, "Hemal", 32));
		employees.add(new Employee(1004, "Satyajit", 35));
		employees.add(new Employee(1005, "Dharmendra", 34));
		employees.add(new Employee(1006, "Rajkumar", 34));
		employees.add(new Employee(1007, "Priti", 25));
		employees.add(new Employee(1008, "Kavita", 25));

		return employees;
	}

	public static List<Account> getAccounts() {
		final List<Account> accounts = new ArrayList<>();
		accounts.add(new Account("Account1"));
		accounts.add(new Account("Account2"));
		accounts.add(new Account("Account3"));
		accounts.add(new Account("Account4"));
		return accounts;
	}

	public static Map<Account, List<Employee>> getEmployeesForAccounts() {
		final Map<Account, List<Employee>> eMap = new HashMap<>();
		
		final Account account1 = new Account("Account1");
		final List<Employee> account1Emplyees = new ArrayList<>();		
		account1Emplyees.add(new Employee(1000, "Yogesh", 32));
		account1Emplyees.add(new Employee(1001, "Sarfaraz", 35));
		account1Emplyees.add(new Employee(1008, "Kavita", 25));
		eMap.put(account1, account1Emplyees);
		
		final Account account2 = new Account("Account2");
		final List<Employee> account2Emplyees = new ArrayList<>();
		account2Emplyees.add(new Employee(1002, "Gokul", 30));
		account2Emplyees.add(new Employee(1003, "Hemal", 31));
		eMap.put(account2, account2Emplyees);
		
		final Account account3 = new Account("Account3");
		final List<Employee> account3Emplyees = new ArrayList<>();
		account3Emplyees.add(new Employee(1004, "Satyajit", 35));
		account3Emplyees.add(new Employee(1005, "Dharmendra", 34));
		eMap.put(account3, account3Emplyees);
		
		final Account account4 = new Account("Account4");
		final List<Employee> account4Emplyees = new ArrayList<>();
		account4Emplyees.add(new Employee(1006, "Rajkumar", 32));
		account4Emplyees.add(new Employee(1007, "Priti", 25));
		eMap.put(account4, account4Emplyees);
		
		return eMap;
	}

	public static List<String> getNames() {
		final List<String> names = new ArrayList<>();
		names.add("Sarfaraz");
		names.add("Yogesh");
		names.add("Hemal");
		names.add("Gokul");
		names.add("Dharmendra");
		return names;
	}
}
