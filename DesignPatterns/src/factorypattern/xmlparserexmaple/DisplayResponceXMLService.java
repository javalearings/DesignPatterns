package factorypattern.xmlparserexmaple;

public class DisplayResponceXMLService implements DisplayService {

	@Override
	public XMLParser getParser() {
		
		return new ResponceXMLParser();
	}

}
