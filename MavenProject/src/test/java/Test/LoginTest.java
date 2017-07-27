package Test;

import org.testng.annotations.Test;

import com.org.mavenproject.LoginObjects;

import org.testng.annotations.BeforeTest;
import org.apache.bcel.classfile.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import utility.Constant1;

public class LoginTest {
  private static WebDriver gk = null;
  @Test
  public void Login() 
  {
	  gk.get(Constant1.URL);
	  LoginObjects.textbox_Username(gk).sendKeys(Constant1.Username);
	  LoginObjects.textbox_Password(gk).sendKeys(Constant1.Password);
	  LoginObjects.LoginButton(gk).click();
	  System.out.println("Login Successfull!!!!");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Gecko\\geckodriver.exe");
		gk=new FirefoxDriver();
		
  }

  //@AfterTest
  public void afterTest() 
  {
	  gk.quit();
  }

}
