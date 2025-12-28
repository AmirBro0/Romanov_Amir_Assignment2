public class Truck extends Vehicle{
    private double capacity;
    private int numAxles;

    public Truck(String brand , int year, double capacity , int numAxles , Driver dv1){
            super(brand, year, dv1);

            this.capacity = capacity;
            this.numAxles = numAxles;
    }
    public void setCapacity(double capacity){
        this.capacity = capacity;
    }
    public double getCapacity(){
        return capacity;
    }
    public void setNumAxles(int numAxles){
        this.numAxles = numAxles;
    }
    public int getNumAxles(){
        return numAxles;
    }

    @Override
    public void startEngine(){
        System.out.println("The engine is on");
    }
    @Override
    public void stopEngine(){
        System.out.println("The engine is off");
    }
}