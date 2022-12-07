public abstract class Warrior<T extends Weapon, C extends Shield> {
    private String name;
    private Integer healthpoints;
    private T weapon;

    private C shield;

    public Warrior(String name, Integer healthpoints, T weapon, C shield) {
        this.name = name;
        this.healthpoints = healthpoints;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthpoints() {
        return healthpoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setHealthpoints(Integer healthpoints) {
        this.healthpoints = healthpoints;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", weapon, name, healthpoints);
    }
}
