package com.casestudies;

class LowSalaryException extends Exception{
	public LowSalaryException(String message) {
		super(message);
	}
}
class Employee{
	String name;
	double salary;
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	void checkSalary() throws LowSalaryException{
		if(salary<10000) {
			throw new LowSalaryException("Salary is too low! Must be at least 10,000");
		}else {
			System.out.println("Salary Accepted for "+name);
		}
	}
}
public class EmployeeSalaryCheck {

	public static void main(String[] args) {
		try {
			Employee e=new Employee("Me",10000);
			e.checkSalary();
		}catch(LowSalaryException e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}

}
