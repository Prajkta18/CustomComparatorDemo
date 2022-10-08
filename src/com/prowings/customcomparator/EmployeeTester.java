package com.prowings.customcomparator;

import java.util.TreeSet;

public class EmployeeTester {

	public static void main(String[] args) {

		Employee e1 = new Employee(10,"AAA","Pune");
		Employee e2 = new Employee(40,"FFF","Mumbai");
		Employee e3 = new Employee(20,"CCC","Delhi");
		Employee e4 = new Employee(30,"ZZZ","Canada");

		CustomComparatorEmployeeId idCom = new CustomComparatorEmployeeId();
		TreeSet ts = new TreeSet(idCom);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("Ascending order using Employee Id:");
		System.out.println(ts);

		System.out.println();

		CustomComparatorEmployeeName nameCom = new CustomComparatorEmployeeName();
		TreeSet ts2 = new TreeSet(nameCom);

		ts2.add(e1);
		ts2.add(e2);
		ts2.add(e3);
		ts2.add(e4);


		System.out.println("Ascending order using Employee name:");
		System.out.println(ts2);

		System.out.println();


		TreeSet ts3 = new TreeSet(new CustomComparatorEmployeeCity() );

		ts3.add(e1);
		ts3.add(e2);
		ts3.add(e3);
		ts3.add(e4);

		System.out.println("Ascending order using Employee city:");
		System.out.println(ts3);
	}
}
