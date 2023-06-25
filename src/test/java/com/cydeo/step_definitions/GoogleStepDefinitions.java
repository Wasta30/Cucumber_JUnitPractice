package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {


    // create page object model object here at class leve
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

/// if u dont pass anything there {} u can pass any argument
    @When("user types apple and clicks enter")// we pass word but take it as a string argument
    public void user_types_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }
    @Then("user sees {string} in the google  title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle = string+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertEquals("title is not as expected",expectedTitle,actualTitle); // junit assertion first accept exepcted value , funnctionality is same compare two strings

    }




    @And("user accept key")
    public void userAcceptKey() {

        googleSearchPage.Acceptkey.click();
    }


    @Then("user sees apple in the google  title")
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertEquals("title is not as expected",expectedTitle,actualTitle); // junit assertion first accept exepcted value , funnctionality is same compare two strings

    }




    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);





    }



}
