package Post;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Post_Details {

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
	        
	        // Click on the Post section 
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[4]/nav/div[1]"))).click();
	        
	        // click on the new post 
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/div[2]/button"))).click();
	        
	        // Enter the post image
	        WebElement uploadImage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
	        String imagePath = "C:\\Users\\user\\Pictures\\Screenshots\\download.jpg";
	        uploadImage.sendKeys(imagePath);
	        
	        // Enter the description
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//textarea[@placeholder='Craft a compelling story about this transformation or insight...']")))
	                .sendKeys("This is post description");
	        
	        // click on the Linked Success Stories dropdown
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div[5]/div[2]/div[1]/div/div")))
	                .click();
	        Thread.sleep(1000);
	        
	     // wait for option to appear
	        WebElement option = wait.until(ExpectedConditions.presenceOfElementLocated(
	                By.xpath("/html/body/div[2]/div[2]/button[1]")
	        ));
	        option.click();

	        // click on the Linked Treatment Journey
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div[5]/div[2]/div[2]/div/button"))).click();
	        Thread.sleep(1000);
	        
	        //wait for option to appear
	        WebElement option1=wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("/html/body/div[2]/div/button[1]")
					));
	        
	        option1.click();
			
			// click on the publish button
			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]"))).click();

	}

}
