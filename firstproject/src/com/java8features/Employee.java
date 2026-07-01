package com.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
	String ename;
	double salary;
	
	Employee(String ename,double salary){
		this.ename=ename;
		this.salary=salary;
	}
	public static void main(String[] args) {
		
		Function<Employee, String> f= (e)->{
			String desg=" ";
			if(e.salary>=100000) {
				desg="Manager";
			}else if (e.salary>=80000) {
				desg="SeniorEngineer";
			}else if (e.salary>=60000) {
				desg="JuniorEngineer";
			}else if (e.salary>=40000) {
				desg="TraineeEngineer";
			}else if (e.salary>=20000) {
				desg="AssociateEngineer";
			}else {
				desg="No position";
			}
			return desg;
		};
		
		
		Employee e1=new Employee("Navya",75000);
		Employee e2=new Employee("Satya",60000);
		Employee e3=new Employee("Sri",25000);
		Employee e4=new Employee("Sita",100000);
		Employee e5=new Employee("Ratnam",95000);

		Employee[] e=new Employee[5];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		e[3]=e4;
		e[4]=e5;

		Predicate<Employee> p =(emp)-> emp.salary>90000;
		
		Consumer<Employee> consumer= (emp)->{
			if(p.test(emp)) {
			System.out.println(emp.ename);
			System.out.println(emp.salary);
			System.out.println(f.apply(emp));
			System.out.println("***************************");
			}
		};
		
		for(Employee em:e) {
			if(p.test(em)) {
				consumer.accept(em);
			}
		}
		
	}

}
