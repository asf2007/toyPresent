package model;

public class Animal extends Toys{
    String color;
    private int id;
    public Animal(String name, int actionWeight, String color) {
        super(name, actionWeight);
        this.color = color;
        this.id = super.getId();
    }

    @Override
    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "мягкая игрушка зверюшка [ название=" + super.getName() + ", id = " + id + ", частота выпадения = " + super.getActionWeight() + ", цвет = " +color +" ]";
    }
}
