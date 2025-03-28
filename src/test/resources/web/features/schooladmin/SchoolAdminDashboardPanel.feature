
Feature: SchoolAdmin DashboardPanel Test Suit

  @schooladmin_dashboard_login @IQA_233, @IQA_234 @Sprint6 @run
  Scenario Outline: School Aadmin Dashboard - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on school admin home page

    Examples: 
      | url                                  | username                     | password |
      | https://rms.hatchearlychildhood.com/ | iqa_schooladmin@inboxeen.com |   123456 |

  @schooladmin_VerifyDashboardPanel @IQA_235, @IQA_246 @Sprint6
  Scenario Outline: Schoool Admin DashboardPanel -Verify DashboardPanel
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    And I am able to see ignite by hatch utilization panel "<panel1>" is present
    And I am able to see average demonstrated skill progress panel "<panel2>" is present
    #And I am able to see professional development panel "<panel3>" is present
    And I am able to see support needed panel "<panel4>" is present
    And I am able to see average play time panel "<panel5>" is present
    And I am able to see teaching strategies gold panel "<panel6>" "<panel06>" is present

    Examples: 
      | panel1          | panel2               | panel3                   | panel4         | panel5            | panel6              | panel06        |
      | Ignite by Hatch | Average Demonstrated | Professional Development | Support Needed | Average Play Time | Teaching Strategies | Are You a GOLD |

  @schooladmin_ClickingOnDashboardPanel @IQA_235 @Sprint6 @run
  Scenario Outline: School Admin DashboardPanel -Verify Clicking Of DashboardPanel
    When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    And I am able to click on ignite by hatch utilization panel
    Then I checked for the Popup
    And I am able to see school set up page "<pagename>"
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    And I am able to click on average demonstrated skill progress panel
    Then I checked for the Popup
    And I am able to see school progress page as "<schpage>"
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #And verify professioal development panel is clickable
     Then I checked for the Popup
    #And I am able to see hatch knowledge base page "<hatchpage>"
    And I am able to click on hatch insights
    And I am able to click on support needed panel
     Then I checked for the Popup
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    And I am able to click on average play time panel
     Then I checked for the Popup
    And I am able to see school play time page "<schplaytimepage>"
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    And I am able to click on teaching strategies gold panel
     Then I checked for the Popup
    And I am able to see teaching strategies gold panel page "<goldpanelpage>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | pagename     | schpage         | hatchpage                 | schplaytimepage  | goldpanelpage            | panel06   |
      | Setup Report | School Progress | Your Hatch Knowledge Base | School Play Time | Teaching StrategiesGOLD | Are You a |

  @schooladmin_verifyHatchLogo @IQA_237 @Sprint6
  Scenario Outline: HatchInsightsLogo - Verify Hatch logo
    When I navigate to the "SKILL SUPPORT" "Curricular Experiences Library"
    Then I checked for the Popup
    And I am able to see All Curricular Experince page "<CurricularExperiencesLibrary>"
    Then I checked for the Popup
    And I am able to see hatch insight logo
    And I am able to click  on hatch insight logo
    Then I am on school admin home page

    Examples: 
      | CurricularExperiencesLibrary |
      | All Curricular Experiences   |

  @schooladmin_verifyFooterLinks @IQA_247 @Sprint6
  Scenario: School AdminFooterLinks: Verify Footer Links
    When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on school admin home page
    And I am able to see hatch early learning link
    And I am able to see terms of use link
    Then I am able to see privacy policy link

  @schooladmin_verifyDashboardMegaMenu @IQA_236 @Sprint6
  Scenario: School Admin DashboardMegaMenu - Verify Dashboard Mega Menus
    And I am able to see hatch insight logo
    And I am able to click  on hatch insight logo
    And I am able to verify mega menu "DASHBOARD" ""
    And I am able to verify mega menu "IGNITE REPORTS" ""
    And I am able to verify mega menu "ROSTER" ""
    And I am able to verify mega menu "SKILL SUPPORT" ""
    And I am able to verify mega menu "RESOURCES" ""
    And I hover over Account menu
    And I am able to verify account subsection
      | My Account | Notification Settings | Log Out |
    And I am able to see current ignite version
    And I am able to see logout link

  #@schooladmin_verifyClickingFooterLink @IQA_247 @Sprint6
  #Scenario Outline: Schoool Admin FooterLinks: Clicking On Footer Links
  #When I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #And I am able to click on hatch early learning link
  #And I am able to see welcome to hatch page "<pagename>"
  #And I click on Terms of Use link "<ExpectedTermTitle>"
  #Then I click on privacy policy link "<ExpectedPolicyTitle>"
  #
  #Examples:
  #| pagename          | ExpectedTermTitle                               | ExpectedPolicyTitle   |
  #| Welcome to Hatch! | Terms of Service for rms.hatchearlylearning.com | Online Privacy Policy |
  @schooladmin_dashboard_logout @IQA_288
  Scenario: School Admin Dashboard - Logout button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
