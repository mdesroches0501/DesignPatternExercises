public class Vermouth extends CalorieDecorator{
    Cocktail cocktail;

    public Vermouth (Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Vermouth";
    }

    public double calories() {
        return 40 + cocktail.calories();
    }
    
}
