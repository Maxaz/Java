package polymorphism.exercise;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return "TCar -> startEngine()";
        //System.out.println("The CAR's engine is starting");
    }
    public String accelerate(){
        return "The CAR is accelerating";
        //System.out.println("The CAR is accelerating");
    }
    public String brake(){
        return "The CAR is braking";
        //System.out.println("The CAR is braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
