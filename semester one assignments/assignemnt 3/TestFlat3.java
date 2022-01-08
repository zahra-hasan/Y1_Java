import flatshare.*;
import sheffield.*;

public class TestFlat3 {

   public static void main (String [] args)  {
      
      Flat wizards = new Flat("Harry, Ron, Hermione");   
      
      wizards.addTenant("Draco");
	  System.out.println("If you have got the third task right " + 
			  "the next line two lines will both say");
	  System.out.println("The tenants are : Harry, Ron, Hermione, Draco");
	  System.out.println(wizards);

	  wizards.removeTenant("Ron");
	  System.out.println("Followed by two lines which both say");
	  System.out.println("The tenants are : Harry, Hermione, Draco");
	  System.out.println(wizards);
	  
	  wizards.removeTenant("Harry");
	  System.out.println("Followed by two lines which both say");
	  System.out.println("The tenants are : Hermione, Draco");
	  System.out.println(wizards);	  
	  
   }
   
}
