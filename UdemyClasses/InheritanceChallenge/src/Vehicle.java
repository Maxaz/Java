public class Vehicle {
    private int minSpeed;
    private int maxSpeed;
    private int actualSpeed;
    private int engineType;
    private boolean isGoingForward;
    private int wheels;

    public Vehicle(int minSpeed, int maxSpeed, int actualSpeed, int engineType, boolean isGoingForward, int wheels) {
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.actualSpeed = actualSpeed;
        this.engineType = engineType;
        this.isGoingForward = isGoingForward;
        this.wheels = wheels;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public int getEngineType() {
        return engineType;
    }

    public boolean isGoingForward() {
        return isGoingForward;
    }

    public int getWheels() {
        return wheels;
    }

    public void move(int speed){
        System.out.println("Vehicle.move() called. Moving at "+speed+" speed.");
    }

    public void stop(){
        System.out.println("Vehicle.stop() called.");
    }


}
