import java.util.Scanner;
public class CheckHoroscope 
{

	public static void main(String[] args) 
	{
		int session = 1;
		String result= " ";
		
		
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < 3 ; i++)
		{
			
		//display the session
		System.out.println("Input / output session " + session +": ");
		
		//ask user to input year
		System.out.print("Enter your birth year: ");
		
		//Use the Scanner class's methods to read year and calculate
		int  year= input.nextInt()%12;
		
		switch(year){
		case(0):
			result = "Monkey";
			break;
		case(1):
			result = "Rooster";
			break;
		case(2):
			result = "Dog";
			break;
		case(3):
			result = "Pig";
			break;
		case(4):
			result = "Rat";
			break;
		case(5):
			result = "Cow";
			break;
		case(6):
			result = "Tiger";
			break;
		case(7):
			result = "Rabbit";
			break;
		case(8):
			result = "Dragon";
			break;
		case(9):
			result ="Snake";
			break;
		case(10):
			result = "Horse";
			break;
		case(11):
			result = "Goat";
		}
		
		//display the result
		System.out.println("Your horoscope sign: " + result);
		System.out.println(" ");
		
		//session + 1 when next session
		session++;
		}
	}

}
