package Items;

import java.util.Random;

public class Spear extends Item{
    private String name = "Spear";
    private int quantity = 1;

    public Spear() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int throwSpear(){
        Random random = new Random();
        int damage = random.nextInt(8);
        return damage;
    }
    public static int useSpear(){
        Random random = new Random();
        int damage = random.nextInt(6);
        return damage;
    }
}
