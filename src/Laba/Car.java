package Laba;

public class Car extends RuntimeException{

    private String nameCar;


    public Car(String nameCar) {
        this.nameCar = nameCar;
    }

    public Car() {
    }



    void close(){
        System.out.println("Mashina  jabylyp jatat ");
    }
    void drive(){
        System.out.println("Mashyna jurup jatat ");
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                '}';
    }


}
