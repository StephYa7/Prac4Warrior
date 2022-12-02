public class Archer extends Warrior<Bow> {

    private Integer range;

    public Archer(String name, Integer healthpoints, Bow weapon,Integer range) {
        super(name, healthpoints, weapon);
        this.range = range;
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, range - %d",super.toString(),range);
    }

    public Integer getRange() {
        return range;
    }
}
