//class declaration
public class Phone {

   //instance variable
   String phoneColor;
   
   //constructor   
   public Phone() {
      phoneColor = "purple";
   }
   public Phone(String textColor) {
      phoneColor = textColor;
   }
   
   //method declarations
   public String text(String message) {
      return "writing on " + phoneColor + " phone: " + message;
   }
   public String phoneCall() {
      return "ring ring ring";
   }
}