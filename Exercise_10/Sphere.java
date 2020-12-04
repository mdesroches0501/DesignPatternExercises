public class Sphere extends Component{
    String name;
    double radius;
    double PI = 3.14;
  
    public Sphere(double radius){
      this.name = "Sphere";
      this.radius = radius;
    }
    
    public double getVolume(){
      return (4/3) * PI * radius * radius * radius;
    }
  
    public void render(){
      System.out.println("Rendering " + name + "... Prim volume: " + getVolume());
    }
  }
