package seedu.inventorydock.exception;

/**
 * Signals that the user provided more than one filter when only one is allowed.
 */
public class MultipleFilterException extends InventoryDockException {
    public MultipleFilterException(String message) {
        super(message);
    }

    public MultipleFilterException(String message, Throwable cause) {
        super(message, cause);
    }
}
