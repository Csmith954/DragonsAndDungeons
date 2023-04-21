package Npc;

import Player.PlayerOne;

import java.util.Random;

public class Warrior {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int health;

    public Warrior() {
        this.strength = 8;
        this.dexterity = 6;
        this.constitution = 7;
        this.intelligence = 5;
        this.wisdom = 6;
        this.charisma = 5;
        this.health = 39;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static Warrior getWarriorRandomStats(){
        Random random = new Random();
        Warrior randomNpc = new Warrior();
        int statCap = 0;
        int[] statArr = new int[6];
        for (int i = 0; i < statArr.length; i++) {
            statArr[i] = random.nextInt();
            statCap += statArr[i];
            if (statCap >= 40){
                break;
            }
        }
        randomNpc.setStrength(statArr[0]);
        randomNpc.setDexterity(statArr[1]);
        randomNpc.setConstitution(statArr[2]);
        randomNpc.setIntelligence(statArr[3]);
        randomNpc.setWisdom(statArr[4]);
        randomNpc.setCharisma(statArr[5]);

        return randomNpc;
    }

    public static int warriorAttack(){
        Random random = new Random();
        int warriorAttack = random.nextInt(11) + 3;
        return warriorAttack;
    }
}
