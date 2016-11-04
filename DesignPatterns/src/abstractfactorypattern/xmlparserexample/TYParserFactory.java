package abstractfactorypattern.xmlparserexample;

public class TYParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParser(String parserType) {
		switch (parserType) {
		case "TYERROR": return new TYErrorXMLParser();
		case "TYFEEDBACK": return new TYFeedBackXMLParser();	
			

			}
		return null;
	}

}
