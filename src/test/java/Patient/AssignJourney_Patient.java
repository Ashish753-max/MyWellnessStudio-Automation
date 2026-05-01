package Patient;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignJourney_Patient {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mydentalwellness.mwstraining.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Click on the login button 
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"root\"]/div[2]/nav/div/div[2]/div/a[1]/button")));
        loginButton.click();
        
        // Enter the email
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("ashishappnox1@gmail.com");
        
        // Enter the password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Ashish@567");
        
        // click on login button
        WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/form/button"));
        login.click();
        
        
     // Click on the patient section 
     		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[1]/nav/div[2]/a")).click();
     		Thread.sleep(2000);
     		
	}

}
