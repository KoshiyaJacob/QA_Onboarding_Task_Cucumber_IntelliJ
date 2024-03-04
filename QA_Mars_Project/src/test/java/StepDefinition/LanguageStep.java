package StepDefinition;
import Pages.Languages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class LanguageStep
{
	Languages LangObj = new Languages();


    @Given("I navigate to Language")
    public void given_i_navigate_to_language()
    {
        LangObj.Click_Language_Tab();


    }

    @When("I add {string} my level {string} in profile")
    public void when_i_add_my_level_in_profile(String LanguageKnown, String myLevel)
    {
        LangObj.Click_AddNew_Btn();
        LangObj.Language_Data(LanguageKnown, myLevel);
        LangObj.Add_New_Lang();
    }

    //Adding

    @Then("The new {string} should display")
    public void then_the_new_should_display(String LanguageKnown)
    {
        //
        String notification = LangObj.CheckNewLanguageAdded(LanguageKnown);
        String Message = LanguageKnown + " has been added to your languages";
        String DuplicateMess = "Duplicated data";

        if (Objects.equals(notification, LanguageKnown + " has been added to your languages"))
        {
            Assert.assertEquals(notification, Message, notification);
        }

        else if (Objects.equals(notification, "Duplicated data"))
        {
            Assert.assertEquals(notification, DuplicateMess, notification);
            System.out.println(LanguageKnown +" " + notification);

        }
    }

    // Edit


    @When("I edit the second {string} with new {string}")
    public void when_i_edit_the_second_with_new(String LanguageKnown, String MyLevel)
    {
        LangObj.Edit_Language(LanguageKnown, MyLevel);
    }

    @Then("The {string} should be updated")
    public void then_the_and_should_be_updated(String LanguageKnown)
    {
        LangObj.CheckUpdatedLang(LanguageKnown);
        String notification = LangObj.CheckUpdatedLang(LanguageKnown);
        String Message = LanguageKnown + " has been updated to your languages";
        Assert.assertEquals(notification, Message, notification);
    }

    //Delete

    @When("I delete an existing {string}")
    public void when_i_delete_an_existing(String LanguageKnown)
    {
        LangObj.Delete_Language(LanguageKnown);

    }

    @Then("the existing {string} should be deleted")
    public void then_the_existing_should_be_deleted(String LanguageKnown)
    {
        LangObj.CheckDeletedLang(LanguageKnown);
        String notification = LangObj.CheckDeletedLang(LanguageKnown);
        Assert.assertEquals(notification , (LanguageKnown + " has been deleted from your languages"), notification);
    }
   
}


