package Videos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateVideo {

	public static void main(String[] args) throws InterruptedException {
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
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Ashish@567");
        
        // click on login button
        WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/form/button"));
        login.click();
        
        // Click on the Videos section
        WebElement video = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/aside/div[2]/div[4]/nav/div[3]")));
        video.click();
        
        // click on the new video
       WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[1]/div[2]/button")));     
       upload.click();
       
       WebElement uploadVideo = driver.findElement(By.xpath("//input[@type='file']"));

       ((JavascriptExecutor) driver).executeScript(
           "arguments[0].style.display='block';", uploadVideo);

       uploadVideo.sendKeys("C:\\Users\\user\\Downloads\\test.mp4");
       
       // Enter the video title
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter descriptive title...']")))
			   .sendKeys("Test Video Title");
       
       // Enter the video description
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Describe the content and key takeaways...']")))
			   .sendKeys("This is video description");
	   
	   // Enter the name of creator
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name of creator...']")))
			   .sendKeys("Kunal Sharma");
	   
	   // click on the save button
	   wait.until(ExpectedConditions.elementToBeClickable(
			   By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]"))).click();
	   Thread.sleep(15000);
	   
	   // click on the edit button of the video
	   wait.until(ExpectedConditions.elementToBeClickable(
			   By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/div[1]/table/tbody/tr/td[5]/div/div/div/button"))).click();
	   
	   // Update the video
	//   wait.until(ExpectedConditions.elementToBeClickable(
	//		   By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[1]/div[1]/div/div/div/button[2]"))).click();
	   
	   WebElement uploadVideo1 = driver.findElement(By.xpath("//input[@type='file']"));

       ((JavascriptExecutor) driver).executeScript(
           "arguments[0].style.display='block';", uploadVideo1);

       uploadVideo1.sendKeys("C:\\Users\\user\\Downloads\\IMG_2073.mov");
	   
	// click on the save button
	   wait.until(ExpectedConditions.elementToBeClickable(
			   By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div[3]/div[2]/form/div[2]/button[2]"))).click();
	   

	}

}
