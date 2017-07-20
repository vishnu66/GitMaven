package com.org.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login 
{
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Gecko\\geckodriver.exe");
		WebDriver gk=new FirefoxDriver();
		gk.get("http://mfsapp-testing.fingent.net/");
	}
}
