package seedu.duke.model.items;

import seedu.duke.model.Item;

/**
 * Represents an ice cream item in the inventory.
 */
public class IceCream extends Item {
    private String flavour;
    private boolean isDairyFree;

    /**
     * Creates an ice cream item with the given details.
     *
     * @param name Name of the ice cream.
     * @param quantity Quantity of the ice cream.
     * @param binLocation Storage bin location.
     * @param expiryDate Expiry date.
     * @param flavour Flavour of the ice cream.
     * @param isDairyFree Whether the ice cream is dairy-free.
     */
    public IceCream(String name, int quantity, String binLocation,
                    String expiryDate, String flavour, boolean isDairyFree) {
        super(name, quantity, binLocation, expiryDate);
        this.flavour = flavour;
        this.isDairyFree = isDairyFree;
    }

    /** @return Flavour of the ice cream. */
    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public boolean isDairyFree() {
        return isDairyFree;
    }

    public void setDairyFree(boolean isDairyFree) {
        this.isDairyFree = isDairyFree;
    }

    @Override
    public String toStorageString(String categoryName) {
        return super.toStorageString(categoryName)
                + " flavour/" + flavour
                + " isDairyFree/" + isDairyFree;
    }

    @Override
    public String toString() {
        return "[IceCream] " + super.toString()
                + ", Flavour: " + flavour
                + ", DairyFree: " + isDairyFree;
    }
}
