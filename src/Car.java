public class Car extends Vehicle{
    private int doors;
    private String fuelType;

    public Car(String brand , int year){
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
