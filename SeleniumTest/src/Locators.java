import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://login.yahoo.com/");
driver.findElement(By.id("login-username")).sendKeys("edureka@yahoo.com"); //id locator for text box
WebElement searchIcon = driver.findElement(By.id("login-signin"));//id locator for next button
searchIcon.click();
}
}
