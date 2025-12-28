public class Car extends Vehicle{
    private int doors;
    private String fuelType;

    public Car(String brand , int year , Driver dv1 , int doors , String fuelType){
        super(brand, year, dv1);

        this.doors = doors;
        this.fuelType = fuelType;
    }
    public void setdoors(int doors){
        this.doors = doors;
    }
    public int getDoors(){
        return doors;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public String getFuelType(){
        return fuelType;
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
