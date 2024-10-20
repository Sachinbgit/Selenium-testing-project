package hybridDrivenFramework;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontAccountingHybridRepo {

	public FrontAccountingHybridRepo(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}
	
	@FindBy(name = "user_name_entry_field")
	WebElement Username;
	@FindBy(name ="password")
	WebElement Password;
	@FindBy(name="SubmitUser")
	WebElement loginbtn;
	@FindBy(linkText ="Logout")
	WebElement logoutbtn;
	@FindBy(linkText = "Click here to Login Again.")
	WebElement loginAgain;
	
	public void loginclear() {
		
	}
    public void login(String User ,String Pass) {
    	Username.clear();
    	Username.sendKeys(User);
    	Password.clear();
    	Password.sendKeys(Pass);
    	loginbtn.click();
    	
    }
    public void logout() {
    	logoutbtn.click();
    	loginAgain.click();
    }
	
	
	
	
}
