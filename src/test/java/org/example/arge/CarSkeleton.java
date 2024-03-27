package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("the car's engine is starting");
        System.out.println(getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("the car's engine is running");
        System.out.println(getClass().getSimpleName());
    }

    public void drive() {
        runEngine();
    }

}
