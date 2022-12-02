public class Mage extends Warrior<Staff> {

    private Integer range;
    private Integer mana;


    public Mage(String name, Integer healthpoints, Staff weapon,Integer range, Integer mana) {
        super(name, healthpoints, weapon);
        this.range = range;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return String.format("Mage: %s, mana - %d, range - %d",super.toString(),mana,range);
    }

    public Integer getRange() {
        return range;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getMana() {
        return mana;

    }
}

