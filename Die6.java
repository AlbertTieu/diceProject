public class Die6
{

  public int value;

  public Die6() {
    this.roll();
  }

  public int getValue() {
    return value;
  }

  public void roll() {
    this.value = (int)(Math.random() * 6) + 1;
  }

  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}

