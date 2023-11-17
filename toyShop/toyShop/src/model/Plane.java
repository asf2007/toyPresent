package model;

public class Plane extends Toys{
    private int id;
    private String model;

    public Plane(String name, int actionWeight, String model) {
        super(name, actionWeight);
        this.model = model;
        this.id = super.getId();
    }

    @Override
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }
    @Override
    public String toString() {
        return "самолет [ название=" + super.getName() + ", id = " + id + ", частота выпадения = " + super.getActionWeight() + ", модель = " + model +" ]";
    }
}
