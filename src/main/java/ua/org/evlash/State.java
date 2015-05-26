package ua.org.evlash;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "com.example.Country")
public class State {
    private String stateName;
    long statePopulation;

    public State() {
    }

    public State(String stateName, long statePopulation) {
        super();
        this.stateName = stateName;
        this.statePopulation = statePopulation;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public long getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(long statePopulation) {
        this.statePopulation = statePopulation;
    }
}