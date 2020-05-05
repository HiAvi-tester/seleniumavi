import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {
	public static void main(String args[])
	{
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/automation-practice-table/");
		  String innerText = driver.findElement(
					By.xpath("/table/tbody/tr[3]/td[2]")).getText(); 	
	
		  driver.findElement(By.name("btnK")).click();  
		  driver.manage().window().maximize();
	}

}
