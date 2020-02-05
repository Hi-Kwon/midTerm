package midTerm;

public class NewMainGameTest
	{
		 public static void main(String [] args)
		 {
			 player();
			 Game ex = new Game();               //Creates new object of type Game, and name it ex.
	         new Thread(ex).start();  	 		//Start this so called ex object. 
		 }
		 public static void player()
		 {
			 //variables which we will use 
			 int x, y;
			 boolean  left, right, up, down;
		 }
		 private static void update()
			{

			}
	}
public class Game implements Runnable
{
	public void run()
	{
		 while(true)
		System.out.println(" While ! ");
	}
	   
}

