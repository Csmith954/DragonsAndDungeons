package Npc;

import java.util.Random;

public class Bear {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int health;
    private int armorClass = 5;

    public Bear() {
        this.strength = 9;
        this.dexterity = 5;
        this.constitution = 8;
        this.intelligence = 1;
        this.wisdom = 6;
        this.charisma = 3;
        this.health = 17;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
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

    public static Bear getBearRandomStats(){
        Random random = new Random();
        Bear randomBear = new Bear();
        int statCap = 0;
        int[] statArr = new int[6];
        for (int i = 0; i < statArr.length; i++) {
            statArr[i] = random.nextInt();
            statCap += statArr[i];
            if (statCap >= 40){
                break;
            }
        }
        randomBear.setStrength(statArr[0]);
        randomBear.setDexterity(statArr[1]);
        randomBear.setConstitution(statArr[2]);
        randomBear.setIntelligence(statArr[3]);
        randomBear.setWisdom(statArr[4]);
        randomBear.setCharisma(statArr[5]);

        return randomBear;
    }

    public static int bearAttack(){
        Random random = new Random();
        int bearAttack = random.nextInt(9) + 4;
        return bearAttack;
    }
}
