public class SnakeLadderGameUC3 {

	public static void main(String[] args) {
		
		//player starts at 0 position

		int player1 = 0;

		int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;

		//Random number for No-Play,Ladder and Snake

		int condition = (int) Math.floor(Math.random() * 10) % 3;
			
			switch(condition) {
			
				//case-0 for No-play and remains at same position

				case 0:

					System.out.println("Dice rolled: " + dice + ", You got NO-PLAY and remain Same position ");break;
			
				//case-1 for Ladder and moves forward

				case 1:

					 player1 += dice; System.out.println("Dice Rolled: " + dice + ", You got ladder and moved "); break;
								
				//case-2 for Snake and move backward
	
				case 2: player1 -= dice; System.out.println("Dice Rolled: " + dice + ", You got Snake and moved back to: ");
				
			
			
			}

	}

}