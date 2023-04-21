package Items;

import java.util.Random;

public class Dagger extends Item{
    String name = "Dagger";
    int price = 2;

    public Dagger() {
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
    public static int useDagger(){
        Random random = new Random();
        int damage = random.nextInt(5);
        return damage;
    }
}
