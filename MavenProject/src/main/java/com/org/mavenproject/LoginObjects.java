package com.org.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class LoginObjects 
{
    private static WebElement element = null;
    
    public static WebElement textbox_Username(WebDriver driver)
    {
    	element = driver.findElement(By.id("email"));
    	return element;
    }
    
    public static WebElement textbox_Password(WebDriver driver)
    {
    	element = driver.findElement(By.id("password"));
    	return element;
    }
    
    public static WebElement LoginButton(WebDriver driver)
    {
    	element = driver.findElement(By.cssSelector(".btn.btn-primary.btn-raised.login-button"));
    	return element;
    }
}
