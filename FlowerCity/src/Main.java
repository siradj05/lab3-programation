import base.GameObject;
import charachters.Dwarf;
import charachters.DwarfType;
import city.*;
import plants.Flower;
import plants.Plant;
import utils.FlowerType;
import utils.Position;
import exceptions.InvalidMovementException;

public class Main {
    public static void main(String[] args) {
        // Introduction
        System.out.println("Добро пожаловать в Цветочный город — волшебное место, где счастливо живут крошечные гномы.");
        System.out.println("Город утопает в цветах, а улицы названы в честь прекрасных цветов.");
        System.out.println("Давайте исследуем город и познакомимся с гномами, которые называют его своим домом!\n");

        // Create the river
        River ogurtsovayaRiver = new River("Огурцовая река");
        System.out.println("Город построен вдоль реки Огурцовой, известной своими пышными огуречными плантациями.\n");

        // Create the city
        City flowerCity = new City("Цветочный город", ogurtsovayaRiver);

        // Add streets to the city
        Street bellStreet = new Street("улица Колокольчиков", FlowerType.BLUEBELL) {
            @Override
            public void move(House newLocation) throws InvalidMovementException {

            }

            @Override
            public void interact() {

            }

            @Override
            public void interact(GameObject other) {

            }
        };
        Street chamomileAlley = new Street("аллея Ромашек", FlowerType.CHAMOMILE) {
            @Override
            public void move(House newLocation) throws InvalidMovementException {

            }

            @Override
            public void interact() {

            }

            @Override
            public void interact(GameObject other) {

            }
        };
        Street cornflowerBoulevard = new Street("бульвар Васильков", FlowerType.CORNFLOWER) {
            @Override
            public void move(House newLocation) throws InvalidMovementException {

            }

            @Override
            public void interact() {

            }

            @Override
            public void interact(GameObject other) {

            }
        };
        flowerCity.addStreet(bellStreet);
        flowerCity.addStreet(chamomileAlley);
        flowerCity.addStreet(cornflowerBoulevard);

        System.out.println("В Цветочном городе есть три главные улицы:");
        System.out.println("- " + bellStreet.getName());
        System.out.println("- " + chamomileAlley.getName());
        System.out.println("- " + cornflowerBoulevard.getName() + "\n");

        // Create houses for dwarfs
        House neznaikaHouse = new House("Дом Незнайки");
        neznaikaHouse.addFlower(new Flower("Ромашка", FlowerType.CHAMOMILE));
        neznaikaHouse.addFlower(new Flower("Одуванчик", FlowerType.DANDELION));

        House abdoulHouse = new House("Дом Абдула");
        abdoulHouse.addFlower(new Flower("Маргаритка", FlowerType.DAISY));
        abdoulHouse.addFlower(new Flower("Колокольчик", FlowerType.BLUEBELL));

        // Create dwarfs
        Dwarf dwarf1 = new Dwarf("Незнайка", DwarfType.EXPLORER, new Position(9, 18)) {
            @Override
            public void interact() {

            }

            @Override
            public void move(House newLocation) throws InvalidMovementException {

            }
        };
        Dwarf dwarf2 = new Dwarf("Ван", DwarfType.FARMER, new Position(12, 24)) {
            @Override
            public void interact() {

            }

            @Override
            public void move(House newLocation) throws InvalidMovementException {

            }
        };
        Dwarf dwarf3 = new Dwarf("Абдул", DwarfType.BUILDER, new Position(14, 24)) {
            @Override
            public void interact() {

            }

            @Override
            public void move(House newLocation) throws InvalidMovementException {

            }
        };
        Dwarf dwarf4 = new Dwarf("Никита", DwarfType.ARTIST, new Position(10, 18)) {
            @Override
            public void interact() {

            }

            @Override
            public void move(House newLocation) throws InvalidMovementException {

            }
        };

        System.out.println("Познакомьтесь с гномами:");
        describeDwarf(dwarf1);
        describeDwarf(dwarf2);
        describeDwarf(dwarf3);
        describeDwarf(dwarf4);

        // Actions and interactions
        System.out.println("\nГномы начинают свой день с увлекательных занятий:\n");

        // Незнайка explores Flower City
        System.out.println("Незнайка decides to explore the city.");
        dwarf1.walk(flowerCity.getPosition());
        System.out.println(dwarf1.getName() + " добрался до Цветочного города и готов к приключениям!\n");

        // Ван plants a sunflower
        System.out.println("Ван, фермер, любит сажать цветы.");
        Plant sunflower = new Flower("Подсолнух", new Position(13, 22), 8.0);
        dwarf2.plantSeed(sunflower, flowerCity);
        System.out.println();

        // Абдул eats food
        System.out.println("Абдул, после тяжелой работы строителем, решает поесть.");
        dwarf3.eat("Огурец");
        dwarf3.eat("Яблоко");
        System.out.println();

        // Никита talks about his passion
        System.out.println("Никита, художник, делится своими мыслями.");
        dwarf4.talk("Искусство – это то, что приносит красоту в нашу жизнь!");
        System.out.println();

        // Незнайка visits his house
        System.out.println("Незнайка посещает его уютный дом.");
        dwarf1.walk(neznaikaHouse);
        System.out.println();

        // Ван visits Абдул's house
        System.out.println("Ван решает навестить дом Абдула, чтобы полюбоваться цветами.");
        dwarf2.walk(abdoulHouse);
        System.out.println();

        // Final state
        System.out.println("На конец дня представляем вам итоговое состояние Цветочного города и его жителей:");
        System.out.println("- " + dwarf1);
        System.out.println("- " + dwarf2);
        System.out.println("- " + dwarf3);
        System.out.println("- " + dwarf4);
        System.out.println("Сад: " + flowerCity);

    }

    // Helper method to describe a dwarf
    private static void describeDwarf(Dwarf dwarf) {
        System.out.printf("- %s is a %s. %s Они известны тем, что %s.%n",
                dwarf.getName(),
                dwarf.getType().getName(),
                dwarf.getType().getDescription(),
                dwarf.getType().getSpecialty());
    }
}
