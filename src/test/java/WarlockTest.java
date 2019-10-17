import creatures.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import players.Warlock;
import spells.FireBall;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Troll troll;
    FireBall fireball;
    Dwarf dwarf;
    Sword sword;

    @Before
    public void before() {
        troll = new Troll("Olave", 6);
        fireball = new FireBall("Infernal", 30);
        warlock = new Warlock("Peter", 80, troll, fireball);
        sword = new Sword("Excalibur", 10);

        dwarf = new Dwarf("Sargom", 130, sword);

    }

    @Test
    public void hasName() {
        assertEquals("Peter", warlock.getName());
    }

    @Test
    public void canAtackAnotherPlayer() {
        warlock.attackPlayer(dwarf);
        assertEquals(100, dwarf.getHealthPoints());
    }


}
