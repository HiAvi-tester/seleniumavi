
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver;  
  
public class Fourth {  
  
    public static void main(String[] args) {  
      
            // System Property for IEDriver   
      
    	System.setProperty("webdriver.ie.driver", "C:\\Users\\avinash.verma\\eclipse-workspace\\Basic\\Driver\\IEDriverServer.exe");  
          
           // Instantiate a IEDriver class.       
        WebDriver driver=new InternetExplorerDriver();  
        
          
          // Launch Website  
        driver.navigate().to("http://www.google.com/")
          
           //Maximize the browser  
          driver.manage().window().maximize();  
            
          
            
  
    }  
  
}
