package POMrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	private WebElement usernameField;
	
	@FindBy(name="password")
	private WebElement passwordFiled;
	
	@FindBy(xpath = "//button[contains(@class,\"MuiButton-root MuiButton-text\")]")
     private WebElement loginButton;
	
	public WebElement getusernameField() {
	return usernameField;
	}
	public WebElement getpasswordFiled() {
		return passwordFiled;
	}
	public WebElement getloginButton() {
		return loginButton;
	}
	
}
