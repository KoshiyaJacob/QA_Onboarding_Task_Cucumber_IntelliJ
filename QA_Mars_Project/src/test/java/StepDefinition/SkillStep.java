package StepDefinition;

import Pages.Skill;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Objects;



    public class SkillStep
    {
    	 Skill Skill_Obj = new Skill();
    	    
    	    //Add and duplication
    	    @Given("I logged in and click Skill tab")
    	    public void i_logged_in_and_click_skill_tab()
    	    {
    	        Skill_Obj.AddSkill();

    	    }
    	    @When("I add {string} level {string}")
    	    public void i_add_level(String SkillKnown, String SkillLevel)
    	    {
    	        Skill_Obj.Skill_Level(SkillKnown, SkillLevel);

    	    }
    	    @Then("The {string}  should display")
    	    public void the_should_display(String SkillKnown)
    	    {
    	        String notification = Skill_Obj.CheckSkillAdded(SkillKnown);

    	        String Message = SkillKnown + " has been added to your skills";
    	        String duplicated_popup = "Duplicated data";

    	        if (Objects.equals(notification, SkillKnown + "has been added to your skills"))
    	        {
    	            Assert.assertEquals(notification, Message, notification);
    	        }

    	        else if (Objects.equals(notification, "Duplicated data"))
    	        {

    	            Assert.assertEquals(notification, duplicated_popup, notification);
    	            System.out.println(SkillKnown + " " + notification);

    	        }

    	    }
    	//Edit
    	    @When("I edit last data into {string} level {string}")
    	    public void iEditLastDataIntoLevel(String SkillKnown, String SkillLevel)
    	    {
    	        Skill_Obj.edit_Language(SkillKnown, SkillLevel);
    	    }
    	    @Then("The {string} should edited successfully")
    	    public void theShouldEditedSuccessfully(String SkillKnown)
    	    {
    	        Skill_Obj.check_Skill_Updated(SkillKnown);
    	        String notification = Skill_Obj.check_Skill_Updated(SkillKnown);
    	        String Message = SkillKnown + " has been updated to your skills";
    	        Assert.assertEquals(notification, Message,notification);
    	    }

    	//Delete
    	    @When("I delete {string}")
    	    public void iDelete(String SkillKnown)
    	    {
    	        Skill_Obj.Delete_Skill(SkillKnown);
    	    }
    	    @Then("The {string} deleted successfully")
    	    public void theDeletedSuccessfully(String SkillKnown)
    	    {
    	        Skill_Obj.CheckDeletedSkill(SkillKnown);
    	        String notification = Skill_Obj.CheckDeletedSkill(SkillKnown);
    	        Assert.assertEquals(notification, SkillKnown + " has been deleted", notification);

    	    }    	
    }
    	

    	
    	    





