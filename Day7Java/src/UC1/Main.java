package UC1;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Gambler gambler = new Gambler();
		int stake=gambler.getStake();
		
		System.out.println("For how many days you want to play");
		int day=sc.nextInt();
		
		for(int i=0;i<day;i++)
		{
			int bit=1;
			stake=stake-1;
		}
				
    }
} 
