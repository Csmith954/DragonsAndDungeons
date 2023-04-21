package Battle;

import Items.*;
import Npc.Bear;
import Npc.Mage;
import Npc.Warrior;
import Npc.Wolf;
import Player.PlayerOne;
import UI.Story;
import UI.UserInput;
import UI.UserOutput;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Battle {
    private static Item item = new Item();
    private static UserInput userInput = new UserInput();
    private static UserOutput userOutput = new UserOutput();
    private static Arrow arrow = new Arrow();
    private static BattleAxe battleAxe = new BattleAxe();
    private static Dagger dagger = new Dagger();
    private static HealthPotion healthPotion = new HealthPotion();
    private static Longbow longbow = new Longbow();
    private static LongSword longSword = new LongSword();
    private static Shortbow shortbow = new Shortbow();
    private static ShortSword shortSword = new ShortSword();
    private static Spear spear = new Spear();
    private static Bear bear = new Bear();
    private static Mage mage = new Mage();
    private static Warrior warrior = new Warrior();
    private static Wolf wolf = new Wolf();
    private static PlayerOne playerOne = new PlayerOne();

    public Battle() {
    }

    public static int initiative(){
        Random random = new Random();
        int initiativeRoll = random.nextInt(20);
        return initiativeRoll;
    }


    public static void fightBear(){
//        int menuSelection = -1;
//        int playerInitiative = initiative();
//        int bearInitiative = initiative();
//        List<Item> playerInventory = playerOne.getInventory();
        System.out.println();
        System.out.println("You are being attacked by a bear!");
        boolean battleOver = false;

            while (!battleOver){
                String weapon = UserInput.selectWeapon();
                System.out.println(PlayerOne.getName() + "'s current health: " + PlayerOne.getHealth());
                    if (weapon.equalsIgnoreCase("Battle Axe")){
                        bear.setHealth(bear.getHealth() - BattleAxe.useBattleAxe());
                        System.out.println();
                        System.out.println("You raise the Battle Axe above your head and bring it down on the bear!");
                        System.out.println("Bear's remaining health: " + bear.getHealth());
                        PlayerOne.setHealth(PlayerOne.getHealth() - Bear.bearAttack());
                        System.out.println();
                        System.out.println("Before you can recover the bear strikes you with its claws...");
                        System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
                    }
                   else if(weapon.equalsIgnoreCase("Dagger")){
                        bear.setHealth(bear.getHealth() - Dagger.useDagger());
                        System.out.println();
                        System.out.println("You strike the bear from behind and stab it with your Dagger!");
                        System.out.println("Bear's remaining health: " + bear.getHealth());
                        PlayerOne.setHealth(PlayerOne.getHealth() - Bear.bearAttack());
                        System.out.println();
                        System.out.println("Before you can recover the bear strikes you with its claws...");
                        System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
                    }
                   else if (weapon.equalsIgnoreCase("Longbow")){
                        bear.setHealth(bear.getHealth() - Longbow.useLongBow());
                        System.out.println();
                        System.out.println("You raise the Longbow at shoot a arrow into the bear!");
                        System.out.println("Bear's remaining health: " + bear.getHealth());
                        PlayerOne.setHealth(PlayerOne.getHealth() - Bear.bearAttack());
                        System.out.println();
                        System.out.println("Before you can recover the bear strikes you with its claws...");
                        System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
                    }
                    else if (weapon.equalsIgnoreCase("Long Sword")){
                        bear.setHealth(bear.getHealth() - LongSword.useLongSword());
                        System.out.println();
                        System.out.println("You charge the bear and slash it with your Long Sword!");
                        System.out.println("Bear's remaining health: " + bear.getHealth());
                        PlayerOne.setHealth(PlayerOne.getHealth() - Bear.bearAttack());
                        System.out.println();
                        System.out.println("Before you can recover the bear strikes you with its claws...");
                        System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
                    }
                   else if (weapon.equalsIgnoreCase("Shortbow")){
                        bear.setHealth(bear.getHealth() - Shortbow.useShortbow());
                        System.out.println();
                        System.out.println("You manage to get a shot off before the bear charges you!");
                        System.out.println("Bear's remaining health: " + bear.getHealth());
                        PlayerOne.setHealth(PlayerOne.getHealth() - Bear.bearAttack());
                        System.out.println();
                        System.out.println("Before you can recover the bear strikes you with its claws...");
                        System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
                    }
                   else if (weapon.equalsIgnoreCase("Short Sword")){
                        bear.setHealth(bear.getHealth() - ShortSword.useShortSword());
                        System.out.println();
                        System.out.println("You charge the bear and slash it with your Short Sword!");
                        System.out.println("Bear's remaining health: " + bear.getHealth());
                        PlayerOne.setHealth(PlayerOne.getHealth() - Bear.bearAttack());
                        System.out.println();
                        System.out.println("Before you can recover the bear strikes you with its claws...");
                        System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
                    }
                   else if (weapon.equalsIgnoreCase("Spear")){
                        bear.setHealth(bear.getHealth() - Spear.useSpear());
                        System.out.println();
                        System.out.println("You stand your ground and stab the bear with your Spear");
                        System.out.println("Bear's remaining health: " + bear.getHealth());
                        PlayerOne.setHealth(PlayerOne.getHealth() - Bear.bearAttack());
                        System.out.println();
                        System.out.println("Before you can recover the bear strikes you with its claws...");
                        System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
                    }
                   if (PlayerOne.getHealth() <= 0){
                       System.out.println("You have fallen in battle, but at least the bear will be well fed.");
                       System.exit(0);
                   }else if (bear.getHealth() <= 0){
                       System.out.println();
                       System.out.println("You have defeated the bear!");
                       System.out.println(PlayerOne.getName() + " gained 200 XP.");
                       System.out.println();
                       playerOne.setXp(playerOne.getXp() + 200);
                       PlayerOne.setHealth(100);
                       bear.setHealth(17);
                       battleOver = true;
                   }
            }

    }

    public static void fightMage(){
//        int menuSelection = -1;
//        int playerInitiative = initiative();
//        int bearInitiative = initiative();
//        List<Item> playerInventory = playerOne.getInventory();
        System.out.println();
        System.out.println("You are being attacked by a mage!");
        boolean battleOver = false;

        while (!battleOver){
            String weapon = UserInput.selectWeapon();
            System.out.println(PlayerOne.getName() + "'s current health: " + PlayerOne.getHealth());
            if (weapon.equalsIgnoreCase("Battle Axe")){
                mage.setHealth(mage.getHealth() - BattleAxe.useBattleAxe());
                System.out.println();
                System.out.println("You raise the Battle Axe above your head and bring it down on the mage!");
                System.out.println("Mage's remaining health: " + mage.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Mage.mageAttack());
                System.out.println();
                System.out.println("Before you can recover the mage stabs you with their dagger...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if(weapon.equalsIgnoreCase("Dagger")){
                mage.setHealth(mage.getHealth() - Dagger.useDagger());
                System.out.println();
                System.out.println("You strike the mage from behind and stab them with your Dagger!");
                System.out.println("Mage's remaining health: " + mage.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Mage.mageAttack());
                System.out.println();
                System.out.println("Before you can recover the mage stabs you with their dagger...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Longbow")){
                mage.setHealth(mage.getHealth() - Longbow.useLongBow());
                System.out.println();
                System.out.println("You raise the Longbow at shoot a arrow into the mage!");
                System.out.println("Mage's remaining health: " + mage.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Mage.mageAttack());
                System.out.println();
                System.out.println("Before you can recover the mage stabs you with their dagger...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Long Sword")){
                mage.setHealth(mage.getHealth() - LongSword.useLongSword());
                System.out.println();
                System.out.println("You charge the mage and slash them with your Long Sword!");
                System.out.println("Mage's remaining health: " + mage.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Mage.mageAttack());
                System.out.println();
                System.out.println("Before you can recover the mage stabs you with their dagger...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Shortbow")){
                mage.setHealth(mage.getHealth() - Shortbow.useShortbow());
                System.out.println();
                System.out.println("You manage to get a shot off before the mage charges you!");
                System.out.println("Mage's remaining health: " + mage.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Mage.mageAttack());
                System.out.println();
                System.out.println("Before you can recover the mage stabs you with their dagger...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Short Sword")){
                mage.setHealth(mage.getHealth() - ShortSword.useShortSword());
                System.out.println();
                System.out.println("You charge the mage and slash them with your Short Sword!");
                System.out.println("Mage's remaining health: " + mage.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Mage.mageAttack());
                System.out.println();
                System.out.println("Before you can recover the mage stabs you with their dagger...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Spear")){
                mage.setHealth(mage.getHealth() - Spear.useSpear());
                System.out.println();
                System.out.println("You stand your ground and stab the mage with your Spear");
                System.out.println("Mage's remaining health: " + mage.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Mage.mageAttack());
                System.out.println();
                System.out.println("Before you can recover the mage stabs you with their dagger...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            if (PlayerOne.getHealth() <= 0){
                System.out.println("You have fallen in battle...");
                System.exit(0);
            }else if (mage.getHealth() <= 0){
                System.out.println();
                System.out.println("You have defeated the mage!");
                System.out.println(PlayerOne.getName() + " gained 2,300 XP.");
                System.out.println();
                playerOne.setXp(playerOne.getXp() + 2300);
                PlayerOne.setHealth(100);
                mage.setHealth(20);
                battleOver = true;
            }
        }

    }

    public static void fightWarrior(){
//        int menuSelection = -1;
//        int playerInitiative = initiative();
//        int bearInitiative = initiative();
//        List<Item> playerInventory = playerOne.getInventory();
        System.out.println();
        System.out.println("You are being attacked by a Warrior!");
        boolean battleOver = false;

        while (!battleOver){
            String weapon = UserInput.selectWeapon();
            System.out.println(PlayerOne.getName() + "'s current health: " + PlayerOne.getHealth());
            if (weapon.equalsIgnoreCase("Battle Axe")){
                warrior.setHealth(warrior.getHealth() - BattleAxe.useBattleAxe());
                System.out.println();
                System.out.println("You raise the Battle Axe above your head and bring it down on the Warrior!");
                System.out.println("Warrior's remaining health: " + warrior.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Warrior.warriorAttack());
                System.out.println();
                System.out.println("Before you can recover the Warrior slashes you with their long sword...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if(weapon.equalsIgnoreCase("Dagger")){
                warrior.setHealth(warrior.getHealth() - Dagger.useDagger());
                System.out.println();
                System.out.println("You strike the Warrior from behind and stab them with your Dagger!");
                System.out.println("Warrior's remaining health: " + warrior.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Warrior.warriorAttack());
                System.out.println();
                System.out.println("Before you can recover the Warrior slashes you with their long sword...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Longbow")){
                warrior.setHealth(warrior.getHealth() - Longbow.useLongBow());
                System.out.println();
                System.out.println("You raise the Longbow at shoot a arrow into the Warrior!");
                System.out.println("Warrior's remaining health: " + warrior.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Warrior.warriorAttack());
                System.out.println();
                System.out.println("Before you can recover the Warrior slashes you with their long sword...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Long Sword")){
                warrior.setHealth(warrior.getHealth() - LongSword.useLongSword());
                System.out.println();
                System.out.println("You charge the Warrior and slash them with your Long Sword!");
                System.out.println("Warrior's remaining health: " + warrior.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Warrior.warriorAttack());
                System.out.println();
                System.out.println("Before you can recover the Warrior slashes you with their long sword...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Shortbow")){
                warrior.setHealth(warrior.getHealth() - Shortbow.useShortbow());
                System.out.println();
                System.out.println("You manage to get a shot off before the Warrior charges you!");
                System.out.println("Warrior's remaining health: " + warrior.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Warrior.warriorAttack());
                System.out.println();
                System.out.println("Before you can recover the Warrior slashes you with their long sword...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Short Sword")){
                warrior.setHealth(warrior.getHealth() - ShortSword.useShortSword());
                System.out.println();
                System.out.println("You charge the Warrior and slash them with your Short Sword!");
                System.out.println("Warrior's remaining health: " + warrior.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Warrior.warriorAttack());
                System.out.println();
                System.out.println("Before you can recover the Warrior slashes you with their long sword...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Spear")){
                warrior.setHealth(warrior.getHealth() - Spear.useSpear());
                System.out.println();
                System.out.println("You stand your ground and stab the Warrior with your Spear");
                System.out.println("Warrior's remaining health: " + warrior.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Warrior.warriorAttack());
                System.out.println();
                System.out.println("Before you can recover the Warrior slashes you with their long sword...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            if (PlayerOne.getHealth() <= 0){
                System.out.println("You have fallen in battle, at least you died with honor...");
                System.exit(0);
            }else if (warrior.getHealth() <= 0){
                System.out.println();
                System.out.println("You have defeated the Warrior!");
                System.out.println(PlayerOne.getName() + " gained 2,300 XP.");
                System.out.println();
                playerOne.setXp(playerOne.getXp() + 2300);
                PlayerOne.setHealth(100);
                warrior.setHealth(20);
                battleOver = true;
            }
        }

    }

    public static void fightWolf(){
//        int menuSelection = -1;
//        int playerInitiative = initiative();
//        int bearInitiative = initiative();
//        List<Item> playerInventory = playerOne.getInventory();
        System.out.println();
        System.out.println("You are being attacked by a wolf!");
        boolean battleOver = false;

        while (!battleOver){
            String weapon = UserInput.selectWeapon();
            System.out.println(PlayerOne.getName() + "'s current health: " + PlayerOne.getHealth());
            if (weapon.equalsIgnoreCase("Battle Axe")){
                wolf.setHealth(wolf.getHealth() - BattleAxe.useBattleAxe());
                System.out.println();
                System.out.println("You raise the Battle Axe above your head and bring it down on the wolf!");
                System.out.println("Wolf's remaining health: " + wolf.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Wolf.wolfAttack());
                System.out.println();
                System.out.println("Before you can recover the wolf bites you...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if(weapon.equalsIgnoreCase("Dagger")){
                wolf.setHealth(wolf.getHealth() - Dagger.useDagger());
                System.out.println();
                System.out.println("You strike the wolf from behind and stab it with your Dagger!");
                System.out.println("Wolf's remaining health: " + wolf.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Wolf.wolfAttack());
                System.out.println();
                System.out.println("Before you can recover the wolf bites you...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Longbow")){
                wolf.setHealth(wolf.getHealth() - Longbow.useLongBow());
                System.out.println();
                System.out.println("You raise the Longbow at shoot a arrow into the wolf!");
                System.out.println("Wolf's remaining health: " + wolf.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Wolf.wolfAttack());
                System.out.println();
                System.out.println("Before you can recover the wolf bites you...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Long Sword")){
                wolf.setHealth(wolf.getHealth() - LongSword.useLongSword());
                System.out.println();
                System.out.println("You charge the wolf and slash it with your Long Sword!");
                System.out.println("Wolf's remaining health: " + wolf.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Wolf.wolfAttack());
                System.out.println();
                System.out.println("Before you can recover the wolf bites you...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Shortbow")){
                wolf.setHealth(wolf.getHealth() - Shortbow.useShortbow());
                System.out.println();
                System.out.println("You manage to get a shot off before the wolf charges you!");
                System.out.println("Wolf's remaining health: " + wolf.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Wolf.wolfAttack());
                System.out.println();
                System.out.println("Before you can recover the wolf bites you...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Short Sword")){
                wolf.setHealth(wolf.getHealth() - ShortSword.useShortSword());
                System.out.println();
                System.out.println("You charge the wolf and slash it with your Short Sword!");
                System.out.println("Wolf's remaining health: " + wolf.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Wolf.wolfAttack());
                System.out.println();
                System.out.println("Before you can recover the wolf bites you...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            else if (weapon.equalsIgnoreCase("Spear")){
                wolf.setHealth(wolf.getHealth() - Spear.useSpear());
                System.out.println();
                System.out.println("You stand your ground and stab the wolf with your Spear");
                System.out.println("Wolf's remaining health: " + wolf.getHealth());
                PlayerOne.setHealth(PlayerOne.getHealth() - Wolf.wolfAttack());
                System.out.println();
                System.out.println("Before you can recover the wolf bites you...");
                System.out.println(PlayerOne.getName() + "'s remaining health: " + PlayerOne.getHealth());
            }
            if (PlayerOne.getHealth() <= 0){
                System.out.println("You have fallen in battle, the pack wont go hungry...");
                System.exit(0);
            }else if (wolf.getHealth() <= 0){
                System.out.println();
                System.out.println("You have defeated the wolf!");
                System.out.println(PlayerOne.getName() + " gained 2,300 XP.");
                System.out.println();
                playerOne.setXp(playerOne.getXp() + 2300);
                PlayerOne.setHealth(100);
                wolf.setHealth(11);
                battleOver = true;
            }
        }

    }




}
