package factorypattern;

public class FileLoggerFactory implements LoggerFactory {

	@Override
	public AppLogger getLogger() {
		return new FileLogger();
	}

}
