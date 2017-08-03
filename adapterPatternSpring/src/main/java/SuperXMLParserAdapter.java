/**
 * Created by machu on 2017-05-27.
 */
public class SuperXMLParserAdapter implements XMLParser{
    //Spring zrobi DI dla ponizszej referencji
    private SuperXMLParser newParser;

    public SuperXMLParserAdapter() {

    }

    public void parse(String path) {
        newParser.readXML(path,1);
    }

    public SuperXMLParser getNewParser() {
        return newParser;
    }

    public void setNewParser(SuperXMLParser newParser) {
        this.newParser = newParser;
    }
}
