package healing_tools;

import behaviours.IHeal;

public class Potion extends HealingTool implements IHeal {

    public Potion(String name, int healingValue) {
        super(name, healingValue);
    }

    public int heal() {
        return this.getHealingValue();
    }
}
