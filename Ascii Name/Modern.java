import java.util.Scanner;
public class Modern
{
   //attributes
   private int ID;
   private int x;
   private int y;
   
   //Constructor
   public Rule(int ID)
   {
      this.ID = 1;
      this.x = 9;
      this.y = 9;
   }
   
   //Getter
   public String getname()
   {
      return name; 
   }  
   
   //Setter
   public void setname()
   {
      this.name = name;
   }
   
   //Getter
   public int getprice()
   {
      return price; 
   }  
   
   //Setter
   public void setprice()
   {
      this.price = price;
   }   

   //Getter
   public String getflavor()
   {
      return flavor; 
   }  
   
   //Setter
   public void setflavor()
   {
      this.flavor = flavor;
   }
   
   //Getter
   public String getfrosting()
   {
      return frosting; 
   }  
   
   //Setter
   public void setfrosting()
   {
      this.frosting = frosting;
   }
      
   //Tostring
   public String toString()
   {
      return name + " is a " + flavor + " with " + frosting + " frosting and cost " + price +" " + "dollars.";
   }

   //compareTo     
   public int compareTo(Dessert price,Dessert other)
   {
      return getprice() - other.price; 
   }              
}