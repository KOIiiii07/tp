package seedu.duke.model.items;

import seedu.duke.model.Item;

public class Drinks extends Item {
    private String brand;
    private String flavour;
    private int volume;
    private boolean isCold;
    private boolean isCanned;

    public Drinks(String name, int quantity, String binLocation, String expiryDate,
                  String brand, String flavour, int volume,
                  boolean isCold, boolean isCanned) {
        super(name, quantity, binLocation, expiryDate);
        this.brand = brand;
        this.flavour = flavour;
        this.volume = volume;
        this.isCold = isCold;
        this.isCanned = isCanned;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }

    public boolean isCanned() {
        return isCanned;
    }

    public void setCanned(boolean canned) {
        isCanned = canned;
    }

    @Override
    public String toString() {
        return "[Drinks] " + super.toString()
                + ", Brand: " + brand
                + ", Flavour: " + flavour
                + ", Volume: " + volume + "ml"
                + ", Cold: " + isCold
                + ", Canned: " + isCanned;
    }
}
