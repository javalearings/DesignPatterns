package abstractfactorypattern.xmlparserexample;

public class NYParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParser(String parserType) {
		
		switch (parserType) {
		case "NYERROR": return new NYErrorXMLParser();
		case "NYFEEDBACK": return new NYFeedBackXMLParser();	
			

			}
		return null;
	}

}
