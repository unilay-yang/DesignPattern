package behavior.observer.java;

public class Watched extends Observable
{
	private String data = "";

	public String getData()
	{
		return data;
	}

	public void setData(String data)
	{
		if (!this.data.equals(data))
		{
			this.data = data;
			super.setChanged();
		}
		notifyObservers();
	}
}
