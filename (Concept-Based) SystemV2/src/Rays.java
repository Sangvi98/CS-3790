import java.util.ArrayList;

public class Rays extends Restaurants {


    String name;
    Menu menu;


    public Rays() {
        this.name = "Rays";
        this.menu = new Menu(true, createFoodList());
    }

    private ArrayList<Food> createFoodList() {
        ArrayList<Food> foodList = new ArrayList<>();
        Food cheesePizza = new Food("Cheese Pizza", Price.Cheap, 2.95, Type.Pizza, NutritionalValue.Low, 380, DietPref.Vegetarian);
        Food pepperoniPizza = new Food("Pepperoni Pizza", Price.Cheap, 3.75, Type.Pizza, NutritionalValue.Low, 430, DietPref.None);
        Food meatPizza = new Food("Meat Pizza", Price.Cheap, 4.00, Type.Pizza, NutritionalValue.Low, 459, DietPref.None);
        Food whitePizza = new Food("White Pizza", Price.Cheap, 3.45, Type.Pizza, NutritionalValue.Low, 453, DietPref.Vegetarian);
        Food veggiePizza = new Food("Veggie Pizza", Price.Cheap, 4.00, Type.Pizza, NutritionalValue.Low, 495, DietPref.Vegetarian);
        Food chickenFettuccine = new Food("Chicken Fettuccine", Price.Medium, 7.49, Type.Pasta, NutritionalValue.Medium, 475, DietPref.None);
        Food beefLasagna = new Food("Beef Lasagna", Price.Medium, 7.49, Type.Pasta, NutritionalValue.Medium, 477, DietPref.None);
        Food veggieLasagna = new Food("Veggie Lasagna", Price.Medium, 7.49, Type.Pasta, NutritionalValue.Medium, 475, DietPref.Vegetarian);
        Food meatballSpaghetti = new Food("Meatball Spaghetti", Price.Medium, 7.49, Type.Pasta, NutritionalValue.Medium, 465, DietPref.None);
        Food veggiePennePasta = new Food("Veggie Penne Pasta", Price.Medium, 7.49, Type.Pasta, NutritionalValue.Medium, 397, DietPref.Vegetarian);
        foodList.add(cheesePizza);
        foodList.add(pepperoniPizza);
        foodList.add(meatPizza);
        foodList.add(whitePizza);
        foodList.add(veggiePizza);
        foodList.add(chickenFettuccine);
        foodList.add(beefLasagna);
        foodList.add(veggieLasagna);
        foodList.add(meatballSpaghetti);
        foodList.add(veggiePennePasta);

        return foodList;
    }
}
