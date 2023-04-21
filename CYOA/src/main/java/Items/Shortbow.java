package Items;

import java.util.Random;

public class Shortbow extends Item{
    private String name = "Shortbow";
    private int price = 25;

    public Shortbow() {
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
    public static int useShortbow(){
        Random random = new Random();
        int damage = random.nextInt(6);
        return damage;
    }
}
