package nvkh.main.oop.abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		Car carNumberOne = new ManualCar();
		Car carNumberTwo = new AutomaticCar();
		carNumberOne.turnOnCar();
		carNumberOne.turnOffCar();
		System.out.println("Car number one type: "+carNumberOne.getCarType());
		carNumberTwo.turnOnCar();
		carNumberTwo.turnOffCar();
		System.out.println("Car number two type: "+carNumberTwo.getCarType());
	}
}
