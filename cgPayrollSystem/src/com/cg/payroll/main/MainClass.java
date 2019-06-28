package com.cg.payroll.main;
import java.util.ArrayList;
import java.util.Collections;

import com.cg.payroll.bean.*;

public class MainClass 
{
	public static void demo()
	{
		System.out.println("hi");		
	}	
	public static void main(String[] str) {		
		/*Emplyee empl=new Emplyee(101,"Abhi","Khandagale","abhi@gmail.com","A3","ASF123","Computer",new  BankDetails(123456, "SBI", "SBIN3334"), new SalaryAccount(1200, 500, 500, 400, 4000, 4500, 500, 5400, 17500));
          System.out.println(empl.getBankDetails().getBankName());*/
		//ArrayList<Emplyee> emp=new ArrayList<>();
		//emp.add(11,"sdf");		
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(102, "Abhi", "Khandagale"));
		emp.add(new Employee(103, "dipak", "Bhatt"));
		emp.add(new Employee(101, "sunil", "jadhav"));
		emp.add(new Employee(105, "govind", "Kande"));
		emp.add(new Employee(104, "Abhi", "Khandagale"));
		
		Employee sr=new Employee(103, "dipak", "Bhatt");
		EmployeeComparator emp1=new EmployeeComparator();
		
		System.out.println(emp.contains(sr));
		
		Collections.sort(emp,emp1);
		for (Employee employee : emp) {
			System.out.println(employee);
		}			
		}}