public class LimeJuice extends CalorieDecorator {
    Cocktail cocktail;

    public LimeJuice (Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Lime Juice";
    }

    public double calories() {
        return 8 + cocktail.calories();
    }
}
