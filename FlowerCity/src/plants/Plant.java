package plants;

import base.GameObject;
import city.House;
import city.Location;
import exceptions.InvalidMovementException;
import interfaces.Living;
import utils.FlowerType;
import utils.Position;

public abstract class Plant extends GameObject implements Living {
    private double height;
    protected boolean alive = true;

    public Plant(String name, Position position, double height) {
        super(name, position);
        this.height = height;
    }

    public Plant(String ромашка, FlowerType flowerType) {
    }

    public double getHeight() {
        return height;
    }

    public void grow() {
        height += 1.0;
    }
    @Override
    public void interact(GameObject other) {
        System.out.printf("%s interacts with %s%n", getName(), other.getName());
    }
    @Override
    public void move(Location newLocation) throws InvalidMovementException {
        throw new InvalidMovementException("Plants cannot move!");
    }

    public abstract void move(House newLocation) throws InvalidMovementException;
}
