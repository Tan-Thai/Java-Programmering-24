package Coding_playground.E5;

public class PlanetMain {
    public static void main(String[] args) {
        for (PlanetEnum planet : PlanetEnum.values()) {
            System.out.println(planet.name());
        }
    }
}
