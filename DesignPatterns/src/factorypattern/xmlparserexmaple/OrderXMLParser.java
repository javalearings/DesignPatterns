package factorypattern.xmlparserexmaple;

public class OrderXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing Order XML");
		return "Order Message";
	}

}
