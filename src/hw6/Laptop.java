package hw6;

public class Laptop {
    String brand;
    String color;
    String operatingSystem;

    public Laptop(String brand, String color, String operatingSystem) {
        this.brand = brand;
        this.color = color;
        this.operatingSystem = operatingSystem;

    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "\n Laptop \n brand -> " + brand + ", \n color -> " + color + ", \n OS -> " + operatingSystem  + "\n";
    }

}

