package abstractfactorypattern.xmlparserexample;

public interface AbstractParserFactory {
	public XMLParser getParser(String parserType);
}
