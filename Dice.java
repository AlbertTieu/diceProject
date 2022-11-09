public class Dice{
    
    private Die6 die1;
    private Die6 die2;
    
    public Dice() {
        die1.roll();
        die2.roll();
    }
    
    public void rollBoth() {
        die1.roll();
        die2.roll();
    }
    
    public int getValue() {
        return die1.value + die2.value;
    }
    
    public void rollDie1() {
        die1.roll();
    }
    
}