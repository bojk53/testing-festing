
public  abstract class cars {
	private String Wheels;
	
	public cars(String Number)
		{
			Wheels = Number;
		}
		
	public String getWheels()
		{
			return Wheels;
		}
	
	public abstract String Color();
	
	public abstract String Numberplat();
	
	public abstract String Year();
	
	
}
