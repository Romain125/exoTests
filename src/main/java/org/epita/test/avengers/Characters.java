package org.epita.test.avengers;

import java.util.Arrays;
import java.util.List;

public class Characters {

    public static Humanoid peterParker = new Humanoid("Peter Parker", 15);
    public static Humanoid tonyStark = new Humanoid("Tony Stark", 48);
    public static Humanoid bruceBanner = new Humanoid("Bruce Banner", 48);
    public static Humanoid thorOfAsgard = new Humanoid("Thor of Asgard", 1500);
    public static Humanoid natashaRomanoff = new Humanoid("Natasha Romanoff", 33);
    public static Humanoid steveRogers = new Humanoid("Steve Rogers", 106);
    public static Humanoid clintonBarton = new Humanoid("Clinton Barton", 35);
    public static Humanoid thanosTheTitan = new Humanoid("Thanos the Titan", 750000);

    public static SuperHero spiderman = new SuperHero(peterParker, "Spider-man", Arrays.asList("Web Shooting", "Agility"));
    public static SuperHero ironman = new SuperHero(tonyStark, "Iron Man", Arrays.asList("High-tech armor", "Rich"));
    public static SuperHero hulk = new SuperHero(bruceBanner, "Hulk", Arrays.asList("Strong"));
    public static SuperHero thor = new SuperHero(thorOfAsgard, null, Arrays.asList("Mjöllnir", "Immortal"));
    public static SuperHero blackWidow = new SuperHero(natashaRomanoff, "Black Widow", Arrays.asList("Close Combat"));
    public static SuperHero captainAmerica = new SuperHero(steveRogers, "Captain America", Arrays.asList("Vibranium Shield", "Super-soldier"));
    public static SuperHero hawkEye = new SuperHero(clintonBarton, "Hawk Eye", Arrays.asList("Bow and arrows"));
    public static SuperHero thanos = new SuperHero(thanosTheTitan, null, Arrays.asList("Strong", "Infinity Gauntlet"));

    public static List<SuperHero> avengers = Arrays.asList(ironman, hulk, thor, blackWidow, captainAmerica, hawkEye);

}
