package org.epita.test.avengers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.epita.test.avengers.Characters.*;

public class AvengersTest {

    @Test
    public void spiderman_est_mineur(){
        SuperHero spiderman = Characters.spiderman;
        assertThat(spiderman.getAge())
                .isLessThanOrEqualTo(17);
    }

    @Test
    void blackwidow_fait_partie_des_avengers() {
        assertThat(blackWidow).isIn(avengers);
    }

    @Test
    public void avengers_does_not_contain_duplicates(){
        assertThat(avengers).doesNotHaveDuplicates();
    }

    @Test
    public void avengers_does_not_contain_thanos(){
        assertThat(avengers)
                .doesNotContain(thanos);
    }

    @Test
    public void thos_and_thanos_does_not_have_hero_name(){
        assertThat(thor.getName()).isEqualTo(thorOfAsgard.getName());
        assertThat(thanos.getName()).isEqualTo(thanosTheTitan.getName());

        assertThat(thor).hasFieldOrPropertyWithValue("heroName", null);
        assertThat(thanos).hasFieldOrPropertyWithValue("heroName", null);
    }

    @Test
    public void thanos_possed_au_moins_pouvoirs_de_hulk(){
        assertThat(thanos.getPowers().containsAll(hulk.getPowers())).isTrue();
        assertThat(thanos.getPowers()).containsAll(hulk.getPowers());
    }

    @Test
    public void test50(){
        assertThat(hawkEye)
                .isInstanceOfAny(SuperHero.class)
                .isInstanceOf(Humanoid.class);

        assertThat(clintonBarton)
                .isNotInstanceOfAny(SuperHero.class, String.class);

    }

    @Test
    public void test61(){
        assertThat(bruceBanner.getAge()).isEqualTo(tonyStark.getAge());
        assertThat(bruceBanner)
                .isEqualToComparingOnlyGivenFields(tonyStark, "age");
    }

    @Test
    public void test68(){
        assertThat(ironman.heroNameOrHumanoidNameIfNull()).contains(" ");
        assertThat(spiderman.heroNameOrHumanoidNameIfNull()).doesNotContain(" ");
    }


}
