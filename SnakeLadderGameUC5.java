public class SnakeLadderGameUC5 {

public static void main(String[] args) {
		
		//player starts at 0 position

		int player1 = 0;
		
		while(player1<100) {

		int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;

		//Random number for No-Play,Ladder and Snake

		int condition = (int) Math.floor(Math.random() * 10) % 3;
			
			switch(condition) {
			
				//case-0 for No-play and remains at same position

				case 0:

					System.out.println("Dice rolled: " + dice + ", You got NO-PLAY and remain Same position ");break;
			
				//case-1 for Ladder and moves forward

				case 1: player1 += dice;
				
				if(player1 > 100) {
				
					System.out.println("Dice Rolled: " + dice + ", It is more than required");
				
					player1 -= dice; break;
				
				} 
			
				else if(player1 == 100) {
	
					System.out.println("Dice Rolled: " + dice + ", Congrats, You Reached 10 and Won the Match");
	
				}
			
				else {
				
					System.out.println("Dice Rolled: " + dice + ", You got ladder and moved to: " + player1);
				
				} ;break;
								
				//case-2 for Snake and move backward
	
				case 2: player1 -= dice;
				
				if(player1 <= 0) {
				
					player1 = 0;
				
					System.out.println("Dice Rolled: " + dice + ", You got Snake and you are at: " + player1);
		
					continue;
	
				}
			
				else {
	
					System.out.println("Dice Rolled: " + dice + ", You got Snake and moved back to: " + player1);
		
				};
			
			}

		}
		
		System.out.println("player reached the " + player1 + "Position");
	}
	
}
