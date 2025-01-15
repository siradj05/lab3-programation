package city;
import base.GameObject;
import java.util.ArrayList;
import java.util.List;

import utils.Position;

public class City extends Location {
    private final List<Street> streets = new ArrayList<>();
    private final River river;

    public City(String name, River river) {
        super(name, new Position(10, 20));
        this.river = river;
    }

    public void addStreet(Street street) {
        streets.add(street);
    }

@Override
    public void addObject(GameObject object) {
}


    public void removeObject(GameObject object) {
    }

    @Override
    public String toString() {
        return String.format("Город %s стоит на берегу %s", getName(), river.getName());
    }
}
