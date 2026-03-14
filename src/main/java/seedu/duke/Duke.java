package seedu.duke;

import seedu.duke.command.Command;
import seedu.duke.exception.DukeException;
import seedu.duke.model.Category;
import seedu.duke.model.Inventory;
import seedu.duke.parser.Parser;
import seedu.duke.ui.UI;

public class Duke {
    private final Inventory inventory;
    private final UI ui;
    private final Parser parser;

    public Duke() {
        ui = new UI();
        inventory = new Inventory();
        parser = new Parser(ui);

        inventory.addCategories(new Category("fruits"));
        inventory.addCategories(new Category("vegetables"));
        inventory.addCategories(new Category("toiletries"));
        inventory.addCategories(new Category("snacks"));
    }

    public void run() throws DukeException {
        ui.showWelcome();

        String input;
        while ((input = ui.readCommand()) != null) {
            try {
                Command command = parser.parse(input);

                if (command == null) {
                    continue;
                }

                if (command.isExit()) {
                    break;
                }

                command.execute(inventory, ui);
            } catch (DukeException e) {
                ui.showError(e.getMessage());
            }

        }

        ui.showGoodbye();
        ui.close();
    }

    public static void main(String[] args) throws DukeException {
        new Duke().run();
    }
}
