package Journey;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Journey2 {

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
			
		// Click on the Journey section 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[4]/nav/div[4]"))).click();
		
		// click on the create new journey
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/button"))).click();
		
		// Upload the image 		
		WebElement uploadImage = driver.findElement(By.xpath("//input[@type='file']"));

		String imagePath = "C:\\Users\\user\\Downloads\\lli97cmwn8ez7r6nzv8uz6ujuv2j (1).jpg";
		uploadImage.sendKeys(imagePath);
		
		// Enter the Journey title
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='e.g., Weekly Acne Recovery Routine']"))).sendKeys("BBL - Hair Removal");
		
		// enter the description
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='A brief explanation of this journey...']"))).sendKeys("Targets unwanted hair using light technology");
		
		// click on the linked treatment dropdown
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div[4]/div/button"))).click();
		// Click option (example: Facial)
		wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("/html/body/div[2]/div/button[2]")))
		    .click();
		
		// click on the save button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]"))).click();

	}

}
