public class NestedIteration {
   public static void main(String[] args) {
      String myString = "Ballard High";
      for (int i = 1; i < 5; i++) {
         for (int j = 0; j < 4; j++) {
            System.out.print(i + "," + j + " ");

         }
         System.out.print("\n");
      }
   }
}