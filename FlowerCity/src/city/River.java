package city;

import java.util.ArrayList;
import java.util.List;

import plants.Plant;

public class River {
    private final String name;
    private final List<Plant> plants = new ArrayList<>();

    public River(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }
}
