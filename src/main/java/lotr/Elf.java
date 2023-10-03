package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    public void kick(Character c) {
        if (c.getPower() < getPower()) {
            c.setHp(0);
        } else {
            setPower(getPower() - 1);
        }
    }
}
