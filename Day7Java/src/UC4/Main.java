package UC4;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Gambler gambler = new Gambler();
		Game game=new Game();
		int stake=gambler.getStake();
		
		//System.out.println("For how many days you want to play");
		int day=20; //sc.nextInt();
		int arr[]=new int [20];
		for(int i=0;i<day;i++)
		{
			int bit=1;
			
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
				day=i;
				break;
			}
			arr[i]=stake;
			
		}
		
		//System.out.println("We meet the condition at day : "+day+" "+"your satke is : "+stake);
	
		int winAmount=0;
		int loseAmount=0;
		for(int i=0;i<20;i++)
		{
			if (arr[i]>100)
			{
				System.out.println("you win at day "+i+1+" your stake is : "+arr[i]);
				winAmount=winAmount+(arr[i]-100);
			}
			if(arr[i]<100)
			{
				System.out.println("you loose at day "+i+1+" your stake is : "+arr[i]);
				loseAmount=loseAmount+(100-arr[i]);
			}
			if(arr[i]==100)
			{
				System.out.println("you tiegame for day "+i+1+" your stake is : "+arr[i]);
			}
		}
		System.out.println();
		System.out.println(winAmount);
		System.out.println(loseAmount);
		
		int netAmount;
		
		if(winAmount>loseAmount)
		{
			netAmount=winAmount-loseAmount;
			System.out.println("Your net earning is for 20 days= "+netAmount);
		}
		if(winAmount<loseAmount)
		{
			netAmount=loseAmount-winAmount;
			System.out.println("Your net lose is for 20 days= "+netAmount);
		}
		if(winAmount==loseAmount)
		{
			System.out.println("You didn't earn or lose any stake");
		}
    }
} 


