package unum.salesforce.regression.script; //keeping it simple now but a package is required dependant on where this script falls

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import com.sun.mail.iap.ConnectionException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import unum.salesforce.regression.framework.bookingDotComHomePage;

import static org.junit.Assert.*;


@Category({  RegressionWhatever.class })  //adding a cagtegory in order for this script to be picketd up by jenkins during nightly/every second day regression run
public class bookingDotComSearchCriteriaTest extends NoSpreadsheetRegressionSuite {

String destinnation = "Limerick";


    @Before
    public void createTestData() throws ConnectionException, IOException {
        try {

           //setting the test data in the createTestData method




        } catch (Exception e) {
            deleteTestData();
        }
    }

    @After
    public void deleteTestData() {
       //leaving this here in case if the requirement
        // would be do delete the search id or some other
        // personalized ids or just to clean up the data after the test finishes the run
    }

    @Test
    public void bookingDotComSearchCriteria5StarsTests() {
        //assumin we are using chromedriver by default

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://booking.com");

        // initializing homepage to do some manipulations with it
        bookingDotComHomePage homePage = PageFactory.initElements(driver, bookingDotComHomePage.class);
        homePage.setLocation(destinnation);
        homePage.clickDate();
        homePage.clickCalendarNxtBtn();  //clicking this button, because we need 3 months from todays date and 3 months from todays date is on the next date page
        homePage.clickTwoNineJuly();
        homePage.clickThreeZeroJuly();

        //instanciating search page
        homePage.clickSearchBtn();
        homePage.click5Stars();
        assertTrue(homePage.getPresentHotel(homePage.getSavoyHotel()));
        waitUntil.elementToBeVisibleAndClickable(homePage.getGeorgeLimerickHotel());
        waitUntil.textPresent("George Limerick Hotel");

        List<WebElement> dynamicElement = driver.findElements(By.xpath("//span[contains(text(),'George Limerick Hotel')]"));
        if(dynamicElement.size() != 0){

            System.out.println("George Limerick Hotel is present");}
        else {

            System.out.println("George Limerick Hotel is not present");

        }






    }

    @Test
    public void bookingDotComSearchCriteriaSaunaTest() {
        //assumin we are using chromedriver by default

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://booking.com");

        // initializing homepage to do some manipulations with it
        bookingDotComHomePage homePage = PageFactory.initElements(driver, bookingDotComHomePage.class);
        homePage.setLocation(destinnation);
        homePage.clickDate();
        homePage.clickCalendarNxtBtn();  //clicking this button, because we need 3 months from todays date and 3 months from todays date is on the next date page
        homePage.clickTwoNineJuly();
        homePage.clickThreeZeroJuly();

        //instanciating search page
        homePage.clickSearchBtn();
        homePage.clickSauna();
        assertTrue(homePage.getLimerickStrand().isDisplayed());
        WebDriverWait wait = new WebDriverWait(driver, 5);
        waitUntil.textPresent("George Limerick Hotel");

        List<WebElement> dynamicElement = driver.findElements(By.xpath("//span[contains(text(),'George Limerick Hotel')]"));
        if(dynamicElement.size() != 0)
            System.out.println("George Limerick Hotel is present");
        else
            System.out.println("George Limerick Hotel is not present");








    }

    /*
     * Setting MTM Ids for linking to testcases in Metadata
     */
    @Override
    public List<String> setMtmList() {
        List<String> mtmIds = new ArrayList<>();
        mtmIds.add(""); //->setting an ID on the MTM to keep track of the test case related to this test. Using an arrayList in case there is more than 1 test case
        return mtmIds;
    }
}
