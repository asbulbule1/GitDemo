@RegressionTest
Feature: Org Admin Dashboard UI Test

  @orgadmin_dashboard_login @Sprint33 @IQA_46 @run
  Scenario Outline: Org Admin Dashboard - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on org admin home page

    Examples: 
      | url                                  | username                  | password | nontsguser              |
      | https://rms.hatchearlychildhood.com/ | iqa_orgadmin@inboxeen.com |   123456 | shivanjali@inboxeen.com |

  @Org_admin_verify_BackButton @IQA_44
  Scenario Outline: Org Admin Dashboard :Any Page-Back button functionality
    When Navigate top menu bar "ROSTER"  "Add New Educator"
    Then I checked for the Popup
    Then I am able to see page title "<Title>"
    And I click on back button
    And I am on org admin home page

    Examples: 
      | Title     |
      | Add Users |

  #@Org_admin_verify_FooterLink @IQA_45
  #Scenario Outline: Org Admin Dashboard : Footerlink
  #When I navigate to top menu bar "DASHBOARD" ""
  #Then I click on privacy policy link "<ExpectedPolicyTitle>"
  #And I click on Terms of Use link "<ExpectedTermTitle>"
  #And I click on HatchEarlyLearning.com link "<ExpectedTitle>"
  #Then I am on org admin home page
  #
  #Examples:
  #| ExpectedPolicyTitle   | ExpectedTermTitle                               | ExpectedTitle        |
  #| Online Privacy Policy | Terms of Service for rms.hatchearlylearning.com | Hatch Early Learning |
  
  @orgadmin_Verify_Average_PlayTime_Panel @IQA69
  Scenario Outline: Org Admin Dashboard : Average Playtime panel redirection
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    When I click on View Play Time for All Children
    Then I checked for the Popup
    Then I am navigated to School Play time page "<SchoolTitlePage>"
    And I am able to see school list with the playtime bar
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | SchoolTitlePage  |
      | School Play Time |

  @orgadmin_Verify_Average_PlayTime_Panel @IQA70
  Scenario Outline: Org Admin Dashboard : Average Playtime Panel in detail
    When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I verify Average play time panel title "<Avgtitle>"
    Then I verify This week children played on average count
    And I verify text We recommend children play Ignite "<Text>"
    And I am able to see View Play Time for All Children "<Link>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    And I am on org admin home page

    Examples: 
      | SchoolTitlePage  | Avgtitle          | Text                              | Link                            |
      | School Play Time | Average Play Time | We recommend children play Ignite | View Play Time for All Children |

  @Panels_UI_Validation @IQA_51
  Scenario Outline: Verify Org Admin Dashboard UI: Panels
    When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then verify ignite by hatch utilization panel "<panel1>" present
    And verify ignite by hatch utilization panle is clickable
    Then I checked for the Popup
    Then Click on Hatch Insight Logo
    And verify average demonstrated panel org admin "<panel2>" present
    And verify average demonstrated panel is clickable
    Then I checked for the Popup
    Then Click on Hatch Insight Logo
    #And verify professioal development panel "<panel3>" present
    #And verify professioal development panel is clickable
    Then I checked for the Popup
    #Then Click on Hatch Insight Logo
    And verify support needed panel "<panel4>" present
    And verify support needed panel is clickable
    Then I checked for the Popup
    Then Click on Hatch Insight Logo
    And verify average playtime panel "<panel5>" present
    And verify average playtime panel is clickable
    Then I checked for the Popup
    Then Click on Hatch Insight Logo
    And verify teaching strategy gold panel "<tsg>" or "<nonTSG>" present
    And verify teaching strategy gold panel is clickable
    Then I checked for the Popup
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | panel1                         | panel2               | panel3                   | panel4         | panel5            | tsg                       | nonTSG         |
      | Ignite by Hatch™ Utilization ? | Average Demonstrated | Professional Development | Support Needed | Average Play Time | Teaching Strategies GOLD? | Are You a GOLD |

  @TSG_GOLD_Panel_UI_Validation @IQA_71 @run
  Scenario: Verify Org Admin Dashboard : Dashoboard - Verify Teaching Strategies Gold Panel
  When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  Then verify % of children matched to GOLD displayed
  And verify Total Document sent displayed
  And verify "Activate HatchSync Connection" link displayed
  Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
  @Non_TSG_Panel_UI_Validation @Sprint2 @IQA_72 @IQA_73
  Scenario: Verify Org Admin Dashboard : Dashoboard - Verify Non Teaching Strategies Gold Panel
    Then Verify header text "Are You a GOLD" displayed
    And Verify "Get HatchSync Today" link displayed
    And Click on Get HatchSync Today and verify its getting nevigate to TSG Page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @orgadmin_verifyhatchutilizationpanel @Sprint2 @IQA_60
  Scenario Outline: Org Admin Dashboard : HatchUtilizationPanel-VerifyTile
    When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am able to see Ignite by hatch utlization panel "<tilename>"
    And I am able to see a "<totalnumberofschool>"
    Then I am able to see the "<numberofschoolforclasses>"

    Examples: 
      | tilename        |
      | Ignite by Hatch |

  @orgadmin_verifyignitebyhatchutilizationnavigation @Sprint2 @IQA_61
  Scenario Outline: Org Admin Dashboard : DashboardPanel- VerifyNavigation
    When I click on Ignite by Hatch
    And I am able to see school set up and utilization page "<title>"
    Then I checked for the Popup
    When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on org admin home page

    Examples: 
      | title        |
      | Setup Report |

  #@orgadmin_verifysetupandutilizationpage @Sprint2 @IQA_62
  #Scenario Outline: Org Admin Dashboard : Setupandutilization-VerifyTwoTables
  #When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #Then I click on Ignite by Hatch
  #And I am able to see school set up and utilization page "<title>"
  #And I am able to see setup remaining table "<tablename>"
  #And I am able to see school header
  #And I am able to see total teacher header
  #And I am able to see total classes header
  #And I am able to see %teachers trained this year header
  #And I am able to see %teachers visited insights
  #And I am able to see % of estimated children addded
  #And I am able to see % of children with parents
  #And I am able to see % of children with photos
  #And I am able to see % of children started play
  #And I am able to see school utilization table "<headertablename>"
  #And I am able to see setup school name header
  #And I am able to see setup total classes header
  #And I am able to see setup active children header
  #And I am able to see setup gold docs sent header
  #And I am able to see setup total reports login per class header
  #And I am able to see setup child playtime header
  #And I am able to see setup child sessions header
  #And I am able to see setup child skill level header
  #Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #Then I am on org admin home page
  #
  #Examples:
  #| title        | tablename       | headertablename    |
  #| Setup Report | Setup Remaining | School Utilization |
  #@orgadmin_verifyclassutilizationpage @Sprint2 @IQA_63
  #Scenario Outline: Org Admin Dashboard : Setupandutilization-VerifyTwoTables
  #When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #Then I click on Ignite by Hatch
  #And I am able to see school set up and utilization page "<title>"
  #And I am able to click on school name
  #And I am able to see class setup and utilization page "<setuptitle>"
  #And I am able to see setup remaining table title "<header1>"
  #And I am able to see school dropdown "<schooldropdown>"
  #And I am able to see classsetup class header
  #And I am able to see classsetup teacher header
  #And I am able to see classsetup trained this year header
  #And I am able to see classsetup visited insights header
  #And I am able to see classsetup children header
  #And I am able to see classsetup children with parents header
  #And I am able to see classsetup children with photos header
  #And I am able to see classsetup started play header
  #And I am able to see classutilization table title "<header2>"
  #And I am able to see classutlization school dropdown "dropdown"
  #And I am able to see classutilization class header
  #And I am able to see classutilization total gold documnets
  #And I am able to see classutilization teacher header
  #And I am able to see classutilization total reports login header
  #And I am able to see classutilization last reports login header
  #And I am able to see classutilization child playtime header
  #And I am able to see classutilization child session header
  #And I am able to see classutilization child skill level header
  #Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #Then I am on org admin home page
  #
  #Examples:
  #| setuptitle                | header1         | header2           | title                      | schooldropdown |
  #| Class Setup & Utilization | Setup Remaining | Class Utilization | School Setup & Utilization | ele School     |
  @orgadmin_verifyaverageskillprogresstile @Sprint2 @IQA_64
  Scenario Outline: Org Admin Dashboard : Setupandutilization-VerifyAverageProgressTile
    When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am able to see average demonstrated skill progress tile "<tilename>"
    And I am able to see current skill progress bar "<current>"
    And I am able to see 30 days ago progress bar "<Thirtydaysago>"
    Then I am able to see view detailed progress bar "<viewdetailedprogress>"

    Examples: 
      | tilename             | current | Thirtydaysago | viewdetailedprogress   |
      | Average Demonstrated | CURRENT | 30 DAYS AGO   | View Detailed Progress |

  @orgadmin_verifynavigationofaverageskillProgress @Sprint2 @IQA_65
  Scenario Outline: Org Admin Dashboard : Setupandutilization-VerifyNavigationfromTile
    When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    And I click on view detailed progress
    And I am able to see school progress page "<schoolprogress>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on org admin home page

    Examples: 
      | schoolprogress  |
      | School Progress |

  #@orgadmin_VerifySupportPageindetail @IQA_67
  #Scenario Outline: Org Admin Dashboard : Support Needed- Verify Support Needed in detail
  #When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #Then Verify support needed panel is displayed "<Panel1>"
  #Then Verify View weekly status report link is displayed "<Report>" "<Statement>"
  #And I am on org admin home page
  #
  #Examples:
  #| Panel1         | Report                    | Dashboardtitle | Statement               |
  #| Support Needed | View Weekly Status Report | Welcome,       | No play sessions show a |
  #@orgadmin_Verify_Professional_Development_Panel @IQA_66
  #Scenario Outline: Org Admin Dashboard : Professional development panel redirection
  #When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #When I click anywhere on professional development panel
  #Then I am navigated to hatchHub page "<HatchTitle>"
  #And I am on org admin home page
  #
  #Examples:
  #| HatchTitle                |
  #| Your Hatch Knowledge Base |
  @orgadmin_dashboard_logout @IQA_47
  Scenario: Verify Org Admin Dashboard - Logout
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
  #@orgadmin_dashboard_logout @IQA_47
  #Scenario: Verify Org Admin Dashboard - Logout
    #Then I click logout button
    #And I am on login page
