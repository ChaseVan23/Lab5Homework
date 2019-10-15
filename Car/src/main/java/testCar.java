
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chase
 */
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
