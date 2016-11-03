package factorypattern;

public class DBlogger implements AppLogger {

	@Override
	public void log(String message) {
			
		System.out.println("Logging message into DB "+message);
	}

}
