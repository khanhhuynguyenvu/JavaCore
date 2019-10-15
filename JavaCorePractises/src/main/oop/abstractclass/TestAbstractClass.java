package main.oop.abstractclass;

public class TestAbstractClass {
	public static void main(String[] args) {
		Person student = new Employee("Jane", "Female",0);
		Person employee = new Employee("Dave", "Male", 1); 
		Person officer = new Officer("Bond", "Male",1);
		student.work();
		employee.work();
		officer.work();
	}
}
