package nvkh.main.oop.abstraction;

public class AutomaticCar implements Car {
	private String carType="Automatic";
	
	@Override
	public void turnOnCar() {
		// TODO Auto-generated method stub
		System.out.println("Automatic Car Turn on");
	}

	@Override
	public void turnOffCar() {
		// TODO Auto-generated method stub
		System.out.println("Automatic Car Turn off");
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return this.carType;
	}
	
}
