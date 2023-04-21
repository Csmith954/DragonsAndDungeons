package UI;

import App.Application;
import Items.Item;
import Player.PlayerOne;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Random;

public class UserOutput {
     private static PlayerOne playerOne = new PlayerOne();
     private static UserInput userInput = new UserInput();

   public static void welcomeMessage(){
       System.out.println("====================================================================================");
       System.out.println("______                                        \n" +
               "|  _  \\                                       \n" +
               "| | | | _ __   __ _   __ _   ___   _ __   ___ \n" +
               "| | | || '__| / _` | / _` | / _ \\ | '_ \\ / __|\n" +
               "| |/ / | |   | (_| || (_| || (_) || | | |\\__ \\\n" +
               "|___/  |_|    \\__,_| \\__, | \\___/ |_| |_||___/\n" +
               "                      __/ |                   \n" +
               "                     |___/                    ");
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println("                   _ \n" +
               "                  | |\n" +
               "  __ _  _ __    __| |\n" +
               " / _` || '_ \\  / _` |\n" +
               "| (_| || | | || (_| |\n" +
               " \\__,_||_| |_| \\__,_|\n" +
               "                     \n" +
               "                     ");
       System.out.println();
       System.out.println();
       System.out.println("______                                               \n" +
               "|  _  \\                                              \n" +
               "| | | | _   _  _ __    __ _   ___   ___   _ __   ___ \n" +
               "| | | || | | || '_ \\  / _` | / _ \\ / _ \\ | '_ \\ / __|\n" +
               "| |/ / | |_| || | | || (_| ||  __/| (_) || | | |\\__ \\\n" +
               "|___/   \\__,_||_| |_| \\__, | \\___| \\___/ |_| |_||___/\n" +
               "                       __/ |                         \n" +
               "                      |___/                          ");
       System.out.println();
       System.out.println("   ___------~~~~~~~~~~~----__         .:.         __----~~~~~~~~~~~------___   \n" +
               " ~~ ~--__          ......====\\\\~~    .:::.    ~~//====......          __--~ ~~ \n" +
               "         ~\\ ...::::~~~~~~  //|||    .:::::.    |||\\\\  ~~~~~~::::... /~         \n" +
               "        -~~\\_            //  |||***.(:::::).***|||  \\\\            _/~~-        \n" +
               "             ~\\_        // *******.:|\\^^^/|:.******* \\\\        _/~             \n" +
               "                \\      / ********.::(>: :<)::.******** \\      /                \n" +
               "                 \\   /  ********.::::\\\\|//::::.********  \\   /                 \n" +
               "                  \\ /   *******.:::::(o o):::::.*******   \\ /                  \n" +
               "                   /.   ******.::::'*|V_V|***`::.******   .\\                   \n" +
               "                     ~~--****.:::'***|___|*****`:.****--~~                     \n" +
               "                           *.::'***//|___|\\\\*****`.*                           \n" +
               "                           .:'  **/##|___|##\\**    .                           \n" +
               "                          .    (v(VVV)___(VVV)v)");
       System.out.println();
       System.out.println();
       System.out.println("Version 1.0 Pre-Release");
       System.out.println("====================================================================================");
   }

   //start up and setup methods go here

   public static void enterToStart(){
       System.out.println();
       System.out.println();
       System.out.println("Enter any key to begin your adventure...");
       System.out.println();
       System.out.println();
   }


   public static void askForName(){
       System.out.println();
       System.out.println();
       System.out.println("Before we begin, please tell me adventurer, what is your name?");
       System.out.println();
       System.out.println();
   }

   public static String printPlayerName(){
       String name = playerOne.getName();
       return name;
   }

   public static void askForStatsInfo(){
       System.out.println();
       System.out.println();
       System.out.println(PlayerOne.getName() + " we also need to check your vitals before we go, each Stat has a value 1-10 and impacts how you are able to \n" +
               "interact with the world. You may spend up to 40 points on your vital stats. Before we begin would you like to learn more about the\n" +
               "vital stats?");
       System.out.println();
       System.out.println();
   }
   public static void explainStrength(){
       System.out.println();
       System.out.println();
       System.out.println("Strength measures a characters ability to exert physical force. A character with high Strength can lift heavier objects,\n" +
               " carry more gear without being overloaded, break things with brute strength, shove and grapple creatures more effectively, \n" +
               "and is more accurate and more effective with melee weapons.");
       System.out.println();
       System.out.println();
   }

