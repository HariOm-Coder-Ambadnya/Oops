package InterfacesLec;

public class ElectricEngine implements  Engine{


    @Override
    public void stop() {
        System.out.println("Electric stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric acc");
    }

    @Override
    public void start() {
        System.out.println("Electric start");

    }

    @Override
    public void upgradeEngine() {

    }
}
