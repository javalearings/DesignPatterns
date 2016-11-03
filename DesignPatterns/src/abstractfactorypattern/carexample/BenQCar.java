package abstractfactorypattern.carexample;

public class BenQCar implements Car {

	@Override
	public Part getWheels() {
		
		return new Part("BenQ Wheels");
	}

	@Override
	public Part getStreeing() {

		return new Part("BenQ Steering");
	}

	@Override
	public Part getEngine() {

		return new Part("BenQ Engine");
	}

	@Override
	public Part getBody() {

		return new Part("BenQ Body");
	}

}
