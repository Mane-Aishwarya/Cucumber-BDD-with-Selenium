package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.NAME, using = "uid")
    public WebElement userNameTxt;
    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordTxt;
    @FindBy(how = How.NAME, using = "btnLogin")
    public WebElement loginBtn;

    public void Login(String userName, String password) {
        userNameTxt.sendKeys(userName);
        passwordTxt.sendKeys(password);
    }
}
