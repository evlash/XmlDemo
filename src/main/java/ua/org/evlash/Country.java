package ua.org.evlash;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

//Определяет корневой элемент XML файла.
@XmlRootElement
// Определяет порядок в котором элементы будут создаваться в XML файле
// Опциональное поле
@XmlType(propOrder = {"countryName", "countryPopulation", "listOfStates"})
public class Country {
    private String countryName;
    private double countryPopulation;
    private ArrayList<State> listOfStates;

    public Country() {

    }

    public String getCountryName() {
        return countryName;
    }

    @XmlElement
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getCountryPopulation() {
        return countryPopulation;
    }

    @XmlElement
    public void setCountryPopulation(double countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public ArrayList<State> getListOfStates() {
        return listOfStates;
    }

    @XmlElementWrapper(name = "stateList")
    @XmlElement(name = "state")
    public void setListOfStates(ArrayList<State> listOfStates) {
        this.listOfStates = listOfStates;
    }
}