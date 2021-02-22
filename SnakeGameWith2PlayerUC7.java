public class SnakeGameWith2PlayerUC7 {
	
	static int numberOfDies = 0;
	
	static int player1 = 0;
	static int player2 = 0;

	public static void main(String[] args) {
		
		//This loop is to start game until one of the player reach 100.
		
		while(player1 < 100 && player2 < 100) {
			
			System.out.println("Player-1 turn");
		
			//Calling snakeAndLadder() method by player-1 value as arguments;
			
			player1 = snakeAndLadder(player1) ;
			
			if(player1 == 100) { break; }
			
			System.out.println("Player-2 turn");
		
			//Calling snakeAndLadder() method by player-2 value as arguments;
			
			player2 = snakeAndLadder(player2) ;
			
		}
		
		//Comparing both players for winner.
		
		if(player1 > player2) { System.out.println("Player-1 Reached: " + player1 + " and Won the Match");}
		
		else { System.out.println("Player-2 Reached: " + player2 + " and Won the Match");}
		
		System.out.println("Number of Dice was played to Win: " + numberOfDies);
		
	}
	
	static int snakeAndLadder(int player) {
		
			//dice to get value between 1-6.
		
			int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
			
			//random number from 0-2 for conditions apply.
		
			int condition = (int) Math.floor(Math.random() * 10) % 3;
			
			switch(condition) {
			
				//case-0 is used to  No-play condition
			
				case 0: System.out.println("Dice rolled: " + dice + ", You got NO-PLAY and remain Same position at: " + player ); break;
			
				//case-1 is for ladder ands moves forward.
				
				case 1: player += dice;
			
						if(player > 100) {
							
							player -= dice;
						
							System.out.println("Dice Rolled: " + dice + ", It is more than required and you are at: " + player);
						
						} 
			
						else {
						
							System.out.println("Dice Rolled: " + dice + ", You got ladder and moved to: " + player);
						
						} ;break;
						
				//case-3 is for Snake and move back.
					
				case 2: player -= dice;
			
						if(player <= 0) {
						
							player = 0;
						
							System.out.println("Dice Rolled: " + dice + ", You got Snake and you are at: " + player);
			
						}
					
						else {
			
							System.out.println("Dice Rolled: " + dice + ", You got Snake and moved back to: " + player);
				
						};
			
			}
			
			numberOfDies++;
		
		return player;
		
	}

}
