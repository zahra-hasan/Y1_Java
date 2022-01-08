/* java assignment */



import sheffield.*;

public class Change {
    public static void main(String[] args) {
        
        /*FIRST TASK: easy reader and calculating change*/
        EasyReader keyboard= new EasyReader();
        EasyWriter printout= new EasyWriter();
        Double shoppingPrice= keyboard.readDouble("How much is your shopping ? ");
        Double moneyPaied= keyboard.readDouble("How much cash did you offer ? ");
        Double theChange= moneyPaied - shoppingPrice;
        printout.println("Your change should be "+ theChange);
        

       /*SECOND TASK: calculating notes*/
        printout.println("Made up of");
        double tenPounds= theChange/10;
        double fivePounds= (theChange-((int)tenPounds)*10)/5;
        double twoPounds= (theChange-(((int)tenPounds*10)+((int)fivePounds*5)))/2;
        
        
        /*Printing out second task*/
        printout.println("10 pound notes : " + (int)tenPounds);
        printout.println("5 pound notes :  "+ (int)fivePounds);
        printout.println("2 pound notes :  "+ (int)twoPounds);
        
        /*THIRD TASK: read file*/
        
        String FileName= keyboard.readString("What is the name of your file? ");
        EasyReader inputFromFile= new EasyReader(FileName);
        double a= inputFromFile.readDouble();
        double b= inputFromFile.readDouble();
        double c= inputFromFile.readDouble();
        double d= inputFromFile.readDouble();
        double e= inputFromFile.readDouble();
        double f= inputFromFile.readDouble(); 
        
        /*print as a table*/
        
        printout.print("Price   ");
        printout.print("Paied   ");
        printout.println("Change");
        printout.print(a, 2);
        printout.print(b, 2, 8);
        printout.println((b-a),2, 7);
        printout.print(c, 2);
        printout.print(d, 2, 8);
        printout.println((d-c),2, 7);
        printout.print(e, 2);
        printout.print(f, 2, 8);
        printout.println((f-e),2, 7);
         
    }

}
