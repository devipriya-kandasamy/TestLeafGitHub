package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
//		1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
//		3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
//		 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
//		6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
//		7. Click on Widget of From Contact
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following:: img[1]")).click();
		//System.out.println(driver.getWindowHandle());

//		 8. Click on First Resulting Contact
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> Handle1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(Handle1.get(1));
						
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
//		9. Click on Widget of To Contact
		
		driver.switchTo().window(Handle1.get(0));

		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following:: img[2]")).click();
	
//		10. Click on Widget of To Contact
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> Handle2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(Handle2.get(1));
		//System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
//		11. Click on Merge button using Xpath Locator
		driver.switchTo().window(Handle2.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
//		 12. Accept the Alert
		
		driver.switchTo().alert().accept();
		
//		13. Verify the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View Contact | opentaps CRM"))
			System.out.println("Success");
		else
			System.out.println("Failed");

		driver.quit();
	}

}
