package Stories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Update_StoryImage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// open the website 
		driver.get("https://mydentalwellness-r897.vercel.app/");
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Click on the login button 
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/nav/div/div[2]/div/a[1]/button"))).click();
		
		
		// Enter the email
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]"))).sendKeys("ashishappnox1@gmail.com");
		
		
		// Enter the password
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]"))).sendKeys("Ashish@567");
		
		
		// click on login button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/form/button"))).click();
		
			
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
		
		// Click on the Update image button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div[2]/div/div/div/div/button[1]")).click();
		Thread.sleep(2000);
		
		// Upload new  image 		
				WebElement uploadImage1 = driver.findElement(By.xpath("//input[@type='file']"));

				String imagePath1 = "C:\\Users\\user\\Pictures\\Screenshots\\download (3).jpg";
				uploadImage1.sendKeys(imagePath1);

	}

}
