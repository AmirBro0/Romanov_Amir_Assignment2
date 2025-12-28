import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Driver dv1 = new Driver("Amir Romanov" , "00101");
        Driver dv2 = new Driver("Bakytzhan Orazbai","02020");
        Driver dv3 = new Driver("Rustam Kabdolda" , "none");
        Driver dv4 = new Driver("Assanali Akezhanov" , "54314");
        Driver dv5 = new Driver("Hamid Niazi" , "784536");

        Vehicle vc1 = new Car("Lexus lfa limited edition 500" , 2012 , dv1 , 2 ,"Premium Unleaded Petrol" );
        Vehicle vc2 = new Car("Lexus ls 500" , 2023 , dv2 , 2 , "Premium Unleaded Gasoline");
        Vehicle vc3 = new Motorcycle("Suziki GSX1000" , 2025 , dv4 , false);
        Vehicle vc4 = new Truck("Man TGX" ,2007, 11.800,4 , dv5 );

        Vehicle vclist[] = {vc1,vc2,vc3,vc4};
        for(int i = 0 ; i < 4;i++){
            vclist[i].startEngine();
            vclist[i].displayInfo();
            vclist[i].stopEngine();
            System.out.println("          \n");
        }
    }
}
