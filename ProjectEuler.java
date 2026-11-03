public class ProjectEuler {

   public static int problem1() {
      int sum = 0;
      for (int i = 0; i < 1000; i++) {
         if ((i % 3 == 0) || (i % 5 == 0)) {
            sum += i;
         }
      }
      return sum;
      }
      
   public static int problem3() {
      int largestFactor = 0;
      for (BigInteger i = 0; i <= (600851475143/2); i++) {
         if ((600851475143 % i == 0) && (i > largestFactor)) {
            largestFactor = i;
         }
      }
      
      return largestFactor;
   }
   public static int problem6() {
      int sumSquares = 0;
      int squareSums = 0;
      int diff = 0;
      for (int i = 0; i <= 100; i++) {
         sumSquares += (i * i);
         squareSums += i;
         
      }
      squareSums = (squareSums * squareSums);
      diff = squareSums - sumSquares;
      return diff;
   }
   
   public static int problem10() {
      int sum = 0;
      boolean isPrime = false;
      for (int i = 2; i < 10; i++) {
         
         for (int factor = 2; factor*factor <= i; factor++) {
            if (i % factor == 0 && i != 2) {
               isPrime = false;
            } else if (i == 2) {
               isPrime = true;
            } else {
               isPrime = true;
            }
         }
         if (isPrime == true) {
            System.out.println(i);
            sum += i;
         }
      }
      return sum;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 6 is: " + problem6());
      System.out.println("The answer to problem 10 is: " + problem10());
   }
}