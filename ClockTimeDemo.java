//Reagan Chapple
import java.util.Scanner;
public class ClockTimeDemo {
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) throws TimeException {
		
		//loop start
		String again = "true";
		while(again.equalsIgnoreCase("true")!= false) {
		
		//Object 1
		System.out.println("Convert military time into 12-hour clock time");
		
		System.out.println("Enter the hours in military time");
		int hours = key.nextInt();
		System.out.println("Enter the minutes in military time");
		int minutes = key.nextInt();
		System.out.println("Enter the seconds in military time");
		int seconds = key.nextInt();
		
		TimeConverter pc1 = new TimeConverter();
		try {
			pc1.updateTime(hours, minutes, seconds);
		} catch (TimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("It would be "+pc1);
		
		//Object 2 in hour:minute:second formatting
		Scanner keys = new Scanner(System.in);
		System.out.println("Convert military time into 12-hour clock time");
		System.out.println("Enter 24 hour clock time using hours:minutes:seconds");
		 String time = keys.nextLine();
		
		TimeConverter pc2 = new TimeConverter();
		try {
		pc2.updateTime(time);
			pc2.updateTime(hours, minutes, seconds);
		} catch (TimeException e) {
			System.out.println(e.getMessage());
		}

		
		System.out.println("It would be "+pc2);

		System.out.println("Would you like to do this again. Enter yes or no");
		again = keys.nextLine();
		
		if(again.equalsIgnoreCase("no")) {
			//ends loop
			again = "false";
			System.out.println("Closing program");
			System.exit(0);
		}
		else {
			//continues loop
			again = "true";
		}
		}
		
	}
}
