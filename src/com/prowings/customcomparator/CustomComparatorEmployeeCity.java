package com.prowings.customcomparator;

import java.util.Comparator;

public class CustomComparatorEmployeeCity implements Comparator <Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.city.compareTo(e2.city);
	}

	
}
