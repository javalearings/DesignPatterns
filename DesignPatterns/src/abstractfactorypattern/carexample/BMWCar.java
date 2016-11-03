package abstractfactorypattern.carexample;

public class BMWCar implements Car {

	@Override
	public Part getWheels() {
		
		return new Part("BMW Wheels");
	}

	@Override
	public Part getStreeing() {
		
		return new Part("BMW Streering");
	}

	@Override
	public Part getEngine() {
		
		return new Part("BMW Engine");
	}
	

	@Override
	public Part getBody() {
		
		return new Part("BMW Body");
	}

}
