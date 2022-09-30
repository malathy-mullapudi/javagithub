//class created only for shop
public class Shop {

	private int material;
	private boolean available = false;
	public synchronized int get() 
	{
		while(available==false)
		{
			try
			{
				wait();
			}
			catch(Exception ie)
			{
				ie.printStackTrace();
			}
		}
		available= false;
		notifyAll();
		return material;
	}

public synchronized void put(int value)
{
	while(available==true)
	{
		try
		{
			wait();
		}
		catch(Exception ie) 
		{
			ie.printStackTrace();
		}
	}
	material = value;
	available =true;
	notifyAll();
	
	}
}
