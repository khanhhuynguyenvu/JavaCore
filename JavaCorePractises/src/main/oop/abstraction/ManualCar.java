package main.oop.abstraction;

public class ManualCar implements Car {
	private String carType="Manual";
	@Override
	public void turnOnCar() {
		// TODO Auto-generated method stub
		System.out.println("Manual Car Turn on");
	}

	@Override
	public void turnOffCar() {
		// TODO Auto-generated method stub
		System.out.println("Manual Car Turn off");
	}

	@Override
	public String getCarType() {
		// TODO Auto-generated method stub
		return this.carType;
	}
	
}
