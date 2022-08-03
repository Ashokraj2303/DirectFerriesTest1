Feature: Spl Offer Page
As a user I should able to change the language of the page

  @languageChange
  Scenario: changing language to Schweiz

    Given I am on homepage "https://www.directferries.co.uk/" with title as "Ferry booking | Compare ferry prices & timetables"
    When I click the more option button
    When I click the spl offer icon
    Then I should be on the spl offer page with title as "Cheap ferry | Latest ferry deals & offers | Direct Ferries"
    When I click the language icon
    When I click Schweiz icon
    Then  The page should be changed into that particular country language with title as "Fähren, Fähre buchen und Preise vergleichen weltweit"


  @languageChange
  Scenario: changing language to France

    Given I am on homepage "https://www.directferries.co.uk/" with title as "Ferry booking | Compare ferry prices & timetables"
    When I click the more option button
    When I click the spl offer icon
    Then I should be on the spl offer page with title as "Cheap ferry | Latest ferry deals & offers | Direct Ferries"
    When I click the language icon
    When I click France icon
    Then  The page should be changed into that particular country language with title as "Billets de bateau - Réservez vos billets de ferry, toutes destinations"

  @languageChange
  Scenario: changing language to Danmark

    Given I am on homepage "https://www.directferries.co.uk/" with title as "Ferry booking | Compare ferry prices & timetables"
    When I click the more option button
    When I click the spl offer icon
    Then I should be on the spl offer page with title as "Cheap ferry | Latest ferry deals & offers | Direct Ferries"
    When I click the language icon
    When I click Danmark icon
    Then  The page should be changed into that particular country language with title as "Sammenlign færger til Sverige, Norge, Tyskland og flere lande"



