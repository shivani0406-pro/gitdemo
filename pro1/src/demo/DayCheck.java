package demo;

import java.util.Scanner;

public class DayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a day");
		Scanner sc = new Scanner(System.in);
		String day = sc.next().toUpperCase();
		System.out.println(day);
		
		switch (day) {
			case "Sunday": {
			
			System.out.println("First day of the week");
			break;
		}
			case "Monday": {
			
			System.out.println("Second day of the week");
			break;
		}
			case "Tuesday": {
			
			System.out.println("Third day of the week");
			break;
		}
			case "Wednesday": {
			
			System.out.println("Fourth day of the week");
			break;
		}
			case "Thursday": {
			
			System.out.println("Fifth day of the week");
			break;
		}
			case "Friday": {
			
			System.out.println("sixth day of the week");
			break;
		}
			case "Saturday": {
			
			System.out.println("seventh day of the week");
			break;
		}
		
			default:
			System.out.println("Invalid day");
		}

	}

}
