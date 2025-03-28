@RegressionTest
Feature: Org Admin Account Megamenu UI Test

  @orgadmin_account_login @Sprint33 @IQA_43
  Scenario Outline: Org Admin Account  - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on org admin home page

    Examples: 
      | url                                  | username                  | password | nontsguser              |
      | https://rms.hatchearlychildhood.com/ | iqa_orgadmin@inboxeen.com |   123456 | shivanjali@inboxeen.com |

  @OrgAdmin_AccountMegaMenuUI @Sprint1 @IQA_43
  Scenario: Org Admin Account Verify when hover over Account Icon mega menu option displays in subsection.
    Then I hover over Account menu
    Then Verify Account subsection
      | My Account | Notification Settings | Log Out |

  @OrgAdminMyProfilePagenevigation @Sprint1 @IQA_53
  Scenario: Org Admin Account: Verify after clicking on My Account user should redirected to Edit My Profile Page
    Then I hover over Account menu
    Then Click on My Account Menu
    Then Verify i redirected to Edit My Profile Page
    Then Verify i can enter "Email@gmail.com" "First_name" "Last_Name" "222" "222" "222" "2222"
    Then Verify i can click on Change password button
    Then Verify i can enter "current password" "New Password" and "Confirm Password"
    Then Verify Not right now button and Change password buttons are enable
    Then Verify Save button is enable and can click on Cancel button

  @OrgAdminAccount_NotificationSetting @Sprint1 @IQA_54
  Scenario: Org Admin Account Verify Notification Settings page
    Then I hover over Account menu
    Then Click on Notification Settings menu
    Then Verify i redirected to Notification Settings Page
    Then Click on emails toggle
    Then Click on Save Settings button
    Then Click on Cancel button
    Then I am on org admin home page

  @orgadmin_account_logout @Sprint5 @IQA_55
  Scenario: Verify Org Admin Account  - LogOut button from Account Subsection
    When I am on org admin home page
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
