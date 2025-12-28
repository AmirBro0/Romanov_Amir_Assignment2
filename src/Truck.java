public class Truck extends Vehicle{
    private double capacity;
    private int numAxles;

    public Truck(String brand , int year){
            super(brand, year);
    }

    @Override
    public void startEngine(){
        System.out.println("The engine is on");
    }
    public void stopEngine(){
        System.out.println("The engine is off");
    }
}