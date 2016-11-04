package factorypattern.xmlparserexmaple;

public class XMLParserFactoryExample {

	public static void main(String[] args) {
		
		DisplayService service=new DisplayXMLErrorService();
		service.display();
		
		service=new DisplayFeedBackXMLservice();
		service.display();
		
		service=new DisplayOrderXMLService();
		service.display();
		
		service=new DisplayResponceXMLService();
		service.display();
	}
}
