package InterfacesLec;

public class NiceCar {

    private Engine engine;

    private Media media = new CdPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startmusic(){
        media.start();
    }

    public void staopmusic(){
        media.stop();
    }

    public void upgradeengine(){
        this.engine = new ElectricEngine();
    }

}
