package StepDefinition;
import Pages.SignIn;

import io.cucumber.java.en.Given;


public class LoginStep
{
    SignIn signIn_Obj = new SignIn();

    @Given("Login to the Profile page using valid credentials")
    public void login_to_the_profile_page_using_valid_credentials()
    {
        signIn_Obj.LoginFunction();

    }
}
