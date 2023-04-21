package App;

import Player.PlayerOne;
import Shop.Merchant;
import UI.UserInput;
import UI.UserOutput;

import static UI.UserInput.addPointsToSkill;

public class Setup {
    private static boolean canStart = false;
    private static boolean nameIsSet = false;
    private boolean statsAreSet = false;
    private static int menuSelection = -1;
    private static int statPoints = 40;
    private static String userResponse;
    private static PlayerOne playerOne = new PlayerOne();
    private static UserInput userInput = new UserInput();
    private static UserOutput userOutput = new UserOutput();
    public static Merchant merchant = new Merchant();

    public Setup() {
    }

    public static void gameSetup(){
        nameSetup();
        statInfo();
        statSetup();
    }

    public static void nameSetup(){
        UserOutput.welcomeMessage();
            UserOutput.enterToStart();
            UserInput.pressAnyKey();
        while (!nameIsSet) {
            UserOutput.askForName();
            UserInput.getPlayerName();
            if (PlayerOne.getName() != null){
                nameIsSet = true;
            }
        }
    }

    public static void statInfo(){
        while (menuSelection != 0) {
            UserOutput.askForStatsInfo();
            userResponse = UserInput.promptForYesOrNo("Enter 'Y' or 'N':");
            System.out.println(userResponse);
            if (userResponse.equalsIgnoreCase("Y")){
                UserOutput.printStatsMenu();
                menuSelection = UserInput.promptForMenuSelection("Please choose an option: ");
                if (menuSelection == 1) {
                    UserOutput.explainStrength();
                } else if (menuSelection == 2) {
                    UserOutput.explainDexterity();
                } else if (menuSelection == 3) {
                    UserOutput.explainConstitution();
                } else if (menuSelection == 4) {
                    UserOutput.explainIntelligence();
                } else if (menuSelection == 5) {
                    UserOutput.explainWisdom();
                } else if (menuSelection == 6) {
                    UserOutput.explainCharisma();
                }else if (menuSelection == 7) {
                    UserOutput.explainLuck();
                }else if (menuSelection == 0) {
                    continue;
                }  else {
                    // anything else is not valid
                    System.out.println("Invalid Selection");
                }
            } else if (userResponse.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void statSetup(){
        while (statPoints != 0 && statPoints > 0) {
            UserOutput.printStatsMenu();
            menuSelection = UserInput.promptForMenuSelection("Please choose an skill to add points to: ");
            if (menuSelection == 1) {
                UserOutput.howManyPoints();
                playerOne.setStrength(addPointsToSkill());
                statPoints -= playerOne.getStrength();
            } else if (menuSelection == 2) {
                UserOutput.howManyPoints();
                playerOne.setDexterity(addPointsToSkill());
                statPoints -= playerOne.getDexterity();
            } else if (menuSelection == 3) {
                UserOutput.howManyPoints();
                playerOne.setConstitution(addPointsToSkill());
                statPoints -= playerOne.getConstitution();
            } else if (menuSelection == 4) {
                UserOutput.howManyPoints();
                playerOne.setIntelligence(addPointsToSkill());
                statPoints -= playerOne.getIntelligence();
            } else if (menuSelection == 5) {
                UserOutput.howManyPoints();
                playerOne.setWisdom(addPointsToSkill());
                statPoints -= playerOne.getWisdom();
            } else if (menuSelection == 6) {
                UserOutput.howManyPoints();
                playerOne.setCharisma(addPointsToSkill());
                statPoints -= playerOne.getCharisma();
            }else if (menuSelection == 7) {
                UserOutput.howManyPoints();
                playerOne.setLuck(addPointsToSkill());
                statPoints -= playerOne.getLuck();
            }else if (menuSelection == 0) {
                System.out.println("You have " + statPoints + " points left");
            }  else {
                // anything else is not valid
                System.out.println("Invalid Selection");
            }
            UserOutput.printPlayerStats(playerOne);
        }
    }


}
