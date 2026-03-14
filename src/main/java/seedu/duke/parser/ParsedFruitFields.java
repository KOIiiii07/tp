package seedu.duke.parser;

public class ParsedFruitFields {
    public final String expiryDate;
    public final String size;
    public final boolean isRipe;

    public ParsedFruitFields(String expiryDate, String size, boolean isRipe) {
        this.expiryDate = expiryDate;
        this.size = size;
        this.isRipe = isRipe;
    }
}
