package UI;

import App.Setup;
import Shop.Merchant;

public class Story {
    private static Merchant merchant = new Merchant();
    public Story() {
    }

    public static void startStory(){
        Setup.gameSetup();
        merchant.shop();
        UserOutput.printPlayerInventory();
        UserOutput.intro();
        UserOutput.firstChoice();
        System.out.println("Still under development!");
//
//        UserInput.getFirstChoice();
    }


}
