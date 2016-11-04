package abstractfactorypattern.xmlparserexample;

public class ParserFactoryProduct {

   private ParserFactoryProduct() {
	 throw new AssertionError();
   }
   public static AbstractParserFactory getFactory(String factoryType) {
	
	   switch (factoryType) {
	case "NYParser": return new NYParserFactory();
	case "TYParser": return new TYParserFactory();	
		

	default:
		break;
	}
	   
	   return null;
	
}
}
