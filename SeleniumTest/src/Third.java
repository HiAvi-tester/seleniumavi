

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class Third {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.get("https://www.google.co.in/");
        String PageTitle= driver.getTitle();
        int PageLength=PageTitle.length();
        System.out.println("Page Title is:" + PageTitle);
        System.out.println("PageTitle length is:" + PageLength);
          System.out.println("Page URL is " + driver.getCurrentUrl());
         
          driver.close();
          
         
  
    }  
  
}