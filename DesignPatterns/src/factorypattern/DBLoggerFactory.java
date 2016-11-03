package factorypattern;

public class DBLoggerFactory implements LoggerFactory {

	@Override
	public AppLogger getLogger() {
		return new DBlogger();
	}

}
