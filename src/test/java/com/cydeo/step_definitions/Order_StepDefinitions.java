package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinitions {


    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    BasePage basePage = new BasePage();

    OrderPage orderPage = new OrderPage();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
        // calling our login method to login in to webtable app
       webTableLoginPage.login();
// clicking to  order link to go order page
       basePage.order.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        Select select = new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);
    }

// accepting int argument and sending it using sendkeys() method
    // send keys method only accept string so we need to either concat with ""
    // or send String.valueOf(int arg0)
    @And("user enters quantity {int}")
    public void userEntersQuantity(int arg0) {
        // the clear method will delete whatever is in the input box
        //orderPage.inputQuantity.clear();
        // if clear doesnt work use this, imitiating Backspace button from keyboard to delete existing input
        orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);

orderPage.inputQuantity.sendKeys(arg0+"");// send key needs string so used "" to make it string
//orderPage.inputQuantity.sendKeys(String.valueOf(arg0));
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
orderPage.inputName.sendKeys(string);
    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
orderPage.inputStreet.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
orderPage.inputCity.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
orderPage.inputState.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
orderPage.inputZip.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {
      /*  List<WebElement> cardTypes = orderPage.cardType;
        for (WebElement each : cardTypes) {
            // the value comes from browser
            if(each.getAttribute("value").equalsIgnoreCase(expectedCardType)){
                each.click(); // agar value jo hai wo expected card type k equal ho to click kro
           // value is unique for radio options , we can make a logic for this method
            }
        }*/
// this line will loop through the list and decide which radio button to click
     BrowserUtils.clickedRadioButton(orderPage.cardType,expectedCardType);


    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

        orderPage.inputCard.sendKeys(string);

    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
orderPage.inputCardExp.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
orderPage.buttonProcessOrder.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {
        String actualName = viewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(expectedName,actualName);



    }



}
