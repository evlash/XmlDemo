package ua.org.evlash;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SAXHandler extends DefaultHandler{

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start doc");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End doc");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("startElement");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("endElement");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("characters");
    }
}
