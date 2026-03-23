package seedu.duke;

import org.junit.jupiter.api.Test;
import seedu.duke.exception.DukeException;
import seedu.duke.parser.category.DrinksParser;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrinksParserTest {
    @Test
    public void parse_validInput_success() {
        String input = "expiryDate/2026-04-01 brand/CocaCola flavour/Cola volume/330";
        assertDoesNotThrow(() -> DrinksParser.parse(input));
    }

    @Test
    public void parse_missingBrand_throwsException() {
        String input = "expiryDate/2026-04-01 brand/ flavour/Cola volume/330";
        DukeException e = assertThrows(DukeException.class,
                () -> DrinksParser.parse(input));
        assertEquals("Missing brand for drinks.", e.getMessage());
    }

    @Test
    public void parse_invalidVolume_throwsException() {
        String input = "expiryDate/2026-04-01 brand/CocaCola flavour/Cola volume/big";
        DukeException e = assertThrows(DukeException.class,
                () -> DrinksParser.parse(input));
        assertEquals("Volume must be an integer.", e.getMessage());
    }
}
