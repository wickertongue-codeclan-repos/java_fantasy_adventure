package weapons;

import behaviours.IWeapon;

public abstract class Weapon implements IWeapon {
    private String name;
    public int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

}
