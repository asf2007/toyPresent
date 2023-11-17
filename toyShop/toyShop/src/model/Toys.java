package model;

public abstract class Toys {
private String name;
private static int id;
private int actionWeight;


    public Toys(String name, int actionWeight) {
        this.name = name;
        this.actionWeight = actionWeight;
        id++;
    }

    public void setActionWeight(int actionWeight) {
        this.actionWeight = actionWeight;
    }

    public String getName() {
        return name;
    }

    public  int getId() {
        return id;
    }

    public int getActionWeight() {
        return actionWeight;
    }

    @Override
    public String toString() {
        return "Игрушка [ название=" + name + ", id = " + id + ", частота выпадения = " + actionWeight + " ]";
    }

}
