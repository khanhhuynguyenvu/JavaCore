package main.oop.abstractclass;

public class Officer extends Person {
	private Integer officer_id;

	public Officer(String name, String gender, Integer officer_id) {
		super(name, gender);
		this.setOfficer_id(officer_id);
	}

	@Override
	public void work() {
		if (officer_id != 0)
			System.out.println("Officer " + this.getName() + " is in charge.");
		else {
			System.out.println("Officer " + this.getName() + "is not working anymore.");
		}
	}

	public Integer getOfficer_id() {
		return officer_id;
	}

	public void setOfficer_id(Integer officer_id) {
		this.officer_id = officer_id;
	}

}
