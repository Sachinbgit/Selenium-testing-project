package grid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridGridSauceDemoRepo {

	 public HybridGridSauceDemoRepo(RemoteWebDriver wd)
	  {
		  PageFactory.initElements(wd, this);
	  }
	
	@FindBy(id="user-name")
	WebElement username;
	@FindBy(css = "input[data-test=\"password\"]")
	WebElement password;
	@FindBy(name = "login-button")
	WebElement loginbtn;
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
	WebElement Addtocartbtn;
	@FindBy(id = "react-burger-menu-btn")
	WebElement openmenu;
	@FindBy(linkText = "Logout")
	WebElement logoutbtn;
	
	//to create methods of login add to cart and logout button
	
	public void login(String user, String pass) {
		username.clear();
		username.sendKeys(user);
		password.clear();
		password.sendKeys(pass);
		loginbtn.click();
	}
	
	public void AddToCart() {
		Addtocartbtn.click();
	}
	
	public void logout() {
		openmenu.click();
		logoutbtn.click();
	}
	

}
