package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.org.mavenproject.Browsers;
import com.org.mavenproject.LoginObjects;

import utility.Constant1;
import utility.ExcelUtility;

public class ExcelLoginTest 
{
	private static WebDriver gk = null;
	@Test
	public void ExcelLogin() throws Exception
	{
		ExcelUtility.setExcelfile(Constant1.Excel_Path + Constant1.Excel_File);
		String Username = ExcelUtility.getCellData(1, 0);
		System.out.println(Username);
		String Password = ExcelUtility.getCellData(1, 1);
		System.out.println(Password);
		
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Gecko\\geckodriver.exe");
		//gk = new FirefoxDriver();
		gk=Browsers.chrome();
		gk.get(Constant1.URL);
		gk.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LoginObjects.textbox_Username(gk).sendKeys(Username);
		LoginObjects.textbox_Password(gk).sendKeys(Password);
		LoginObjects.LoginButton(gk).click();
		
		ExcelUtility.setCellData("Pass", 1, 2);
	}
}
