import java.util.Scanner;
public class SafeInput {
  // get a text that is not empty
  public static String getNonZeroLenString(Scanner in, String prompt){
    String retString = "";
    boolean done = false;
    do {
      System.out.println(prompt);
      retString = in.nextLine();
      if (retString.length()>0){
        done = true;
      }
    }while(!done);
    return retString;
  }
  // validate an integer
  public static int getInt(Scanner in, String prompt){
    int retVal = 0;
    String trash = "";
    boolean done = false;
    do {
      System.out.println(prompt);
      if (in.hasNextInt()){
        retVal=in.nextInt();
        in.nextLine(); //clear the buffer
        done = true;
      }
      else {
        trash = in.nextLine();
        System.out.println("Please input a valid integer. You entered: " + trash);
      }
    }while(!done);
    return retVal;
  }
}
