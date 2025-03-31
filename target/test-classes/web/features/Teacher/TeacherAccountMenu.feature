Feature: Teacher Account Menu UI Test

  @TeacherAccountMenu_login @IQA-344 @Sprint9
  Scenario Outline: Teacher Account  - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on teacher home page

    Examples: 
      | url                                  | username                 | password |
      | https://rms.hatchearlychildhood.com/ | iqa_teacher@inboxeen.com |   123456 |

  @Teacher_verifyaccountmenu @IQA-342 @Sprint9
  Scenario: Teacher account menu verification- Verify account menu
    When I hover over Account menu
    Then Click on My Account Menu
    Then Verify i redirected to Edit My Profile Page
    Then Verify i can enter "Email@gmail.com" "First_name" "Last_Name" "222" "222" "222" "2222"
    Then Verify i can click on Change password button
    Then Verify i can enter "current password" "New Password" and "Confirm Password"
    Then Verify Not right now button and Change password buttons are enable
    Then Verify Save button is enable and can click on Cancel button
    Then Verify child popup appears and close the child pop up
    Then I am on teacher home page

  @Teacher_verifynotificationseetingpage @IQA-343 @Sprint9
  Scenario: Teacher Notification page verification- Verify Notification setting page
    Then Verify child popup appears and close the child pop up
    When I hover over Account menu
    Then Click on Notification Settings menu
    Then Verify i redirected to Notification Settings Page
    Then Click on emails toggle
    Then Click on Save Settings button
    Then Click on Cancel button
    Then Verify child popup appears and close the child pop up
    Then I am on teacher home page

  @TeacherAccount_LogOut @IQA-344
  Scenario: Teacher Account Verify LogOut button from Account Subsection
    Then Verify child popup appears and close the child pop up
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
