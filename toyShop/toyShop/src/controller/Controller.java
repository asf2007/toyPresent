package controller;

import model.*;
import view.View;

public class Controller {
    View view;
    PresentAction action;

    public Controller(View view, PresentAction action) {
        this.view = view;
        this.action = action;
    }

    public void Start(){
        Toys rab1 = new Animal("rabbit1", 10, "black");
        Toys car1 = new Car("Taxi", 20, "ford");
        Toys bear1 = new Animal("bear1", 5, "black");
        Toys car2 = new Car("BMW", 15, "BMW");
        Toys plane1 = new Plane("Истребитель", 30, "миг-29");
        Toys plan2 = new Plane("Кукурузник", 80, "Ан-2");


        action.addPresent(rab1);
        action.addPresent(car1);
        action.addPresent(bear1);
        action.addPresent(car2);
        action.addPresent(plan2);
        action.addPresent(plane1);
        view.actionBegin();
        action.getPresent();
        action.getPresent();
        action.getPresent();
        action.getPresent();
        action.getPresent();
        action.getPresent();
        view.finishAction();

    }
}
