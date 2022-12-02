public class Hero extends Warrior{

    public Hero(String name, Integer healthpoints, Weapon weapon) {
        super(name, healthpoints, weapon);
    }

    @Override
    public String toString() {
        return String.format("Hero: %s",super.toString());
    }
}
