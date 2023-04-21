package Items;

import java.util.Random;

public class HealthPotion extends Item{
    String name = "Health Potion";
    private int price = 5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HealthPotion() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int healthPotion(){
        Random random = new Random();
        int healthGain = random.nextInt(4) + random.nextInt(4) + 2;
        return healthGain;
    }
}
