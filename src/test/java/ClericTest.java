import healing_tools.Potion;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Cleric;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;
    Barbarian barbarian;
    Sword sword;

    @Before
    public void before() {
        potion = new Potion("HealBurn", 20);
        cleric = new Cleric("Mercy", 140, potion);
        sword = new Sword("Excalibur", 10);
        barbarian = new Barbarian("Lol", 10, sword);
    }

    @Test
    public void hasName() {
        assertEquals("Mercy", cleric.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(140, cleric.getHealthPoints());
    }

    @Test
    public void canHealPlayer() {
        cleric.healPlayer(barbarian);
        assertEquals(30,barbarian.getHealthPoints());
    }


}
