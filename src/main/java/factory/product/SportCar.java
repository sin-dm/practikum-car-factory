package factory.product;

public class SportCar extends Transport {

    public String alarmSystem;

    public SportCar(String alarmSystem) {
        super(4, "sport", "v-engine", "6st");
        this.alarmSystem = alarmSystem;
    }

    @Override
    public void startEngine() {
        System.out.println("Sport car engine started! What a sound!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Sport car engine stopped, time to go home");
    }

    @Override
    public void ride() {
        System.out.println("Let's ride super fast");
    }
}