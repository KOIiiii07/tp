package seedu.duke.parser;

import seedu.duke.exception.DukeException;

public class ToiletriesParser {
    public static ParsedToiletriesFields parse(String input) throws DukeException {
        String brand = FieldParser.extractField(input, "brand/", "isLiquid/");
        if (brand == null || brand.trim().isEmpty()) {
            throw new DukeException("Missing brand for toiletries.");
        }

        String liquidString = FieldParser.extractField(input, "isLiquid/", null);
        if (liquidString == null || liquidString.trim().isEmpty()) {
            throw new DukeException("Missing liquid field for toiletries.");
        }

        if (!(liquidString.equalsIgnoreCase("true") || liquidString.equalsIgnoreCase("false"))) {
            throw new DukeException("Liquid field must be true or false.");
        }
        boolean isLiquid = Boolean.parseBoolean(liquidString);

        return new ParsedToiletriesFields(brand, isLiquid);
    }
}
