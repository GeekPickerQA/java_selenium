package TestCase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeLanguage {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl;
		
		baseUrl = "https://www.alza.cz/EN/";
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id=\"languages\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"languageList\"]/div[1]/a[2]")).click();
		System.out.println("Change Language successfully");
		
		driver.quit();

	}

}
