package utils;
public enum FlowerType {
    DAISY("Маргаритка"),
    CHAMOMILE("Ромашка"),
    DANDELION("Одуванчик"),
    CORNFLOWER("Василёк"),
    BLUEBELL("Колокольчик");

    private final String russianName;

    FlowerType(String russianName) {
        this.russianName = russianName;
    }


}
