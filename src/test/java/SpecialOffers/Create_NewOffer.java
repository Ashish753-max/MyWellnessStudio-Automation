package SpecialOffers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_NewOffer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mydentalwellness-r897.vercel.app/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        
        // Click on the login button 
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"root\"]/div[2]/nav/div/div[2]/div/a[1]/button")));
        loginButton.click();
        
        // Enter the email
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("ashishappnox1@gmail.com");
        
        // Enter the password
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        password.sendKeys("Ashish@567");
        
        // click on login button
        
        WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/form/button")));
        login.click();
			
		// Click on the Special offers section 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[3]/nav/div[2]"))).click();
		
		// click on the create new offer button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/button"))).click();
		
		//select card content 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[2]/div/div[2]/div/div[2]/div[1]/button"))).click();
		
		//Enter the title
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter title']"))).sendKeys("Offer for Botox Treatment");
		Thread.sleep(1000);
		
		//Enter the headline
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div/div[1]/div[2]/div[2]/div/textarea"))).sendKeys("Here are several Botox treatment offer headlines, categorized by the angle of the promotion, based on industry trends for 2026:");
		
		
		// Upload the image 		
				WebElement uploadImage = driver.findElement(By.xpath("//input[@type='file']"));

				String imagePath = "C:\\Users\\user\\Pictures\\Screenshots\\download.jpg";
				uploadImage.sendKeys(imagePath);
				
				// Click on the call to action button
				wait.until(ExpectedConditions.presenceOfElementLocated(
				        By.xpath("//span[contains(text(),'Select action type')]")
				)).click();
		
		

	}

}
