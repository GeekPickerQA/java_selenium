package TestCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl;
		
		baseUrl = "https://www.alza.cz/EN/";
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		driver.navigate().to("https://www.alza.cz/EN/alza-for-business-home-page");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		System.out.println("Navigation Done");
		driver.quit();
		

	}

}
