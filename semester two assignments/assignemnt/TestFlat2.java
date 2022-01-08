import flatshare.*;
import sheffield.*;

public class TestFlat2 {

   public static void main (String [] args)  {
      final String BACKUP = "backup.txt";
      
      Flat wizards = new Flat("Harry, Ron, Hermonine");
      wizards.saveToFile(BACKUP);   
      
      if  (  java.nio.file.Files.exists(java.nio.file.Paths.get(BACKUP))  ) { //You haven't been taught this
		  Flat students = new Flat(new EasyReader(BACKUP));
		  System.out.println("If you have got the output from the second task right " + 
			  "the next line two lines will both say");
			  System.out.println("The tenants are : Harry, Ron, Hermonine");
		  System.out.println(students); 
	  }
	  else 
	  	  System.out.println("Task 2 not attempted");
      
   }
   
}
