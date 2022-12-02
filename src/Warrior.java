public abstract class Warrior <T extends Weapon> {
    private String name;
    private Integer healthpoints;
    private T weapon;

    public Warrior(String name, Integer healthpoints, T weapon) {
        this.name = name;
        this.healthpoints = healthpoints;
        this.weapon = weapon;
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

    public void setHealthpoints(Integer healthpoints) {
        this.healthpoints = healthpoints;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", weapon, name, healthpoints);
    }
}
