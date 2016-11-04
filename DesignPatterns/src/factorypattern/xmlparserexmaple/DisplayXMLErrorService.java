package factorypattern.xmlparserexmaple;

public class DisplayXMLErrorService implements DisplayService {

	@Override
	public XMLParser getParser() {
	
		return new XMLErrorParser();
	}

}
