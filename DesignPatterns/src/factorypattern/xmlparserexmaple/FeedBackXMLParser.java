package factorypattern.xmlparserexmaple;

public class FeedBackXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing FeeedBack XML");
		return "FeedBack Message";
	}

}
