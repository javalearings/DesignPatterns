package factorypattern.xmlparserexmaple;

public class ResponceXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing Responce XML");
		return "Responce Message";
	}

}
