package Stories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Remove_StoryImage {

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
     		Thread.sleep(1000);
     		
     		// Upload the image 		
     		WebElement uploadImage = driver.findElement(By.xpath("//input[@type='file']"));

     		String imagePath = "C:\\Users\\user\\Downloads\\95fc8fc4-2fe1-4fe9-991b-e6fd97df56f0 (3).png";
     		uploadImage.sendKeys(imagePath);

     		Thread.sleep(2000);
     		
     		//Enter the description
     		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Tell the story of the transformation...']"))).sendKeys("This patient treatment story highlights the transformative journey of a patient who underwent a successful dental treatment, showcasing the positive impact on their oral health and overall well-being.");
     		
     		
     		// click on the create story button
     		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]"))).click();
		Thread.sleep(2000);
		
		
		// click on the edit story button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/div[1]/table/tbody/tr[1]/td[4]/div/div/div[1]/button"))).click();
		
		// Click on the remove image button
		// Locate the image area where hover is needed
		WebElement imageArea = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div[2]/div/div/div")
		    )
		);

		// Hover on image
		Actions actions = new Actions(driver);
		actions.moveToElement(imageArea).perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div[2]/div/div/div/div/button[2]"))).click();
		

	}

}
