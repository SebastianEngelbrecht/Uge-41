public class Car {
    String make;
    String model;
    int year;
    String bodystyle;
    Driver driver;

    public Car(String make, String model, int year, String bodystyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodystyle = bodystyle;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return
                "Make: " + make  +
                ", Model: " + model +
                ", Year: " + year +
                ", Bodystyle: " + bodystyle;
    }
}
