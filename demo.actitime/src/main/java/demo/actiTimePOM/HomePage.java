package demo.actiTimePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="logoutLink")private WebElement logoutbutton;
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	public void setLogoutbutton(WebElement logoutbutton) {
		this.logoutbutton = logoutbutton;
	}
	public void logout()
	{
		logoutbutton.click();
	}
	

}
