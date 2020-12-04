public class KnightMove implements Command{
  Knight knight;
  String newLocation;

  public KnightMove(Knight knight, String newLocation){
    this.knight = knight;
    this.newLocation = newLocation;
  }

  public void execute(){
    System.out.println(knight.name + " moves from " + knight.location + " to " + this.newLocation);
    knight.move(newLocation);
  }

  public void undo(){
    System.out.println(knight.name + " moves from " + this.newLocation + " to " + knight.oldLocation);
    knight.move(knight.oldLocation);
  }
}