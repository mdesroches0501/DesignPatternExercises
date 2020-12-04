public class Cherry extends CalorieDecorator{
    Cocktail cocktail;

    public Cherry (Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Cherry";
    }

    public double calories() {
        return 40 + cocktail.calories();
    }
    
}

