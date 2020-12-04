public class BishopMove implements Command{
  Bishop bishop;
  String newLocation;

  public BishopMove(Bishop bishop, String newLocation){
    this.bishop = bishop;
    this.newLocation = newLocation;
  }

  public void execute(){
    System.out.println(bishop.name + " moves from " + bishop.location + " to " + this.newLocation);
    bishop.move(newLocation);
  }

  public void undo(){
    System.out.println(bishop.name + " moves from " + this.newLocation + " to " + bishop.oldLocation);
    bishop.move(bishop.oldLocation);
  }
}