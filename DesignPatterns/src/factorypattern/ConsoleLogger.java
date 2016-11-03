package factorypattern;

public class ConsoleLogger implements AppLogger {

	@Override
	public void log(String message) {
		System.out.println("Logging message into Console "+message);
	}

}
