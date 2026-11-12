public class FindMinimum {
   public static int findMin() {
      int smallestInt = 99;
      for (int i = 0; i < 10; i++) {
         int rand = (int)(Math.random()*100);
         if (rand < smallestInt) {
            smallestInt = rand;
         }
      }
      return smallestInt;
   }
   public static void main(String[] args) {
      System.out.println(findMin());
   }
}