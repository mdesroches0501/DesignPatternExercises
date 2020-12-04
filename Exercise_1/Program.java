public class Program {
    public static void main(String[] args) {
        Car car = new Car(1993, "Honda", "Accord", "LX", "White");
        Bike bike = new Bike(2006, "Mongoose", "Rebel", "Blue", "BMX");

        System.out.println(String.format("%s %d %s %s %s", car.GetColor(), car.GetYear(), car.GetMake(), car.GetModel(), car.GetTrim()));
        System.out.println(String.format("%s %d %s %s %s", bike.GetColor(), bike.GetYear(), bike.GetMake(), bike.GetModel(),
                bike.GetType()));
    }
}