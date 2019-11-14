package login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmuthuveeran\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  

	    driver.navigate().to("https://chromedriver.chromium.org/downloads");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.id("jot-ui-searchInput")).sendKeys("javatpoint tutorials");  
	          
	    // Click on the search button  
	    driver.findElement(By.id("sites-searchbox-search-button")).click(); 

		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try { 
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\Users\\vmuthuveeran\\Downloads\\screen1.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
    }
}

