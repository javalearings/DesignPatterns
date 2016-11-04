package abstractfactorypattern.xmlparserexample;

public class NYFeedBackXMLParser implements XMLParser {

	@Override
	public String parse() {
		System.out.println("Parsing NYFeedback XML");
		return "NYFeedBack Message";
	}

}
