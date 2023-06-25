package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage {

    public  OrderPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    @FindBy(name = "name")
    public WebElement inputName;

    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;

    @FindBy(name = "state")
    public WebElement inputState;

    @FindBy(name = "zip")
    public WebElement inputZip;

    @FindBy(name = "card")// this will return me list of webelemtn so make list of webElement
    public List<WebElement> cardType;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement inputCard;
    
    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement inputCardExp;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement buttonProcessOrder;

    
    
  /*  @FindBy(name = "cardNo")
    public WebElement cardNoInput;

    @FindBy(name = "cardExp")
    public WebElement cardExpInput;

    @FindBy(css = "button[type='submit']")
    public WebElement processOrderBtn;*/









}
