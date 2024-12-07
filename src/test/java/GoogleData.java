import org.testng.annotations.DataProvider;

public class GoogleData {

	@DataProvider
	public String[] GetData()
	{
		String data[] = new String[5];
		data[0] = "Motorola G50 max";
		data[1] = "howto find job in tech company";
		data[2] = "current gdp of india";
		data[3] = "wolrd most beatiful country";
		data[4] = "Best cricket in world";
		
		return data;
		
	}
	
}
