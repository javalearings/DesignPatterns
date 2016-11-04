package abstractfactorypattern.xmlparserexample;

public class TYErrorXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing TY Error XML");
		return "TY Error Message";
	}

}
