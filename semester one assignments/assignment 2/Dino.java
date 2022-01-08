// assignment2 COM1003


import sheffield.*;

public class Dino {
    public static void main(String[] args) {

    EasyReader inputFile = new EasyReader("dino.txt");
    EasyGraphics dianosaur = new EasyGraphics(984,140);
    
    //creat the main array
    int [] dinosaursGraphArray = new int [4305];
        
    //write code to read charecters from file as strings and convert them to chars
    String fileAsString = inputFile.readString();
    char[] storeInCharArray = fileAsString.toCharArray();

    //write code to convert chars into integers and then stores them in the main array to print put the graph:
    int characterCount = 0; 
    int characterCount2 = 0;
    int characterCount3 = 0;
    int starscount = 0;
    for (int i=140; i>=0; i=i-4){
     
        // write code to colour the background -fifth layer-
        for (int n=0; n<984; n=n+4){
            if (i>20){
                dianosaur.setColor(24, 54, 74);
                dianosaur.fillRectangle(n, i, 4, 8);}
            
            else { 
                dianosaur.setColor(6, 27, 31);
                dianosaur.fillRectangle(n, i, 4, 8);} 
            }

        //write code to print out the stars -fourth layer-
       
            do  { 
                double starX = 984*Math.random();
                double starY = 120*Math.random();
                dianosaur.setColor(255, 255, 255);
                dianosaur.plot((int)starX,40+(int)starY);
            starscount++; } while (starscount<50);
            
                
        // write code to print out the THIRD dianosaur -third layer-
        for (int n=492; n<984; n=n+4) {
            int valueOfChar = (int)storeInCharArray[characterCount2];
            dinosaursGraphArray[n]= valueOfChar;
            characterCount2++;
            // write code to determine the colors and prints out the graph
            if (valueOfChar%2 == 0){
                dianosaur.setColor(109, 163, 174);
                dianosaur.fillRectangle(n, i, 4, 8);}
            }
               
        // write code to print out the MIDDLE dianosaur -second layer-      
        for (int n=250; n<742; n=n+4) {
            int valueOfChar = (int)storeInCharArray[characterCount3];
            dinosaursGraphArray[n]= valueOfChar;
            characterCount3++;
            // write code to determine the colors and prints out the graph
            if (valueOfChar%2 == 0){
                dianosaur.setColor(142, 207, 190);
                dianosaur.fillRectangle(n, i, 4, 8);}
            }         

        // write code to print out the FIRST dianosaur -first layer-
        for (int n=0; n<492; n=n+4) {
            int valueOfChar = (int)storeInCharArray[characterCount]; 
            dinosaursGraphArray[n]= valueOfChar;
            characterCount++;
            // write code to determine the colors and prints out the graph
            if (valueOfChar%2 == 0){
                    dianosaur.setColor(167, 233, 240);
                    dianosaur.fillRectangle(n, i, 4, 8);}
                }  
            
        }
    }
}