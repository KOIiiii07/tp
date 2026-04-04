package seedu.duke;

import seedu.duke.command.Command;
import seedu.duke.exception.DukeException;
import seedu.duke.logging.LoggerConfig;
import seedu.duke.model.Category;
import seedu.duke.model.Inventory;
import seedu.duke.parser.Parser;
import seedu.duke.storage.Storage;
import seedu.duke.ui.UI;

/**
 * Represents the main entry point and application loop for Duke.
 * A <code>Duke</code> object initializes the core components, loads stored data,
 * and processes user commands until exit.
 */
public class Duke {
    private final Inventory inventory;
    private final UI ui;
    private final Parser parser;
    private final Storage storage;

    /**
     * Creates a Duke application instance with default categories and storage.
     *
     * @throws DukeException If stored inventory data cannot be loaded.
     */
    public Duke() throws DukeException {
        ui = new UI();
        inventory = new Inventory();
        parser = new Parser(ui);
        storage = new Storage("./data/inventory.txt");

        String[] categoryNames = {
            "fruits",
            "vegetables",
            "toiletries",
            "snacks",
            "drinks",
            "icecream",
            "sweets",
            "burger",
            "setmeal",
            "seafood",
            "meat",
            "petfood",
            "accessories"
        };

        for (String categoryName : categoryNames) {
            inventory.addCategory(new Category(categoryName));
        }

        storage.load(inventory, ui);
    }

    /**
     * Starts the Duke application.
     *
     * @param args Command-line arguments.
     * @throws DukeException If startup initialization fails.
     */
    public static void main(String[] args) throws DukeException {
        LoggerConfig logger = new LoggerConfig("./logs/logger.txt");
        logger.setup();
        new Duke().run();
    }

    /**
     * Runs the main command loop until the user exits the application.
     * Successful commands are persisted after execution, and exit also triggers a save.
     */
    public void run() {
        ui.showWelcome();

        String input;
        while ((input = ui.readCommand()) != null) {
            try {
                Command command = parser.parse(input);

                if (command == null) {
                    continue;
                }

                if (command.isExit()) {
                    storage.save(inventory);
                    break;
                }

                command.execute(inventory, ui);
                storage.save(inventory);
            } catch (DukeException e) {
                ui.showError(e.getMessage());
            }
        }

        ui.showGoodbye();
        ui.close();
    }
}
