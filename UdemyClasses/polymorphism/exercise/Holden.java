package polymorphism.exercise;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //System.out.println("The Holden's engine is starting");
        return "The Holden's engine is starting";
    }

    @Override
    public String accelerate() {
        return "The Holden is accelerating";
        //System.out.println("The Holden is accelerating");
    }

    @Override
    public String brake() {
        return "The Holden is braking";
        //System.out.println("The Holden is braking");
    }
}
