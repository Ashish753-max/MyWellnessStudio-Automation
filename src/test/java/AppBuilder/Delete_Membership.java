package AppBuilder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete_Membership {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
        
        // maximize the window
        driver.manage().window().maximize();
        
        // open the website 
        driver.get("https://mydentalwellness-r897.vercel.app/");
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
        
     // Click on the App builder section
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[2]/nav/div[2]"))).click();
     	
       	  	// click on the Membership section
        WebElement package1 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/button[5]")
        ));
        package1.click();
        
        
        
        // click on the archived tab
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/button[2]"))).click();
        Thread.sleep(1000);
        // click on the delete button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[11]/div/div/div[2]/button"))).click();
        
        // click on the confirm unarchive button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/button[2]"))).click();

	}

}
