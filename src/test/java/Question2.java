import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Question2 {

    WebDriver driver = null;
    public  void identifyBrowser(String browser){

        if (browser.equalsIgnoreCase("Chrome")){

            driver= new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("Firefox")){

            driver= new FirefoxDriver();
        }

        if (browser.equalsIgnoreCase("Safari")){

            driver= new SafariDriver();
        }
    }


    public void openLoginPage(){
        driver.get(System.getenv("URL"));
    }
    public void setUsername(){
        driver.findElement(By.name(System.getenv("username"))).sendKeys(System.getenv("Username"));
    }
    public void setPassword(){
        driver.findElement(By.name(System.getenv("password"))).sendKeys(System.getenv("Password"));
    }

    public void enterCaptcha(){
        driver.findElement(By.name(System.getenv("captha"))).sendKeys(System.getenv("captcha"));
    }
  public void clickLogin(){
        driver.findElement(By.name(System.getenv("login"))).click();
  }

  public void selectProduct(){
      driver.findElement(By.name(System.getenv("product"))).click();
  }

    public void clickCheckout(){
        driver.findElement(By.name(System.getenv("checkout"))).click();
    }

    public void enterName(){
        driver.findElement(By.name(System.getenv("captha"))).sendKeys(System.getenv("name"));
    }
    public void mobileNumber(){
        driver.findElement(By.name(System.getenv("mobileNumber"))).sendKeys(System.getenv("mobileNumber"));
    }

    public void enterAddress(){
        driver.findElement(By.name(System.getenv("mobileNumber"))).sendKeys(System.getenv("address"));;
    }

    public void clickSubmit(){
        driver.findElement(By.name(System.getenv("submit"))).click();
    }

}


