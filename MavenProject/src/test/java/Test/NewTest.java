package Test;

import org.testng.annotations.Test;

import com.org.mavenproject.App;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  private static WebDriver gk = null;
  @Test
  public void Login() 
  {
	  gk.get("http://mfsapp-testing.fingent.net/");
	  App.textbox_Username(gk).sendKeys("mfssuperadm@gmail.com");
	  App.textbox_Password(gk).sendKeys("12345678");
	  App.LoginButton(gk).click();
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
