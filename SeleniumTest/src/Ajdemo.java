import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Ajdemo {
	
	private String URL = "http://demo.guru99.com/test/ajax.html";
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\chromedriver.exe"); 
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}
	
	
	public void test_AjaxExample() {

		By container = By.cssSelector(".container");
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(container));
		
		
		WebElement noTextElement = driver.findElement(By.className("radiobutton"));
		String textBefore = noTextElement.getText().trim();
		
		
		driver.findElement(By.id("yes")).click();
	
		
		driver.findElement(By.id("buttoncheck")).click();
		
		
		WebElement TextElement = driver.findElement(By.className("radiobutton"));
		wait.until(ExpectedConditions.visibilityOf(TextElement));
		String textAfter = TextElement.getText().trim();
		
		
		Assert.assertNotEquals(textBefore, textAfter);
		System.out.println("Ajax Call Performed");
		
		String expectedText = "Radio button is checked and it's value is Yes";
		
		
		Assert.assertEquals(textAfter, expectedText);
		driver.close();
	}
	
}