package day9;
import java.util.Scanner;
public class QuestionNo21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Print name  of the week");
		int p = input.nextInt();
		
		switch (p) {
		
		case 1:
			System.out.println("Today is sunday");break;
	    case 2:
	    	System.out.println ("Today is monday");break;
		case 3:
			System.out.println("Today is Tuesday");break;
		case 4:
			System.out.println("Today wednesday");break;
		case 5: 
			System.out.println("Today is Thursday");break;
		case 6:
			System.out.println("Today is Friday");break;
		case 7:
			System.out.println("Today is Saturday");break;
		default:
			System.out.println("invalid day");
		input.close();
		 
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		

	

}
