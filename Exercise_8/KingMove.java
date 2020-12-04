public class KingMove implements Command{
  King king;
  String newLocation;

  public KingMove(King king, String newLocation){
    this.king = king;
    this.newLocation = newLocation;
  }

  public void execute(){
    System.out.println(king.name + " moves from " + king.location + " to " + this.newLocation);
    king.move(newLocation);
  }

  public void undo(){
    System.out.println(king.name + " moves from " + this.newLocation + " to " + king.oldLocation);
    king.move(king.oldLocation);
  }
}