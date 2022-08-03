Feature: deal finder
  As a user, I should able to find different deals


  @onewayTrip @dealFinder
  Scenario: finding deals for one of the popular routes for single way

    Given I am on homepage "https://www.directferries.co.uk/" with title as "Ferry booking | Compare ferry prices & timetables"
    When I click one way icon on the deal finder and click one of the popular rout
    When I select Departure date on 12 august and time 10
    When I select number of adult passenger into one and click done btn
    When I vehicle icon and click motorcycle option
    When I enter "KTM" on the vehicle make and "DUKE 390" on the vehicle model
    When I click the search btn
    Then I should be on the page with Departure details "Date Out: Fri 12 Aug @ 10:00" and route "Dover - Calais"

  @roundTrip @dealFinder
  Scenario: finding deals for round trip

    Given I am on homepage "https://www.directferries.co.uk/" with title as "Ferry booking | Compare ferry prices & timetables"
    When I click round trip and enter "France" in the search bar
    When I click Dover - Dunkirk rout
    When I select Departure date on 12 august and return  date on 19 august
    When I select number of adult passenger into three and click done btn
    When I vehicle icon and click car option
    When I select honda brand and select civic model
    When  I select no to luggage and Caravan
    When I click the search btn
    Then I should be on the page with Departure details "Date Out: Fri 12 Aug @ 09:00", return deatils "Date Ret: Fri 19 Aug @ 17:00"and route "Dover - Dunkirk"


   @dealFinder
  Scenario: finding deals for one of the popular routes for single way

    Given I am on homepage "https://www.directferries.co.uk/" with title as "Ferry booking | Compare ferry prices & timetables"
    When I click one way icon on the deal finder and click one of the popular rout
    When I select Departure date on 12 august and time 10
    When I select number of adult passenger into three and child one
    When I add child age as 6 and click done
    When I vehicle icon and click Bicycle option
    When I click the search btn
    Then I should be on the page with "The maximum number of passengers allowed with this vehicle type is 1" mgs


@invalidSearchTerm @dealFinder
Scenario: invalid search term
    Given I am on homepage "https://www.directferries.co.uk/" with title as "Ferry booking | Compare ferry prices & timetables"
    When I click one way icon on the deal finder and enter "ASHOK" in the search bar
  Then I should get invalid routes mgs "No Routes Found"
