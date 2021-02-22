public class SnakeLadderGameUC6 {

	public static void main(String[] args) {
		
		int player1 = 0;
		
		int numberOfDies = 0;
		
		while(player1<100) {
		
			int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
		
			int condition = (int) Math.floor(Math.random() * 10) % 3;
			
			switch(condition) {
			
				case 0: System.out.println("Dice rolled: " + dice + ", You got NO-PLAY and remain Same position at: " + player1 );continue;
			
				case 1: player1 += dice;
			
						if(player1 > 100) {
							
							player1 -= dice;
						
							System.out.println("Dice Rolled: " + dice + ", It is more than required and you are at: " + player1);
						
							 break;
						
						} 
					
						else if(player1 == 100) {
			
							System.out.println("Dice Rolled: " + dice + ", Congrats, You Reached " + player1 + " and Won the Match");
			
						}
					
						else {
						
							System.out.println("Dice Rolled: " + dice + ", You got ladder and moved to: " + player1);
						
						} ;break;
					
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
			
			numberOfDies++;
			
		}
		
		System.out.println("Number of Dice was played to Win: " + numberOfDies);
		
	}

}
