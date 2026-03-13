package seedu.duke.parser;

import seedu.duke.command.Command;

public class Parser {

    public Command parse(String input) {
        String trimmed = input.trim();

        // if (trimmed.isEmpty()) {
        //     throw new IllegalArgumentException("Input cannot be empty.");
        // }

        String[] parts = trimmed.split(" ", 2);
        String commandWord = parts[0];

        switch (commandWord) {
        case "add":
            String addInput = parts.length > 1 ? parts[1].trim() : "";
            return new AddCommandParser().parse(addInput);

        case "list":
            return new ListCommandParser().parse();



        default:
            System.out.println("Unknown command");
            return null;
        }
    }
}
