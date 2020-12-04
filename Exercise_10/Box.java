public class Box extends Component{
  
    String name;
    double width;
    double height;
    double length;
  
    public Box(double width, double height, double length){
      this.name = "Box";
      this.width = width;
      this.height = height;
      this.length = length;
    }
  
    
    public double getVolume(){
      return width * height * length;
    }
  
    public void render(){
      System.out.println("Rendering " + name + "... Prim volume: " + getVolume());
    }
  
  }