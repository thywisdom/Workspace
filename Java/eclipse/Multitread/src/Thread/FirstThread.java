package Thread;
class First extends Thread
{
	public void run() {
		try
		{
			for(int i=0;i<10;i++)
			{
				sleep(1000);
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
class Second extends Thread
{
	public void run() {
		try
		{
			for(int i=10;i<20;i++)
			{
				sleep(1000);
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}

public class FirstThread {

	public static void main(String[] args) {
		First y=new First();
		y.run();
		Second y1=new Second();
		y1.run();

	}
}


	


