package Auth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
	//	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));

		
		// open the website 
		driver.get("https://mydentalwellness.mwstraining.com/");
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// Click on the login button 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/nav/div/div[2]/div/a[1]/button"))).click();
		Thread.sleep(2000);
		
		// Enter the email
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]"))).sendKeys("ashishappnox1@gmail.com");
		//WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		//email.sendKeys("ashishappnox1@gmail.com");
		
		// Enter the password
		WebElement password =driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("Ashish@567");
		
		// click on login button
		WebElement login= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/form/button"));
		login.click();
		
		
		
		
		

	}

}
