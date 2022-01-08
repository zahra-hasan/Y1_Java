import flatshare.*;
import sheffield.*;

public class TestFlat4 {

   public static void main (String [] args)  {
      
      Flat wizards = new Flat("Harry, Ron, Hermione, Draco");
      wizards.purchase("Ron", "washing up liquid", 1.80); 
      wizards.purchase("Draco", "bin bags", 2.00);            
      wizards.purchase("Harry", "toilet roll", 2.75);  
      
      System.out.println("If you have got the fourth task right " + 
			  "the next line two lines will both say");
	  System.out.println("The tenants are : Harry (1.11), Ron (0.16), "+ 
	  	      "Hermione (-1.64), Draco (0.36)");
	  System.out.println(wizards);

	  System.out.println();
      Flat weasleys = new Flat("Fred, George, Ginny");
      weasleys.purchase("Fred", "washing up liquid", 1.80); 
      weasleys.purchase("George", "bin bags", 2.00);            
      weasleys.purchase("Ginny", "toilet roll", 2.75);  
      
	  System.out.println("Followed by two lines which both say");
	  System.out.println("The tenants are : Fred (-0.38), George (-0.18), Ginny (0.57)");
	  System.out.println(weasleys);
	  
   }
   
}
