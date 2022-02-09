package com.hcl.lambdastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Programmer> emps = new ArrayList<>();

		// Create programmer objects
		Programmer p1 = new Programmer(2, "Joe", 40000);
		Programmer p2 = new Programmer(1, "Jack", 45000);
		Programmer p3 = new Programmer(3, "Mason", 50000);
		Programmer p4 = new Programmer(4, "Jacob", 60000);
		Programmer p5 = new Programmer(5, "Ronnie", 65000);
		
		// add programmers to employee list 
		emps.add(p1);
		emps.add(p2);
		emps.add(p3);
		emps.add(p4);
		emps.add(p5);
		
		
		// retrieves employees with a salary less than 70000
		// with name length greater than 4 chars and the name doesn't start with J
		emps.stream().filter(employee -> employee.getSalary() < 70000 && employee.getName()
				.length() > 4 && employee.getName().charAt(0) !='J')
		.map(emp -> emp.getName())
		.forEach(System.out::println);
		
		
		// filters the salaries that are greater than 50000
		emps.parallelStream().filter(employee -> employee.getSalary() > 50000)
		.map(emp -> ((emp.getSalary())))
		.forEach(System.out::println);;
		
		
		// returns count sum min max mean of salaries
		System.out.println("Stats of the salaries: \n" 
		+ emps.stream().collect(Collectors.summarizingInt(emp-> emp.getSalary())));
	}

}
