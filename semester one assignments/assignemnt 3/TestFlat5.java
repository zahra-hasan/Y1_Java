import flatshare.*;
import sheffield.*;

public class TestFlat5 {

   public static void main (String [] args)  {
      
      Flat wizards = new Flat("Harry, Ron, Hermione, Draco");
      wizards.purchase("Ron", "washing up liquid", 1.80); 
      wizards.purchase("Draco", "bin bags", 2.00);            
      wizards.purchase("Harry", "gin", 20.75);  
      wizards.purchase("Hermione", "floor cleaner", 1.80);
      
      System.out.println("If you have got the fifth task right " + 
			  "the next line two lines will both say");
	  System.out.println("The tenants are : Harry (-1.4), Ron (0.4), " + 
	  	      "Hermione (0.4), Draco (0.6)");
	  System.out.println(wizards);
	  
   }
   
}
