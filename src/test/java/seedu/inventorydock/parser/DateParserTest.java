package seedu.inventorydock.parser;

import org.junit.jupiter.api.Test;
import seedu.inventorydock.exception.InvalidDateException;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateParserTest {
    @Test
    public void validateDate_validDate_success() {
        assertDoesNotThrow(() -> DateParser.validateDate("2026-03-20"));
    }

    @Test
    public void validateDate_nullDate_throwsException() {
        InvalidDateException e = assertThrows(InvalidDateException.class,
                () -> DateParser.validateDate(null));
        assertEquals("Missing expiry date", e.getMessage());
    }

    @Test
    public void validateDate_invalidDate_throwsException() {
        InvalidDateException e = assertThrows(InvalidDateException.class,
                () -> DateParser.validateDate("20-03-2026"));
        assertEquals("Invalid date. Please use yyyy-M-d.", e.getMessage());
    }

    @Test
    public void parseDate_validDate_returnsLocalDate() throws Exception {
        LocalDate date = DateParser.parseDate("2026-03-20");

        assertEquals(LocalDate.of(2026, 3, 20), date);
    }

    @Test
    public void parseDate_nullDate_throwsException() {
        InvalidDateException e = assertThrows(InvalidDateException.class,
                () -> DateParser.parseDate(null));
        assertEquals("Missing expiry date", e.getMessage());
    }

    @Test
    public void parseDate_invalidDate_throwsException() {
        InvalidDateException e = assertThrows(InvalidDateException.class,
                () -> DateParser.parseDate("20-03-2026"));
        assertEquals("Invalid date. Please use yyyy-M-d.", e.getMessage());
    }
}
