package Auth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckLogoutFlow {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        for (int i = 1; i <= 5; i++) {   // loop added
            System.out.println("Run: " + i);

            ChromeDriver driver = new ChromeDriver();
            
            // maximize the window
            driver.manage().window().maximize();
            
            // open the website 
            driver.get("https://pipeclose.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            Thread.sleep(4000);
            
            // Click on the login button 
            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav/div/div[2]/button[1]"));
            loginButton.click();
            Thread.sleep(2000);
            
            // Enter the email
            WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/form/div[1]/input"));
            email.sendKeys("ashishappnox1@gmail.com");
            
            // Enter the password
            WebElement password =driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/form/div[2]/input"));
            password.sendKeys("Ashish@567");
            Thread.sleep(1000);
            
            // click on login button
            WebElement login= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/form/button"));
            login.click();
            Thread.sleep(8000);
            
            /*	WebDriverWait wait1 = driver.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/header/div/div[3]/div[2]/button"));
                wait1.click();  */
            
            WebElement profile = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/header/div/div[3]/div[2]/button"));
            profile.click();
            
            WebElement logout = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/header/div/div[3]/div[2]/div/div[2]/button[3]"));
            logout.click();
            
            driver.quit();  // close the browser after each run 

            
        }
    }
}