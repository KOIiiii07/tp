package seedu.duke;

import org.junit.jupiter.api.Test;
import seedu.duke.exception.DukeException;
import seedu.duke.parser.category.SetMealParser;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SetMealParserTest {
    @Test
    public void parse_validInput_success() {
        String input = "expiryDate/2026-06-01 mealType/Western foodSize/Large minToUnfreeze/20 isSpicy/false";
        assertDoesNotThrow(() -> SetMealParser.parse(input));
    }

    @Test
    public void parse_missingFoodSize_throwsException() {
        String input = "expiryDate/2026-06-01 mealType/Western foodSize/ minToUnfreeze/20 isSpicy/false";
        DukeException e = assertThrows(DukeException.class,
                () -> SetMealParser.parse(input));
        assertEquals("Missing foodSize for set meal.", e.getMessage());
    }

    @Test
    public void parse_invalidMinToUnfreeze_throwsException() {
        String input = "expiryDate/2026-06-01 mealType/Western foodSize/Large minToUnfreeze/abc isSpicy/false";
        DukeException e = assertThrows(DukeException.class,
                () -> SetMealParser.parse(input));
        assertEquals("minToUnfreeze must be an integer.", e.getMessage());
    }
}