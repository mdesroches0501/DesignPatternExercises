public class Bitters extends CalorieDecorator{
    Cocktail cocktail;

    public Bitters (Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Bitters";
    }

    public double calories() {
        return 20 + cocktail.calories();
    }
    
}
