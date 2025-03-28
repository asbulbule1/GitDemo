@ThreeUser
Feature: Parent Dashboard Test

  @Parent_Dashboard_login @IQA_243 @Sprint6 @run
  Scenario Outline: Parent Dashboard - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I checked for the Popup
    Then I am on parent home page

    Examples: 
      | env  | url                                  | username                  | password |
      | Prod | https://rms.hatchearlychildhood.com/ | iqa_parent_1@inboxeen.com |   123456 |

  @Parent_Dashboard @IQA_239 @Sprint6
  Scenario: Parent - Dashboard
    Then I checked for the Popup
    When I am able to verify top menu bar "DASHBOARD" ""
    And I am able to verify top menu bar "Practice Together" ""
    And I navigate to top menu bar "DASHBOARD" ""

  @Parent_MegaMenu
  Scenario: Parent-MegaMenu verification
    When I navigate to top menu bar "DASHBOARD" ""
    And I am able to verify top menu bar "RESOURCES" "Install Ignite"
    And I navigate to top menu bar "DASHBOARD" ""
    And I navigate to the and "RESOURCES" "Help Center & Knowledge Base"
    And I able to close hatch support page "Hatch Support"
    And I navigate to top menu bar "DASHBOARD" ""

  @Parent_AccountMenu
  Scenario: Parent- Account Menu Verification
    When I navigate to top menu bar "DASHBOARD" ""
    Then I hover over Account menu
    Then Verify Account subsection
      | My Account | Notification Settings | Language Settings | Log Out |
    When I am able to see Child skill level panel with title
    And I navigate to top menu bar "DASHBOARD" ""
    When I am able to see Parctice together panel with title "Practice Together"
    And I navigate to top menu bar "DASHBOARD" ""
    # And I am able to see child art work with title
    Then I am on parent home page

  @Parent_Logo @IQA_240 @Sprint6
  Scenario Outline: Parent Dashboard : HatchInsights Logo
    When I navigate to top menu bar "Practice Together" ""
    And I am able to see Practice Together page "<Expectedtitle>"
    Then I click on HatchInsights Logo
    And I am on parent home page

    Examples: 
      | Expectedtitle             |
      | Skill Practice Activities |

  @Parent_Dashboard_Mega_menu @IQA_241 @Sprint6
  Scenario Outline: Parent Dashboard : Dashboard_Mega_menu
    When I navigate to top menu bar "Practice Together" ""
    And I am able to see Practice Together page "<Expectedtitle>"
    When I navigate to top menu bar "DASHBOARD" ""
    Then I am on parent home page

    Examples: 
      | Expectedtitle             |
      | Skill Practice Activities |

  @Parent_Back_button @IQA_242 @Sprint6
  Scenario Outline: Parent Dashboard : Back Button
    When I navigate to top menu bar "DASHBOARD" ""
    When I navigate to top menu bar "Practice Together" ""
    And I am able to see Practice Together page "<Expectedtitle>"
    And I click on back button
    Then I am on parent home page

    Examples: 
      | Expectedtitle             |
      | Skill Practice Activities |

  @Parent_Footer_link @IQA_243 @Sprint6 @run
  Scenario Outline: Parent Dashboard :Footerlink
    When I click on privacy policy link "<ExpectedPolicyTitle>"
    Then I checked the Loader
    When I click on Terms of Use link "<ExpectedTermTitle>"
    Then I checked the Loader
    And I able to click on HatchEarlyLearningcom link "<ExpectedTitle>"

    Examples: 
      | ExpectedPolicyTitle   | ExpectedTermTitle | ExpectedTitle        |
      | Online Privacy Policy | Terms of Use      | Hatch Early Learning |

  @Parent_dashboard_logout @Sprint6 @run
  Scenario: Verify Parent Dashboard - LogOut button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
