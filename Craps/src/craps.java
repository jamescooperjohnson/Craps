import java.sql.Time;
import java.util.Scanner;

public class craps
	{
		
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in);
				
				System.out.println("What is your name?");	
					
					String name = userInput.nextLine();
					
		boolean stillPlaying = true;		
		Scanner userInput2 = new Scanner (System.in);
		
		System.out.println("Hello " + name + " Let's play Craps! Please type 'roll' or 'Roll' if you wish to play!");

		String roll = userInput.nextLine();
		
		Scanner userInput3 = new Scanner (System.in);
		
		System.out.println("How much Money would you like to bet?");

		int money = userInput.nextInt();
	
		
			 int die2 = (int)(Math.random() * 6)+1;
			 int die1 = (int)(Math.random() * 6)+1;
			 int point =die1 + die2 ;	
					
				
				if (point == 2 || point == 12)
						{
						
						System.out.println("You rolled a " + die1 + " and a "  + die2 + ". Thats a " + (point) +  " . You lose. You have $0 left");
						stillPlaying = false;	
						}
					
				else if (point == 7 || point == 11)
					{
					System.out.println("You rolled a " + die1 + " and a " + die2 + ". Thats a " + (point) +  ". You Win!!! Your new balance is $" + (money + 100));
					stillPlaying = false;
					}
				else
					{
					System.out.println("You rolled a " + die1 + " and a " + die2 + ". Thats a " + (point) + ". You're Safe. Roll again. Your new balance is "+ money);
					
	
					Scanner userInput4 = new Scanner (System.in);
					
					System.out.println("Press Enter to Re-roll");
	
						String enter = userInput4.nextLine();
					
					}
				
			

			while(stillPlaying)	
					{


				int die3 = (int)(Math.random() * 6)+1;
				int die4 = (int)(Math.random() * 6)+1;
				int point2 = die3 + die4 ;	
						
					
					if (point2 == 7)
							{
							
							System.out.println("You rolled a " + die3 + " and a "  + die4 + ". Thats a " + (point2) +  " . You lose. You have $0 left");
							stillPlaying = false;	
							}
						
					else if (point == point2)
						{
						System.out.println("You rolled a " + die3 + " and a " + die4 + ". Thats a " + (point2) +  ". You Win!!! Your new balance is $" + (money + 100));
						stillPlaying = false;
						}
					else
						{
						System.out.println("You rolled a " + die3 + " and a " + die4 + ". Thats a " + (point2) + ". You're Safe. Roll again. Your new balance is "+ money);
						

						Scanner userInput4 = new Scanner (System.in);
						
						System.out.println("Press opEnter to Re-roll");

							String enter = userInput.nextLine();

						}	
			
			}
				
				
			}
	}
			
	
			
			
	
			
			
			
			
			

	
