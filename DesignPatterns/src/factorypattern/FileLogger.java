package factorypattern;

public class FileLogger implements AppLogger {

	@Override
	public void log(String message) {
		
		System.out.println("Logging message into File "+message);
	}

}
