public class Dice{
    
    public Die6 die1;
    public Die6 die2;
    
    public Dice() {
        die1 = new Die6();
        die2 = new Die6();
    }
    
    public void rollBoth() {
        die1.roll();
        die2.roll();
    }
    
    public int getValue() {
        return die1.value + die2.value;
    }
    
    public int rollAndGetValue(){
        this.rollBoth();
        return getValue();
    }
}