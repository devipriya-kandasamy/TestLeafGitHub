package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();	
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Info");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fname");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dev");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	driver.findElement(By.name("description")).sendKeys("joining in IT Department");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("a@a.com");
	
	
	WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd = new Select(dropdown);
	dd.selectByVisibleText("New York");		
	driver.findElement(By.name("submitButton")).click();
	
	String title = driver.getTitle();
	System.out.println(title);
	}

}
