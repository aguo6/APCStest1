//Listing 9.4
//********************************************************************
//  Magazine.java       Author: Lewis/Loftus/Cocking
//
//  Represents a single magazine.
//********************************************************************
public class Magazine
{
   private String title;
   //-----------------------------------------------------------------
   // Sets up the new magazine with its title.
   //-----------------------------------------------------------------
   public Magazine (String newTitle)
   {
      title = newTitle;
   }
   //-----------------------------------------------------------------
   // Returns this magazine as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return title;
   }
}