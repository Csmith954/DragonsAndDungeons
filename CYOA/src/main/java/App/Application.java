package App;

import Battle.Battle;
import Items.*;
import Player.PlayerOne;
import Shop.Merchant;
import UI.UserInput;
import UI.UserOutput;

import static UI.UserInput.addPointsToSkill;

public class Application {
//    private static PlayerOne playerOne = new PlayerOne();
    private static UserInput userInput = new UserInput();
    private static UserOutput userOutput = new UserOutput();
    public static Merchant merchant = new Merchant();
//    private static Item item = new Item();
//    private static Arrow arrow = new Arrow();
//    private static BattleAxe battleAxe = new BattleAxe();
//    private static Dagger dagger = new Dagger();
//    private static HealthPotion healthPotion = new HealthPotion();
//    private static Longbow longbow = new Longbow();
//    private static LongSword longSword = new LongSword();
//    private static Shortbow shortbow = new Shortbow();
//    private static ShortSword shortSword = new ShortSword();
//    private static Spear spear = new Spear();
    private static Setup setup = new Setup();
    private static Battle battle= new Battle();
    private static MainMenu mainMenu = new MainMenu();


    public static void run(){
        mainMenu.mainMenuOptions();
//        setup.gameSetup();
//        merchant.shop();
//        UserOutput.printPlayerInventory();
//        battle.fightBear();
        //move into  a gameSetup() method
//        boolean canStart = false;
//        boolean nameIsSet = false;
//        boolean statsAreSet = false;
//        int menuSelection = -1;
//        int statPoints = 40;
//        String userResponse;

//        UserOutput.welcomeMessage();
//        while (!canStart) {
//            UserOutput.enterToStart();
//             canStart = UserInput.pressAnyKey();
//        }
//        while (!nameIsSet) {
//            UserOutput.askForName();
//            UserInput.getPlayerName();
//            if (PlayerOne.getName() != null){
//                nameIsSet = true;
//            }
//        }
//        setup.nameSetup();
//        setup.statInfo();
//        setup.statSetup();
//        setup.gameSetup();


//        while (menuSelection != 0) {
//            UserOutput.askForStatsInfo();
//            userResponse = UserInput.promptForYesOrNo("Enter 'Y' or 'N':");
//            System.out.println(userResponse);
//            if (userResponse.equalsIgnoreCase("Y")){
//                UserOutput.printStatsMenu();
//                menuSelection = UserInput.promptForMenuSelection("Please choose an option: ");
//                if (menuSelection == 1) {
//                    UserOutput.explainStrength();
//                } else if (menuSelection == 2) {
//                    UserOutput.explainDexterity();
//                } else if (menuSelection == 3) {
//                    UserOutput.explainConstitution();
//                } else if (menuSelection == 4) {
//                    UserOutput.explainIntelligence();
//                } else if (menuSelection == 5) {
//                    UserOutput.explainWisdom();
//                } else if (menuSelection == 6) {
//                    UserOutput.explainCharisma();
//                }else if (menuSelection == 7) {
//                    UserOutput.explainLuck();
//                }else if (menuSelection == 0) {
//                    continue;
//                }  else {
//                    // anything else is not valid
//                    System.out.println("Invalid Selection");
//                }
//            } else if (userResponse.equalsIgnoreCase("N")) {
//                break;
//            }
//        }

//        menuSelection = -1;

//        while (statPoints != 0 && statPoints > 0) {
//            UserOutput.printStatsMenu();
//                menuSelection = UserInput.promptForMenuSelection("Please choose an skill to add points to: ");
//                if (menuSelection == 1) {
//                    UserOutput.howManyPoints();
//                    playerOne.setStrength(addPointsToSkill());
//                    statPoints -= playerOne.getStrength();
//                } else if (menuSelection == 2) {
//                    UserOutput.howManyPoints();
//                    playerOne.setDexterity(addPointsToSkill());
//                    statPoints -= playerOne.getDexterity();
//                } else if (menuSelection == 3) {
//                    UserOutput.howManyPoints();
//                    playerOne.setConstitution(addPointsToSkill());
//                    statPoints -= playerOne.getConstitution();
//                } else if (menuSelection == 4) {
//                    UserOutput.howManyPoints();
//                    playerOne.setIntelligence(addPointsToSkill());
//                    statPoints -= playerOne.getIntelligence();
//                } else if (menuSelection == 5) {
//                    UserOutput.howManyPoints();
//                    playerOne.setWisdom(addPointsToSkill());
//                    statPoints -= playerOne.getWisdom();
//                } else if (menuSelection == 6) {
//                    UserOutput.howManyPoints();
//                    playerOne.setCharisma(addPointsToSkill());
//                    statPoints -= playerOne.getCharisma();
//                }else if (menuSelection == 7) {
//                    UserOutput.howManyPoints();
//                    playerOne.setLuck(addPointsToSkill());
//                    statPoints -= playerOne.getLuck();
//                }else if (menuSelection == 0) {
//                    System.out.println("You have " + statPoints + " points left");
//                }  else {
//                    // anything else is not valid
//                    System.out.println("Invalid Selection");
//                }
//            }
//        menuSelection = -1;
//        UserOutput.printPlayerStats(playerOne);
        // create a shop method for all this

        //implement shop logic and inventory list on player so user can shop for items
//        merchant.shop();
//        UserOutput.setUpWeapons();
//        while (menuSelection != 0) {
//            merchant.displayShopInventory(merchant.setUpMerchant());
//            System.out.println();
//            System.out.println();
//            menuSelection = UserInput.promptForMenuSelection("Enter a number to purchase a item: ");
//                if (menuSelection == 1) {
//                    if (playerOne.getGold() >= item.getPrice()) {playerOne.addItemToInventory(arrow);
//                        playerOne.setGold(playerOne.getGold() - arrow.getPrice());
//                        merchant.setGold(merchant.getGold() + arrow.getPrice());
//                        System.out.println(arrow.getQuantity() + arrow.getName() + " were added to " + PlayerOne.getName() + "'s inventory!");}
//                    else {
//                        System.out.println("You don't have enough gold for that item!");
//                    }
//                } else if (menuSelection == 2) {
//                    if (playerOne.getGold() >= arrow.getPrice()) {
//                        playerOne.addItemToInventory(battleAxe);
//                        playerOne.setGold(playerOne.getGold() - battleAxe.getPrice());
//                        merchant.setGold(merchant.getGold() + battleAxe.getPrice());
//                        System.out.println("A " + battleAxe.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
//                    }else {
//                        System.out.println("You don't have enough gold for that item!");
//                    }
//                } else if (menuSelection == 3) {
//                    if (playerOne.getGold() >= dagger.getPrice()) {
//                        playerOne.addItemToInventory(dagger);
//                        playerOne.setGold(playerOne.getGold() - dagger.getPrice());
//                        merchant.setGold(merchant.getGold() + dagger.getPrice());
//                        System.out.println("A " + dagger.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
//                    }else {
//                        System.out.println("You don't have enough gold for that item!");
//                    }
//                } else if (menuSelection == 4) {
//                    if (playerOne.getGold() >= healthPotion.getPrice()) {
//                        playerOne.addItemToInventory(healthPotion);
//                        playerOne.setGold(playerOne.getGold() - healthPotion.getPrice());
//                        merchant.setGold(merchant.getGold() + healthPotion.getPrice());
//                        System.out.println("A " + healthPotion.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
//                    }else {
//                        System.out.println("You don't have enough gold for that item!");
//                    }
//                } else if (menuSelection == 5) {
//                    if (playerOne.getGold() >= longbow.getPrice()) {
//                        playerOne.addItemToInventory(longbow);
//                        playerOne.setGold(playerOne.getGold() - longbow.getPrice());
//                        merchant.setGold(merchant.getGold() + longbow.getPrice());
//                        System.out.println("A " + longbow.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
//                    }else {
//                        System.out.println("You don't have enough gold for that item!");
//                    }
//                } else if (menuSelection == 6) {
//                    if (playerOne.getGold() >= longSword.getPrice()) {
//                        playerOne.addItemToInventory(longSword);
//                        playerOne.setGold(playerOne.getGold() - longSword.getPrice());
//                        merchant.setGold(merchant.getGold() + longSword.getPrice());
//                        System.out.println("A " + longSword.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
//                    }else {
//                        System.out.println("You don't have enough gold for that item!");
//                    }
//                } else if (menuSelection == 7) {
//                    if (playerOne.getGold() >= shortbow.getPrice()) {
//                        playerOne.addItemToInventory(shortbow);
//                        playerOne.setGold(playerOne.getGold() - shortbow.getPrice());
//                        merchant.setGold(merchant.getGold() + shortbow.getPrice());
//                        System.out.println("A " + shortbow.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
//                    }else {
//                        System.out.println("You don't have enough gold for that item!");
//                    }
//                } else if (menuSelection == 8) {
//                    if (playerOne.getGold() >= shortSword.getPrice()) {
//                        playerOne.addItemToInventory(shortSword);
//                        playerOne.setGold(playerOne.getGold() - shortSword.getPrice());
//                        merchant.setGold(merchant.getGold() + shortSword.getPrice());
//                        System.out.println("A " + shortSword.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
//                    }else {
//                        System.out.println("You don't have enough gold for that item!");
//                    }
//                } else if (menuSelection == 9) {
//                        if (playerOne.getGold() >= spear.getPrice()) {
//                            playerOne.addItemToInventory(spear);
//                            playerOne.setGold(playerOne.getGold() - spear.getPrice());
//                            merchant.setGold(merchant.getGold() + spear.getPrice());
//                            System.out.println("A " + spear.getName() + " was added to " + PlayerOne.getName() + "'s inventory!");
//                        }else {
//                                System.out.println("You don't have enough gold for that item!");
//                            }
//                } else if (menuSelection == 0) {
//                    System.out.println("You have " + playerOne.getGold() + " gold left");
//                } else {
//                    // anything else is not valid
//                    System.out.println("Invalid Selection");
//                }
//        }

        //Replace below with a Story() method
        //continue story with various branches
//        UserOutput.intro();
//        UserOutput.firstChoice();
//        if (UserInput.getFirstChoice() == 1){
//
//        }





    }
}