   public static void explainDexterity(){
       System.out.println();
       System.out.println();
       System.out.println("Dexterity encompasses a number of physical attributes including hand-eye coordination, agility, reflexes,\n" +
               " fine motor skills, balance and speed of movement; a high dexterity score indicates superiority in all these attributes.\n");
       System.out.println();
       System.out.println();
   }

   public static void explainConstitution(){
       System.out.println();
       System.out.println();
       System.out.println("Constitution is a term which encompasses the character's physique, toughness, health and resistance to\n " +
               "disease and poison; a high constitution score indicates superiority in all these attributes. The higher a character's\n" +
               " constitution, the more hit points that character will have.");
       System.out.println();
       System.out.println();
   }

   public static void explainWisdom(){
       System.out.println();
       System.out.println();
       System.out.println("Wisdom reflects how attuned you are to the world around you and represents perceptiveness and intuition.");
       System.out.println();
       System.out.println();
   }

   public static void explainIntelligence(){
       System.out.println();
       System.out.println();
       System.out.println("Intelligence measures mental acuity, accuracy of recall, and the ability to reason.");
       System.out.println();
       System.out.println();
   }

   public static void explainCharisma(){
       System.out.println();
       System.out.println();
       System.out.printf("Charisma measures a character's force of personality, force of will, persuasiveness,\n" +
               " personal magnetism, ability to lead, and physical attractiveness. This ability represents actual\n " +
               "strength of personality, not merely how one is perceived by others in a social setting.");
       System.out.println();
       System.out.println();
   }

   public static void explainLuck(){
       System.out.println();
       System.out.println();
       System.out.println("Luck is a measure of your general good fortune and has an effect on outcomes.");
       System.out.println();
       System.out.println();
   }

    public static void printStatsMenu() {
        System.out.println();
        System.out.println();
        System.out.println("----Vital Stats----");
        System.out.println("1: Strength");
        System.out.println("2: Dexterity");
        System.out.println("3: Constitution");
        System.out.println("4: Intelligence");
        System.out.println("5: Wisdom");
        System.out.println("6: Charisma");
        System.out.println("7: Luck");
        System.out.println("0: See remaining points");
        System.out.println();
        System.out.println();
    }

    public static void howManyPoints(){
        System.out.println("How many points would you like to put into this skill? (1-10)");
    }

    public static void printPlayerStats(PlayerOne playerOne){
        System.out.println();
        System.out.println();
        System.out.println("----"+ printPlayerName() + "'s Stats----");
        System.out.println("Health: " + playerOne.getHealth());
        System.out.println("Strength: " + playerOne.getStrength());
        System.out.println("Dexterity: " + playerOne.getDexterity());
        System.out.println("Constitution: " + playerOne.getConstitution());
        System.out.println("Intelligence: " + playerOne.getIntelligence());
        System.out.println("Wisdom: " + playerOne.getWisdom());
        System.out.println("Luck: " + playerOne.getLuck());
        System.out.println("Gold: " + playerOne.getGold());
        System.out.println("Level: " +playerOne.getLevel());
        System.out.println("Experience Points: " + playerOne.getXp());
        System.out.println();
        System.out.println();
    }

    public static void setUpWeapons(){
        System.out.println();
        System.out.println();
        System.out.println("Before heading on your journey you stop by the local shop to stock up.");
        System.out.println();
        System.out.println();
    }

    //story elements go here

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("You are a young adventurer who has always dreamed of exploring the mysterious lands beyond the mountains.\n" +
                "You have heard tales of dragons, elves, magic and ancient secrets that await those who dare to venture into the unknown.\n" +
                "You have finally saved enough money to start heading towards the border. You hope to find adventure and glory along the way.");
        System.out.println();
        System.out.println();
    }

    public static void firstChoice(){
        System.out.println();
        System.out.println("It is starting to get dark and you are still a few hours away from the nearest inn, do you continue traveling or stop and set up camp?");
        System.out.println();
        System.out.println("Please choose an option:");
        System.out.println("1) Continue traveling and try to make it to the inn before dark.");
        System.out.println("2) Stop and set up camp in the woods nearby.");
        System.out.println();
        System.out.println();
    }

    public static void firstChoiceBranchOne(){
        System.out.println();
        System.out.println("As you continue down the road you see a group of warriors harassing a ");

    }

    public static void printPlayerInventory(){
        List<Item> playerInventory = PlayerOne.getInventory();
        System.out.println();
        System.out.println();
        System.out.println(PlayerOne.getName() + "'s current inventory: ");
        for (Item i : playerInventory){
            System.out.println(i.getName());
        }
    }


}
