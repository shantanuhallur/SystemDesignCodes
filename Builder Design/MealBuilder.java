public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public void reset() {
        meal = new Meal();
    }

    public abstract void addBurger();
    public abstract void addSweet();
    public abstract void addFries();
    public abstract void addDrink();
    
    public Meal getMeal() {
        return meal;
    }
}
