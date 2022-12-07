public class LightShield implements Shield {
    @Override
    public Integer blockDamage() {
        return 12;
    }

    @Override
    public String toString() {
        return String.format("LightShield %d", blockDamage());
    }
}
