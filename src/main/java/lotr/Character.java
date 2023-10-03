package lotr;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter  @AllArgsConstructor
public abstract class Character {
    private int hp;
    @Setter
    private int power;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return getHp() > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

    public void setHp(int new_hp) {
        hp = new_hp;
        if (hp < 0) {
            hp=0;
        }
    }
}
