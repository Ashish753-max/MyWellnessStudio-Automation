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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[4]/nav/div[2]")).click();
		Thread.sleep(2000);
		
		// click on new story
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/button")).click();
		Thread.sleep(1000);
		
		// Enter the story title
		driver.findElement(By.xpath("//input[@placeholder='e.g., Client Success Journey']")).sendKeys("Patient Treatment Story");
		Thread.sleep(1000);
		
		// Upload the image 		
				WebElement uploadImage = driver.findElement(By.xpath("//input[@type='file']"));

				String imagePath = "C:\\Users\\user\\Pictures\\Screenshots\\download.jpg";
				uploadImage.sendKeys(imagePath);

				Thread.sleep(2000); 
		
		//Enter the description
		driver.findElement(By.xpath("//textarea[@placeholder='Tell the story of the transformation...']")).sendKeys("The client treatment story description provides a detailed overview of the client’s treatment journey, including the initial consultation, diagnosis, treatment plan, procedures performed, and overall progress.");
		Thread.sleep(1000);
		
		// click on the create story button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]")).click();
		Thread.sleep(2000);
		
		
		// click on the archive button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/div[1]/div[1]/table/tbody/tr/td[4]/div/div/button[2]")).click();
		Thread.sleep(1000);
		
		// click on the confirm button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[2]/div[2]/div[2]/div/button[2]")).click();
	Thread.sleep(1000);
	
	// Click on the archive option
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/div[1]/button[2]")).click();
			Thread.sleep(1000);
	
	// Click on the unarchive options
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[4]/div/div/button[2]")).click();
	Thread.sleep(1000);
	
	//click on the confirm button
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[2]/div[2]/div[2]/div/button[2]")).click();
	Thread.sleep(1000);

	}

}
