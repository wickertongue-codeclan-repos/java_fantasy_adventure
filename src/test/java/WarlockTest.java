import creatures.Goblin;
import creatures.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import players.Warlock;
import spells.FireBall;
import spells.Thunderball;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Troll troll;
    FireBall fireball;
    Dwarf dwarf;
    Sword sword;
    Goblin goblin;
    Thunderball thunderball;

    @Before
    public void before() {
        troll = new Troll("Olave", 6);
        fireball = new FireBall("Infernal", 30);
        thunderball = new Thunderball("Sparkle", 50);
        goblin = new Goblin("Ice Cream", 3);
        warlock = new Warlock("Peter", 80, troll, fireball);
        sword = new Sword("Excalibur", 10);
        dwarf = new Dwarf("Sargom", 130, sword);
    }

    @Test
    public void hasName() {
        assertEquals("Peter", warlock.getName());
    }

    @Test
    public void hsHealthPoints() {
        assertEquals(80, warlock.getHealthPoints());
    }

    @Test
    public void hasSpell() {
        assertEquals(fireball, warlock.getSpell());
    }

    @Test
    public void canAtackAnotherPlayer() {
        warlock.attackPlayer(dwarf);
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void canDefendAgainstAttacks() {
        warlock.defend();
        dwarf.attackPlayer(warlock);
        assertEquals(76, warlock.getHealthPoints());
    }

    @Test
    public void canSwitchCreature() {
        warlock.switchCreature(goblin);
        assertEquals(goblin, warlock.getCreature());
    }

    @Test
    public void canSwitchSpells() {
        warlock.switchSpells(thunderball);
        assertEquals(thunderball, warlock.getSpell());
    }


}
