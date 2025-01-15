package city;

import base.GameObject;
import charachters.Dwarf;
import plants.Flower;
import utils.Position;

import java.util.ArrayList;
import java.util.List;

// House implementation
public class House extends Location {
    private final List<Flower> flowers = new ArrayList<>();


    public House(String name) {
        super(name, new Position(10, 20));
    }



    public void addFlower(Flower flower) {
        flowers.add(flower);
    }



    @Override
    public void addObject(GameObject object) {
        if (object instanceof Flower) {
            addFlower((Flower) object);
        }
    }

    @Override
    public void removeObject(GameObject object) {

    }
}

