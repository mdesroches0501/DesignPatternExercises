public class Bike extends Vehicle {
    private String Type;

    private Wheel Wheel;

    public Bike(Number year, String make, String model, String color, String type) {
        super(year, make, model, color);
        Type = type;
    }

    public String GetType() {
        return Type;
    }

    public void SetType(String type) {
        Type = type;
    }

    public Wheel GetWheel() {
        return Wheel;
    }
    
    public void SetWheel(Wheel wheel) {
        Wheel = wheel;
    }
}