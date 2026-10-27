import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main(String[] args) {
    boolean done = false;
    int die1;
    int die2;
    int sum;
    Scanner in = new Scanner(System.in);
    Random rand = new Random();

    // introduction:

    // game loop
    do {
      // game logic
      die1 = rand.nextInt(1, 7);
      die2 = rand.nextInt(1, 7);
      sum = die1 + die2;
      System.out.println("Sum: " + die1 + "+" + die2 + "=" + sum);
      if (sum == 2 || sum == 3 || sum == 12) {
        //Craps
        done = true;
        System.out.println("Craps. You lose!");
      }
      else if (sum==7 || sum == 11) {
        //natural
        done = true;
        System.out.println("Natural. You win!");
      }
      else {
        int point = sum;
        boolean pointdone = false;
        System.out.println(sum + " is now the point.");
        do {
          pointdone = Utilities.ReplayQuery(in, pointdone, "Roll again? [Y/n]");
          die1 = rand.nextInt(1, 7);
          die2 = rand.nextInt(1, 7);
          sum = die1 + die2;
          System.out.println("Sum: " + die1 + "+" + die2 + "=" + sum);
          if (sum==point){
            System.out.println("You made the point. You win!");
            pointdone = true;
            done = true;
          }
          else if (sum==7) {
            System.out.println("You lost..");
            pointdone = true;
            done = true;
          }
          else {
            System.out.println("You did not make the point.");
          }
        }while(!pointdone);
      }
      // continue?
      //System.out.println(done);
      done = Utilities.ReplayQuery(in, done, "Play again? [Y/n]");
      //System.out.println(done);

    } while (!done);
  }
}
