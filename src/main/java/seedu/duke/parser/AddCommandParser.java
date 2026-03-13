package seedu.duke.parser;

import seedu.duke.command.Command;

public class AddCommandParser {

    public Command parse(String input) {
        String[] parts = input.split("/", 2);
        String addType = parts[0].trim();

        switch (addType) {
        case "item":
            return new AddItemCommandParser().parse(input);
        default:
            System.out.println("Unknown add command.");
            return null;
        }
    }
}
