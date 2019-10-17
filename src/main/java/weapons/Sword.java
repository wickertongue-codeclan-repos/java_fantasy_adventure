package weapons;

import behaviours.IWeapon;

public class Sword extends Weapon {

    public Sword(String name, int damage) {
        super(name, damage);
    }

    public int attack() {
        return this.damage;
    }

}
