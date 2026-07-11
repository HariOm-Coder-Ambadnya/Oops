package InterfacesLec;

public class PowerEngine implements  Engine{

    @Override
    public void stop() {
        System.out.println("Powerengine stop");
    }

    @Override
    public void acc() {
        System.out.println("Powerengine acc");

    }

    @Override
    public void start() {
        System.out.println("Powerengine start");
    }

    @Override
    public void upgradeEngine() {

    }

}
