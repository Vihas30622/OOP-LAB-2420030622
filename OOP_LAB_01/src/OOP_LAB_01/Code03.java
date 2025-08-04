package OOP_LAB_01;
import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the sphere: ");
        int radius = sc.nextInt();

        double pi = 3.1416;
        double volume = (4.0 / 3.0) * pi * radius * radius * radius;

        System.out.println("Volume of the sphere is: " + volume);

	}

}
