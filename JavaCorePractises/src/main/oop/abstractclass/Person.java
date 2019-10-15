package main.oop.abstractclass;

public abstract class Person {
	private String name;
	private String gender;

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	// abstract method
	public abstract void work();

	public void changeName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
