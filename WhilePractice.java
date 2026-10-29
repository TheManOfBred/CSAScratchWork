public class WhilePractice {
   public static void main(String[] args) {
      //initialization
      /*
      int speedLimit = 20;
      
      int currentSpeed = 0;
      //condition
      while (currentSpeed <= speedLimit) {
         System.out.println("current speed = " + currentSpeed);
         //change
         currentSpeed++;
         
         
      }
      */
      String str = "I like pancakes";
      //for (initialization; condition; change) {
      for (int i = str.length() - 1; i >= 0; i--) {
         System.out.println("Letter at index " + i + " is " + str.substring(i, i+1));
         
      }
      
   }
}