package dice;

public class Dice {
int min=1;
int max=6;
public int diceRoll(){
    double val= (Math.random()*(max-min+1))+min;
    return (int)val;
}
}
