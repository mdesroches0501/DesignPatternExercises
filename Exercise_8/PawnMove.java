public class PawnMove implements Command{
  Pawn pawn;
  String newLocation;

  public PawnMove(Pawn pawn, String newLocation){
    this.pawn = pawn;
    this.newLocation = newLocation;
  }

  public void execute(){
    System.out.println(pawn.name + " moves from " + pawn.location + " to " + this.newLocation);
    pawn.move(newLocation);
  }

  public void undo(){
    System.out.println(pawn.name + " moves from " + this.newLocation + " to " + pawn.oldLocation);
    pawn.move(pawn.oldLocation);
  }
}