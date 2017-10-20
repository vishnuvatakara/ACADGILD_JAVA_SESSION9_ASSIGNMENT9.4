package collections;

import java.util.TreeSet;

public class Naturalsort {
	public static void main(String args[])
	{	//creating employee class objects
		Employee obj1=new Employee();
		Employee obj2=new Employee();
		Employee obj3=new Employee();
		Employee obj4=new Employee();
		Employee obj5=new Employee();
		TreeSet<Employee> ts=new TreeSet<Employee>();	//creating treeset
		//passing objects to Tree Set
		ts.add(obj1);
		ts.add(obj2);
		ts.add(obj3);
		ts.add(obj4);
		ts.add(obj5);

		for(Employee e:ts)
		{	//printing employee details in the tree set
			System.out.println(e.name+" "+e.designation+" "+e.salary);
		}
	}

}
