package AppBuilder;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadConcernImage_Home {

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
     	
       	  	// click on the concern section
        WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='root']/div[2]/div/main/div/div/div[3]/div/div/div/div[4]/div[2]/div[1]/div[2]/div/button")
        ));

        editBtn.click();

        // get all file inputs
        List<WebElement> inputs = driver.findElements(By.cssSelector("input[type='file']"));

        // usually the upload component that opened is the last one rendered
        WebElement uploadImage = inputs.get(inputs.size() - 1);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].style.display='block';" +
                "arguments[0].style.visibility='visible';" +
                "arguments[0].removeAttribute('hidden');",
                uploadImage
        );

        uploadImage.sendKeys("C:\\Users\\user\\Downloads\\00005468-656d-6552-6573-6f7572636537 (1).jpg");

	}

}
