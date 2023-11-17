import controller.Controller;
import model.Animal;
import model.Car;
import model.PresentAction;
import model.Toys;
import view.View;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller(new View(), new PresentAction("подарки"));
        controller.Start();

    }
}