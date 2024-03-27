package org.example.company;


public class Car {
   private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", cylinders=" + cylinders + ", name=" + name + ", wheels=" + wheels
                + "]";
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Car car){
            return this.cylinders == car.cylinders && this.name.equals(car.name);
        }
        return false;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return("the car's engine is starting");
    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return("the car is accelerating");
    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return ("the car is braking");

    }
}
