package city;
import base.GameObject;
import exceptions.InvalidMovementException;
import utils.FlowerType;
import utils.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Street extends Location {
    private final FlowerType flowerType;
    private final List<House> houses = new ArrayList<>();

    public Street(String name, FlowerType flowerType) {
        super(name, new Position(10, 20));
        this.flowerType = flowerType;
    }



    @Override
    public void addObject(GameObject object) {
    }

    @Override
    public void removeObject(GameObject object) {
    }

    public abstract void move(House newLocation) throws InvalidMovementException;

    public abstract void interact();

    public abstract void interact(GameObject other);
}