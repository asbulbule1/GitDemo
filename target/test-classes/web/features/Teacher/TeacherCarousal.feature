@RegressionTest
Feature: Teacher Carsousal Menu Test

  @TeacherCarousal_login @IQA-347
  Scenario Outline: Teacher Carousel - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on teacher home page

    Examples: 
      | url                                  | username                 | password | prod                          |
      | https://rms.hatchearlychildhood.com/ | iqa_teacher@inboxeen.com |   123456 | chris@hatchearlychildhood.com |

  @Teacher_verifycarsoualUIvalidation @IQA-346 @Sprint9
  Scenario Outline: Teacher Verify On Reports Page we can see the carousel
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "IGNITE REPORTS" "<Report_Menu>"
    Then I checked for the Popup
    Then Verify we are on "<Report_Page_Title>" Page
    And verify carosel is getting dispayed on report page
      | Weekly Support Needed | Progress Reports | Play Time Reports | Recommended | All Curricular Experiences | Child Time & Progress Export | Play Log Data Export |
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | Report_Menu     | Report_Page_Title            |
      | Class Progress  | Class Progress               |
      | Child Progress  | Child Progress               |
      | Class Play Time | Class Play Time              |
      | Child Play Time | Child Play Time              |
      | Support Needed  | Weekly Status                |
      | Play Log        | Play Log                     |
      | Child Time      | Child Time & Progress Export |

  @Teaher_carousel_UI_validation @IQA-347 @Sprint9
  Scenario: Teacher Verify On Reports Page we can see the carousel
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "IGNITE REPORTS" "Class Progress"
    Then I checked for the Popup
    Then Verify we are on "Class Progress" Page
    And click on Carosel_Product and verify getting naviate to respective report page
      | Weekly Support Needed | Progress Reports | Play Time Reports | Recommended | All Curricular Experiences | Child Time & Progress Export | Play Log Data Export | Growth Reports |
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @TeacherCarouselAccount_LogOut @IQA-347 @Sprint9
  Scenario: Teacher Carousel  Verify LogOut button from Account Subsection
    Then Verify child popup appears and close the child pop up
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
