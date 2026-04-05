package seedu.inventorydock.exception;

/**
 * Signals that a requested category does not exist in the inventory.
 */
public class CategoryNotFoundException extends InventoryDockException {

    /**
     * Constructs a CategoryNotFoundException with a custom message.
     *
     * @param message The error message.
     */
    public CategoryNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a CategoryNotFoundException with a custom message and cause.
     *
     * @param message The error message.
     * @param cause The underlying cause of the exception.
     */
    public CategoryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a CategoryNotFoundException for a specific category name.
     *
     * @param categoryName The name of the category that was not found.
     */
    public CategoryNotFoundException(String categoryName) {
        super("Category '" + categoryName + "' does not exist in the inventory.");
    }
}
