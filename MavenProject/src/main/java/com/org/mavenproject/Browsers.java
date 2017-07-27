package com.org.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers 
{
	private static WebDriver gk=null;
	
	//To Run on Firefox Driver
	public static WebDriver firefox()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Gecko\\geckodriver.exe");
		gk = new FirefoxDriver();
		return gk;
	}
	
	//To Run on Chrome Driver
	public static WebDriver chrome()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Chrome\\chromedriver.exe");
		gk = new ChromeDriver();
		return gk;
	}
	
	//To Run on Internet Explorer
	public static WebDriver ie()
	{
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\IE\\IEDriverServer.exe");
		gk = new InternetExplorerDriver();
		return gk;
	}
}
