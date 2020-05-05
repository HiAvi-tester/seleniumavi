import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");

		driver.findElement(By.xpath("/html/body/p/a")).click();

		WebElement customerID = driver.findElement(By.name("cusid"));
		customerID.sendKeys("12345");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().window(parentwindow);

	}
}
