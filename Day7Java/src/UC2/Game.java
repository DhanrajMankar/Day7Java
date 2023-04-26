package UC2;
import java.util.random.*;
public class Game {

	public int playGame()
	{
		int a=1;
		double randomCheck=Math.random()*2;
		if(randomCheck>1)
		{
			a=2;
		}
		return a;
	}
}
