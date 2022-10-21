//create thread using thread schedular methods sleep(),join() methods
class Mythread extends Thread
{
	public void run()//run method 
	{
		for(int i=0;i<=5;i++)//print the number 
		{
			try
			{
				Thread.sleep(1000);//thread is sleep for one seconds
			}
			catch(Exception e)//exception
			{
				System.out.println(e);
			}
			System.out.println(i);//print the numbers
		}
	}
}
public class Mythread1
{
public static void main(String[] args)
{
	Mythread m1=new Mythread();//object cretion
	Mythread m2=new Mythread();
	Mythread m3=new Mythread();
	m1.start();//start the thread
	m2.start();//again second thread will be started
	try
	{
		m1.join();//current thread wait for die
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	m3.start();//last thread started
}
}