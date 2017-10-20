package collections;

import java.util.Scanner;

public class Employee implements Comparable<Employee>{ // use comparable interface
	String name,designation;	
	int salary;
	Scanner sc=new Scanner(System.in);
	Employee()
	{	//reading input details of employee
		System.out.println("enter the employee name");
		name=sc.next();
		System.out.println("enter the employee designation");
		designation=sc.next();
		System.out.println("enter the employee salary");
		salary=sc.nextInt();
	}
	public int compareTo(Employee e) {	//over ride compareto method
		if(salary>e.salary)	//sort via salary
			return 1;	
		else if(salary<e.salary)
			return -1;
		else {
			int n = name.compareTo(e.name); //sort via designation and name if salary is equal  
			if(n==0) 
				return designation.compareTo(e.designation);
			return 1;		
		}
	}
}
