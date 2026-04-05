package seedu.inventorydock.command;

import seedu.inventorydock.exception.InventoryDockException;
import seedu.inventorydock.model.Inventory;
import seedu.inventorydock.ui.UI;

public abstract class Command {

    public abstract void execute(Inventory inventory, UI ui) throws InventoryDockException;

    public boolean isExit() {
        return false;
    }
}
