package factorypattern;

public interface LoggerFactory {
	public default void displayLog()
	{
		AppLogger logger= getLogger();
		logger.log("Logging");
	}
	public AppLogger getLogger(); 
}
