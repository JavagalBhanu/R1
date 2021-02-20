package project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
//to run the script on remote system , we should use RemoteWebDriver with 2 arg
	// 1. remoteAddress: url of node-http://ip address of node:port/wd/hub
	//2. capabilities: which browser
	@Test
	public void testA() throws MalformedURLException {
		Reporter.log("Hi",true);
		//WebDriver driver=new ChromeDriver(); //this code will open chrome browser 
		//in current computer where code is present
		URL remoteAddress=new URL("http://localhost:4444/wd/hub");
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);//this code will open the browser 
		//in remote system (node)
		driver.get("http://www.google.com");
		driver.quit();
	}
}
