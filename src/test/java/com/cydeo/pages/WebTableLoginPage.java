package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

   public WebTableLoginPage(){

       PageFactory.initElements(Driver.getDriver(),this);




    }



    @FindBy(name = "username")
    public WebElement inputUsername;


    @FindBy(name = "password" )
    public WebElement inputPassword;


    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * no parametrs
     * when w ecall this method it will directly login using
     * username: Test
     * and passowrd
     *
     * we can also store method in POM as well if required like this one
     *
     */
    public void login(){// in the same class to call ob we can use this word
        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will accept two argument and login either use this or above same hain
     * @param username
     * @param password
     */


    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }


    /**This method will login using credetnail from configuration property
     * so againn this is another method of the same thing
     */

    // here we can read dats from cong property
    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("webTableUsername"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("webTablePassword"));
        loginButton.click();
    }



}
