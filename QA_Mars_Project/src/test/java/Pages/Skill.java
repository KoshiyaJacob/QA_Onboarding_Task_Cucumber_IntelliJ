package Pages;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import Hooks.Hooks;

public class Skill extends Hooks
{
    //Add Locator
    By Skill_Tab = By.linkText("Skills");

    By Add_New_Button = By.xpath("(//div[@class='ui teal button'])[1]");

    By Language_TextBox = By.xpath("//input[@placeholder='Add Skill']");

    By Level_Dropdown = By.xpath("//select[@name='level']");

    By Add_Button = By.xpath("//input[@value='Add']");

    //Edit Locator
    By edit_Icon = By.xpath("//div[@data-tab='second']//table/tbody[last()]/tr/td[3]/span[1]");

    By edit_TextBox = By.xpath("//input[@placeholder='Add Skill']");

    By update_Button = By.xpath("//input[@value='Update']");

    // Delete Locator
    By delete_Button = By.xpath("//div[@data-tab='second']//table/tbody[last()]/tr/td[3]/span[2]");

    //popup locator
    By Popup_Message = By.xpath("//div[@class='ns-box-inner']");


    //Add and Duplicate:
    public void AddSkill()
    {
        Wait.WaitToBeVisible(driver, "linkText", "Skill_Tab",20 );
        driver.findElement(Skill_Tab).click();
    }

    public void Skill_Level(String SkillKnown, String SkillLevel)
    {

        driver.findElement(Add_New_Button).click();

        driver.findElement(Language_TextBox).sendKeys(SkillKnown);


        Wait.WaitToBeVisible(driver, "xpath", "SelectedLevel", 10);

        Select selectedLevel = new Select(driver.findElement(Level_Dropdown));
        selectedLevel.selectByValue(SkillLevel);


        driver.findElement(Add_Button).click();
    }

    public String CheckSkillAdded(String SkillKnown)
    {

        Wait.WaitToBeVisible(driver, "xpath", "Popup-Message", 10);
        return driver.findElement(Popup_Message).getText();
    }

    //Edit

    public void edit_Language(String SkillKnown , String SkillLevel)
    {

        driver.findElement(edit_Icon).click();
        driver.findElement(edit_TextBox).clear();

        driver.findElement(edit_TextBox).sendKeys(SkillKnown);


        Wait.WaitToBeVisible(driver, "xpath", "SelectedLevel", 10);

        Select selectedLevel = new Select(driver.findElement(Level_Dropdown));
        selectedLevel.selectByValue(SkillLevel);

        driver.findElement(update_Button).click();
    }

    public String check_Skill_Updated(String SkillKnown)
    {

        Wait.WaitToBeVisible(driver, "xpath", "Popup-Message", 10);
        return driver.findElement(Popup_Message).getText();
    }

    //Delete
    public void Delete_Skill(String SkillKnown)
    {
        driver.findElement(delete_Button).click();
    }

    public String CheckDeletedSkill(String SkillKnown)
    {

        return driver.findElement(Popup_Message).getText();
    }
}


