package Player;

import Items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class PlayerOne {

    private static String name;
    private static List<Item> inventory = new ArrayList<>();
    private static int gold = 50;
    private static int level;
    private static int xp;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int luck;
    private static int health = 100;


    public PlayerOne() {
    }

    public static String getName() {
        return name;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        PlayerOne.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List getInventory() {
        return inventory;
    }

    public void setInventory(List inventory) {
        this.inventory = inventory;
    }

    public void addItemToInventory(Item item){
        inventory.add(item);
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public static PlayerOne getPlayerRandomStats(){
        Random random = new Random();
        PlayerOne randomPlayer = new PlayerOne();
        int statCap = 0;
        int[] statArr = new int[7];
        for (int i = 0; i < statArr.length; i++) {
            statArr[i] = random.nextInt();
            statCap += statArr[i];
            if (statCap >= 40){
                break;
            }
        }
        randomPlayer.setStrength(statArr[0]);
        randomPlayer.setDexterity(statArr[1]);
        randomPlayer.setConstitution(statArr[2]);
        randomPlayer.setIntelligence(statArr[3]);
        randomPlayer.setWisdom(statArr[4]);
        randomPlayer.setCharisma(statArr[5]);
        randomPlayer.setLuck(statArr[6]);

        return randomPlayer;
    }



    public static int attackRoll(){
        Random random = new Random();
        PlayerOne playerOne = new PlayerOne();
        int attackDamage = random.nextInt(21) + playerOne.getStrength();
        return attackDamage;
    }

    public static int dexterityRoll(){
        Random random = new Random();
        PlayerOne playerOne = new PlayerOne();
        int dex = random.nextInt(21) + playerOne.getDexterity();
        return dex;
    }

    public static int intelligenceRoll(){
        Random random = new Random();
        PlayerOne playerOne = new PlayerOne();
        int intell = random.nextInt(21) + playerOne.getIntelligence();
        return intell;
    }

    public static int constitutionRoll(){
        Random random = new Random();
        PlayerOne playerOne = new PlayerOne();
        int con = random.nextInt(21) + playerOne.getConstitution();
        return con;
    }

    public static int wisdomRoll(){
        Random random = new Random();
        PlayerOne playerOne = new PlayerOne();
        int wiz = random.nextInt(21) + playerOne.getWisdom();
        return wiz;
    }

    public static int charismaRoll(){
        Random random = new Random();
        PlayerOne playerOne = new PlayerOne();
        int rizz = random.nextInt(21) + playerOne.getCharisma();
        return rizz;
    }

    public static int luckRoll(){
        Random random = new Random();
        PlayerOne playerOne = new PlayerOne();
        int luck = random.nextInt(21) + playerOne.getLuck();
        return luck;
    }

}
