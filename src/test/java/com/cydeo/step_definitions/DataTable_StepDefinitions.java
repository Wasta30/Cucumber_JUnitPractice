package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }

    // we are able to pass multiple string here under one step , so instead of parametriztion where we used just one string

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown ");
    }

    DropDownPage dropDownPage = new DropDownPage();
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

// this list of string has months because we put data in feature class ( remember expected dats comes from documentation )

        List<String> actualMonth = BrowserUtils.dropDownOptionAsString(dropDownPage.monthDropDown);

        Assert.assertEquals(expectedMonths,actualMonth);
        //Assert will check the size of the list first , If it is matching it will check content 1 by 1.

    }





}
