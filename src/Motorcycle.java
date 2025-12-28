public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand , int year,Driver dv1 , boolean hasSidecar){
        super(brand, year,dv1);

        this.hasSidecar = hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar){
        this.hasSidecar = hasSidecar;
    }
    public boolean getHasSideCar(){
        return hasSidecar;
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
