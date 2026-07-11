package InterfacesLec;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        Engine car2 = new Car();
//
//        car.start();
//        car.start();
//        car.acc();
//        car.brake();

        NiceCar car = new NiceCar();
        car.start();
        car.upgradeengine();
        car.start();

    }
}
