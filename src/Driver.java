import java.awt.*;

public class Driver {
    private String name;
    private String licenseNumber;

    public Driver(String name , String licenseNumber){
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public void DisplayDriverInfo(){
        System.out.println("The name is: " + name + "\nThe license number is: " + licenseNumber);
    }
}
