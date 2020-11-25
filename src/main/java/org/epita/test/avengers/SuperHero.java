package org.epita.test.avengers;

import java.util.Collections;
import java.util.List;

public class SuperHero extends Humanoid {

    private List<String>  powers;
    private String heroName;

    public SuperHero(Humanoid humanoid, String heroName, List<String> powers) {
        super(humanoid.getName(), humanoid.getAge());
        this.heroName = heroName;
        this.powers = powers;
    }

    public String heroNameOrHumanoidNameIfNull() {
        if(heroName == null) {return super.getName();}
        return heroName;
    }

    public List<String> getPowers() {
        return Collections.unmodifiableList(powers);
    }
}
