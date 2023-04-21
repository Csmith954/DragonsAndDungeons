package Items;

import java.util.Random;

public class LongSword extends Item{
    private String name = "Long Sword";
    private int price = 15;

    public LongSword() {
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

    public static int useLongSword(){
        Random random = new Random();
        int damage = random.nextInt(10);
        return damage;
    }
}
