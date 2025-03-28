@RegressionTest
Feature: Teacher Dashboard UI Test

  @TeacherDashboard_login @IQA_296 @run
  Scenario Outline: Teacher Dashboard  - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on teacher home page

    Examples: 
      | url                                  | username                 | password | prod                          |
      | https://rms.hatchearlychildhood.com/ | iqa_teacher@inboxeen.com |   123456 | chris@hatchearlychildhood.com |

  @Teacher_Dashboard_MegaMenu_Footer_Link @IQA_227 @IQA_229 @Sprint6 
  Scenario: Teacher Dashboard, MegaMenuverifyfication
    Then Verify child popup appears and close the child pop up
    Then Verify i can see Hatch Insight Logo
    And Verify i can see below mega menu
      | DASHBOARDS | IGNITE REPORTS | ROSTER | SKILL SUPPORT | RESOURCES |
    And Verify i can see Account icon
    And Verify i can see class dropdown
    And Verify i can see ignite Device Version "Current Ignite Version:"
    And Verify after clicking on Ignite device version it redirect to "Device Ignite Version"
    Then I checked for the Popup
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_Dashboard_MegAMenu_Funtional @IQA_228 @Sprint6
  Scenario: Teacher Dashboard : Dashboard Mega menu functionality
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_Hatch_Insight_Logo @IQA_231 @Sprint6
  Scenario: Teacher Dashboard : Hatch Inisght Logo
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    And Verify i can click on hatch insight logo
    Then Verify child popup appears and close the child pop up

  @Teacher_Back_Button_Functionality @IQA_232 @Sprint6
  Scenario: Teacher User: Back button Functionality
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    And Verify i click on Back button
    Then Verify child popup appears and close the child pop up

  @Teacher_Dashboard_Panel @IQA_244 @Sprint6 
  Scenario: Teacher user: Dashboard Panel Tile
    Then Verify child popup appears and close the child pop up
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up
    Then I can see Average Demonstrated Skill Progress Panel
    And I can see Ignite Play Schedule Panel
    And I can see Curricular experiences
    And I can see Support Needed Panel
    And I can see Average Play Time Panel
    And I can see Teaching Strategies GOLD Panel

  @Teacher_Footer_Link @IQA_245 @Sprint6 @run
  Scenario: Teacher user : Footer links on Dashboard Page
    Then Verify child popup appears and close the child pop up
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up
    Then I can see @2022 Hatch, Inc contains "2024" link on footer
    And I can see HatchEarlyLearning "HatchEarlyLearning.com" link on footer
    And I can see contact no "1.800.624.7968 option 4" link on footer
    And I can see tearm of use "Terms Of Use" link on footer
    And I can see Privacy Policy "Privacy Policy" link on footer
    And Verify i can see ignite Device Version "Current Ignite Version"
    And I can see Current ignite version and check my device "Current ignite version and check my device" link on footer
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_Current_Ignite_Version @IQA_291 @Sprit_8
  Scenario: Teacher User: Current Ignite Verison redirection verification
    Then Verify child popup appears and close the child pop up
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up
    Then I click on Current ignite banner
    Then I checked for the Popup
    Then Verify we are on "Device Ignite Version" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_Panels_UI_Validation @IQA_292 @Sprit_8  
  Scenario Outline: Verify Teacher Dashboard UI: Panels
    Then Verify child popup appears and close the child pop up
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up
    And Verify average demonstrated panel "<panel1>" on Teacher present
    And verify average demonstrated panel on Teacher is clickable
    Then I checked for the Popup
    Then Verify we are on "Class Progress" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up
    And Verify ignite play schedule panel "<panel2>" on Teacher present
    And Verify ignite play schedule panel on Teacher is clickable
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up
    And Verify Curricular Experiences panel "<panel3>" on Teacher present
    And Verify Curricular Experiences panel on Teacher is clickable
    Then I checked for the Popup
    Then Verify we are on "Curricular Experiences Recommendations" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up
    And Verify Support Needed panel "<panel4>" on Teacher present
    And Verify Support Needed panel on Teacher is clickable
    Then I checked for the Popup
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up
    And Verify Average Play Time panel "<panel5>" on Teacher present
    And Verify Average Play Time panel on Teacher is clickable
    Then I checked for the Popup
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up
    And Verify Teaching Strategies GOLD panel "<panel6>" on Teacher present
    And Verify Teaching Strategies GOLD panel on Teacher is clickable
    Then I checked for the Popup
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | panel1                | panel2               | panel3                 | panel4         | panel5              | panel6                  |
      | Average Demonstrated? | Ignite Play Schedule | Curricular Experiences | Support Needed | Average Play Time ? | Teaching StrategiesGOLD |

  @Teacher_Report_Mega_Menus @IQA_293 @Sprint_8
  Scenario: Teacher - Report Mega Menus
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "IGNITE REPORTS" ""
    Then verify given menus present on subsection
      | Class Play Time | Child Play Time | Growth Report | Child Skill Detail Report | Support Needed | Class Progress | Child Progress | Play Log | Child Time |
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_Report_MegaMenu @IQA_294 @Sprint_8
  Scenario: Verify user should see the menus in the subsection of Roster.
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "ROSTER" ""
    And verify given menus present on Roster subsection with and
      | View & Edit Classes | View & Edit Children | View & Edit Family Members | Add New Child | Carryover Last Year's Children | Roster CSV | Import History |
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_Skill_Support_Mega_Menus @IQA_295 @Sprint_8 
  Scenario: Teacher - Skill Support Mega Menus
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "SKILL SUPPORT" ""
    Then verify given menus present on subsection
      | Recommended Curricular Experiences | Curricular Experiences Library |
    And Verify "Support Needed" Submenu Present on Skill Support Menu
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  #@Teacher_Resources_Subsection_Menu @IQA_296 @Sprint_8
  #Scenario: Verify user should see the menus in the subsection.
    #Then Verify child popup appears and close the child pop up
    #Then I navigate to top menu bar "RESOURCES" ""
    #And verify given menus present on Roster subsection with and
      #| The Hatch Hub | Videos | PDFs and Printables | Discussion Boards | Webinars | Help Center & Knowledge Base | Install Ignite | Device Ignite Version | What does it mean to Ignite? |
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then Verify child popup appears and close the child pop up

  #@Teacher_dashboard_navigation @IQA-345 @Sprint9
  #Scenario: Verify child pop up is clickable or not - Verify child pop up
  #Then Verify child popup appears and close the child pop up
  #Then I am on teacher home page
  @Teacher_dashboard_click_hatch_logo_navigate_to_dashboard @IQA_349 @Sprint9
  Scenario Outline: Verify user should navigate to dashboard page -Verify hatch logo and popup
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "<pagename>" Page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | pagename        |
      | Class Play Time |

  @TeacherDashboardAccount_LogOut @IQA_296
  Scenario: Teacher Dashboard Verify LogOut button from Account Subsection
    Then Verify child popup appears and close the child pop up
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
    
  #@Dashboard_Verify_logout_link @IQA-348 @Sprint9
  #Scenario: Verify logout link from dashboard page
    #When I am on teacher home page 
    #Then I click logout button
    #And I am on login page
