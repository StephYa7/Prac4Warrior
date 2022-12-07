public class HeavyShield implements Shield{
    @Override
    public Integer blockDamage() {
        return 21;
    }

    @Override
    public String toString() {
        return String.format("HeavyShield %d", blockDamage());
    }
}
