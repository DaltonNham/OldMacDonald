class Chick implements Animal 
{     
	private String myType;
	private String mySound;
	private String mySound2;
	private int chickRandom;
	public Chick(String type, String sound, String sound2)
	{
		myType = type;
		mySound = sound;
		mySound2 = sound2;
		chickRandom = ((int)(Math.random()*2));
	}
	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";
		mySound2 = "unknown";
	}
	public String getSound()
	{
		if (chickRandom == 1)
		{
			return mySound;
		}
		else
		{
			return mySound2;
		}
	}
	public String getType(){return myType;}
}
