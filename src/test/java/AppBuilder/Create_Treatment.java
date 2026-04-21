package AppBuilder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Treatment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		// open the website 
		driver.get("https://mydentalwellness.vercel.app/");
		WebDriverWait wait1 =new WebDriverWait(driver, Duration.ofSeconds(10));
		
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
		Thread.sleep(3000);
		
		// Click on the App builder section
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[2]/nav/div[2]")).click();
		Thread.sleep(2000);
		
		// click on the treatment section
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/button[6]")).click();
		Thread.sleep(2000);
		
		// click on the create new treatment 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[2]/div[1]/div[2]/button[2]")).click();
		Thread.sleep(1000); 
		
		// Enter the story title
				driver.findElement(By.xpath("//input[@placeholder='Treatment name']")).sendKeys("Heart Checkup");
				Thread.sleep(2000);
		
		// Upload the image 	
		WebElement uploadImage = driver.findElement(
	    By.xpath("//div[contains(@class,'border-dashed')]//input[@type='file']")
					);

	    uploadImage.sendKeys("C:\\Users\\user\\Pictures\\Screenshots\\download.jpg");
		Thread.sleep(2000);

		
		
		
		
		

	}

}
