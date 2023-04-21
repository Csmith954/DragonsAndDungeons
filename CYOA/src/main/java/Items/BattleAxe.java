package Items;

import java.util.Random;

public class BattleAxe extends Item{
    String name = "Battle Axe";
    int price = 10;

    public BattleAxe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int useBattleAxe(){
        Random random = new Random();
        int damage = random.nextInt(9);
        return damage;
    }
}
