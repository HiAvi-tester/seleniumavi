import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_1 {
 
	 public static void main(String args[]) {
		 
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\chromedriver.exe");  
	          
	        WebDriver driver=new ChromeDriver();  
	        driver.get("https://www.google.co.in/");

driver.manage().window().maximize();
		 
	 }
 
}
