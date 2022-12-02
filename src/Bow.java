public class Bow implements Weapon {
    @Override
    public Integer damage() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Bow %d", damage());
    }
}
