package InterfacesLec;

public class Car implements Engine, Brake{

    @Override
    public void brake() {
        System.out.println("I am car brake");
    }

    @Override
    public void stop() {
        System.out.println("I am car stop");

    }

    @Override
    public void acc() {
        System.out.println("I am car acclealtor");

    }

    @Override
    public void start() {
        System.out.println("I am car start");
    }

    @Override
    public void upgradeEngine() {
        System.out.println("Car engine");
    }


}
