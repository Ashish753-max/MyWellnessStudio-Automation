package AppBuilder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Membership3 {

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
        
        //click on the create new membership
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[2]/div[1]/div[2]/button[2]"))).click();
        
        // Enter the membership name
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter membership name']"))).sendKeys("Glow");
        
        //Enter the price
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='0.00']"))).sendKeys("99");
        
        //Click on Commitment period
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div[1]/div/div[1]/div[2]/div[2]/label[2]/div"))).click();
        
        // enter the commitment period
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='0']"))).sendKeys("6");
        Thread.sleep(1000);
        
        // Enter the description
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div[1]/div/div[1]/div[4]/textarea"))).sendKeys("Radiate confidence with our Glow Membership! Enjoy a revitalizing treatment each month, plus exclusive savings on your favorite skincare services and products.");
        
        
        // Click on the save button
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/form/div[2]/button[2]"))).click();

	}

}
