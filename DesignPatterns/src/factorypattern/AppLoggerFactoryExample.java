package factorypattern;

public class AppLoggerFactoryExample {

	public static void main(String[] args) {
		LoggerFactory factory=new FileLoggerFactory();
		factory.displayLog();
		
		factory = new DBLoggerFactory();
		factory.displayLog();
		
		factory = new ConsoleLoggerFactory();
		factory.displayLog();
		
	}
}
