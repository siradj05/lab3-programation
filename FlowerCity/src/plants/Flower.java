package plants;

import city.House;
import exceptions.InvalidMovementException;
import utils.FlowerType;
import utils.Position;

public class Flower extends Plant {
    public Flower(String name, Position position, double height) {
        super(name, position, height);
    }

    public Flower(String ромашка, FlowerType flowerType) {
        super(ромашка, flowerType);
    }

    @Override
    public String toString() {
        return "Flower{name='" + getName() + "', position=" + getPosition() + "', height=" + getHeight() + "}";
    }



    @Override
    public void move(House newLocation) throws InvalidMovementException {

    }

    @Override
    public void interact() {

    }
}
