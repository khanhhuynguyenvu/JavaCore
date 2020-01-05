package nvkh.main.generics.generics_interface.model;

public class ModelOne {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Model1 [id=" + id + ", name=" + name + "]";
	}

	public ModelOne(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
