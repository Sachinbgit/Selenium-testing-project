package grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName( "chrome");
		
		RemoteWebDriver w = new RemoteWebDriver(dc);
		w.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		w.quit();

	}

}
