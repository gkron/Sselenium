package Automationtest.mavntest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LoginPage {
	
public HomePage(WebDriver driver) {
		super(driver);
}
	By titleText =By.className("logo");
	By linkname  =By.linkText("LINGUISTICS");
	By dictionarylink=By.linkText("Dictionaries");
	By dictpage   =By.className("hText");

    //Get the title of Login Page
	 
    public String getLoginTitle(){
      return driver.findElement(titleText).getText();
 
    }
    
    //Navigate to dictionary page & verify page
    public void dictionpage(){
    	driver.findElement(linkname).click();
    	driver.findElement(dictionarylink).click();
    }
    
    public String verifydictpage(){
    	return driver.findElement(dictpage).getText();
    }
}
