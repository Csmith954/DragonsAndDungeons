package Items;

import java.util.Random;

public class Longbow extends Item{
    String name = "Longbow";
    private int price = 50;

    public Longbow() {
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
    public static int useLongBow(){
        Random random = new Random();
        int damage = random.nextInt(8);
        return damage;
    }
}
