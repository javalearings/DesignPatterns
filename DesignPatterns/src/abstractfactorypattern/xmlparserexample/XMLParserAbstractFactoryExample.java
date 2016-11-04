package abstractfactorypattern.xmlparserexample;

public class XMLParserAbstractFactoryExample {

	public static void main(String[] args) {
		AbstractParserFactory factory= ParserFactoryProduct.getFactory("NYParser");
		XMLParser parser=factory.getParser("NYERROR");
		System.out.println(parser.parse());
		
		factory=ParserFactoryProduct.getFactory("TYParser");
		parser=factory.getParser("TYFEEDBACK");
		System.out.println(parser.parse());
	}
}
