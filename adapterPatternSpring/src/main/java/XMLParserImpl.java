/**
 * Created by machu on 2017-05-27.
 */
public class XMLParserImpl implements XMLParser{

    private String version;

    public XMLParserImpl() {
    }

    public void parse(String path) {
        System.out.println("parsing "+ path + "using XMLParserImpl");
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
