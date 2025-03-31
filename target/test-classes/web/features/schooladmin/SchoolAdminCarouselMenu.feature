
Feature: SchoolAdmin CarouselMenu Test Suit

  @schooladmin_carousel_Login
  Scenario Outline: School Admin Carousel - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on school admin home page

    Examples: 
      | url                                  | username                     | password |
      | https://rms.hatchearlychildhood.com/ | iqa_schooladmin@inboxeen.com |   123456 |

  @schooladmin_verifycarsoualUIvalidation @IQA_288 @Sprint_8
  Scenario Outline: Verify On Reports Page we can see the carousel
    When I navigate to top menu bar "IGNITE REPORTS" "<Report_Menu>"
    Then I checked for the Popup
    Then Verify we are on "<Report_Page_Title>" Page
           Then I checked the Loader
    And verify carosel is getting dispayed on report page
      | Setup & Utilization | Progress Reports | Play Time Reports | Recommended | All Curricular Experiences | Child Time & Progress Export | Play Log Data Export | Growth Reports | Device Ignite Version |
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Report_Menu           | Report_Page_Title            |
      | School Progress       | School Progress              |
      | Class Progress        | Class Progress               |
      | Child Progress        | Child Progress               |
      | School Play Time      | School Play Time             |
      | Class Play Time       | Class Play Time              |
      | Child Play Time       | Child Play Time              |
      | Device Ignite Version | Device Ignite Version        |
      | Play Log              | Play Log                     |
      | Child Time            | Child Time & Progress Export |

  @schooladmin_carousel_UI_validation @IQA_289 @Sprint_8 @run
  Scenario: Verify On Reports Page we can see the carousel
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
           Then I checked the Loader
    And click on Carosel_Product and verify getting naviate to respective report page
      | Setup & Utilization | Progress Reports | Play Time Reports | Recommended | All Curricular Experiences | Child Time & Progress Export | Play Log Data Export | Growth Reports | Device Ignite Version |
    When I close child window if any and navigate back to parent window
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @schooladmin_carousel_Logout @IQA_288
  Scenario: School Admin Carousel - Logout button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
