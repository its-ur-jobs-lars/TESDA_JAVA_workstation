package Task16;



//Base class 
class Vehicle{
    String make;
    String model;
    int year;

    //constructor for vehicle
    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

}

class Car extends Vehicle{
    int numberOfdoors;

    public Car(String make, String model, int year, int numberOfdoors){
        super(make, model, year);
        this.numberOfdoors = numberOfdoors;
    }

public void detailDisplay(){
     System.out.println("Car details:");
     System.out.println("Make: " +make);
     System.out.println("Model: " +model);
     System.out.println("Year:" +year);
     System.out.println("Number of Doors" +numberOfdoors );
     System.out.println("\n");

}
}


public class Tasksheet126{
    public static void main(String[] args) {
        Car myownCar = new Car("Toyota", "Hillux", 2024, 2);
        Car myownCar1 = new Car ("Toyota", "Camary", 2022, 4);


        myownCar.detailDisplay();
        myownCar1.detailDisplay();

    }
}
 
