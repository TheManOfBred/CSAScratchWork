import java.util.Scanner;

public class SchoolOfRock {
   public static void main(String[] args) {
      int numBandmates = 20;
      double decibelsPlayed = 71.5;
      boolean isPlaying = true;
      double avgDecibelsPlayed = (decibelsPlayed/numBandmates);
      String bandName = "House Band";
      
      System.out.println("Please enter your band name");
      Scanner scan = new Scanner(System.in);
      bandName = scan.nextLine();
      System.out.println("You entered the band name \"" + bandName + "\"");
      System.out.println("The average amount of decibels outputed is \"" + avgDecibelsPlayed + "\"");
   
   
   
   }
}