package com.prowings.customcomparator;

import java.util.Objects;

public class StudentName implements Comparable{

	int rollno;
	String name;

	public StudentName() {
		super();

	}

	public StudentName(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentName [rollno=" + rollno + ", name=" + name + "]";
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
		StudentName other = (StudentName) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}

	@Override
	public int compareTo(Object o) {

		StudentName s = (StudentName) o;

		return this.name.compareTo(s.name);
	}

}
