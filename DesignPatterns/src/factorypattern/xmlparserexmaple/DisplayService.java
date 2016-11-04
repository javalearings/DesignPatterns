package factorypattern.xmlparserexmaple;

public interface DisplayService {

	public default void display() {
		XMLParser paser= getParser();
		System.out.println("Parsed message "+paser.parse());
	}
	public XMLParser getParser();
}
