import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {

    private HashSet<Character> vowels;
    WebDriver driver=null;
    @Step("Login")
    public void login() {
        ChromeDriver chrome = Driver.returnDriver("Chrome");
        chrome.get("https://www.facebook.com");
    }

    Question2 imp=new Question2();

    @Step("Open the login page")
    public void openLogInPage() {
        imp.identifyBrowser("");
        imp.openLoginPage();
    }

    @Step("Login to account")
    public void enterUname(){
        imp.setUsername();
        imp.setPassword();
        imp.enterCaptcha();
        imp.clickLogin();
    }
    @Step("Select the product and checkout")
    public void checkout(){
        imp.selectProduct();
        imp.clickCheckout();
    }

    @Step("Enter the shipping details")
    public void enterDetails(){
        imp.enterName();
        imp.mobileNumber();
        imp.enterAddress();
        imp.clickSubmit();
    }
}
