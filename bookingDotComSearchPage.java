package unum.salesforce.regression.framework;


import android.util.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unum.salesforce.regression.framework.utils.CommonFinds;
import unum.salesforce.regression.framework.utils.WaitUntil;

import java.io.Console;


import static com.sforce.soap.tooling.FileType.LOG;


public class bookingDotComSearchPage {

    Console console;
    protected WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
    protected CommonFinds commonFinds;
    boolean verification = false;
    //xpaths


    @FindBy(xpath = "//span[contains(text() ,'Sauna')]")
    public WebElement saunaChkBox;



   @FindBy(xpath = "//div[contains(@class,'css-checkbox')]//following-sibling::span[contains(text(),'5 stars')]")
   public WebElement fiveStarsChkBx;

    @FindBy(xpath = "//span[contains(text(),'The Savoy Hotel')]")
    public WebElement savoyHotel;

    @FindBy(xpath = "//span[contains(text(),'Limerick Strand')]")
    public WebElement limerickStrand;

    @FindBy(xpath = "//span[contains(text(),'George Limerick Hotel')]")
    public WebElement georgeLimerickHotel;

   //getters

    public WebElement getSaunaChkBox(){return saunaChkBox;}

    public WebElement getFiveStarsChkBx(){return fiveStarsChkBx;}

    public WebElement getSavoyHotel(){return savoyHotel;}

    public WebElement getLimerickStrand(){return limerickStrand;}

    public WebElement getGeorgeLimerickHotel(){

        return georgeLimerickHotel;}


    public Boolean getPresentHotel(WebElement eleMent){
        try{
            if (eleMent.isDisplayed()) verification = true;

        }
        catch (Exception e)
        {
            //Some sort of message goes here
        }
        return verification;
    }



    //setters

   public void clickSauna(){
        saunaChkBox.click();
    }

    public void click5Stars(){getFiveStarsChkBx().click();}




    public String getAllPageText() {
        return commonFinds.byClassContains("sr_property_block_main_row").getText();
    }








}