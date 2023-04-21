package UI;

import Player.PlayerOne;

import java.util.Scanner;

public class UserInput {
   private static Scanner scanner = new Scanner(System.in);
    private static PlayerOne playerOne = new PlayerOne();


    public static void getPlayerName(){
        String playerName = scanner.nextLine();
        playerOne.setName(playerName);
    }
    public static void pressAnyKey(){
           scanner.nextLine();
    }

    public static String promptForYesOrNo(String prompt){
        System.out.println(prompt);
        String yesOrNo =  scanner.nextLine().toUpperCase();
            if (yesOrNo.equals("Y") || yesOrNo.equals("N")) {
                return yesOrNo;
            } else {
                System.out.println("Invalid Selection");
                promptForYesOrNo("Enter 'Y' or 'N'");
            }
            return null;
    }
    public static int promptForMenuSelection(String prompt) {
        int menuSelection;
        System.out.print(prompt);
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public static int addPointsToSkill(){
        int points = Integer.parseInt(scanner.nextLine());
        if (points > 0 && points <= 10){
            return points;
        }
        return 0;
    }

    public static int getFirstChoice(){
        int menuSelection = -1;
        while( menuSelection != 1 || menuSelection != 2) {
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                menuSelection = -1;
            }
        }
        return menuSelection;
    }

    public static String selectWeapon(){
        System.out.println();
        System.out.println("Which weapon do you want to use? (type the full weapon name)");
        String selectedWeapon = scanner.nextLine();
        System.out.println();
        return selectedWeapon;
    }
}
