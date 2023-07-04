package HARSH40;

class ThreadA extends Thread
{
	synchronized public void run()
	{
		for(int i=1;i<=20; i+=2)
		{
			System.out.println("Odd Thread Running"+ i+"times");
			try
			{
				sleep(250);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
class ThreadB extends Thread
{
	synchronized public void run()
	{
		for(int i=2;i<=20; i+=2)
		{
			System.out.println("Even Thread Running"+ i+"times");
			try
			{
				sleep(250);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
public class Q20Demo
{
	public static void main(String[] args)
	{
		ThreadA ob1= new ThreadA();
		ThreadB ob2=new ThreadB();
		ob1.start();
		ob2.start();
	}
}
