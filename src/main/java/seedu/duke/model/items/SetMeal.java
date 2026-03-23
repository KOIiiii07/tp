package seedu.duke.model.items;

import seedu.duke.model.Item;

public class SetMeal extends Item {
    private String mealType;
    private String foodSize;
    private int minToUnfreeze;
    private boolean isSpicy;

    public SetMeal(String name, int quantity, String binLocation,
                   String expiryDate, String mealType, String foodSize,
                   int minToUnfreeze, boolean isSpicy) {
        super(name, quantity, binLocation, expiryDate);
        this.mealType = mealType;
        this.foodSize = foodSize;
        this.minToUnfreeze = minToUnfreeze;
        this.isSpicy = isSpicy;
    }

    public String getFoodSize() {
        return foodSize;
    }

    public void setFoodSize(String foodSize) {
        this.foodSize = foodSize;
    }

    public int getMinToUnfreeze() {
        return minToUnfreeze;
    }

    public void setMinToUnfreeze(int minToUnfreeze) {
        this.minToUnfreeze = minToUnfreeze;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Override
    public String toString() {
        return "[SetMeal] " + super.toString()
                + ", Meal Type: " + mealType
                + ", Food Size: " + foodSize
                + ", Minutes to Unfreeze the meal: " + minToUnfreeze
                + ", Spicy: " + isSpicy;
    }
}
