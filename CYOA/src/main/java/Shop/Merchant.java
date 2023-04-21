package Shop;

import Items.*;
import Player.PlayerOne;
import UI.UserInput;
import UI.UserOutput;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static App.Application.merchant;

//import static App.Application.merchant;

public class Merchant extends Item {
    private List<Item> inventory = new ArrayList<>();
    private int gold = 100;
    Arrow arrow = new Arrow();
    BattleAxe battleAxe = new BattleAxe();
    Dagger dagger = new Dagger();
    HealthPotion healthPotion = new HealthPotion();
    Longbow longbow = new Longbow();
    LongSword longSword = new LongSword();
    Shortbow shortbow = new Shortbow();
    ShortSword shortSword = new ShortSword();
    Spear spear = new Spear();
    private static PlayerOne playerOne = new PlayerOne();
    int menuSelection = -1;

    public Merchant() {
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public List<Item> setUpMerchant(){
        List<Item> items = new ArrayList<>();
        items.add(arrow);
        items.add(battleAxe);
        items.add(dagger);
        items.add(healthPotion);
        items.add(longbow);
        items.add(longSword);
        items.add(shortbow);
        items.add(shortSword);
        items.add(spear);
        return items;
    }

    public void displayShopInventory(List<Item> items){
        int counter = 1;
        System.out.println();
        System.out.println();
        System.out.println("Welcome to my shop, which item would you like to purchase?");
        System.out.println();
        System.out.println();
        System.out.println(playerOne.getName() + "'s current gold is " + playerOne.getGold());
        System.out.println();
        System.out.println("Press '0' to exit shop");
        for (Item item : items){
            System.out.println(counter + ") " + item.getName() + " | Price: " + item.getPrice() + " gold");
            counter++;
        }
    }
     public void shop(){
         UserOutput.setUpWeapons();
         while (menuSelection != 0) {
             merchant.displayShopInventory(merchant.setUpMerchant());
             System.out.println();
             System.out.println();
             menuSelection = UserInput.promptForMenuSelection("Enter a number to purchase a item: ");
             if (menuSelection == 1) {
                 if (playerOne.getGold() >= getPrice()) {playerOne.addItemToInventory(arrow);
                     playerOne.setGold(playerOne.getGold() - arrow.getPrice());
                     merchant.setGold(merchant.getGold() + arrow.getPrice());
                     System.out.println(arrow.getQuantity() + arrow.getName() + " were added to " + PlayerOne.getName() + "'s inventory!");}
                 else {
                     System.out.println("You don't have enough gold for that item!");
                 }
             } else if (menuSelection == 2) {
                 if (playerOne.getGold() >= arrow.getPrice()) {
                     playerOne.addItemToInventory(battleAxe);
                     playerOne.setGold(playerOne.getGold() - battleAxe.getPrice());
                     merchant.setGold(merchant.getGold() + battleAxe.getPrice());
                     System.out.println("A " + battleAxe.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
                 }else {
                     System.out.println("You don't have enough gold for that item!");
                 }
             } else if (menuSelection == 3) {
                 if (playerOne.getGold() >= dagger.getPrice()) {
                     playerOne.addItemToInventory(dagger);
                     playerOne.setGold(playerOne.getGold() - dagger.getPrice());
                     merchant.setGold(merchant.getGold() + dagger.getPrice());
                     System.out.println("A " + dagger.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
                 }else {
                     System.out.println("You don't have enough gold for that item!");
                 }
             } else if (menuSelection == 4) {
                 if (playerOne.getGold() >= healthPotion.getPrice()) {
                     playerOne.addItemToInventory(healthPotion);
                     playerOne.setGold(playerOne.getGold() - healthPotion.getPrice());
                     merchant.setGold(merchant.getGold() + healthPotion.getPrice());
                     System.out.println("A " + healthPotion.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
                 }else {
                     System.out.println("You don't have enough gold for that item!");
                 }
             } else if (menuSelection == 5) {
                 if (playerOne.getGold() >= longbow.getPrice()) {
                     playerOne.addItemToInventory(longbow);
                     playerOne.setGold(playerOne.getGold() - longbow.getPrice());
                     merchant.setGold(merchant.getGold() + longbow.getPrice());
                     System.out.println("A " + longbow.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
                 }else {
                     System.out.println("You don't have enough gold for that item!");
                 }
             } else if (menuSelection == 6) {
                 if (playerOne.getGold() >= longSword.getPrice()) {
                     playerOne.addItemToInventory(longSword);
                     playerOne.setGold(playerOne.getGold() - longSword.getPrice());
                     merchant.setGold(merchant.getGold() + longSword.getPrice());
                     System.out.println("A " + longSword.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
                 }else {
                     System.out.println("You don't have enough gold for that item!");
                 }
             } else if (menuSelection == 7) {
                 if (playerOne.getGold() >= shortbow.getPrice()) {
                     playerOne.addItemToInventory(shortbow);
                     playerOne.setGold(playerOne.getGold() - shortbow.getPrice());
                     merchant.setGold(merchant.getGold() + shortbow.getPrice());
                     System.out.println("A " + shortbow.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
                 }else {
                     System.out.println("You don't have enough gold for that item!");
                 }
             } else if (menuSelection == 8) {
                 if (playerOne.getGold() >= shortSword.getPrice()) {
                     playerOne.addItemToInventory(shortSword);
                     playerOne.setGold(playerOne.getGold() - shortSword.getPrice());
                     merchant.setGold(merchant.getGold() + shortSword.getPrice());
                     System.out.println("A " + shortSword.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
                 }else {
                     System.out.println("You don't have enough gold for that item!");
                 }
             } else if (menuSelection == 9) {
                 if (playerOne.getGold() >= spear.getPrice()) {
                     playerOne.addItemToInventory(spear);
                     playerOne.setGold(playerOne.getGold() - spear.getPrice());
                     merchant.setGold(merchant.getGold() + spear.getPrice());
                     System.out.println("A " + spear.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
                 }else {
                     System.out.println("You don't have enough gold for that item!");
                 }
             } else if (menuSelection == 0) {
                 System.out.println("You have " + playerOne.getGold() + " gold left");
             } else {
                 // anything else is not valid
                 System.out.println("Invalid Selection");
             }
         }
     }

}
