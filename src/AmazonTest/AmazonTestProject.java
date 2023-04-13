package AmazonTest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme");

		driver.findElement(By.id("nav-search-submit-button")).click();
		
		@SuppressWarnings("unchecked")
		List<WebElement> product_Names = (List<WebElement>) driver.findElement(By.xpath("//div[@class='a-section']//h2//span"));
	       @SuppressWarnings("unchecked")
		List<WebElement> product_prices = (List<WebElement>) driver.findElement(By.xpath("//div[@class='a-section']//h2//span[@class='a-price-whole']"));
	   		for(int i=0;i<product_Names.size();i++)
	   		{
	   			System.out.println("product : " + product_Names.get(i).getText());
	   			System.out.println("prices : " + product_prices.get(i).getText());
	   		}
		
		driver.get(
				"https://www.amazon.in/realme-Storage-Display-Charger-Included/dp/B0BG1NWLY3/ref=sr_1_1?crid=21S9QTLHVYJD8&keywords=realme&qid=1680890203&sprefix=%2Caps%2C249&sr=8-1&th=1");

		driver.findElement(By.id("buy-now-button")).click();

		driver.findElement(By.id("ap_email")).sendKeys("ujwalapravin0505@gmail.com");

		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("ap_password")).sendKeys("Ujjwala@123");

		driver.findElement(By.id("signInSubmit")).click();

		driver.findElement(By.id("orderSummaryPrimaryActionBtn")).click();

					
	}

	}


