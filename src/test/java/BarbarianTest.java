import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Dwarf;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    IWeapon sword;
    IWeapon axe;
    Dwarf dwarf;

    @Before
    public void before() {
        sword = new Sword("Excalibur", 10);
        axe = new Axe("Brutal Adamantite Broadaxe", 20);
        barbarian = new Barbarian("Lol", 200, sword);
        dwarf = new Dwarf("Sargom", 130, sword);

    }

    @Test
    public void dwarfHasName() {
        assertEquals("Lol", barbarian.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(200, barbarian.getHealthPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, barbarian.getWeapon());
    }

    @Test
    public void canSwitchWeapon() {
        barbarian.switchWeapon(axe);
        assertEquals(axe, barbarian.getWeapon());
    }

    @Test
    public void canAttackAnotherPlayer() {
        barbarian.attackPlayer(dwarf);
        assertEquals(120, dwarf.getHealthPoints());
    }


}

