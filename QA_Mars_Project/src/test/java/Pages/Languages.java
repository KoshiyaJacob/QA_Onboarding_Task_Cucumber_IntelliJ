package Pages;

import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import Hooks.Hooks;

public class Languages extends Hooks
{

    //Adding and duplicating locators

    By languageTab = By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]");

    By addNewBtn = By.xpath("//div[@data-tab='first']//div[@class ='ui teal button ']");

    By language_Data = By.xpath("//input[@placeholder='Add Language']");

    By level_Dropdown = By.xpath("//select[@name='level']");

    By add_Language = By.xpath("//input[@value='Add']");

//Edit locators

    By edit_Button = By.xpath("//div[@data-tab='first']//tbody[last()]/tr/td[3]/span[1]/i");

    By editLanguage = By.xpath("//input[@placeholder='Add Language']");

    By update_Button = By.xpath("//input[@value='Update']");

//Delete locators

    By deleteButton = By.xpath("//div[@data-tab='first']//tbody[last()]/tr/td[3]/span[2]/i");

//Popup Locator

    By popup_Message = By.xpath("//div[@class=\"ns-box-inner\"]");


    //Adding and Duplication Languages method
    public void Click_Language_Tab()
    {
        //Wait.WaitToBeVisible(driver, "xpath", "languageTab", 10);
        driver.findElement(languageTab).click();
    }

    public void Click_AddNew_Btn()
    {
        Wait.WaitToBeVisible(driver, "xpath", "addNewBtn", 10);
        driver.findElement(addNewBtn).click();

    }
    public void Language_Data(String LanguageKnown, String MyLevel)
    {
        driver.findElement(language_Data).click();
        driver.findElement(language_Data).clear();

        driver.findElement(language_Data).sendKeys(LanguageKnown);

        Wait.WaitToBeVisible(driver, "xpath", "SelectedLevel", 10);
        Select selectedLevel = new Select(driver.findElement(level_Dropdown));
        selectedLevel.selectByValue(MyLevel);

    }
    public void Add_New_Lang()
    {
        driver.findElement(add_Language).click();
    }

    public String CheckNewLanguageAdded(String LanguageKnown)
    {

        Wait.WaitToBeVisible(driver, "xpath", "popup-Message", 10);
        return driver.findElement(popup_Message).getText();
    }

    //Editing Laanguages method

    public void Edit_Language(String LanguageKnown, String MyLevel)
    {

        driver.findElement(edit_Button).click();

        driver.findElement(editLanguage).clear();
        driver.findElement(editLanguage).sendKeys(LanguageKnown);


        Select selectedLevel = new Select(driver.findElement(level_Dropdown));
        selectedLevel.selectByValue(MyLevel);
        driver.findElement(update_Button).click();
    }

    public String CheckUpdatedLang(String LanguageKnown)
    {

        return driver.findElement(popup_Message).getText();

    }
    //Deleting Languages
    public void Delete_Language(String LanguageKnown)
    {

        driver.findElement(deleteButton).click();

    }
    public String CheckDeletedLang(String LanguageKnown)
    {

        return driver.findElement(popup_Message).getText();
    }


}
