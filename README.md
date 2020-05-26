Booking.com Testing

There is a total of 3 classes attached. 
bookingDotComSearchCriteriaTest is the main class that runs the script and performs any neccesary manipulations.
bookingDotComHomePage and bookingDotComSearchPage are the 2 frmawork pages that have the initialized weblements and their getters/setters/clickers methods implemented.

The bookingDotComSearchCriteriaTest  test consists of 2 test runs, where the first one selects a 5 star option from search criteriaand verifies that The Savoy Hotel is present and George Limerick Hotel is Not Present.
The second test run is selecting a search criteria where sauna is present and Limerick Strand Hotel is present while  George Limerick Hotel is Not Present.


Assumptions: 
Assuming the following: 
Click method already implemented (using selenium click) 

No data setup required for this test, leaving the @Before class, just in case for further use if needed.

Assuming no xpaths/getters/setters required for the number of people going to stay, because 2 are selected by default. 

Releases already implemenmted, so Jenkins can pick up the script by Annotations in the @Category just before the test name.

Hardcoding xpaths instead of creating a method to get 3months from dtodays date, thus 29 of july and 30 of july were chosen. 

More will be explained in the code. 
 
