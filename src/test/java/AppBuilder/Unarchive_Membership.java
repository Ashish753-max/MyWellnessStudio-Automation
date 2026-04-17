package AppBuilder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Unarchive_Membership {

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
		
		// Click on the App builder section
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[2]/nav/div[2]")).click();
		Thread.sleep(2000);
		
		// click on the Membership section
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/button[5]")).click();
		Thread.sleep(2000);
		
		// click on the archive button of the membership (first)
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[12]/div/div/div[2]/button")).click();		
		Thread.sleep(1000);
		
		// click on the archive plan button 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/button[2]")).click();
		Thread.sleep(1000);
		
		// click on the archive section 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/button[2]")).click();
		Thread.sleep(1000);
		
		// click on the unarchive button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]/table/tbody/tr/td[12]/div/div/div[2]/button")).click();
		Thread.sleep(1000);
		
		// Click on the unarchive plan button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/button[2]")).click();
		Thread.sleep(1000);

	}

}
