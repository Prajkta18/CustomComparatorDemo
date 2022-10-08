package com.prowings.customcomparator;

import java.util.Comparator;

public class CustomComparatorEmployeeId implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		if(e1.id == e2.id)
			return 0;

		else if(e1.id > e2.id)
			return 1;

		else
			return -4;
	}

}
