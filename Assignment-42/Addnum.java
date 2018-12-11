class MyRunnable implements Runnable
{
	int sum = 0;
	public void run()
	{
	for(int i=500; i<= 1000; i++)
		{
		sum += i;
		}
	}
	public int sum()
	{
	return sum;
	}
}

class Addnum extends MyRunnable
{
	public static void main(String[] args)
	{
	int sum = 0;
	MyRunnable r = new MyRunnable();
	Thread t = new Thread(r);
	t.start();
	try
	{
	t.join();
	}
	catch (InterruptedException e)
	{
	System.out.println(e);
	}
	for(int j=0; j<500; j++)
		{
		sum = sum + j;
		}
	int total = sum + r.sum();
	System.out.println(total);
	}
}