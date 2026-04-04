package seedu.duke.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a category containing inventory items.
 * A <code>Category</code> object stores a category name and its associated items.
 */
public class Category {
    private String name;
    private final List<Item> items;

    /**
     * Creates a category with the specified name.
     *
     * @param name Name of the category.
     */
    public Category(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public int getItemCount() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Removes the item at the specified zero-based index.
     *
     * @param index Zero-based index of the item to remove.
     * @throws IndexOutOfBoundsException If the index is out of range.
     */
    public void removeItem(int index) {
        if (index < 0 || index >= items.size()) {
            throw new IndexOutOfBoundsException("Invalid item index");
        }
        items.remove(index);
    }

    /**
     * Returns the item whose name matches the specified name, ignoring case.
     *
     * @param itemName Name of the item to find.
     * @return Matching item, or {@code null} if no item matches.
     */
    public Item findItemByName(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Category: ").append(name).append("\n");
        for (int i = 0; i < items.size(); i++) {
            sb.append("  ").append(i + 1).append(". ").append(items.get(i)).append("\n");
        }
        return sb.toString();
    }
}
