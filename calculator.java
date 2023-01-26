import java.util.Scanner;

public class CALCULATOR {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while (true) 
		{
			System.out.println("enter first number:");
			int num1=scanner.nextInt();
			System.out.println("ENTER SECOND NUMBER:");
			int num2=scanner.nextInt();
			System.out.println("*********************MENU**********************");
			System.out.println("1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION\n 4.DIVISION \n 5.MODULUS \n 6.EXIT ");
			System.out.println("ENTER YOUR CHOICE:");
			int choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
			{
				int sum=num1+num2;
				System.out.println("SUM OF "+num1+"AND "+num2+"IS:"+sum);
				break;
			}
			case 2:
			{
				int sub=num1-num2;
				System.out.println("SUBTRACTION OF "+num1+"AND "+num2+"IS"+sub);
				break;
			}
			case 3:
			{
				int multiplication=num1*num2;
				System.out.println("MULTIPLICATION OF "+num1+" AND "+num2+" IS:"+multiplication);
				break;
			}
			case 4:
			{
				int division=num1/num2;
				System.out.println("DIVISION OF "+num1+" BY "+num2+" IS:"+division);
				break;
			}
			case 5:
			{
				int modulus=num1%num2;
				System.out.println("REMAINDER IS:"+modulus);
				break;
			}
			case 6:
			{
				System.out.println("EXIT");
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("invalid choice!");
			}
			}

		}
		
	}

}
