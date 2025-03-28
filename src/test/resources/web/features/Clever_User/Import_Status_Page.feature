#@RegressionSuite
#Feature: Clever Org Admin Resources Import History Test
#
  #@import_status_login @Sprint_10
  #Scenario Outline: Import Status - Login
    #Given I am on "<env>" environment "<url>"
    #When I enter username "<username>"
    #And I enter password "<password>"
    #And I click letsgo
    #Then I am on org admin home page
#
    #Examples: 
      #| url                                  | username                                | password |
      #| https://rms.hatchearlychildhood.com/ | hatchearlychildhood.9b5403@inboxeen.com |   123456 |
#
  #@orgadmin_VerifyImportHistoryPage @IQA_350 @Sprint_10
  #Scenario: Verify Import History Page
    #Given I am on org admin home page
    #When I navigate to top menu bar "ROSTER" "Roster Sync Status"
    #And Verify we are on "Import Status" Page
    #Then Verify Headers of import history Log should displayed
      #| Sr no. | Import Type | Status | Started |
    #And Verify i can select history log button
    #And Verify cron job is executed at "21:12:" overnight
    #And Verify on import status summary page count labels should displayed.
      #| schools | admins | classes | teachers | children | parents |
    #Then I navigate to the "DASHBOARD" ""
#
  #@import_status_logout @IQA_257 @Sprint_10
  #Scenario: Verify Import Status - Logout Link
    #When I am on org admin home page
    #Then I click logout button
    #And I am on login page
