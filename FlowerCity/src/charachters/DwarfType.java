package charachters;


public class DwarfType {
    private final String name;
    private final String description;
    private final String specialty;

    // Private constructor to ensure controlled creation of types
    private DwarfType(String name, String description, String specialty) {
        this.name = name;
        this.description = description;
        this.specialty = specialty;
    }

    // Predefined Dwarf Types
    public static final DwarfType EXPLORER = new DwarfType(
            "Explorer",
            "Любит исследовать новые территории и наносить на карту неизведанное.",
            "Открывая новые места"
    );

    public static final DwarfType BUILDER = new DwarfType(
            "Builder",
            "Умеет строить здания и изготавливать инструменты.",
            "Строительство и ремонт конструкций"
    );

    public static final DwarfType FARMER = new DwarfType(
            "Farmer",
            "Любит выращивать растения и ухаживать за посевами.",
            "Посадка и выращивание"
    );

    public static final DwarfType ARTIST = new DwarfType(
            "Artist",
            "Увлечен созданием произведений искусства и украшением города.",
            "Живопись и изготовление украшений"
    );

    // Getters for the attributes
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return String.format("%s: %s (Specialty: %s)", name, description, specialty);
    }
}

