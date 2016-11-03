package abstractfactorypattern.carexample;



public class CarAbstractFactoryExample {

	private Car car;
	
	public static void main(String[] args) {
		CarAbstractFactoryExample abstractFactory=new CarAbstractFactoryExample();
		Car car = abstractFactory.getCar("BMW");
		System.out.println("Wheels :"+car.getWheels().getSpecification());
		System.out.println("Engine : "+car.getEngine().getSpecification());
		System.out.println("Streeing : "+car.getStreeing().getSpecification());
		System.out.println("Body : "+car.getBody().getSpecification());
	}
	
	public Car getCar(String carType) {
		if(carType.equals("BMW"))
			car=new BMWCar();
		else if(carType.equals("BenQ"))
			car = new BenQCar();
		else
			car = new GendralMotarsCar();
		return car;
	}
}
