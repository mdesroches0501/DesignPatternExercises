public class RookMove implements Command{
  Rook rook;
  String newLocation;

  public RookMove(Rook rook, String newLocation){
    this.rook = rook;
    this.newLocation = newLocation;
  }

  public void execute(){
    System.out.println(rook.name + " moves from " + rook.location + " to " + this.newLocation);
    rook.move(newLocation);
  }

  public void undo(){
    System.out.println(rook.name + " moves from " + this.newLocation + " to " + rook.oldLocation);
    rook.move(rook.oldLocation);
  }
}