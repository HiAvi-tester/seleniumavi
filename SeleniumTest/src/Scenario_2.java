import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_2 {
        static WebDriver WebDriver; 
        public static void main(final String[] args){
        	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\chromedriver.exe");  
        WebDriver = new ChromeDriver();
        WebDriver.get("https://www.google.co.in/");
        System.out.println(WebDriver.manage().window().getSize());
  
        Dimension s = new Dimension(480, 620);
    WebDriver.manage().window().setSize(s);
  System.out.println(WebDriver.manage().window().getSize());
WebDriver.close();

 }
}

