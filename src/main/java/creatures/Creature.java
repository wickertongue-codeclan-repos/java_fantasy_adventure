package creatures;

public abstract class Creature {

    private String name;
    private int defenseRating;

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
}
