public class Car extends Vehicle {
    private String Trim;

    private Engine Engine;
    private Wheel Wheel;

    public Car(Number year, String make, String model, String trim, String color) {
        super(year, make, model, color);
        Trim = trim;
    }

    public String GetTrim() {
        return Trim;
    }

    public void SetTrim(String trim) {
        Trim = trim;
    }

    public Engine GetEngine() {
        return Engine;
    }
    
    public void SetEngine(Engine engine) {
        Engine = engine;
    }

    public Wheel GetWheel() {
        return Wheel;
    }
    
    public void SetWheel(Wheel wheel) {
        Wheel = wheel;
    }
}