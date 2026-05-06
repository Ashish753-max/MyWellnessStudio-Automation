package AppBuilder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Package1 {

	public static void main(String[] args) {
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
     	
       	  	// click on the package section
        WebElement package1 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[2]/button[7]")
        ));
        package1.click();
        
        // click on the create new package
        WebElement createPackage = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div/div[2]/div[1]/div[2]/button[2]")
		));
        createPackage.click();
		
		// Enter the package name 
		WebElement packageName = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='Package name']")
		));
		packageName.sendKeys("Core to Floor");
		
		// Enter the price
		WebElement price = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='Package Price']")
		));
		price.sendKeys("5900");
		
		// Enter the quantity
		WebElement quantity = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='Max Qty']")
		));
		quantity.sendKeys("1");
		
		// click on add treatment to package
		WebElement btn = wait.until(ExpectedConditions.presenceOfElementLocated(
		        By.xpath("//span[contains(text(),'Add treatment to package')]")
		));

		((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
		
		// click on treatment dropdown
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/div/div/div/div[2]/div[1]/div/button")
		)).click();
		
		// select the treatment
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[2]/div/button[1]")
		)).click();
		
		// click on save treatment package
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/div/div/div/div[3]/button[2]")
		)).click();
		
		// enter the image
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div/div/div[3]/div[2]/div/div[1]/div/div[7]/div/div/div")
		)).sendKeys("C:\\Users\\user\\Downloads\\6f764e27-2238-4e16-948a-0c1cd52e4589 (1).jpg");
		

	}

}
