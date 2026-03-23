package seedu.duke.model.items;

import seedu.duke.model.Item;

public class Sweets extends Item {
    private String brand;
    private String ingradient;
    private String sweetnessLevel;

    public Sweets(String name, int quantity, String binLocation,
                  String expiryDate, String brand, String ingradient,
                  String sweetnessLevel) {
        super(name, quantity, binLocation, expiryDate);
        this.brand = brand;
        this.ingradient = ingradient;
        this.sweetnessLevel = sweetnessLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getIngradient() {
        return ingradient;
    }

    public void setIngradient(String ingradient) {
        this.ingradient = ingradient;
    }

    public String getSweetnessLevel() {
        return sweetnessLevel;
    }

    public void setSweetnessLevel(String sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    @Override
    public String toString() {
        return "[Sweets] " + super.toString()
                + ", Brand: " + brand
                + ", Ingradient: " + ingradient
                + ", Sweetness Level: " + sweetnessLevel;
    }
}
