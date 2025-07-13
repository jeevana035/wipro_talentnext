package oops;
import java.util.*;

public class box {
	double width, height, depth;
	box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
	 double calculateVolume() {
	        return width * height * depth;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter depth: ");
        double depth = sc.nextDouble();
        
        box myBox = new box(width, height, depth);
        double volume = myBox.calculateVolume();
        System.out.println("Volume of the box is: " + volume);


	}

}
