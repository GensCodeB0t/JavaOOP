//******************************************************************************************
// Programming Projects 3.6 
// VolumeAndArea.java
// Ryan Gens
// Find the volume and surface area of a sphere.
//******************************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;

public class VolumeAndArea {

	public static void main(String[] args) {
		float radius;
		double area,volume;
		final float pi= (22/7);
		Scanner scan = new Scanner(System.in);
		DecimalFormat decFrmt = new DecimalFormat("0.####");
		
		// User Input
		System.out.println("Please enter the radius of a sphere.\n");
		radius = scan.nextFloat();
		
		// Volume
		volume = (4/3)*pi*(Math.pow(radius,3));
		
		// Area
		area = 4*pi*(Math.pow(radius, 2));
		
		// Print Volume and Area
		System.out.println("The Volume of the Sphere = " + decFrmt.format(volume));
		System.out.print("The Area of the Sphere = " + decFrmt.format(area));	

	}

}
