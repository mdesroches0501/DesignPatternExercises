import java.util.ArrayList;

public class Object implements Component{
  ArrayList<Component> characterComponents;
  String name;

  public Object(String name){
    this.name = name;
    characterComponents = new ArrayList<Component>();
  }

  public void add(Component characterComponent){
    characterComponents.add(characterComponent);
  }

  public void remove(Component characterComponent){
    characterComponents.remove(characterComponent);
  }

  public Component getChild(int i){
    return characterComponents.get(i);
  }

  public void render(){
    System.out.println(name + ":");
    for(Component comp : characterComponents){
      comp.render();
    }
  }
}