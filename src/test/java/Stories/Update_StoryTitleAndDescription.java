package Stories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Update_StoryTitleAndDescription {

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

				String imagePath = "C:\\Users\\user\\Downloads\\95fc8fc4-2fe1-4fe9-991b-e6fd97df56f0 (3).png";
				uploadImage.sendKeys(imagePath);
		
		
		//Enter the description
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Tell the story of the transformation...']"))).sendKeys("The client treatment story description provides a detailed overview of the client’s treatment journey, including the initial consultation, diagnosis, treatment plan, procedures performed, and overall progress.");
		
		
		// click on the create story button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]"))).click();
		
		Thread.sleep(3000);
		// click on the edit button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]/div/div/div[1]"))).click();
		
		// select the title field
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='e.g., Client Success Journey']")));

		WebElement field = null;
		// Clear old text
		field.clear();

		// Enter new text
		field.sendKeys("Updated Story description");
		Thread.sleep(1000);
		
		// select the description field 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Tell the story of the transformation...']")));

		WebElement field1 = null;
		// Clear old text
		field1.clear();

		// Enter new text
		field1.sendKeys("Updated Story description");

		// Click on update story button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]"))).click();

	}

}
