package flatshare;
import sheffield.*;
/**
* A class to represent a flat
* @author sdn
*/
public class Flat {
	
	final int MAX_TENANTS = 20;
	private Person [] tenants;
	
	/**
	* Constructor
	* creates a flat with tenants identified from the parameter
	* @param listOfNames A list of names separated by commas and possibly spaces as well
	*/
	public Flat (String listOfNames) {

		String[] names = listOfNames.split(", ");
        tenants  = new Person[names.length];
        for (int i=0; i<names.length; i++) {
            tenants[i] = new Person(names[i]);}
            
    }
    
    /**
    * A method to save the list of tenants to a file one to a line using the
    * toString() method of Person to print them out
    * @param fileName the name of the file to store the tenants in
    */
    public void saveToFile(String fileName)  {

        EasyWriter toFile = new EasyWriter(fileName);
        for (Person t : tenants) {
             toFile.println(t);	
            }
            //printing out the asterisk at the end
            toFile.print("*");
    }
    
	/**
	* Constructor
	* creates a flat with tenants identified from a file containing tenants details
	* one tenant to a line
	* @param file An EasyReader accessing the file
	*/
	public Flat (EasyReader file) {

        String names = "";
        //storing all txt lines in a string with "," between
        while (!file.eof()){
           names += file.readString()+", ";}  

        //getting rid of the asterisk and storing names in an array
        String[] namesOfTenants = names.replace("*", "").split(", ");

        //forwarding the names in namesOfTenants array to the tenants array
        tenants  = new Person[namesOfTenants.length];
        for (int i=0; i<namesOfTenants.length; i++) {
            tenants[i] = new Person(namesOfTenants[i]);}
    }
    
    /**
    * Adds another tenant to the end of the existing list of tenants
    * @param newOne The name of the new tenant
    */
    public void addTenant(String newOne)  {

        //creat new Person array to add the new tenant
        Person[] newTenant = new Person[tenants.length+1];

        for (int i=0; i<newTenant.length; i++){
            if (i<tenants.length) {
            newTenant[i] = tenants[i]; }
            if (i== newTenant.length-1) {
                newTenant[i] = new Person(newOne);
            }
        }

        //update original Person array
        tenants = newTenant.clone();

    }
    
    /**
    * Removes a tenant from the list of tenants
    * The order of the remaining tenants stays the same
    * @param remove The name of the tenant to remove
    */
    public void removeTenant(String remove)  {

        //new Person array to store tenants except fot the deleted one
        Person[] removeTenant = new Person[tenants.length-1];
		for(int i = 0; i < tenants.length; i++){
            if (tenants[i].isCalled(remove)){
            //copy the names before the removed tenant index
              for(int num = 0; num < i; num++){
                removeTenant[num] = tenants[num];
			  }
		    //copy the names after the removed tenant index
              for(int j = i; j < removeTenant.length; j++){
                removeTenant[j] = tenants[j+1];
              }
            }
        }
		//update original Person array
		tenants = removeTenant.clone();
    }
   
   /**
   * Records the fact that someone has bought something useful for the flat
   * Everyone contributes the same amount to the purchase but the person
   * who did the shopping gets the money they paid as a credit unless
   * they don't actually live there
   * Something useful is something that appears in the Requirements
   * @param shopper the name of the person who did the shopping
   * @param item what was bought
   * @param price what was paid for it
   */
   public void purchase(String shopper, String item, double price) {

       //check if the item considered necessity 
        if (Required.itemCalled(item)!=null){
            //calculate the contribution
            for (int i=0; i<tenants.length; i++){
            //contribution for the shopper
                if (tenants[i].isCalled(shopper)){
                    tenants[i].hasPaid(price-(price/tenants.length));
                }
            //contribution for everybody
                else {tenants[i].hasPaid((price/tenants.length)*(-1));
                }
            } 
        } 
    }   
   	   
   /**
   * A standard toString method.  Lists the tenants in order using the toString
   * method of the Person class to print them out
   * @return A String listing the tenants
   */
   public String toString() {
   	   if  (  tenants == null  ) return "The flat is empty";
   	   String result = "The tenants are : ";
   	   for (Person t : tenants) result += ", "+t.toString();
   	   result = result.replace(": ,",":");
   	   return result;
   }
   
}
     	 	 
     	 
     	 
	
	