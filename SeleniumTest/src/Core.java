import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Core {
	public static void main(String args[])
	{
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.javatpoint.com/");
		  JavascriptExecutor js = (JavascriptExecutor) driver;

          js.executeScript("window.scrollBy(0,350)", "");
		  driver.manage().window().maximize();
	}

}
