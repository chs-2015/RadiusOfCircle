/**
 * Author: Brandon B.
 * Date: 9-4-15
 */

import java.util.Scanner;
public class RadiusOfCircle {
    
    public static void main(String[] args) {
    	double area, radius;
    	Scanner areaScanner = new Scanner(System.in);

		System.out.println("This program finds the radius of a circle.");
		System.out.print("What is the area? ");
		area = areaScanner.nextDouble();
		
		radius = Math.sqrt(area/Math.PI);
		System.out.println("Radius of your circle is " + radius);
    }
}
