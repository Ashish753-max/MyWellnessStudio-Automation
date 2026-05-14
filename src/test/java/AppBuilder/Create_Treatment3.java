package AppBuilder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Treatment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		// open the website 
		driver.get("https://mydentalwellness-r897.vercel.app/");
		WebDriverWait wait1 =new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Click on the login button 
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/nav/div/div[2]/div/a[1]/button"))).click();
		
		
		/// Enter the email
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]"))).sendKeys("ashishappnox1@gmail.com");
		
		
		// Enter the password
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]"))).sendKeys("Ashish@567");
		
		
		// click on login button
		WebElement login= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/form/button"));
		login.click();
		
		// Click on the App builder section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[2]/nav/div[2]"))).click();
		
		
		// click on the treatment section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/button[6]"))).click();
	
		
		
		// click on the create new treatment
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[2]/div[1]/div[2]/button[2]"))).click();
		
		
		// Enter the Treatment name 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Treatment name']"))).sendKeys("Advanced Laser Therapy");
		
		//click on service unit type
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div[1]/div/div[1]/div[2]/div/button"))).click();
		
		// select the service unit type (Treatment)
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/button[5]"))).click();
		
		// Add treatment variation
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div[1]/div/div[3]/button"))).click();
		
		// Enter the treatment variation name
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Variation name'])[1]"))).sendKeys("Alma OPUS Plasma Full Face");
		
		// Enter treatment price
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='$ 0.00'])[1]"))).sendKeys("2400");
					
					// Enter the Quantity
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='0'])[1]"))).sendKeys("1");
					
					// Enter variation name 2 
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Variation name'])[2]"))).sendKeys("Alma OPUS Plasma Neck");
					
					// Enter treatment price for variation 2
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='$ 0.00'])[2]"))).sendKeys("2100");
					
					// Enter the Quantity for variation 2
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='0'])[2]"))).sendKeys("1");
					
					// click on save treatment variation
				WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(
						    By.xpath("//button[normalize-space()='SAVE TREATMENT VARIATIONS']")
						));

						((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);	  
					
					
		
		

	}

}
