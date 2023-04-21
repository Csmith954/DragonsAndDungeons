package App;

import Battle.Battle;
import Npc.Bear;
import UI.Story;
import UI.UserInput;
import UI.UserOutput;

import java.util.Scanner;

public class MainMenu {
    private UserOutput userOutput = new UserOutput();
    private UserInput userInput = new UserInput();
    private Battle battle = new Battle();

    public MainMenu() {
    }

    public void mainMenuOptions(){
        int menuSelection = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("___  ___      _        ___  ___                 \n" +
                "|  \\/  |     (_)       |  \\/  |                 \n" +
                "| .  . | __ _ _ _ __   | .  . | ___ _ __  _   _ \n" +
                "| |\\/| |/ _` | | '_ \\  | |\\/| |/ _ \\ '_ \\| | | |\n" +
                "| |  | | (_| | | | | | | |  | |  __/ | | | |_| |\n" +
                "\\_|  |_/\\__,_|_|_| |_| \\_|  |_/\\___|_| |_|\\__,_|\n" +
                "                                                \n" +
                "                                                ");


        while(menuSelection != 3) {
           System.out.println("============================================================");
            System.out.println("1. Story Mode");
            System.out.println("2. Battle Arena");
            System.out.println("3. Exit");
            System.out.println("============================================================");
            System.out.println();
            System.out.println();
            System.out.println("Enter your choice: ");
            menuSelection = scanner.nextInt();
            switch (menuSelection){
                case 1:
                    Story.startStory();
                    break;
                case 2: battleArenaMenu();
                break;
                case 3: System.exit(0);
            }
        }

    }

    public static void battleArenaMenu(){
        Scanner scanner = new Scanner(System.in);
        int battlesFought = 0;
        int menuSelection = 0;
        System.out.println("============================================================");
        System.out.println("______       _   _   _          ___                       \n" +
                "| ___ \\     | | | | | |        / _ \\                      \n" +
                "| |_/ / __ _| |_| |_| | ___   / /_\\ \\_ __ ___ _ __   __ _ \n" +
                "| ___ \\/ _` | __| __| |/ _ \\  |  _  | '__/ _ \\ '_ \\ / _` |\n" +
                "| |_/ / (_| | |_| |_| |  __/  | | | | | |  __/ | | | (_| |\n" +
                "\\____/ \\__,_|\\__|\\__|_|\\___|  \\_| |_/_|  \\___|_| |_|\\__,_|\n" +
                "                                                          \n" +
                "                                                          ");
        while(menuSelection != 5) {
            System.out.println("============================================================");
            System.out.println("Welcome to the battle arena! Pick your opponent: ");
            System.out.println("Battles fought: " + battlesFought);
            System.out.println();
            System.out.println("1. Bear");
            System.out.println("2. Mage");
            System.out.println("3. Warrior");
            System.out.println("4. Wolf");
            System.out.println("5. Exit");
            System.out.println("============================================================");
            System.out.println();
            System.out.println();
            System.out.println("Enter your choice: ");
            menuSelection = scanner.nextInt();
            switch (menuSelection){
                case 1:
                    Battle.fightBear();
                    battlesFought++;
                    break;
                case 2:
                    Battle.fightMage();
                    battlesFought++;
                    break;
                case 3: Battle.fightWarrior();
                    battlesFought++;
                    break;
                case 4: Battle.fightWolf();
                    battlesFought++;
                    break;
            }
        }
    }

}
