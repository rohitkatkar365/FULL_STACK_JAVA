package local.inner.com;

public class door {
	public boolean islocked(String key)
	{
		class lock
		{
			public boolean islocked(String key)
			{
				if(key.equals("qwerx"))
				{
					return false;
				}
				else
				{
					return true;
				}
			}
		}
	return new lock().islocked(key);
}
}
