public class Lime extends CalorieDecorator{
    Cocktail cocktail;

    public Lime (Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Lime";
    }

    public double calories() {
        return 2 + cocktail.calories();
    }
}
