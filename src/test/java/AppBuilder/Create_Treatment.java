package AppBuilder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Treatment {

	   public static void main(String[] args) throws InterruptedException {
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Treatment name']"))).sendKeys("Teeth Whitening");
		
		//click on set up pricing 
			wait.until(ExpectedConditions.presenceOfElementLocated(
					    By.xpath("//div[contains(@class,'rounded-full') and contains(@class,'bg-primary')]"))).click();
					
				
		// Enter treatment price
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='$ 0.00']"))).sendKeys("15");
		
		// Enter the Quantity
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='0']"))).sendKeys("100");
		
		// click on save treatment price
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div/div/div[3]/button"))).click();
		
		
		// click on upload banner image
		// Upload the image 	
				WebElement uploadImage = driver.findElement(
			    By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div[1]/div/div[6]/div/div/div/div[1]/div[2]/div/div/button")
							);

			    uploadImage.sendKeys("C:\\Users\\user\\Downloads\\6f764e27-2238-4e16-948a-0c1cd52e4589 (1).jpg");
				Thread.sleep(2000);
		
		
		

	}

}
