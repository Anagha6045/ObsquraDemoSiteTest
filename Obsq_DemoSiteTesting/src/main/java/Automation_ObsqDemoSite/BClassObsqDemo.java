package Automation_ObsqDemoSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BClassObsqDemo 
{
	public WebDriver driver;
	
	public WebDriver browserIntialization(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver =new ChromeDriver();
		}
		else if (browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if (browser.endsWith("Firefox"))
		{
		 driver =new FirefoxDriver();	
		}
		else
		{
			throw new Exception("Invalid Browser");
		}
		return driver;
	}

}
