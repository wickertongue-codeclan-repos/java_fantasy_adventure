package players;

import behaviours.IWeapon;

public class Barbarian extends Player implements IWeapon {
    private IWeapon weapon;

    public Barbarian(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public int attack() {
        return this.weapon.attack();
    }

    public void setHealth(int attackDamage) {
        this.healthPoints -= attackDamage;
    }

    public void switchWeapon(IWeapon newWeapon) {
        this.weapon = newWeapon;
    }

    public IWeapon getWeapon() {
        return this.weapon;
    }


}
