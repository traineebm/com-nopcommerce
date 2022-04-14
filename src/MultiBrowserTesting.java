import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    static String browser = "chrome";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver-v0.30.0-win64/geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "Drivers/edgedriver_win64/msedgedriver.exe");
            driver = new EdgeDriver();

        } else {
            System.out.println("Browser name is incorrect");

        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }
}