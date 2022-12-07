public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("her", 150, new Staff(),new LightShield());
        Hero hero2 = new Hero("her2", 150, new Staff(),new HeavyShield());



        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("a1", 55, new LongBow(), new LightShield(),12));
        red.add(new Archer("a2", 54, new Bow(), new LightShield(),12));

        Team<Warrior> blue = new Team<>(hero2);
        blue.add(new Mage("m1", 55, new Staff(), 12, new LightShield(),333));
        blue.add(new Archer("m2", 54, new Bow(), new LightShield(),12));
        blue.add(new Hero("m1", 54, new LongBow(),new LightShield()));

        System.out.println(red);
        System.out.println(red.getTeamHealthPoints());
        System.out.println(blue);
        System.out.println(blue.getTeamHealthPoints());
    }
}