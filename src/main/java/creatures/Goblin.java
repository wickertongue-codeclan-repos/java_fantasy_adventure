package creatures;

import behaviours.IDefend;

public class Goblin  extends Creature implements IDefend {

    public Goblin(String name, int defenseRating) {
        super(name, defenseRating);
    }


}
