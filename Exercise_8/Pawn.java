public class Pawn{
  String name;
  String location;
  String oldLocation;
  
  public Pawn(String name, String location){
    this.name = name;
    this.location = location;
  }

  public void move(String location){
    this.oldLocation = this.location;
    this.location = location;
  }
}
