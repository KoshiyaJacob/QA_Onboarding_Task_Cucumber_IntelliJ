package Hooks;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public  class Hooks 
{
	
	 public static  WebDriver driver;
	 public  WebElement sign_In_Button = driver.findElement(By.linkText("Sign In"));
	 public  WebElement email_Field = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
	 public  WebElement password_Field = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
	 public  WebElement login_Button = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	 
	   @After
	   public void Setup()  
	    {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("http://localhost:5000");

	        sign_In_Button.click();

	        email_Field.sendKeys("koshiya14@gmail.com");
	        password_Field.sendKeys("Godislove@1");
	        login_Button.click();
	        //Thread.sleep(5000);
	    }

        @Before
	    public void TearDown()
	    {
	        driver.close();

	    }
	 
	 
	 
	 

	
}


