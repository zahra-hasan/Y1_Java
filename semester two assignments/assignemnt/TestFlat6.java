import flatshare.*;
import sheffield.*;

public class TestFlat6 {

   public static void main (String [] args)  {
      final String BACKUP = "backupagain.txt";
      
      Flat wizards = new Flat("Harry, Ron, Hermione, Draco");
      wizards.purchase("Ron", "washing up liquid", 1.80); 
      wizards.purchase("Draco", "bin bags", 2.00);            
      wizards.purchase("Harry", "gin", 2.75);  
      
      wizards.saveToFile(BACKUP);   
      
      if  (  java.nio.file.Files.exists(java.nio.file.Paths.get(BACKUP))  ) { //You haven't been taught this
		  Flat students = new Flat(new EasyReader(BACKUP));
		  System.out.println("If you have got the output from the sixth task right " + 
			  "the next line two lines will both say");
		  System.out.println("The tenants are : Harry (-0.95), Ron (0.85), " + 
		  	  "Hermione (-0.95), Draco (1.05)");
	      System.out.println(students);
	  }
	  else 
	  	  System.out.println("Task 6 not attempted");
      
   }
   
}
