public class NonVegLunchBuilder extends MealBuilder {
    
    @Override
    public void addBurger() {
        meal.burger = "Chicken Burger";
    }

    @Override
    public void addDrink() {
        meal.drink = "McFlurry";
    }

    @Override
    public void addFries() {
        meal.fries = "King";
    }

    @Override
    public void addSweet() {
        meal.sweet = "Gulab Jamun";
    }
}
