package factorypattern.xmlparserexmaple;

public class XMLErrorParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing Error XML");
		return "Error Message";
	}

}
