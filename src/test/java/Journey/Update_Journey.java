package Journey;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Update_Journey {

	public static void main(String[] args) throws InterruptedException {
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
			
		// Click on the Journey section 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[4]/nav/div[4]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(
			    By.xpath("//*[@id='root']/div[2]/div/main/div/div/div[2]/div[1]/table/tbody/tr[1]/td[5]/div/div/div[1]/button")))
			    .click();
		Thread.sleep(3000);
		
		// click on the remove image button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div[1]/div/div/div/div/div/button[2]"))).click();
		// Upload the image 		
				WebElement uploadImage = driver.findElement(By.xpath("//input[@type='file']"));

				String imagePath = "C:\\Users\\user\\Pictures\\Screenshots\\download.jpg";
				uploadImage.sendKeys(imagePath);
		
		// click on the save button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]"))).click();

	}

}
