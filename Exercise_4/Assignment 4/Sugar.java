public class Sugar extends CalorieDecorator {
    Cocktail cocktail;

    public Sugar (Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Sugar";
    }

    public double calories() {
        return 300 + cocktail.calories();
    }
}
