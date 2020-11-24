package day16;

import java.util.Scanner;

public class Question28SoultionTest29SolutionTest {

	public static void main(String[] args) {
		Question28Solution29Solution obj = new Question28Solution29Solution ();
		Scanner input = new Scanner (System.in);
		
		
        
	
	String decision = "";
    do {
    	
   		System.out.println("Enter your choice : factor|prime|nthprime|allprime|seriessum");
		String choice = input.next();
		
		switch (choice) {
		
		case "factor":
			System.out.println("Enter number to fin factorial");
			int n = input.nextInt();
			int fact = obj.findFactorial(n);
			System.out.println("Factorial of  "+ n+ " is :" + fact);
					
			break;
		case "prime":
			System.out.println("Enter number to find Prime:");
			n = input.nextInt();
			boolean isPrime =obj.isPrimeNumber(n)	;
			if(isPrime) {
				System.out.println(n + " is a prime number.");
			}else {
				System.out.println(n + " is not a prime number.");
			}
			break;
		case"nthprime":
			System.out.println("Enter the number to find nth prime:");
			n=input.nextInt();
			obj.firstNthPrime(n);
			break;
		
		case"allprime":
			System.out.println("Enter start number  to find all prime:");
			int start=input.nextInt();
			System.out.println("Enter end number to find all prime:");
			int end=input.nextInt();
			obj.allPrimeBetween(start, end);
			break;
			
		case"seriessum":
			System.out.println("Enter number to find series sum:");
			n=input.nextInt();
			int sum= obj.printSeriesSum(n)	;
			System.out.println("Nth series sum is : " +sum);
			break;
		
		default:
			break;
		}
		
		System.out.println("Do you want to continue?");
		decision=input.next();
		
    	
    	
    	
    }while(decision.equalsIgnoreCase("yes"));

    System.out.println("Happy Coding ... Bye bye .");
	
	input.close();
	
	
	
	
	
    
	
	
    }	
}




