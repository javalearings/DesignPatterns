package factorypattern.xmlparserexmaple;

public class DisplayOrderXMLService implements DisplayService {

	@Override
	public XMLParser getParser() {
		
		return new OrderXMLParser();
	}

}
