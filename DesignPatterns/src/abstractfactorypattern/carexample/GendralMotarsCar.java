package abstractfactorypattern.carexample;

public class GendralMotarsCar implements Car {

	@Override
	public Part getWheels() {
		
		return new Part("Gendral Motors Wheels");
	}

	@Override
	public Part getStreeing() {

		return new Part("Gendral Motars Streering ");
	}

	@Override
	public Part getEngine() {

		return new Part("Gedral Motars Engine");
	}

	@Override
	public Part getBody() {

		return new Part("Gendral Motars Body");
	}

}
