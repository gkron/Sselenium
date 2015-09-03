package Automationtest.mavntest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SanityTest {

	public WebDriver driver;
	LoginPage loginPage;
	HomePage homepage;
	
	@BeforeClass
	public void bc(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://11.120.149.218:8180/saturn/");
		loginPage = new LoginPage(driver);
		loginPage.login("superbauser", "haht");
}
	
@Test(priority=1)
	public void verifytitle() throws IOException {
		homepage= new HomePage(driver);
		String actitle=homepage.getLoginTitle();
		Assert.assertEquals(actitle, "banner images go here");
		File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //copy the file to the required path
        FileUtils.copyFile(screenshot1,new File("G:\\eclipse\\eclipse\\screenshot1.jpeg"));
}
	@Test(priority=2)
	public void testdictonpage() throws IOException{
		homepage= new HomePage(driver);
		homepage.dictionpage();
		String vt=homepage.verifydictpage();
		Assert.assertEquals(vt, "Dictionaries");
		 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

         //copy the file to the required path
         FileUtils.copyFile(screenshot,new File("G:\\eclipse\\eclipse\\screenshot.jpeg"));

	}
	
	@AfterClass
	public void ac(){
		driver.close();
		
	}
	
}
