package StepDefinitions;

import Base.BaseUtil;
import LoginPage.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions extends BaseUtil {
    private BaseUtil base;

    public LoginStepDefinitions(BaseUtil base) {
        this.base = base;
    }

    @Given("^: I navigate to the login page of the application$")
    public void iNavigateToTheLoginPageOfTheApplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aishw\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
        base.driver.manage().deleteAllCookies();
        base.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        base.driver.navigate().to("http://www.demo.guru99.com/v4/index.php");
    }

    @And("^I entered username and password$")
    public void iEnteredUsernameAndPassword() {
        Login login = new Login(base.driver);
        login.Login("mngr306775", "jAjequj");
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        Login login = new Login(base.driver);
        login.loginBtn.submit();
    }

    @Then("^I should see the Manager tab on the left$")
    public void iShouldSeeTheManagerTabOnTheLeft() {
        String headingToBeMatched = base.driver.findElement(By.className("barone")).getText();
        String heading = "Guru99 Bank";
        if (heading.equals(heading)) {
            base.driver.quit();
        }
    }
}
