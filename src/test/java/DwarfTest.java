import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Dwarf;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    IWeapon sword;
    IWeapon axe;
    Barbarian barbarian;

    @Before
    public void before() {
        sword = new Sword("Excalibur", 10);
        axe = new Axe("Brutal Adamantite Broadaxe", 20);
        dwarf = new Dwarf("Sargom", 130, sword);
        barbarian = new Barbarian("Lol", 200, sword);

    }

    @Test
    public void dwarfHasName() {
        assertEquals("Sargom", dwarf.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(130, dwarf.getHealthPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, dwarf.getWeapon());
    }

    @Test
    public void canSwitchWeapon() {
        dwarf.switchWeapon(axe);
        assertEquals(axe, dwarf.getWeapon());
    }

    @Test
    public void canAttackAnotherPlayer() {
        dwarf.attackPlayer(barbarian);
        assertEquals(190, barbarian.getHealthPoints());
    }

}
