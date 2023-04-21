package Npc;

import java.util.Random;

public class Wolf {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int health;

    public Wolf() {
        this.strength = 6;
        this.dexterity = 7;
        this.constitution = 6;
        this.intelligence = 3;
        this.wisdom = 6;
        this.charisma = 3;
        this.health = 11;
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
    public static Wolf getWolfRandomStats(){
        Random random = new Random();
        Wolf randomWolf = new Wolf();
        int statCap = 0;
        int[] statArr = new int[6];
        for (int i = 0; i < statArr.length; i++) {
            statArr[i] = random.nextInt();
            statCap += statArr[i];
            if (statCap >= 40){
                break;
            }
        }
        randomWolf.setStrength(statArr[0]);
        randomWolf.setDexterity(statArr[1]);
        randomWolf.setConstitution(statArr[2]);
        randomWolf.setIntelligence(statArr[3]);
        randomWolf.setWisdom(statArr[4]);
        randomWolf.setCharisma(statArr[5]);

        return randomWolf;
    }

    public static int wolfAttack(){
        Random random = new Random();
        int wolfAttack = random.nextInt(5) + random.nextInt(5) + 2;
        return wolfAttack;
    }

}
