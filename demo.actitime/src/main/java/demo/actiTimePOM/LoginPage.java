package demo.actiTimePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement usernameTextfield;

	@FindBy(name="pwd")
	private WebElement passwordTextField;

	
	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}


	public void setUsernameTextfield(WebElement usernameTextfield) {
		this.usernameTextfield = usernameTextfield;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbutton;

	
	//business logic method
	public void login(String username,String password)
	{
		
		usernameTextfield.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginbutton.click();
	}
	
	//to finf please identify yourself
	@FindBy(id="headerContainer")
	private WebElement header;


	public WebElement getHeader() {
		return header;
	}


	public void setHeader(WebElement header) {
		this.header = header;
	}
	
	//to find checkbox
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;


	public WebElement getCheckbox() {
		return checkbox;
	}


	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}
	//to find keep me logged in text
	@FindBy(id="keepLoggedInLabel")
	private WebElement logintext;


	public WebElement getLogintext() {
		return logintext;
	}


	public void setLogintext(WebElement logintext) {
		this.logintext = logintext;
	}
	//to find forgot password link
	@FindBy(id="toPasswordRecoveryPageLink")private WebElement forgotPasswordLink;


	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}


	public void setForgotPasswordLink(WebElement forgotPasswordLink) {
		this.forgotPasswordLink = forgotPasswordLink;
	}
	//to find actiTime
	@FindBy(xpath="//div[@class=\"atProductName\"]")private WebElement actitime;


	public WebElement getActitime() {
		return actitime;
	}


	public void setActitime(WebElement actitime) {
		this.actitime = actitime;
	}
	//to find icon
	@FindBy(xpath="//div[@class=\"atLogoImg\"]")private WebElement icon;


	public WebElement getIcon() {
		return icon;
	}


	public void setIcon(WebElement icon) {
		this.icon = icon;
	}
	
	

}
