import java.util.Scanner;

public class App
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		//Ask the user for the answer
		System.out.println("did you register an account? (yes/no)");
			String accountYN = input.nextLine();

		//Ask the user for the answer
		System.out.println("did you cancel your account? (yes/no)");
			String cancelYN = input.nextLine();

		//Ask the user for the answer
		System.out.println("are you an admin? (yes/no)");
			String adminYN = input.nextLine();

		//Ask the user for the answer
		System.out.println("are you signed in? (yes/no)");
			String signedYN = input.nextLine();



		if (accountYN == "no" || cancelYN == "yes") //Check if registered is "no" or canceled is "yes"
		{
			System.out.println("go away");
		}
		else if (signedYN == "yes" && adminYN == "no") //Check if signedIn is "yes" and admin is "yes"
		{
			System.out.println("you can see and change all the pages");
		}
		else if (signedYN == "yes" && adminYN == "no") //Check if signedIn is "yes" and admin is "no"
		{
			System.out.println("you can see all the pages");
		}
		else if (signedYN == "no") //Check if signedIn is "no"
		{
			System.out.println("you can't see any of the pages, please sign in");
		}
		else
		{
			System.out.println("sorry!!!");
		}
	}
}


