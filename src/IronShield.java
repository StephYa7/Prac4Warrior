public class IronShield extends Shield implements BlockDamage{

    public IronShield(Integer weight, Integer price) {
        super(weight, price);
    }


    @Override
    public Integer blockDamage() {
        return 9;
    }
}
