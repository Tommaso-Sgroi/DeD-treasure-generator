package it.tommy.ded.treasoures.generator.dice;


public class Dice {
    protected DiceType diceType;


    public Dice(DiceType diceType){
        this.diceType = diceType;
    }

    public int throwDice(){
        return diceType.getMin() + (int)(Math.random() * ((diceType.getMax() - diceType.getMin()) + 1));
    }
}
