/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package describe;


public class Triangle {
    private int side_a;
    private int side_b;
    private int side_c;
    private String description;
    private static int totalTri = 0;
    private static int totalPerim = 0;
    
    //Constructor with logic to sanitize user input and count triangles
    public Triangle(int side_a, int side_b, int side_c)
    {
    	//Sanity check for the triangle side values                    
       
       if (Triangle.isValid(side_a, side_b, side_c) == false)
       {
        side_a = 1;
        side_b = 1;
        side_c = 1;
       }    
       this.side_a = side_a;
       this.side_b = side_b;
       this.side_c = side_c;
       
       totalTri++; //Increment the counter for every new object
    }
    
    private boolean is_right()
    {
        double num1 = Math.pow(this.side_a, 2);
        double num2 = Math.pow(this.side_b, 2);
        double num3 = Math.pow(this.side_c, 2);
    	//Check for right triangle status using the pythagorean theorm
     if ((num1 + num2) == num3)
         return true;
     else 
         return false;
    }
    
    private boolean is_scalene()
    {
    	//Check for scalene status, make sure no sides are equal
     if (this.side_a != this.side_b && this.side_b != this.side_c && this.side_a != this.side_c)   
         return true;
     else
         return false;
    }
    
    private boolean is_isoceles()
    {
    	//Check to see if two sides of the triangle are equal
    if (this.side_a == this.side_b || this.side_b == this.side_c || this.side_a == this.side_c)
    {
        if (side_a == side_b && side_b == side_c)
            return false;
        else
            return true;
    }
    else
        return false;
    }
    
    private boolean is_equilateral()
    {
    	//Check to see if all sides are equal
       if (this.side_a == this.side_b && this.side_a == this.side_c)
           return true;
       else
           return false;
    }
    
    private static boolean isValid(int side_a, int side_b, int side_c)
    {    	         
       //Check to see if two sides added together are larger than the third side   	      
       if ((side_a + side_b) < side_c || (side_a + side_c) < side_b || (side_b + side_c) < side_a)          
    	   return false;
       else
           return true;
    
    }
            
    private int calc_perim()
    {
      int perimeter;
      perimeter = this.side_a + this.side_b + this.side_c;
      totalPerim += perimeter;
      return perimeter;
    }
    
    private void addTotalPerim()
    {   	
        totalPerim += this.calc_perim();
    }
    
    private void reduceTotalPerim()
    {
    	totalPerim -= this.calc_perim();
    }
    private String getTri()
    {                
        this.description = "Side A is : " + this.side_a + "\nSide B is : " + 
                this.side_b + "\nSide C is : " + this.side_c + "\n" + 
                "The perimeter is: " + this.calc_perim() +
                "\nTriangle properties: \n";        
        if (this.is_equilateral() == true)
            this.description += "\tequilateral\n";
        if (this.is_isoceles() == true)
            this.description += "\tisoceles\n";
        if (this.is_right() == true)
            this.description += "\tright\n";
        if (this.is_scalene() == true)
            this.description += "\tscalene\n";
        
        return (this.description);        
    }
    
    public static int getTotalPerim()
    {
        return totalPerim;
    }
    
    public String toString()
    {       
        return this.getTri();
    }
}
