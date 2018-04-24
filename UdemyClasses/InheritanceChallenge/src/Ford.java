public class Ford extends Car {
    private int model;
    private int doors;
    private int engineCapacity;
    private int premiumAcc;

    public Ford(int minSpeed, int maxSpeed, int actualSpeed, int engineType, boolean isGoingForward, int type, int gears, int model, int doors, int engineCapacity, int premiumAcc) {
        super(minSpeed, maxSpeed, actualSpeed, engineType, isGoingForward, type, gears);
        this.model = model;
        this.doors = doors;
        this.engineCapacity = engineCapacity;
        this.premiumAcc = premiumAcc;
    }

    public int getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getPremiumAcc() {
        return premiumAcc;
    }
}
