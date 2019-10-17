package spells;

import behaviours.ISpell;

public class Thunderball extends Spell implements ISpell {


    public Thunderball(String name, int damage) {
        super(name, damage);
    }
}
