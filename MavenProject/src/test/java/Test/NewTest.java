package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver gk;
  @Test
  public void f() 
  {
	  gk.get("http://mfsapp-testing.fingent.net/");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Gecko\\geckodriver.exe");
		gk=new FirefoxDriver();
		
  }

  @AfterTest
  public void afterTest() 
  {
	  gk.close();
  }

}
