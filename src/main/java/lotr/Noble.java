package lotr;
import java.util.Random;

public class Noble extends Character {
    static Random rn = new Random();

    public Noble(int hp_min, int hp_max, int power_min, int power_max) {
        super(rn.nextInt(hp_max-hp_min + 1) + hp_min, rn.nextInt(power_min-power_min + 1) + power_min);
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - rn.nextInt(getPower() + 1));
    }

}
