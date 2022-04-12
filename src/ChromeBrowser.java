import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F"; // the website you want to open
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe"); // key code - all in small letters always
        WebDriver driver = new ChromeDriver();// calling ChromeDriver class by creating object & using interface 'WebDriver'
        // Launching Url by using driver.getmethod
        driver.get(baseUrl);
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle(); // add variable title to store the value of get title method.
        System.out.println(title);

        System.out.println("Current URL = " + driver.getCurrentUrl());// Getting Current URL

        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";//Storing URL and navigate
        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " + driver.getCurrentUrl());

        WebElement emailField = driver.findElement(By.id("Email")); // findElement is always returning value 'WebElement'
        emailField.sendKeys("amiss_17@gmail.com"); // sending email to email field element

        // Finding the password field element
        WebElement passwordField = driver.findElement(By.name("Password")); // findElement is always returning value 'WebElement'
        passwordField.sendKeys("abc123"); // sending Password to password field element
        driver.close(); //closing browser automatically
    }
}
