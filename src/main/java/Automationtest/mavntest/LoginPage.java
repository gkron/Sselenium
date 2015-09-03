package Automationtest.mavntest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
}
	
    By userName = By.id("txtUsername");
    By password = By.id("txtPassword");
    By login = By.xpath("//span[@class='ui-button-text' and text()='Login']");
    
    
    public void login(String name, String pwd){
    	driver.findElement(userName).sendKeys(name);
    	driver.findElement(password).sendKeys(pwd);
        driver.findElement(login).click();
    	
    }
}