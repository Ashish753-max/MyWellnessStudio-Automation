package ExploratoryTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VideosSection {

	public static void main(String[] args) {
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
        
        // Click on the Videos section
        WebElement video = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[4]/nav/div[3]")));
        video.click();
        

	}

}
