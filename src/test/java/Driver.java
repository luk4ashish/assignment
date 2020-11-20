import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static ChromeDriver returnDriver(String web) {
        System.setProperty("webdriver.chrome.driver", "E:\\Program Files\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = null;
        if (web.equalsIgnoreCase("Chrome")) {
            driver= new ChromeDriver();
        }
        return driver;
    }

}

