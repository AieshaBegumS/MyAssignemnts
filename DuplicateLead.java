package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		//Open Chrome Browser
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		// URL which will be opened.
		driver.get("http://leaftaps.com/opentaps/control/main");
		//To maximize the browsers
		driver.manage().window().maximize();
		//Enter the user name
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("democsr");
		//Enter PAssword
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf Organization");
		//First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aiesha Begum");
		//Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shaik");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aiesha");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aieshabegums1401@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("The title of this webpage is " + title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaf Organization");		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Begum Aiesha");
		driver.findElement(By.className("smallSubmit")).click();
		String retitle = driver.getTitle();
		System.out.println("The title of this webpage is " + retitle);

	}

}
