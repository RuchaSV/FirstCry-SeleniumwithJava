package FirstCry;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Class5 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriverchrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tranktechnologies.com/");
		Thread.sleep(2000);
Robot r=new Robot();
             WebElement Aboutus = driver.findElement(By.xpath("//ul[@class='cm-flex-type-2']//a[normalize-space()='About us']")); 
			Aboutus.click();
			WebElement Webdevelopment = driver.findElement(By.xpath("//a[normalize-space()='Web Development']")); 
			Webdevelopment.click();
			WebElement name = driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//input[@placeholder='Your Name']")); 
			name.sendKeys("Shishir");
			WebElement mail = driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//input[@placeholder='Your Mail']")); 
			mail.sendKeys("Shishir@gmail.com");
			WebElement company = driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//input[@placeholder='Your Company']")); 
			company.sendKeys("Shishir Vyaghrambare&co");
			WebElement webdevelopment = driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//select[@name='service']")); 
			webdevelopment.sendKeys("Web Development");
			WebElement phone = driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//input[@placeholder='Your Phone']")); 
			phone.sendKeys("9322996494");
			WebElement msg = driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//textarea[@placeholder='Message']")); 
			msg.sendKeys("Hi");
			r.keyPress(KeyEvent.VK_ENTER);
			WebElement captcha = driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//textarea[@placeholder='Message']")); 
			captcha.click();
			WebElement submit = driver.findElement(By.xpath("//form[@id='get_in_touch_banner']//input[@name='getintouch']")); 
			submit.click();
			WebElement vertical = driver.findElement(By.xpath("//li[@class='drop_down show_dropdown']//i[@class='fa fa-chevron-down']")); 
			Actions a=new Actions(driver);
			a.moveToElement(vertical);
			

    
		
	}

}
