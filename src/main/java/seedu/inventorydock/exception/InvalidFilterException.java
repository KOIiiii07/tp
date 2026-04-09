package seedu.inventorydock.exception;

/**
 * Signals that a filter or search mode is invalid.
 */
public class InvalidFilterException extends InventoryDockException {
    /**
     * Creates an exception with the specified message.
     *
     * @param message Message describing the error.
     */
    public InvalidFilterException(String message) {
        super(message);
    }
}
