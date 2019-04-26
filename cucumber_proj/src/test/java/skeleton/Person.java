package skeleton;

public class Person {
	
	
	int distance;
	String message;
	
	
	public void setdistance(Integer int1) 
	{
		// TODO Auto-generated method stub
		this.distance=int1;
	}

	public void setmessage(String string)
	{
		// TODO Auto-generated method stub
		if(distance>0&& distance<=20)
		{
			this.message=string;
		}
		else
		{
			this.message="cannot hear";
		}
	}

	public String getmessage()
	{
		// TODO Auto-generated method stub
		return message;
	}

}
