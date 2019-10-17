package players;

import behaviours.IWeapon;

public class Dwarf extends Player implements IWeapon {
    IWeapon weapon;


    public Dwarf(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

//    public void attackPlayer(Player enemy, IWeapon weapon) {
//
//        this.healthPoints -=
//        player.setHealth(weapon.attack());
//    }

    public int attack() {
        return this.weapon.attack();
    }

    public void setHealth(int attackDamage) {
        this.healthPoints -= attackDamage;
    }

    public IWeapon getWeapon() {
        return this.weapon;
    }
}
