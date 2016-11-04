package abstractfactorypattern.xmlparserexample;

public class TYFeedBackXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing TY FeedBack XML");
		return "TY FeedBack Message";
	}

}
