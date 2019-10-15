
import java.io.IOException;

public class testCar {

    public static void main(String[] args) throws IOException{

        Car c = new Car(1996, "Audi");

        System.out.println("Starting Car Speed : " + c.getCarSpeed());

        for(int i=0;i<5;i++)

            c.accelerate();

        for(int i=0;i<5;i++)

            c.brake();

        System.out.println("Final Car Speed : " + c.getCarSpeed());
 
       }

   }

