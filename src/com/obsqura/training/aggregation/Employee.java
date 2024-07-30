package com.obsqura.training.aggregation;

public class Employee {
	String empName;
	int empId;
	Car cr;
	Bike bk;

	public Employee(String empName, int empId, Car cr, Bike bk) {
		
		this.empName = empName;
		this.empId = empId;
		this.cr = cr;
		this.bk = bk;
	}
	void display() {
		System.out.println("Employee name: "+empName+"; "+"Employee Id: "+empId);
		System.out.println("Colour of the car: "+cr.colour+"; "+"Car name: "+cr.carName+"; "+
		"Registration number: "+cr.regNo);
		System.out.println("Bike name: "+bk.bikeName+"; "+"Registration number: "+bk.regNo);
	}

	public static void main(String[] args) {
		Car c= new Car("Black","Kia", 1103);
		Bike b =new Bike("Bullet", 5698);
		Employee em= new Employee("Alby",5,c,b);
		em.display();
		}
}
