package vishnu.vishtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws Exception {
	  
	  String exepath="C:\\Users\\vishnu\\Desktop\\chromedriver_win32\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", exepath);
      
       WebDriver drv; 
       drv=new ChromeDriver();
      
    	   drv.get("http://www.store.demoqa.com");
    	   Thread.sleep(2000);
 	      drv.manage().window().maximize();
 	      drv.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
  }
}
