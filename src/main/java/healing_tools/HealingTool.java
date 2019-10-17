package healing_tools;

public abstract class HealingTool {
    private String name;
    private int healingValue;

    public HealingTool(String name, int healingValue) {
        this.name = name;
        this.healingValue = healingValue;
    }

    public String getName() {
        return name;
    }

    public int getHealingValue() {
        return healingValue;
    }
}
