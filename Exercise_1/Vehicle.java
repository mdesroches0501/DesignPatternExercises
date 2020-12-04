public abstract class Vehicle {
    public Number Year;

    public String Make;
    public String Model;
    public String Color;

    public Vehicle(Number year, String make, String model, String color) {
        Year = year;
        Make = make;
        Model = model;
        Color = color;
    }

    public Number GetYear() {
        return Year;
    }

    public void SetYear(Number year) {
        Year = year;
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

    public String GetColor() {
        return Color;
    }

    public void SetColor(String color) {
        Color = color;
    }
}