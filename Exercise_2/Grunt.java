public class Grunt extends GameUnit {
    public Grunt() {
        System.out.println("Grunt spawns");
        moveBehavior = new Walk();
        weapon = new Axe();
    }
}