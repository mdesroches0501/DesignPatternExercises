public class Tank extends GameUnit {
    public Tank() {
        System.out.println("Tank spawns");
        moveBehavior = new Drive();
        weapon = new Cannon();
    }
}