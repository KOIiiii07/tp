package seedu.duke.model;

/**
 * Represents an item stored in the inventory.
 * An <code>Item</code> object stores a name, quantity, bin location, and expiry date.
 */
public class Item {
    private String name;
    private int quantity;
    private String binLocation;
    private String expiryDate;

    /**
     * Creates an item with the specified details.
     *
     * @param name Name of the item.
     * @param quantity Quantity of the item.
     * @param binLocation Bin location of the item.
     * @param expiryDate Expiry date of the item.
     */
    public Item(String name, int quantity, String binLocation,
                String expiryDate) {
        this.name = name;
        this.quantity = quantity;
        this.binLocation = binLocation;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBinLocation() {
        return binLocation;
    }

    public void setBinLocation(String binLocation) {
        this.binLocation = binLocation;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Returns the storage format used when persisting the item.
     *
     * @param categoryName Name of the category containing the item.
     * @return Storage string containing the category and item fields.
     */
    public String toStorageString(String categoryName) {
        return "category/" + categoryName
                + " item/" + name
                + " bin/" + binLocation
                + " qty/" + quantity
                + " expiryDate/" + expiryDate;
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s, Quantity: %d, Bin: %s, Expiry: %s",
                name, quantity, binLocation, expiryDate
        );
    }
}
