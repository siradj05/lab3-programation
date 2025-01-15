package base;

import java.util.Objects;

import city.House;
import city.Location;
import utils.Position;
import exceptions.InvalidMovementException;

// Abstract base class for all game objects
public abstract class GameObject {
    protected String name;
    protected Location location;
    protected Position position;

    public GameObject(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public GameObject() {

    }

    public String getName() {
        return name;
    }
    public Position getPosition() {
        return position;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameObject)) return false;
        GameObject that = (GameObject) o;
        return Objects.equals(name, that.name);
    }
    public abstract void interact();

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public abstract void interact(GameObject other);

    public abstract void move(Location newLocation) throws InvalidMovementException;
}
