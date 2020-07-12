package com.fitabank.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest2 {
	
	@Test
	public void test2() throws MalformedURLException
	{
		
		DesiredCapabilities dc= new DesiredCapabilities().firefox();
		URL url= new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver rdriver= new RemoteWebDriver(url, dc);
		rdriver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(rdriver.getTitle());
		rdriver.quit();
		
	}

}
