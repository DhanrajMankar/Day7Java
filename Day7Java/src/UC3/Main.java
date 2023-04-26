package UC3;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Gambler gambler = new Gambler();
		Game game=new Game();
		int stake=gambler.getStake();
		
		System.out.println("For how many days you want to play");
		int day=sc.nextInt();
		
		for(int i=0;i<day;i++)
		{
			int bit=1;
			boolean cond=true;
			while(cond)
			{
			int gameResult=game.playGame();
			
			if(gameResult==1)
			{
				stake=stake+1;
			}
			else
			{
				stake=stake-bit;
			}
			
			if(stake>=150||stake<=50)
			{
				cond=false;
				break;
			}
			}
			if(stake>=150||stake<=50)
			{
				day=i;
				break;
			}
			
		}
		
		System.out.println("We meet the condition at day : "+day+" "+"your satke is : "+stake);
				
    }
} 


