package findTheArea;

import java.util.*;


public class Area {

	public static void main(String[] args) {
		
		double radius, area;
		
			Scanner input = new Scanner (System.in);
			
			System.out.println("Enter the Radius of the circle");
			radius = input.nextDouble();
			input.close();
			
			area = Math.PI * radius * radius;
			double perimeter=2*Math.PI* radius;
			
			
			
			
			
			
			System.out.println("Area of the Circle is " +perimeter);
		
			
			System.out.println("Area of the Circle is " +area);
			
			
			
			
		
		

	}

}
