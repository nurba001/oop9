package Laba;

import javax.lang.model.type.ErrorType;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException  {
        Car car =new Car();
   try (FileWriter fileWriter=new FileWriter("car.txt"))  {
       car.drive();
       throw new RuntimeException();
   }catch ( RuntimeException a){
        System.out.println("Oshybka");}
   car.close();

    }
}
