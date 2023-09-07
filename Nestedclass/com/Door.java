package Nestedclass.com;

public class Door {
	private Lock lock;	// object of lock class
	public Door()
	{
		lock = new Lock(true);
	}
	public void shopstatus()
	{
		if(lock.islock())
		{
			System.out.println("Shop is closed,Please visit later");
		}
		else
		{
			System.out.println("Welcome to shop");
		}
	}
	private class Lock
	{
		private boolean lock;
		public Lock(boolean lock)
		{
			this.lock = lock;
		}
		public boolean islock()
		{
			return lock;
		}
		public void setlock(boolean lock)
		{
			this.lock=lock;
		}
	}
}
