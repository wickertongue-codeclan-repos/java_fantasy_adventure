package players;

import behaviours.IWeapon;

public class Dwarf extends Player implements IWeapon {
    IWeapon weapon;


    public Dwarf(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void attackPlayer(Player enemy) {
        if (enemy.defense > 0) {
            int damage = weapon.attack() - enemy.defense;
            enemy.healthPoints -= damage;
        } else {
            enemy.healthPoints -= weapon.attack();
        }
    }

    public int attack() {
        return this.weapon.attack();
    }

//    public void setHealth(int attackDamage) {
//        this.healthPoints -= attackDamage;
//    }

    public void switchWeapon(IWeapon newWeapon) {
        this.weapon = newWeapon;
    }

    public IWeapon getWeapon() {
        return this.weapon;
    }
}
