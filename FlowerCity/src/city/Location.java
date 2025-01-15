package city;



import base.GameObject;
import utils.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Location {
    private String name;
    private List<GameObject> objects;

    // Constructor
    public Location(String name, Position position) {
        this.name = name;
        this.objects = new ArrayList<>();
    }
    ;

    // Getter for the name
    public String getName() {
        return name;
    }

    // Method to add objects to this location
    public void addObject(GameObject object) {
        objects.add(object);
    }


    // Method to display all objects in the location
    public List<GameObject> getObjects() {
        return objects;
    }

    @Override
    public String toString() {
        return "Location: " + name + ", Objects: " + objects;
    }

    public abstract void removeObject(GameObject object);

    public House getPosition() {
        return null;
    }
}


