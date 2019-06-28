package com.cg.payroll.bean;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp, Employee emp1) {		
		return emp1.getId()-emp.getId();
	}

}
