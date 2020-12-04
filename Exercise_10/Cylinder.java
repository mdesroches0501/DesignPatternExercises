public class Cylinder extends Component{

    String name;
    double radius;
    double height;
    double PI = 3.14;
  
    public Cylinder(double radius, double height){
      this.name = "Cylinder";
      this.radius = radius;
      this.height = height;
    }
    
    public double getVolume(){
      return PI * radius * radius * height;
    }
  
    public void render(){
      System.out.println("Rendering " + name + "... Prim volume: " + getVolume());
    }
  }