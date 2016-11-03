package factorypattern;

public class ConsoleLoggerFactory implements LoggerFactory {

	@Override
	public AppLogger getLogger() {
		return new ConsoleLogger();
	}

}
