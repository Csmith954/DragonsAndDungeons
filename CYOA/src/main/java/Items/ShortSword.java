package Items;

import java.util.Random;

public class ShortSword extends Item{
    private String name = "Short Sword";
    private int price = 10;

    public ShortSword() {
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

    public static int useShortSword(){
        Random random = new Random();
        int damage = random.nextInt(6);
        return damage;
    }
}
