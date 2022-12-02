public class WoodenShield extends Shield implements  BlockDamage {

    public WoodenShield(Integer weight, Integer price) {
        super(weight, price);
    }

    @Override
    public Integer blockDamage() {
        return 5;
    }
}
