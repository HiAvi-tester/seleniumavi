//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/");

		WebElement selectable = driver.findElement(By.linkText("Selectable"));

		selectable.click();

		WebElement Home = driver.findElement(By.linkText("Home"));

		Home.click();

		WebElement selectable01 = driver.findElement(By.linkText("Selectable"));

		selectable01.click();

		WebElement Home01 = driver.findElement(By.linkText("Home"));

		Home01.click();

		driver.navigate().refresh();

		driver.close();

	}

}