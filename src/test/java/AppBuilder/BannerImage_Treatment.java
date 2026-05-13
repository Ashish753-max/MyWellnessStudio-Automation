package AppBuilder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BannerImage_Treatment {

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
        wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[2]/nav/div[2]"))).click();
        Thread.sleep(2000);
     		
     		
     		// click on the treatment section
        wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/button[6]"))).click();
        
   /*     // click on upload
        wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[1]/div[2]/div[1]/div[2]/div/button"))).click();   */
        
        Thread.sleep(2000);
        
     // Upload the image 		
        WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		fileInput.sendKeys("C:\\\\Users\\\\user\\\\Downloads\\\\b8e8ec2e-bb17-4b84-b04b-d22f8841bf70 (4).jpg");
        
     		

	}

}
