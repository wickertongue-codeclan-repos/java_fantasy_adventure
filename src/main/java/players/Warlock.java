package players;

import behaviours.ISpell;
import creatures.Creature;
import spells.Spell;

public class Warlock extends Player implements ISpell {

    private Creature creature;
    private Spell spell;

    public Warlock(String name, int healthPoints, Creature creature, Spell spell){
        super(name, healthPoints);
        this.creature = creature;
        this.spell = spell;
    }

    public int cast(){
        return this.spell.cast();
    }

    public void attackPlayer(Player enemy) {
        enemy.healthPoints -= spell.cast();
    }


}
