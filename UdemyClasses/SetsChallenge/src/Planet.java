public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
    }

    @Override
    public boolean addMoon(HeavenlyBody moon) {
        if (Moon.class.isInstance(moon)) return super.addMoon(moon);
        return false;
    }


}
