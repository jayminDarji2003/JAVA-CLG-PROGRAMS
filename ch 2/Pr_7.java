/*
    Question 7
*/

abstract class Vehicle{
    abstract void numWheels();
}

class Car extends Vehicle{
    void numWheels(){
        System.out.println("There are 4 wheel in car");
    }
}

class Truck extends Vehicle{
    void numWheels(){
        System.out.println("There are 10 wheel in Truch");
    }
}

public class Pr_7 {
   // Vehicle v;
    //Car c = new Car();
    // v = c;
    // v.numWheels();

    // Truck t = new Truck();
    // v = t;
    // v.numWheels();
}
