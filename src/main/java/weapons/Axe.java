package weapons;

import behaviours.IWeapon;

public class Axe extends Weapon implements IWeapon {

    public Axe(String name, int damage) {
        super(name, damage);
    }

    public int attack() {
        return this.damage;
    }
}
