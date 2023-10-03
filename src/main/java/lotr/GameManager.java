package lotr;

public class GameManager {
    public void fight(lotr.Character c1, lotr.Character c2) {
        Class<?extends lotr.Character> c1Class = c1.getClass();
        Class<?extends lotr.Character> c2Class = c2.getClass();
        int counter = 1;
        System.out.println(c1Class + " vs " + c2Class + '\n');
        while (c1.isAlive() && c2.isAlive() && (counter < 101)) {
            System.out.println("Round " + counter + '\n');
            System.out.println(c1Class + "'s HP: " + c1.getHp() + '\n');
            System.out.println(c1Class + "'s power: " + c1.getPower() + '\n');

            System.out.println(c2Class + "'s HP: " + c2.getHp() + '\n');
            System.out.println(c2Class + "'s power: " + c2.getPower() + '\n');

            System.out.println("...fight sounds..." + '\n');
            c1.kick(c2);
            c2.kick(c1);
            counter++;
        }
        System.out.println("-----------\n" + c1Class + "'s HP: " + c1.getHp() + '\n');
        System.out.println(c1Class + "'s power: " + c1.getPower() + '\n');
        System.out.println(c2Class + "'s HP: " + c2.getHp() + '\n');
        System.out.println(c2Class + "'s power: " + c2.getPower() + "\n-----------\n");
        if (counter > 100) {
            c1.setHp(0);
            c2.setHp(0);
            System.out.println("Both characters died of devastation." + '\n');
        } else if (!c1.isAlive()) {
            System.out.println(c1Class + " was defeated." + '\n');
        } else if (!c2.isAlive()) {
            System.out.println(c2Class + " was defeated." + '\n');
        } else {
            System.out.println("Both " + c1Class + " and " + c2Class + " were defeated in this fight." + '\n');
        }
    }
}
