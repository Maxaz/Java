class Car {
    private int cylinders;
    private String name;
    private boolean engine;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
        this.speed = 0;
    }

    public Car(int cylinders) {
        this.name = "Car";
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
        this.speed = 0;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String startEngine() {
        if (isEngine()) {
            return "You will burn the car's starter!";
        } else {
            setEngine(true);
            return "... the car's engine starts!";
        }
    }

    public String accelerateCar() {
        setSpeed(getSpeed() + 1);
        return getName() + " is accelerating.";
    }

    public String breakCar() {
        if (getSpeed() == 0) {
            return "... the car is not moving.";
        } else {
            setSpeed(getSpeed() - 1);
            return "... the car is breaking.";
        }
    }

    public String stopEngine() {
        if (isEngine()) {
            setEngine(false);
            return "... the car's engine stops.";
        } else {
            return "... the car's engine is off";
        }
    }
}

class Audi extends Car {
    private String model;
    private int doors;

    public Audi(int cylinders, String model, int doors) {
        super("Audi", cylinders);
        this.model = model;
        this.doors = doors;
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerateCar() {
        return super.accelerateCar();
    }

    @Override
    public String breakCar() {
        return super.breakCar();
    }

    @Override
    public String stopEngine() {
        return super.stopEngine();
    }
}

class Ford extends Car {
    private String model;
    private int doors;

    public Ford(int cylinders, String model, int doors) {
        super("Ford", cylinders);
        this.model = model;
        this.doors = doors;
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerateCar() {
        return super.accelerateCar();
    }

    @Override
    public String breakCar() {
        return super.breakCar();
    }

    @Override
    public String stopEngine() {
        return super.stopEngine();
    }
}


public class Main {
    public static void  main(String[] args){
        Car carExample = new Audi(5,"A7",5);
        System.out.println(carExample.startEngine());
        System.out.println(carExample.accelerateCar());
        System.out.println(carExample.breakCar());
        System.out.println(carExample.stopEngine());

        Car carExample1 = new Ford(4, "Mondeo", 5);
        System.out.println(carExample1.startEngine());
        System.out.println(carExample1.accelerateCar());
        System.out.println(carExample1.breakCar());
        System.out.println(carExample1.stopEngine());

    }

}
