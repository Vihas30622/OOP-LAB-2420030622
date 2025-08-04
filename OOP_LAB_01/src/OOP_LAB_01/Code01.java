package OOP_LAB_01;
import java.util.Scanner;

public class Code01 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter morning shift earnings (in rupees): ");
		        int morningShiftEarnings = scanner.nextInt();

		        System.out.print("Enter evening shift earnings (in rupees): ");
		        int eveningShiftEarnings = scanner.nextInt();

		        int totalDailyEarnings = morningShiftEarnings + eveningShiftEarnings;

		        System.out.println("Total earnings for the day: ₹" + totalDailyEarnings);

		        scanner.close();
		    }
		


	}


