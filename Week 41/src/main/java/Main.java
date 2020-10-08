public class Main {
    public static void main (String[] args){
        Driver driver = new Driver("Sebastian",24);
        Car car = new Car("Mercedes","A class",2020,"Sport");
        Car car2 = new Car("Mercedes","AMG GT",2020,"Race");

        car.setDriver(driver);
        car2.setDriver(driver);
        System.out.println(driver);
        System.out.println(car);
        System.out.println(car2);

    }
}
