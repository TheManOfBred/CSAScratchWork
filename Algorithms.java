public class Algorithms {
   public static void main(String[] args) {
      System.out.println(largestRandomNumber(10000));
   }
   public static int sumAllNumbersLessThan(int num) {
      int count = 0;
      int value = 0;
      int nextNum = 1;
      while (count < num-1) {
         value += nextNum;
         nextNum++;
         count++;
      }
      return value;
   }
   public static int largestRandomNumber(int loopTimes) {
      int max = -10000;
      for (int i = 0; i <= loopTimes; i++) {
         int num = (int) (Math.random() * 10001);
         if (num > max) {
            max = num;
         }
         
      }
      return max;
   }
}