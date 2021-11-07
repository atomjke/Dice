public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("HERE COMES THE DICE!");

        int die1;
        int die2;
        int roll;
        
        die1 = (int)(Math.random()*6) + 1;
        System.out.println("Roll #1: " + die1);

        die2 = (int)(Math.random()*6) + 1;
        System.out.println("Roll #2: " + die2);

        roll = die1 + die2;
        System.out.println("The total is " + roll + "!");
    }
}