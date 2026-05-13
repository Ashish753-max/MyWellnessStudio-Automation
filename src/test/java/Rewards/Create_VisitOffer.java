package Rewards;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_VisitOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mydentalwellness-r897.vercel.app/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Click on the login button 
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"root\"]/div[2]/nav/div/div[2]/div/a[1]/button")));
        loginButton.click();
        
        // Enter the email
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("ashishappnox1@gmail.com");
        
        // Enter the password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("Ashish@567");
       
        
        // click on login button
        wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/form/button"))).click();
			
		// Click on the Rewards section 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[3]/nav/div[1]"))).click();
		
		// click on the create visit offer button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div/div[1]/div[2]/button"))).click();
		
		// Enter the Reward Tile (Reward Valid - In App )
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='e.g. 15% off a chemical peel']"))).sendKeys("1 Emsella Session");
		
		// Enter the Reward Description (Reward Valid - In App )
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Enter disclaimer...']"))).sendKeys("Redeem 550 points for a single Emsella session to support pelvic floor strength and wellness.");
       
		
	/*	// click on valid location 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div[2]/form/div[1]/div/div[3]/div/label/div"))).click();    */
		
		// Enter the discount percentage value
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='0']"))).sendKeys("10");
		
		Thread.sleep(2000);
		// click on select service dropdown 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div[2]/form/div[1]/div/div[5]/div[3]/div[2]/div/button"))).click();
		
		//select the service from the dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/button[1]"))).click();
	}

}
