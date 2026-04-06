package seedu.inventorydock.command;

import org.junit.jupiter.api.Test;
import seedu.inventorydock.model.Inventory;
import seedu.inventorydock.ui.UI;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExitCommandTest {

    @Test
    public void isExit_returnsTrue() {
        ExitCommand command = new ExitCommand();
        assertTrue(command.isExit());
    }

    @Test
    public void execute_showsGoodbyeMessage() {
        Inventory inventory = new Inventory();
        ExitCommand command = new ExitCommand();
        TestUI ui = new TestUI();

        command.execute(inventory, ui);
        assertEquals(1, ui.messages.size());
        assertEquals("Goodbye!", ui.messages.get(0));
    }

    @Test
    public void execute_calledMultipleTimes_showsGoodbyeEachTime() {
        Inventory inventory = new Inventory();
        ExitCommand command = new ExitCommand();
        TestUI ui = new TestUI();

        command.execute(inventory, ui);
        command.execute(inventory, ui);
        assertEquals(2, ui.messages.size());
    }

    private static class TestUI extends UI {
        private final List<String> messages = new ArrayList<>();

        @Override
        public void showGoodbye() {
            messages.add("Goodbye!");
        }
    }
}
