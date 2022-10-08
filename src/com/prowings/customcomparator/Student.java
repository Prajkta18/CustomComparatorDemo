package com.prowings.customcomparator;

import java.util.Objects;

public class Student implements Comparable{

	int rollno;
	String name;

	public Student() {
		super();

	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}

	@Override
	public int compareTo(Object o) {

		Student s = (Student) o;

		if(this.rollno == s.rollno)
			return 0;

		else if(this.rollno > s.rollno)
			return 7;

		else 
			return -2;

	}


}
