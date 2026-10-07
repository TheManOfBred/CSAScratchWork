public class Burger {
   //instance variables
   private int numPatties;
   private boolean isTasty;
   private double gramsOfSauce;
   private String burgerName; 
   private int numBites;
   
   //constructors
   //first let's do the no-argument constructor
   public Burger() {
      numBites = 0;
      numPatties = 2;
      isTasty = true;
      gramsOfSauce = 30.0;
      burgerName = "Craig the Burger";
   }
   
   public Burger(int numPatties, boolean isTasty, double gramsOfSauce, String burgerName) {
      numBites = 0;
      this.numPatties = numPatties;
      this.isTasty = isTasty;
      this.gramsOfSauce = gramsOfSauce;
      this.burgerName = burgerName;
   }
   
   //Methods go here
   public void bite() {
      System.out.println("Chomp...");
      numBites++;
   }
   
   public int getNumBites() {
      return numBites;
   }
   
   public static String getBurgerRecipe() {
      return "Cook burger, put on bun, add condiments";
   }
   
   public static void main(String[] args) {
      //create a Burger object using the no argument constructor
      Burger burger1 = new Burger();
      //create a Burger object using the constructor with arguments
      Burger burger2 = new Burger(3, true, 50.5, "Aaron");
      //take a bite out of either burger
      burger2.bite();
      //get the number of bites taken out of the burger
      System.out.println(burger2.getNumBites());
      //call the class method "getBurgerRecipe()"
      System.out.println(getBurgerRecipe());
   }
}