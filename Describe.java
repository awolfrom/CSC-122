/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package describe;

/**
 *
 * @author cim201
 */
import java.util.Scanner;
public class Describe {

    public static void main(String[] args) {
    	int side_a;
    	int side_b;
    	int side_c;
        int side_a2;
    	int side_b2;
    	int side_c2;
        int side_a3;
    	int side_b3;
    	int side_c3;
        int side_a4;
    	int side_b4;
    	int side_c4;
    	//Instantiate the static triangles
        Triangle tri1 = new Triangle(3,4,5);
        Triangle tri2 = new Triangle(3,3,3);
        Triangle tri3 = new Triangle(4,4,5);
        Triangle tri4 = new Triangle(1,1,2);
        
        //Setup the scanner and read in the values for the dynamic Triangles
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an Integer for side A of triangle 1: ");
        side_a = input.nextInt();
        System.out.println("Enter an Integer for side B of triangle 1: ");
        side_b = input.nextInt();
        System.out.println("Enter an Integer for side C of triangle 1: ");
        side_c = input.nextInt();
        Triangle tri_1 = new Triangle(side_a,side_b,side_c);
        
        System.out.println("Enter an Integer for side A of triangle 2: ");
        side_a2 = input.nextInt();
        System.out.println("Enter an Integer for side B of triangle 2: ");
        side_b2 = input.nextInt();
        System.out.println("Enter an Integer for side C of triangle 2: ");
        side_c2 = input.nextInt();
        Triangle tri_2 = new Triangle(side_a2,side_b2,side_c2);
        
        System.out.println("Enter an Integer for side A of triangle 3: ");
        side_a3 = input.nextInt();
        System.out.println("Enter an Integer for side B of triangle 3: ");
        side_b3 = input.nextInt();
        System.out.println("Enter an Integer for side C of triangle 3: ");
        side_c3 = input.nextInt();
        Triangle tri_3 = new Triangle(side_a3,side_b3,side_c3);
        
        System.out.println("Enter an Integer for side A of triangle 4: ");
        side_a4 = input.nextInt();
        System.out.println("Enter an Integer for side B of triangle 4: ");
        side_b4 = input.nextInt();
        System.out.println("Enter an Integer for side C of triangle 4: ");
        side_c4 = input.nextInt();
        Triangle tri_4 = new Triangle(side_a4,side_b4,side_c4);
        
        System.out.println("System Triangle 1 has sides of: \n" + tri1);
        System.out.println("System Triangle 2 has sides of: \n" + tri2);
        System.out.println("System Triangle 3 has sides of: \n" + tri3);
        System.out.println("System Triangle 4 has sides of: \n" + tri4+"\n");
        
        System.out.println("User Triangle 1 has sides of: \n" + tri_1);
        System.out.println("User Triangle 2 has sides of: \n" + tri_2);
        System.out.println("User Triangle 3 has sides of: \n" + tri_3);
        System.out.println("User Triangle 4 has sides of: \n" + tri_4);
        
        System.out.println("The total perimeter of all triangles is: " + Triangle.getTotalPerim());
        
        
    }
    
}
