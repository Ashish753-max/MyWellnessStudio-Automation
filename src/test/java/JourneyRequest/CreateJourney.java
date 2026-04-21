package JourneyRequest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateJourney {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// open the website 
		driver.get("https://mydentalwellness.vercel.app/");
		// Click on the login button 
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/nav/div/div[2]/div/a[1]/button"));
		loginButton.click();
		Thread.sleep(2000);
		
		// Enter the email
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("ashishappnox1@gmail.com");
		
		// Enter the password
		WebElement password =driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("Ashish@567");
		
		// click on login button
		WebElement login= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/form/button"));
		login.click();
		Thread.sleep(4000);
			
		// Click on the Journey request section 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[1]/nav/div[5]")).click();
		Thread.sleep(2000);
		
		// Click on the new journey button to create the journey 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/button")).click();
		Thread.sleep(1000);
		
		// Enter the post image
		
		WebElement uploadImage = driver.findElement(By.xpath("//input[@type='file']"));

		String imagePath = "C:\\Users\\user\\Pictures\\Screenshots\\download.jpg";
		uploadImage.sendKeys(imagePath);
		Thread.sleep(1000);
		
		// Enter the journey name 
		driver.findElement(By.xpath("//input[@placeholder='e.g., Weekly Acne Recovery Routine']")).sendKeys("Treatment Journey");
		Thread.sleep(1000);
		
		// Enter the description
		driver.findElement(By.xpath("//textarea[@placeholder='A brief explanation of this journey...']")).sendKeys("A treatment journey is the comprehensive, multi-stage experience of a patient—from symptom awareness and diagnosis through treatment, recovery, and long-term management. It includes key phases like seeking care, testing, treatment, and follow-up, aiming to improve health outcomes and patient experience through coordinated care and support. ");
		Thread.sleep(1000);
		
		
		
		// Click dropdown
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div[4]/div/button"));
		dropdown.click();
		Thread.sleep(1000);

		// Select option
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement option = wait1.until(ExpectedConditions
		        .elementToBeClickable(By.xpath("//li[text()='Botox']")));

		option.click();

	}

}
