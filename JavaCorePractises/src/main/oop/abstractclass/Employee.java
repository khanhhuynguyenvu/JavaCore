package main.oop.abstractclass;

public class Employee extends Person {
	private Integer empId;

	public Employee(String name, String gender, Integer empId) {
		super(name, gender);
		this.empId = empId;
	}

	@Override
	public void work() {
		if (empId == 0) {
			System.out.println(this.getName() + " is not working.");
		} else {
			System.out.println(this.getName() + " is working as employee.");
		}
	}

}
