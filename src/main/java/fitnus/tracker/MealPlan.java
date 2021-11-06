package fitnus.tracker;

import java.util.ArrayList;

public class MealPlan {
    private String mealPlanName;
    private ArrayList<Food> mealFoods;

    public MealPlan(String mealPlanName, ArrayList<Food> mealFoods) {
        this.mealPlanName = mealPlanName;
        this.mealFoods = mealFoods;
    }

    public String getMealPlanName() {
        return this.mealPlanName;
    }

    public ArrayList<Food> getMealFoods() {
        return this.mealFoods;
    }

    public String getFoodString() {
        String str = "";
        for (Food item : mealFoods) {
            str += item.toString() + System.lineSeparator();
        }
        return str;
    }

    /**
     * Returns String representation of MealPlan object, including all its food under it.
     * @return String representation of MealPlan object
     */
    @Override
    public String toString() {
        for (Food item: mealFoods) {
            System.out.println(item.toString());
        }
        return this.mealPlanName;
    }

}
