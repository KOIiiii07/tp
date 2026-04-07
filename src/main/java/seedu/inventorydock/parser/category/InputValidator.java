package seedu.inventorydock.parser.category;

import seedu.inventorydock.exception.InventoryDockException;
import seedu.inventorydock.exception.InvalidCommandException;
import seedu.inventorydock.exception.MissingArgumentException;

public class InputValidator {
    public static void validate(
            String input, String... fields) throws InventoryDockException {
        assert input != null : "InputValidator received null input.";
        assert fields != null && fields.length > 0 : "Fields must be provide for validation.";

        int previous = -1;

        for (String field : fields) {
            int current = input.indexOf(field);

            if (current == -1) {
                throw new MissingArgumentException("Missing required field: " + field);
            }

            if (current < previous) {
                throw new InvalidCommandException("Fields must follow the correct order. " +
                        "Run 'help' for supported command.");
            }
            previous = current;
        }
    }
}

