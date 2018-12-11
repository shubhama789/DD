class MyRunnable implements Runnable
{
	public void run()
	{
	for(int i=0; i<5; i++)
		{
		System.out.println("Child Thread");
		}
	}
}

class ThreadPriority extends MyRunnable
{
	public static void main(String[] args)
	{
	MyRunnable r = new MyRunnable();
	Thread t = new Thread(r);
	t.setPriority(2);
	t.start();
	for(int j=0; j<5; j++)
		{
		System.out.println("Main Thread");
		}
	}
}