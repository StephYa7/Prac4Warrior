import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    private Hero hero;
    private List<T> teamList = new ArrayList<T>();

    public Team(Hero hero) {
        this.hero = hero;
    }

    public void add(T pers) {
        teamList.add(pers);
    }


    @Override
    public Iterator<T> iterator() {
        return teamList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder bild = new StringBuilder(hero.toString() + "\n");
        for (T item : this) {
            bild.append(item.toString() + "\n");
        }
        return bild.toString();
    }

    public Integer getTeamHealthPoints() {
        Integer summ = hero.getHealthpoints();
        for (T item : this) {
            summ += item.getHealthpoints();
        }
        return summ;
    }
}


