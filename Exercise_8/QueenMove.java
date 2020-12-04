public class QueenMove implements Command{
  Queen queen;
  String newLocation;

  public QueenMove(Queen queen, String newLocation){
    this.queen = queen;
    this.newLocation = newLocation;
  }

  public void execute(){
    System.out.println(queen.name + " moves from " + queen.location + " to " + this.newLocation);
    queen.move(newLocation);
  }

  public void undo(){
    System.out.println(queen.name + " moves from " + this.newLocation + " to " + queen.oldLocation);
    queen.move(queen.oldLocation);
  }
}