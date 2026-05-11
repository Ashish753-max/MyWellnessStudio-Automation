package Stories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Unarchive_Story {

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
			
		// Click on the Stories section 
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[4]/nav/div[2]"))).click();
		
		
		// click on new story
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/div[2]/button"))).click();
		
		
		// Enter the story title
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='e.g., Client Success Journey']"))).sendKeys("Patient Treatment Story");
		
		// Upload the image 		
				WebElement uploadImage = driver.findElement(By.xpath("//input[@type='file']"));

				String imagePath = "C:\\Users\\user\\Pictures\\Screenshots\\download.jpg";
				uploadImage.sendKeys(imagePath);

				Thread.sleep(2000); 
		
		//Enter the description
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Tell the story of the transformation...']"))).sendKeys("The client treatment story description provides a detailed overview of the client’s treatment journey, including the initial consultation, diagnosis, treatment plan, procedures performed, and overall progress.");
		
		
		// click on the create story button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]"))).click();
		Thread.sleep(2000);
		
		
		// click on the archive button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]/div/div/div[2]/button"))).click();
		
		
		// click on the confirm button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[2]/div[2]/div[2]/div/button[2]"))).click();
		Thread.sleep(2000);
	
	// Click on the archive option
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/div[1]/button[2]"))).click();
			
	
	// Click on the unarchive options
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]/div/div/div/button"))).click();
	
	
	//click on the confirm button
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[2]/div[2]/div[2]/div/button[2]"))).click();
	

	}

}
