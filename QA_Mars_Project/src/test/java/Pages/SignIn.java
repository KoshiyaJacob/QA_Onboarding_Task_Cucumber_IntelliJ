package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import Hooks.Hooks;

public class SignIn extends Hooks
{
    public WebElement Profile_Verification = driver.findElement(By.xpath("//a[contains(text(),'Mars Logo')]"));

    public void LoginFunction( )
    {
        String Text_Verify = Profile_Verification.getText();
        Assert.assertEquals(Text_Verify,"Mars Logo", "Navigated to profile page successfully");
        System.out.println(Text_Verify);

    }
}
