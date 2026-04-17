package Patient;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Patient_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// open the website 
		driver.get("https://mydentalwellness.vercel.app/");
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		
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
			
		// Click on the patient section 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[1]/nav/div[2]/a")).click();
		Thread.sleep(2000);
		
		// click on the patient (First patient)
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/div/div/div")).click();
		Thread.sleep(1000);
		
		// click on the view app as patient 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/button[2]")).click();
		Thread.sleep(1000);

	}

}
