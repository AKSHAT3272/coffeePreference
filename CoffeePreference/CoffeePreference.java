
/**
 *  Class CoffeePreference simply takes user preference about how creamer the coffee should be
 *  and how many sugars should be added to the Coffee.
 * @author (Akshat) 
 * @version (9.20.2016)
 */
 public class CoffeePreference
  {
      private int numCreamer;
      private int numSugar;
      
      //Constructor which takes user peference for the coffee.
      public CoffeePreference(int Creamer,int Sugar)
       {
           numCreamer=Creamer;
           numSugar=Sugar;
       }
     
     /*The method Prints the user's coffee preference.
      *Here the function takes ther user defined values from the constructor and prints those values.
      *Example System.out.println("Coffee")-This will simply Print Coffee.
      */
     public void ShowPreferences()
     {
         System.out.println("Number of Cream to be Added:- " + numCreamer);
         System.out.println("Number of Sugar to be Added:- " + numSugar);
     }
  }