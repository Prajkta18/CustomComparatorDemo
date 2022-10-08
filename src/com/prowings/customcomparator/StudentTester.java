package com.prowings.customcomparator;

import java.util.TreeSet;

public class StudentTester {


	public static void main(String[] args) {

		Student s1 = new Student(30, "AAA");
		Student s2 = new Student(8, "DDD");
		Student s3 = new Student(2, "FFF");
		Student s4 = new Student(11, "ZZZ");

		TreeSet ts = new TreeSet();

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);

		System.out.println("Ascending Order using Roll Number:");
		System.out.println(ts);


		TreeSet ts1 = new TreeSet();

		StudentName s5 = new StudentName(30, "AAA");
		StudentName s6 = new StudentName(8, "DDD");
		StudentName s7 = new StudentName(2, "FFF");
		StudentName s8 = new StudentName(11, "BBB");

		ts1.add(s5);
		ts1.add(s6);
		ts1.add(s7);
		ts1.add(s8);

		System.out.println("Ascending Order using Name");
		System.out.println(ts1);

	}
}
