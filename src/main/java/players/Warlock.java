package players;

import behaviours.IDefend;
import behaviours.ISpell;
import creatures.Creature;
import spells.Spell;

public class Warlock extends Player implements ISpell, IDefend {
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
        if (enemy.defense > 0) {
            int damage = spell.cast() - enemy.defense;
            enemy.healthPoints -= damage;
        } else {
            enemy.healthPoints -= spell.cast();
        }
    }

    public int defend() {
       return this.defense = creature.getDefenseRating();
    }

}
