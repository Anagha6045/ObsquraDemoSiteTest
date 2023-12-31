package Testing_ObsqDemoSite;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation_ObsqDemoSite.BClassObsqDemo;


public class TClassObsqDemo extends BClassObsqDemo
{
	WebDriver driver;
	@BeforeMethod
	public void intialiazation() throws Exception 
	{
		driver=browserIntialization("Chrome");
		driver.get("https://selenium.obsqurazone.com/index.php");
	}
	
	//Input form
   @Test
	public void testcase01()
	{
		driver.findElement(By.xpath("(//*[@class='nav-link'])[2]")).click();
		driver.findElement(By.id("single-input-field")).sendKeys("Hai there, Message from TclassObsqDemo class file");
		driver.findElement(By.id("button-one")).click();
		WebElement button1 = driver.findElement(By.id("message-one"));
		System.out.println(button1.isDisplayed());
		WebElement placeholder1= driver.findElement(By.xpath("(//*[@placeholder='Enter Value'])[1]"));
	    System.out.println(placeholder1.isDisplayed());
	    placeholder1.sendKeys("34");
	    WebElement placeholder2= driver.findElement(By.xpath("(//*[@placeholder='Enter Value'])[2]"));
	    System.out.println(placeholder2.isDisplayed());
	    placeholder2.sendKeys("34");
	    WebElement button2= driver.findElement(By.xpath("//button[text()='Get Total']"));
	    System.out.println(button2.isDisplayed());
	    System.out.println(button2.isEnabled());
	    button2.click();
	    
	    
	    
	}
}
