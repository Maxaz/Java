package polymorphism.exercise;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Mitsubishi's engine is starting";
        //System.out.println("The Mitsubishi's engine is starting");
    }

    @Override
    public String accelerate() {
        return "The Mitsubishi is accelerating";
        //System.out.println("The Mitsubishi is accelerating");
    }

    @Override
    public String brake() {
        return "The Mitsubishi is braking";
        //System.out.println("The Mitsubishi is braking");
    }
}
