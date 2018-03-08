public class Car extends Vehicle {
    private int type;
    private int gears;

    public Car(int minSpeed, int maxSpeed, int actualSpeed, int engineType, boolean isGoingForward, int type, int gears) {
        super(minSpeed, maxSpeed, actualSpeed, engineType, isGoingForward, 4);
        this.type = type;
        this.gears = gears;
    }

    public int getType() {
        return type;
    }

    public int getGears() {
        return gears;
    }

    public void turn(){
        System.out.println("Car.turn() called.");
    }

    public void moveBackward(){
        System.out.println("Car.moveBackward() called.");
    }

    public void honk(){
        System.out.println("Car.honk() called.");
    }
}
