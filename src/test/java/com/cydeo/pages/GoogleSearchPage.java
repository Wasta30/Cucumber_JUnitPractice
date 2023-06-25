package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    // create constructor , intilaie driver instancce and classes instance using page factoryint element


@FindBy(xpath = "//div[.='Accept all']")
public WebElement Acceptkey;


    @FindBy(name = "q")
    public WebElement searchBox;



}
