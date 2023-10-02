package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		 //Initialize driver
		 ChromeDriver driver = new ChromeDriver();
		 //Load url
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 //Maximize url
		 driver.manage().window().maximize();
		 //Username
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 //Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 //Login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //CRM/SFA link
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 //Accounts tab
		 driver.findElement(By.linkText("Accounts")).click();
		 //Create Account
		 driver.findElement(By.linkText("Create Account")).click();
		 //Account name
		 driver.findElement(By.id("accountName")).sendKeys("Revathi P");
		 //Account description
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 
		 //Select Industry
		 WebElement industry = driver.findElement(By.name("industryEnumId")); 
		 Select indus = new Select(industry);
		 indus.selectByValue("IND_SOFTWARE");
		 
		 //Select Ownership
		 WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
         Select owner = new Select(ownership);
		 owner.selectByVisibleText("S-Corporation");
		 
		 //Select Employee
		 WebElement employee = driver.findElement(By.id("dataSourceId"));
		 Select emp = new Select(employee);
		 emp.selectByValue("LEAD_EMPLOYEE");
		 
		 //Select Marketing Campaign
		 WebElement marketingcampaign = driver.findElement(By.id("marketingCampaignId"));
		 Select marketcamp = new Select(marketingcampaign);
		 marketcamp.selectByIndex(6);
		 
		 //Select State/Province
         WebElement stateprovince = driver.findElement(By.id("generalStateProvinceGeoId"));
         Select stateprov = new Select(stateprovince);
         stateprov.selectByValue("TX");
         
         //Create Account button
         driver.findElement(By.className("smallSubmit")).click();
         
         Thread.sleep(2000);
         
         //close browser
         driver.close();
        
	}    
	
}
