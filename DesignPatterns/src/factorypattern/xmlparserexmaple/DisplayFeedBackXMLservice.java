package factorypattern.xmlparserexmaple;

public class DisplayFeedBackXMLservice implements DisplayService {

	@Override
	public XMLParser getParser() {
		
		return new FeedBackXMLParser();
	}

}
