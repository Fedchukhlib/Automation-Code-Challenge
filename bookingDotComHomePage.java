package unum.salesforce.regression.framework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class bookingDotComHomePage extends bookingDotComSearchPage{

    protected WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }

    public static final String TITLE = "Home";


    // xpaths
    /*
    destination xpath
     */

    @FindBy (xpath = "//input[@aria-label = 'Type your destination']" )
    public WebElement location;

    /*
    date
     */

    @FindBy (xpath = "//div[@class ='xp__dates-inner']")
    public WebElement date;

    @FindBy (xpath = "//button[@type ='submit']" )
    public WebElement searchBtn;

    @FindBy (xpath = "//div[@data-bui-ref = 'calendar-next']" )
    public WebElement calendarNxtBtn;

    @FindBy (xpath = "//span[@aria-label = '29 July 2020']" )
    public WebElement twoNineJuly;

    @FindBy (xpath = "//span[@aria-label = '30 July 2020']" )
    public WebElement threeZeroJuly;



    //getters
    public WebElement getLocation()
    {return location;}

    public WebElement getDate()
    {return date;}

    public WebElement getSrchBrn()
    {return searchBtn;}

    public WebElement getCalendarNxtBtn()
    {return calendarNxtBtn;}

    public WebElement getTwoNineJuly()
    {return twoNineJuly;}

    public WebElement getThreeZeroJuly()
    {return threeZeroJuly;}




    //setters
    public void setLocation(String loc){
        getLocation().sendKeys(loc);
    }

    public void clickDate(){
        getDate().click();
    }

    public void  clickSearchBtn(){
        getSrchBrn().click(); //asssumin click is already implemented

    }
    public void clickCalendarNxtBtn(){
        getCalendarNxtBtn().click(); //asssuming click is already implemented

    }
    public void clickTwoNineJuly(){
        getTwoNineJuly().click(); //asssuming click is already implemented

    }
    public void clickThreeZeroJuly(){
        getThreeZeroJuly().click(); //asssuming click is already implemented

    }








}