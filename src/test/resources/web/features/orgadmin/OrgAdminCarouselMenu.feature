@RegressionTest
Feature: Org Admin Carousel menu Test

  @orgadmin_carousel_menu_login @Sprint33 @IQA_50 @run
  Scenario Outline: Org Admin Carousel Menu - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on org admin home page

    Examples: 
      | url                                  | username                  | password | nontsguser              |
      | https://rms.hatchearlychildhood.com/ | iqa_orgadmin@inboxeen.com |   123456 | shivanjali@inboxeen.com |

  @OrgAdminCarousel_UI_Validation @Sprint2 @IQA_52 @run
  Scenario Outline: Org Admin Carousel Verify On Reports Page we can see the carousel
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

  @OrgAdminCarousel_UI_Validation @Sprint2 @IQA_50
  Scenario: Org Admin Carousel Verify On Reports Page we can see the carousel
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    And click on Carosel_Product and verify getting naviate to respective report page
      | Setup & Utilization | Progress Reports | Play Time Reports | Recommended | All Curricular Experiences | Child Time & Progress Export | Play Log Data Export | Growth Reports | Device Ignite Version |
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @orgadmin_carousel_menu_logout @Sprint5 @IQA_55
  Scenario: Verify Org Admin Carousel Menu - LogOut button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
