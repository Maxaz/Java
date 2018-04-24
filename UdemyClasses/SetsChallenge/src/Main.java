import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        Moon tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
//
// challenge tests
//
        Planet mars = new Planet("Mars", 687);
        solarSystem.put(mars.getName(), mars);
        planets.add(mars);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        mars.addMoon(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        mars.addMoon(tempMoon); // temp is still Mars


        Planet tempStar = new Planet("StarSateliteTest", 0.5);
        solarSystem.put(tempStar.getName(), tempStar);
        mars.addMoon(tempStar);

        Planet deimos = new Planet("Deimos", 3.1);
        solarSystem.put(deimos.getName(),deimos);
        planets.add(deimos);
//        should add deimos as planet even there is already a satellite with same name
        mars.addMoon(deimos);
//        should not add deimos to mars as satellite

//        test2
        System.out.println(mars.equals(deimos));
        System.out.println(deimos.equals(mars));
        Planet deimos1 = new Planet("Deimos", 3.1);
        System.out.println(deimos.equals(deimos1));
        System.out.println(deimos1.equals(deimos));
        Star deimos2 = new Star("Deimos", 1.3);
        System.out.println(deimos.equals(deimos2));
        System.out.println("*************");


//        test3 & 4
        tempMoon = new Moon("Phobos", 0.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        mars.addMoon(tempMoon);

        deimos = new Planet("Deimos", 3.2);
        solarSystem.put(deimos.getName(),deimos);
        planets.add(deimos);

        System.out.println("********************");

//          test 5 & 6
        Moon test5Moon = new Moon("Phobos", 0.6);
        solarSystem.put(test5Moon.getName(), test5Moon);
        deimos.addMoon(test5Moon);


//

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName() + " : " + planet.getOrbitalPeriod());
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName() + " with period of " + jupiterMoon.getOrbitalPeriod());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }
//
//        Object o = new Object();
//        o.equals(o);
//        "pluto".equals("");


        System.out.println("***********");
        System.out.println("Solarsystem map display: ");
        for (String s : solarSystem.keySet()){
            System.out.println(s + " " + solarSystem.get(s).getOrbitalPeriod());
        }

        body = solarSystem.get("Deimos");
        System.out.println("Moons of " + body.getName());
        for(HeavenlyBody jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName() + " with period of " + jupiterMoon.getOrbitalPeriod());
        }
    }
}
