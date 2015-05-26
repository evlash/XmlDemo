package ua.org.evlash;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class XMLRarsUtils {
    public static Object parsDOM(String filePath) throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(false); // optional
        DocumentBuilder builder = factory.newDocumentBuilder();
        File xmlFile = new File(filePath);
        Document document = builder.parse(xmlFile);
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++){
            System.out.println(nodeList.item(i).getTextContent());
        }
        return null;
    }

    public static Object parsSAX(String filePath) throws Exception{
        File xmlFile = new File(filePath);
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        SAXParser parser = parserFactor.newSAXParser();
        SAXHandler handler = new SAXHandler();
        parser.parse(xmlFile ,handler);



        return null;
    }
    public static Object marshallingJAXB(String filePath) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
// for getting nice formatted output добавим свойство, которое выдаст нам читабелный формат в результате
        jaxbMarshaller. setProperty(Marshaller.JAXB_FORMATTED_0UTPUT, Boolean.TRUE);
        File XMLfile = new File(filePath);
// Пишем в XML файл
        jaxbMarshaller.marshal(countrylndia, XMLfile);
// Пишем в консоль
        jaxbMarshaller.marshal(countrylndia. System.out);
    return null;

    }
    public static Object unmarshallingJAXB(String filePath) throws Exception {

        return null;
    }
}
