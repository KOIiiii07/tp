package seedu.duke.parser;

import seedu.duke.command.AddItemCommand;
import seedu.duke.command.Command;

public class AddItemCommandParser {
    public Command parse(String input) {
        String[] tokens = input.split(" ");

        String itemName = null;
        String categoryName = null;
        String bin = null;
        int quantity = 0;

        String brand = "N/A";
        String expiryDate = "N/A";
        String size = "N/A";
        boolean isRipe = false;
        boolean isLeafy = false;
        boolean isLiquid = false;

        for (String token : tokens) {
            String[] parts = token.split("/", 2);
            String fieldName = parts[0];
            String fieldValue = parts.length > 1 ? parts[1] : "";

            switch (fieldName) {
            case "item":
                itemName = fieldValue;
                break;
            case "category":
                categoryName = fieldValue;
                break;
            case "bin":
                bin = fieldValue;
                break;
            case "qty":
                quantity = Integer.parseInt(fieldValue);
                break;
            case "brand":
                brand = fieldValue;
                break;
            case "expiryDate":
                expiryDate = fieldValue;
                break;
            case "size":
                size = fieldValue;
                break;
            case "isRipe":
                isRipe = Boolean.parseBoolean(fieldValue);
                break;
            case "isLeafy":
                isLeafy = Boolean.parseBoolean(fieldValue);
                break;
            case "isLiquid":
                isLiquid = Boolean.parseBoolean(fieldValue);
                break;
            default:
                System.out.println("Unknown field: " + token);
                break;
            }
        }

        return new AddItemCommand(itemName, categoryName, bin, quantity,
                brand, expiryDate, size, isRipe, isLeafy, isLiquid);
    }
}
