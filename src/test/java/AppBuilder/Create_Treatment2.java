package AppBuilder;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Treatment2 {

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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Treatment name']"))).sendKeys("Botox");
			
			//click on set up pricing 
			// click on set up pricing
			WebElement btn = wait.until(
			    ExpectedConditions.elementToBeClickable(
			        By.xpath("//p[contains(text(),'Set Up Pricing')]")
			    )
			);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
						
					
			// Enter treatment price
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='$ 0.00']"))).sendKeys("15");
			
			// Enter the Quantity
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='0']"))).sendKeys("100");
			
			// click on save treatment price
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div/div/div[3]/button"))).click();
			
			
			// Upload the image 		
					// Click upload area (if needed)
			/*		WebElement btn1 = wait.until(ExpectedConditions.presenceOfElementLocated(
					        By.xpath("//span[contains(text(),'Select Image')]")
					));

					((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", btn1);    */
			List<WebElement> inputs = driver.findElements(By.xpath("//input[@type='file']"));

			inputs.get(1).sendKeys(
			    "C:\\Users\\user\\Downloads\\6f764e27-2238-4e16-948a-0c1cd52e4589 (3).jpg"
			);
			
			// Enter the description
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div[1]/div/div[8]/div/textarea"))).sendKeys("Botox is commonly used to reduce the appearance of fine lines and wrinkles. This treatment relaxes the muscles in the treated area to soften wrinkles for 3-4 months.");
			
			// Click on the Add new treatment button
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div[2]/button[2]"))).click();

	}

}
