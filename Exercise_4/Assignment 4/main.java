public class main {

    public static void main (String args[]) {

        Cocktail cocktail = new Bourbon();
        System.out.println(cocktail.getDescription() + " " + cocktail.calories() + " calories");

        System.out.println("Old Fashioned");
        Cocktail cocktail2 = new Bourbon();
        cocktail2 = new Bitters(cocktail2);
        cocktail2 = new Bitters(cocktail2);
        cocktail2 = new Cherry(cocktail2);
        cocktail2 = new Lime(cocktail2);
        System.out.println(cocktail2.getDescription() + " " + cocktail2.calories() + " calories");

        System.out.println("Vodka Gimlet");
        Cocktail cocktail3 = new Vodka();
        cocktail3 = new LimeJuice(cocktail3);
        cocktail3 = new Lime(cocktail3);
        System.out.println(cocktail3.getDescription() + " " + cocktail3.calories() + " calories");

        System.out.println("Manhattan");
        Cocktail cocktail4 = new Bourbon();
        cocktail4 = new Vermouth(cocktail4);
        cocktail4 = new Vermouth(cocktail4);
        cocktail4 = new Cherry(cocktail4);
        cocktail4 = new Bitters(cocktail4);
        System.out.println(cocktail4.getDescription() + " " + cocktail4.calories() + " calories");

        System.out.println("Tom Collins");
        Cocktail cocktail5 = new Gin();
        cocktail5 = new LimeJuice(cocktail5);
        cocktail5 = new LimeJuice(cocktail5);
        cocktail5 = new Sugar(cocktail5);
        cocktail5 = new Sugar(cocktail5);
        cocktail5 = new Lime(cocktail5);
        System.out.println(cocktail5.getDescription() + " " + cocktail5.calories() + " calories");

       
    }
}