package week4.day1;

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
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following:: img[1]")).click();
		System.out.println(driver.getWindowHandle());

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandle = new ArrayList<String>(windowHandles);

		driver.switchTo().window(windowHandle.get(1));
		System.out.println(driver.getWindowHandle());
		
		
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[2]/a")).click();

		
//		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following:: img[2]")).click();

		
	}

}
