public class VegLunchBuilder extends MealBuilder {
    @Override
    public void addBurger() {
        meal.burger = "Cheese Veg Burger";
    }
    @Override
    public void addDrink() {
        meal.drink = "Diet Coke";
    }

    @Override
    public void addFries() {
        meal.fries = "small Fries";
    }

    @Override
    public void addSweet() {
        meal.sweet = "Vanilla Ice Cream";
    }
}
