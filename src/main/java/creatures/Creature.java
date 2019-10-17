package creatures;

import behaviours.IDefend;

public abstract class Creature implements IDefend {

    private String name;
    protected int defenseRating;

    public Creature(String name, int defenseRating) {
        this.name = name;
        this.defenseRating = defenseRating;
    }

    public String getName() {
        return name;
    }

    public int getDefenseRating() {
        return defenseRating;
    }

    public int defend() {
        return this.defenseRating;
    }
}
