
Feature: SchoolAdmin Roster Menu Test Suit

  @schooladmin_Roster_Menu_Login @IQA_259
  Scenario Outline: School Admin Roster Menu - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on school admin home page

    Examples: 
      | url                                  | username                     | password |
      | https://rms.hatchearlychildhood.com/ | iqa_schooladmin@inboxeen.com |   123456 |

  @schooladmin_verifyrostermenus @IQA_259 @Sprint7
  Scenario: Roster Menu Verification - Verify Roster Menus
    And I am able to verify mega menu "ROSTER" ""
    And I am able to verify "ROSTER" "View & Edit Schools"
    And I am able to verify "ROSTER" "View & Edit Classes"
    And I am able to verify mega menu "ROSTER" "Add New Class"
    And I am able to verify "ROSTER" "View & Edit Educators"
    And I am able to verify mega menu "ROSTER" "Add New Educator"
    And I am able to verify "ROSTER" "View & Edit Children"
    And I am able to verify "ROSTER" "View & Edit Family Members"
    And I am able to verify mega menu "ROSTER" "Add New Child"
    Then I am able to verify mega menu "ROSTER" "Carryover Last"

  @schooladmin_Roster_Menu_Logout @IQA_259
  Scenario: Verify School Admin Roster Menu - LogOut button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
