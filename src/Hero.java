public class Hero extends Warrior{

    public Hero(String name, Integer healthpoints, Weapon weapon, Shield shield) {
        super(name, healthpoints, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Hero: %s",super.toString());
    }
}
