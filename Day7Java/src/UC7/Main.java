package UC7 ;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Gambler gambler = new Gambler();
		Game game=new Game();
		int stake=gambler.getStake();
		int cond=1;
	while(cond==1)
	{	
		System.out.println("For how many days you want to play");
		int day=sc.nextInt();
		int arrWins[]=new int [day];
		int arrLose[]=new int [day];
		
// Here we are assuming that a player can bit 20 time in day		
		
	 for(int i=0;i<day;i++)
	  {
		 
	     int noWin=0;
	     int noLose=0;
		 int j=0;
		 while(j<20)
		 {	
			int bit=1;
			
			int gameResult=game.playGame();
			
			if(gameResult==1)
			{
				stake=stake+1;
				noWin++;
			}
			else
			{
				stake=stake-bit;
				noLose++;
			}
			j++;
		 }
		 
		 
		 arrWins[i]=noWin;
		 arrLose[i]=noLose;
	 }
	 
	 System.out.println("Printing Array for more idea");
	 for(int i=0;i<day;i++)
	 {
		 System.out.println("Day-"+i+" win-"+arrWins[i]+" "+"Lose-"+arrLose[i]);
	 }
	 
	 
	 
	 
	 
	 int temp1=0,temp2=0;
	 int index1=0,index2=0;
	 for(int i=0;i<day;i++)
	 {
		 if(temp1<arrWins[i])
		 {
			 temp1=arrWins[i];
			 index1=i;
		 }
		 if(temp2<arrLose[i])
		 {
			 temp2=arrLose[i];
			 index2=i;
		 }
	 }
	 System.out.println();
	 System.out.println("Most luckest day is at we win highest times is Day = "+index1);
	 System.out.println("Most unluckey day is at we lose highest times is Day = "+index2);		
	 System.out.println();
	 
	 System.out.println("Do you want to play it again ");
	 System.out.println("1.YES");
	 System.out.println("2.NO");
	 
	 cond=sc.nextInt();
	 
	}
   }		
} 


