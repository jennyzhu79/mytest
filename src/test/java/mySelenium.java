

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;


public class mySelenium {
	
	
	
	@Test(groups={"smoke"})
	public void testChrome() throws InterruptedException {

		System.setProperty( "webdriver.chrome.driver", ".\\res\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get( "http://www.baidu.com/" );
		
		driver.findElement(By.id("kw1")).sendKeys( "163");
		driver.findElement(By.id("su1")).click();
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='3']/h3/a")).click();


		String[] handles = new String[driver.getWindowHandles().size()];
		System.out.println(handles.length);
		driver.getWindowHandles().toArray(handles);
		WebDriver handle1=driver.switchTo().window(handles[1]);
		System.out.println(handle1.getTitle());

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='news']/h2[1]/a")).click();
		
		Thread.sleep(5000);
		
		String[] handles2 = new String[driver.getWindowHandles().size()];
		System.out.println(handles2.length);
		driver.getWindowHandles().toArray(handles2);
		WebDriver handle2 = driver.switchTo().window(handles2[2]);
		System.out.println(handle2.getTitle());

		driver.findElement(By.xpath("//*[@id='tiePostBox']/div[2]/div[2]/div[1]/div[2]/a")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}	

}


