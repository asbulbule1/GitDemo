@ThreeUser
Feature: Parent Account Menu

  @Parent_account_menu_login @IQA_277 @Sprint7
  Scenario Outline: Parent Account Menu - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
   Then I checked for the Popup
    Then I am on parent home page

    Examples: 
      | env  | url                                  | username                | password |
      | Prod | https://rms.hatchearlychildhood.com/ | iqa_parent_1@inboxeen.com |   123456 |

  @Parent_Account_Menu @IQA_273 @Sprint7
  Scenario: Verify Parent: when hover over Account Icon mega menu option displays in subsection.
    Then Verify Account subsection
      | My Account | Language Settings | Notification Settings | Log Out |

  @Parent_MyProfilePagenevigation @IQA_274 @Sprint7
  Scenario: Verify Parent: Edit My Profile Page
    Then I hover over Account menu
    Then Click on My Account Menu
    Then Verify i redirected to Edit My Profile Page
    Then Verify i can enter "Email@gmail.com" "First_name" "Last_Name" "222" "222" "222" "2222"
    Then Verify i can click on Change password button
    Then Verify i can enter "current password" "New Password" and "Confirm Password"
    Then Verify Not right now button and Change password buttons are enable
    Then Verify Save button is enable and can click on Cancel button
    Then I am on parent home page

  @Parent_MyProfilePagenevigation @IQA_275 @Sprint7
  Scenario: Verify Parent: Edit My Profile Page
    Then I hover over Account menu
    Then Click on My Account Menu
    Then Verify i can click on Change password button
    Then Verify i can enter "current password" "New Password" and "Confirm Password"
    Then Verify Not right now button and Change password buttons are enable
    Then Verify i redirected to Edit My Profile Page
    Then Verify Save button is enable and can click on Cancel button
    Then I am on parent home page

  @Parent_LanuageSetting @IQA_276 @Sprint7
  Scenario: Verify Parent: Language Settings Page
    Then I hover over Account menu
    Then I Click on Language Setting page
    Then I am able see Language Setting page "Language Settings"
    Then I am able to select spanish language button
    Then I am able to save the language setting changes
    Then I am able to select english language button
    Then I am able to save the language setting changes
    Then I click on canclebutton
    Then I am on parent home page
    Then I hover over Account menu
    Then I Click on Language Setting page
    Then I click on Go to Dashboard button
    Then I am on parent home page

  @Account_NotificationSetting @IQA_277 @Sprint7
  Scenario: Verify Parent: Notification Settings page
    Then I hover over Account menu
    Then Click on Notification Settings menu
    Then Verify i redirected to Notification Settings Page
    Then Click on emails toggle
    Then Click on Save Settings button
    Then Click on Cancel button
    Then I am on parent home page

  @Parent_account_menu_logout @IQA_278 @Sprint7
  Scenario: Verify Parent Account Menu - LogOut button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
