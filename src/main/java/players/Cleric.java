package players;

import behaviours.IHeal;
import healing_tools.HealingTool;

public class Cleric extends Player implements IHeal {
    private HealingTool healingTool;


    public Cleric(String name, int healthPoints, HealingTool healingTool) {
        super(name, healthPoints);
        this.healingTool = healingTool;
    }

    public int heal() {
        return this.healingTool.getHealingValue();
    }

    public void healPlayer(Player player) {
        player.healthPoints += heal();
    }

}
