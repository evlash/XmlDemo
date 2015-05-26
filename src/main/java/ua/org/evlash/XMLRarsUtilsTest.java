package ua.org.evlash;

import java.util.ArrayList;

/**
 * Created by Dmitriy on 26.05.2015.
 */
public class XMLRarsUtilsTest {
    public static void main(String[] args) throws Exception {

        XMLRarsUtils.parsSAX("source.xml");

        Country countrylndia = new Country();
        countrylndia.setCountryName("India");
        countrylndia.setCountryPopulation(5000000);

        ArrayList<State> stateList = new ArrayList<State>();
        State mpState = new State("рыворыл", 1000000);
        stateList.add(mpState);
        State maharastraState = new State("Maharastra", 2000000);
        stateList.add(maharastraState);
        countrylndia.setListOfStates(stateList);

        XMLRarsUtils.marshallingJAXB("CountryRecord.xml", countrylndia);
        XMLRarsUtils.unmarshallingJAXB("CountryRecord.xml");

    }
}
