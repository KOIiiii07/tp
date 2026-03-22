package seedu.duke;

import org.junit.jupiter.api.Test;
import seedu.duke.exception.DukeException;
import seedu.duke.parser.category.IcecreamParser;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IcecreamParserTest {
    @Test
    public void parse_validInput_success() {
        String input = "expiryDate/2026-03-28 flavour/Vanilla isDairyFree/false";
        assertDoesNotThrow(() -> IcecreamParser.parse(input));
    }

    @Test
    public void parse_missingFlavour_throwsException() {
        String input = "expiryDate/2026-03-28 flavour/ isDairyFree/false";
        DukeException e = assertThrows(DukeException.class,
                () -> IcecreamParser.parse(input));
        assertEquals("Missing flavour for ice cream.", e.getMessage());
    }

    @Test
    public void parse_invalidBoolean_throwsException() {
        String input = "expiryDate/2026-03-28 flavour/Vanilla isDairyFree/maybe";
        DukeException e = assertThrows(DukeException.class,
                () -> IcecreamParser.parse(input));
        assertEquals("isDairyFree must be true or false", e.getMessage());
    }
}