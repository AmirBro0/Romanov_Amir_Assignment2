public class Motorcycle extends Vehicle{
    private boolean hasSidecar;
    public Motorcycle(String brand , int year){
        super(brand, year);
    }

    @Override
    public void startEngine() {
        System.out.println("the engine is on");
    }

    @Override
    public void stopEngine() {
        System.out.println("the engine is off");
    }
}
