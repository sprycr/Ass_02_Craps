import java.util.Scanner;
public class Utilities {
//  public static int RollDice() {
//
//  }

  public static boolean ReplayQuery(Scanner in, boolean done, String message) {
    boolean valid = false;
    // replay logic
    do { // loop until valid input received
      System.out.print(message);
      if (in.hasNextLine()) {
        String replay = in.nextLine();

        if (replay.equalsIgnoreCase("") || replay.equalsIgnoreCase("Y")) {
          valid = true;
          done = false;

        } else if (replay.equalsIgnoreCase("N")) {
          valid = true;
          done = true;
          System.out.println("Thank you for playing!");
        } else {
          System.out.println("Please input a valid response. You entered: " + replay);
        }
      }
    } while (!valid);
    return done;
  }
}
