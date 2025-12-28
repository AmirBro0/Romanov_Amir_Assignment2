public abstract class Vehicle {

    protected String brand;
    protected int year;
    private Driver dv1;
    public Vehicle(String brand, int year, Driver dv1) {
        this.brand = brand;
        this.year = year;
        this.dv1 = dv1;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo(){
        System.out.println("The brand is: " + brand + "\nThe year is: " + year);
        dv1.DisplayDriverInfo();
    }
}