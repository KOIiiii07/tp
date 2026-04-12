package seedu.inventorydock.parser.category;

import org.junit.jupiter.api.Test;
import seedu.inventorydock.exception.InventoryDockException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BooleanFieldParserTest {
    @Test
    public void parse_validTrue_success() throws Exception {
        String input = "category/fruits item/apple bin/A-1 qty/1 expiryDate/2026-01-01 isRipe/true";

        boolean result = BooleanFieldParser.parse(input, "isRipe/");

        assertTrue(result);
    }

    @Test
    public void parse_validFalse_success() throws Exception {
        String input = "category/snacks item/chips bin/A-1 qty/1 expiryDate/2026-01-01 isCrunchy/false";

        boolean result = BooleanFieldParser.parse(input, "isCrunchy/");

        assertFalse(result);
    }

    @Test
    public void parse_missingValue_throwsException() {
        String input = "category/fruits item/apple bin/A-1 qty/1 expiryDate/2026-01-01 isRipe/";

        InventoryDockException e = assertThrows(InventoryDockException.class,
                () -> BooleanFieldParser.parse(input, "isRipe/"));

        assertEquals("value for isRipe/ is required.", e.getMessage());
    }

    @Test
    public void parse_invalidValue_throwsException() {
        String input = "category/fruits item/apple bin/A-1 qty/1 expiryDate/2026-01-01 isRipe/yes";

        InventoryDockException e = assertThrows(InventoryDockException.class,
                () -> BooleanFieldParser.parse(input, "isRipe/"));

        assertEquals("isRipe/ must be true or false.", e.getMessage());
    }
}
