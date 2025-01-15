package charachters;

import city.House;
import city.Location;
import interfaces.Living;
import plants.Plant;
import base.GameObject;
import exceptions.InvalidMovementException;
import utils.Position;

import java.util.Random;

public abstract class Dwarf extends GameObject implements Living {
    private double height;
    private DwarfType type;
    private boolean isHungry = true; // Indicates if the dwarf is hungry
    private static final Random random = new Random();

    // Constructor to initialize the dwarf's name, type, and position
    public Dwarf(String name, DwarfType type, Position position) {
        super(name, position); // Call GameObject's constructor
        this.height = 5 + random.nextDouble() * 5; // Height between 5-10 cm
        this.type = type;
    }

    // Constructor for default type (FARMER)
    public Dwarf(String name, Position position) {
        super(name, position);
        this.height = 5 + random.nextDouble() * 5;
        this.type = DwarfType.FARMER; // Default type
    }

    // Getter for the type
    public DwarfType getType() {
        return type;
    }

    // Setter for the type
    public void setType(DwarfType type) {
        this.type = type;
    }

    // Method to make the dwarf walk to a new location
    @Override
    public void move(Location newLocation) throws InvalidMovementException {
        if (newLocation == null) {
            throw new InvalidMovementException("Невозможно переместиться в нулевое местоположение");
        }
        if (location != null) {
            location.removeObject(this); // Remove dwarf from current location
        }
        location = newLocation;
        location.addObject(this); // Add dwarf to new location
        System.out.printf("%s переехал в %s%n", getName(), newLocation.getName());
    }

    // Planting method
    public void plantSeed(Plant plant, Location location) {
        if (location != null && plant != null) {
            System.out.printf("%s plants a %s at %s%n", getName(), plant.getName(), location.getName());
            location.addObject(plant);
        }
    }

    // Eating method
    public void eat(String food) {
        if (isHungry) {
            System.out.printf("%s is eating %s%n", getName(), food);
            isHungry = false; // Dwarf is no longer hungry after eating
        } else {
            System.out.printf("%s is not hungry right now%n", getName());
        }
    }

    // Talking method
    public void talk(String message) {
        System.out.printf("%s says: \"%s\"%n", getName(), message);
    }

    @Override
    public void grow() {
        height *= 1.05; // Grow by 5%
    }

    @Override
    public void interact(GameObject other) {
        if (other instanceof Plant) {
            System.out.printf("%s (%s) is interacting with %s%n", getName(), type.getName(), other.getName());
        } else if (other instanceof Dwarf) {
            System.out.printf("%s greets %s%n", getName(), other.getName());
        }
    }

    // Method to print the dwarf's details
    @Override
    public String toString() {
        return String.format("Dwarf %s of type %s with height %.1f cm, position: %s",
                getName(),
                type.getName(),
                height,
                getPosition());
    }

    public void walk(House position) {
    }

    public abstract void move(House newLocation) throws InvalidMovementException;
}

