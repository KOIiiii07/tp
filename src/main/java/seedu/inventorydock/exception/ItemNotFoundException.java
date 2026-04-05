package seedu.inventorydock.exception;

/**
 * Signals that a requested item could not be found in the inventory.
 */
public class ItemNotFoundException extends InventoryDockException {

    /**
     * Constructs an ItemNotFoundException with a custom message.
     *
     * @param message The error message.
     */
    public ItemNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs an ItemNotFoundException with a custom message and cause.
     *
     * @param message The error message.
     * @param cause The underlying cause of the exception.
     */
    public ItemNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs an ItemNotFoundException for a specific item name.
     *
     * @param itemName The name of the item that was not found.
     */
    public ItemNotFoundException(String itemName) {
        super("Item '" + itemName + "' not found in inventory.");
    }
}
