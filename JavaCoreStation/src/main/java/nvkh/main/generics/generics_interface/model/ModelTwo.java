package nvkh.main.generics.generics_interface.model;

public class ModelTwo {
	private int id;
	private String name;
	private Double num;

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Model2 [id=" + id + ", name=" + name + ", num=" + num + "]";
	}

	public ModelTwo(int id, String name, Double num) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
	}
	
}
