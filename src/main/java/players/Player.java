package players;

public abstract class Player {
    private String name;
    protected int healthPoints;
    protected int defense;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.defense = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

//    public Creature getDefense() {
//        this.defense;
//    }

}
