package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchItem {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl;
		
		baseUrl = "https://www.alza.cz/EN/";
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		
		Thread.sleep(2000);
		
		WebElement searchInput = driver.findElement(By.xpath("//input[@id=\"edtSearch\"]"));
	    searchInput.sendKeys("Nokia");
	    driver.findElement(By.xpath("//div[@id=\"btnSearch\"]")).click();
	    
	    
	    if(driver.getPageSource().contains("We can deliver Nokia products on the same day they are ordered."))
	    {
	    	System.out.println("Text Present");
	    }else {
	    	System.out.println("Text Not Present");
	    }
	    
	    driver.quit();
	}

}
