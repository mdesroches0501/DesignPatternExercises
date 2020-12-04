public class Engine {
    private String Make;
    private String Model;

    private Number Displacement;
    private Number Cylinders;
    private String CylinderAlignment;
    private Number MaxHorsepower;
    private Number MaxTorque;

    public Engine(String make, String model, Number displacement, Number cylinders, String cylinderAlignment, Number maxHorsepower, Number maxTorque) {
        Make = make;
        Model = model;
        Displacement = displacement;
        Cylinders = cylinders;
        CylinderAlignment = cylinderAlignment;
        MaxHorsepower = maxHorsepower;
        MaxTorque = maxTorque;
    }

    public String GetMake() {
        return Make;
    }
    
    public void SetMake(String make) {
        Make = make;
    }

    public String GetModel() {
        return Model;
    }
    
    public void SetModel(String model) {
        Model = model;
    }

    public Number GetDisplacement() {
        return Displacement;
    }

    public void SetDisplacement(Number displacement) {
        Displacement = displacement;
    }

    public Number GetCylinders() {
        return Cylinders;
    }

    public void SetCylinders(Number cylinders) {
        Cylinders = cylinders;
    }

    public String GetCylinderAlignment() {
        return CylinderAlignment;
    }
    
    public void SetCylinderAlignment(String cylinderAlignment) {
        CylinderAlignment = cylinderAlignment;
    }

    public Number GetMaxHorsepower() {
        return MaxHorsepower;
    }
    
    public void SetMaxHorsepower(Number maxHorsepower) {
        MaxHorsepower = maxHorsepower;
    }

    public Number GetMaxTorque() {
        return MaxTorque;
    }
    
    public void SetMaxTorque(Number maxTorque) {
        MaxTorque = maxTorque;
    }
}