@RegressionTest
Feature: Teacher Roster

  @TeacherRoster_Login @IQA_111 @Sprint_9 @PEG_16360 @failed
  Scenario Outline: Teacher Roster  - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on teacher home page

    Examples: 
      | url                                  | username                 | password | prod                          |
      | https://rms.hatchearlychildhood.com/ | iqa_teacher@inboxeen.com |   123456 | chris@hatchearlychildhood.com |

  @Teacher_Parent_Conference_Reports @IQA_302 @Sprint9
  Scenario Outline: Teachers - Other Report - Parent Conference Reports
    Then Verify child popup appears and close the child pop up
    When I navigate to top menu bar "IGNITE REPORTS" "Child Skill Detail Report"
    Then I checked for the Popup
    And verify we are able to see Parent Conference Report page "<ExpectedConferencePageTitle>"
    And I am able to select Class Name from list of Class in dropdown
      | teach_Class |
    #And Verify the List of children with report
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | ExpectedConferencePageTitle             |
      | Child Skill Detail - Conference Reports |

  #@Tecaher_verifysupportneededpage @IQA-303 @Sprint9
  #Scenario Outline: Support Needed Page Verification- Verify Support Needed Page
  #When I navigate to top menu bar "REPORTS" "Support Needed"
  #And I am able to see support needed page title "<supportneededpage>"
  #And I am able to see subdomain header "<subdomainheader>"
  #And I am able to see percentage header "<precentageHeader>"
  #And I navigate to top menu bar "DASHBOARD" ""
  #Then Verify child popup appears and close the child pop up
  #
  #Examples:
  #| supportneededpage | subdomainheader | precentageHeader |
  #| Weekly Status     | Subdomain       | % Correct        |
  @Roster_View_and_edit_classes @IQA_306 @Sprint_8
  Scenario Outline: Roster - Verify roster view and edit classes
    Then Verify child popup appears and close the child pop up
    When I navigate to the and "ROSTER" "View & Edit Classes"
    Then I checked for the Popup
    Then I am able to see list of classes and Teacher
    #And I am able to see count of children and devices below the headers "<ChildrenTitle>" "<DeviceTitle>"
    And I am able to see filter classes name with School "<School>"
    And Verify Status dropdown "<Status>"
    And I navigate to the "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | ChildrenTitle | School     | Status |
      | Children      | teach_School | Active |

  @Teacher_roster_viewallchildrenpage @IQA-310 @Sprint9
  Scenario Outline: Roster- Add new child displayed on view all children page
    Then Verify child popup appears and close the child pop up
    When I navigate to the and "ROSTER" "View & Edit Children"
    Then Verify child popup appears and close the child pop up
    And Verify we are on "View All Children" Page
    And Verify i can select School "<School_Name>" from DropDown
    And Verify i can select Class "<Class_Name>" from DropDown
    And I am able to select Status from dropdown "<drp>"
    And Verify children list displayed on view all children page
    And Verify i can search child by name "<Child_Name>" through search box
    And Verify i can deactivate the child
    And I am able to select active status from dropdown "<sdrp>"
    And Verify i can search child by name "<Child_Name>" through search box
    And Verify i can activate the child
    And I am able to select Status from dropdown "<drp>"
    And Verify i can search child by name "<Child_Name>" through search box
    And Verify after clikcing on child name i redirect to Child Skill Detail page with titl "<Child_Skill_Page>"
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | School_Name | Class_Name | Child_Name | drp    | sdrp     | Child_Skill_Page   |
      | ele School  | ele class  | Vikram H.| Active | Inactive | Child Skill Detail |

  @Teacher_ROSTER_View_All_Children_Page @IQA_308 @Sprint9
  Scenario Outline: ROSTER- Add New Child Edit info button and back button
    Then Verify child popup appears and close the child pop up
    When I navigate to the and "ROSTER" "View & Edit Children"
    Then Verify child popup appears and close the child pop up
    Then Verify we are on "View All Children" Page
    Then Verify child popup appears and close the child pop up
    And Verify i can select School "<School_Name>" from DropDown
    And Verify i can select Class "<Class_Name>" from DropDown
    And I am able to select Status from dropdown "Active"
    And Verify i can edit the child info
    Then Verify we are on "Child Profile" Page
    And i click on back button
    Then Verify child popup appears and close the child pop up
    Then Verify we are on "View All Children" Page
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | School_Name | Class_Name |
      | teach_School  | teach_Class  |

  @Teacher_ROSTER_Add_New_Child @PEG_16358 @IQA_111 @Teacher_ROSTER_Add_New_Child_Displayed_On_View_Page @IQA_113 @Sprint5 
  Scenario Outline: Teacher : ROSTER- Add New Child page functionality
    Then Verify child popup appears and close the child pop up
    When I navigate to the "ROSTER" "Add New Child"
    Then I checked for the Popup
    Then Verify we are on "Add Child" Page
    And Verify i can select school "<School_Name>" and Class "<Class_Name>" from given dropdown
    And verify i can enter Child first Name
    And verify i can enter Child last Name
    And verify i can enter Child Date of birth "<Birth_Date>" from calender
    Then Verify i can select Educational journey with "Ignite" with Language "English"
    Then Verify i can take photo of child by clicking on Camera button
    Then Verify checkboox of Use placholder photo Image already selected if present
    And Verify i can select Request photo from Family member checkbox
    Then Verify i can click on Continue button
    Then Verify the added child details SchoolName "<School_Name>" ClassName "<Class_Name>" Language "<Language>" getting displayed on step 2 page
    And verify i can select child Gender "<Gender>" from dropdown
    And verify i can select child Grade "<Grade>" from dropdown
    And verify i can select child Race "<Race>" from dropdown
    And verify i can select child Ethnicity "<Ethnicity>" from dropdown
    #And verify i can select child Language "<Language>"
    And verify i can enter Parent first Name
    And verify i can enter Parent last Name
    And verify i can enter Parent Email address
    And Verify i can enter Parent Phone Number
    Then Verify i can select Request photo from Family member checkbox on step 2
   And Verify i can click on Done button
    Then Verify child popup appears and close the child pop up
    And Verify we are on "<ChildrenPAgeTitle>" Page
    And I am able to select Status from dropdown "Active"
    And Verify the added child is displayed on View all children page
    Then Verify child popup appears and close the child pop up
    And Verify added child can be deleted
    Then Verify child popup appears and close the child pop up
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | School_Name | Class_Name | Birth_Date  | Gender | Race  | Ethnicity          | Language | Grade             | ChildrenPAgeTitle |
      | teach_School  | teach_Class  | 16/May/2019 | Male   | Asian | Hispanic or Latino | English  | Preschool (3 yrs) | View All Children |

  @Teacher_ROSTER_Add_New_Child @PEG_16360 @IQA_111 @Teacher_ROSTER_Add_New_Child_Displayed_On_View_Page @IQA_113 @Sprint5 @failed
  Scenario Outline: Teacher : ROSTER- Add New Child page functionality
    Then Verify child popup appears and close the child pop up
    When I navigate to the "ROSTER" "Add New Child"
    Then I checked for the Popup
    Then Verify we are on "Add Child" Page
    And Verify i can select school "<School_Name>" and Class "<Class_Name>" from given dropdown
    And verify i can enter Child first Name
    And verify i can enter Child last Name
    And verify i can enter Child Date of birth "<Birth_Date>" from calender
    Then Verify i can select Educational journey with "Ignite" with Language "English"
    Then Verify i can take photo of child by clicking on Camera button
    Then Verify checkboox of Use placholder photo Image already selected if present
    And Verify i can select Request photo from Family member checkbox
    Then Verify i can click on Continue button
    Then Verify the added child details SchoolName "<School_Name>" ClassName "<Class_Name>" Language "<Language>" getting displayed on step 2 page
    And verify i can select child Gender "<Gender>" from dropdown
    And verify i can select child Grade "<Grade>" from dropdown
    And verify i can select child Race "<Race>" from dropdown
    And verify i can select child Ethnicity "<Ethnicity>" from dropdown
    And verify i can enter Parent first Name
    And verify i can enter Parent last Name
    And verify i can enter Parent Email address
    And Verify i can enter Parent Phone Number
    Then Verify i can select Request photo from Family member checkbox on step 2
    #And Verify i can click on Done button
    And Verify i can click on save & add another button
    Then Verify child popup appears and close the child pop up
    And I navigate to the and "ROSTER" "View & Edit Children"
    Then Verify child popup appears and close the child pop up
    Then I checked for the Popup
    And Verify the added child is displayed on View all children page
    And Verify added child can be deleted
    Then Verify child popup appears and close the child pop up
    Then Verify we are on "View All Children" Page
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | School_Name | Class_Name | Birth_Date  | Gender | Race  | Ethnicity          | Language | Grade             | ChildrenPAgeTitle |
      | teach_School  | teach_Class  | 16/May/2019 | Male   | Asian | Hispanic or Latino | English  | Preschool (3 yrs) | View All Children |

  @Teacher_ROSTER_Add_New_Child_Side_Panel @IQA_112 @PEG_16361
  Scenario: Teacher : ROSTER- Add New Child Page side panel
    Then Verify child popup appears and close the child pop up
    When I navigate to the and "ROSTER" "Add New Child"
    Then I checked for the Popup
    Then Verify we are on "Add Child" Page
    And Verify The user should be able to see one "Adding Multiple Children" on side menu
    Then I checked for the Popup
    And Verify After Clicking on CSV import should be able to navigate to the "Import Roster CSV" page
    Then I navigate to the and "ROSTER" "Add New Child"
    And Verify The user should be able to see two "Adding children from last year" on side menu
    Then I checked for the Popup
    And Verify After Clicking on Carryover Children blue link text user should be able to navigate to the "Carryover Children" page
    Then I navigate to the and "ROSTER" "Add New Child"
    Then I checked for the Popup
    And Verify The user should be able to see three "Need to see current Hatch roster" on side menu
    Then I checked for the Popup
    And After Clicking on the View & Edit Children blue link text user should be able to navigate to "View All Children" page
    Then Verify child popup appears and close the child pop up
    Then Verify we are on "View All Children" Page
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_ROSTER_Add_New_Child_Side_Panel @IQA_112 @PEG_16363
  Scenario: Teacher Roster : ROSTER- Add New Child Page side panel
    When I navigate to the and "ROSTER" "Add New Child"
    Then I checked for the Popup
    Then Verify we are on "Add Child" Page
    And Verify The user should be able to see one "Adding Multiple Children" on side menu
    And Verify After Clicking on CSV import should be able to navigate to the "Import Roster CSV" page
    Then I navigate to the and "ROSTER" "Add New Child"
    And Verify The user should be able to see two "Adding children from last year" on side menu
    And Verify After Clicking on Carryover Children blue link text user should be able to navigate to the "Carryover Children" page
    Then I navigate to the and "ROSTER" "Add New Child"
    And Verify The user should be able to see three "Need to see current Hatch roster" on side menu
    And After Clicking on the View & Edit Children blue link text user should be able to navigate to "View All Children" page
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

  @Teacher_Roster_Child_Profile_Page_Functionality @PEG_16366 
  Scenario: Teacher - Roster Child Profile Page Functionality
    When I navigate to the and "ROSTER" "View & Edit Children"
    Then Verify child popup appears and close the child pop up
    Then I checked for the Popup
    Then Verify we are on "View All Children" Page
    And Verify i can search child by name "teach child" through search box
    And Verify i can click on edit info button of child
    Then Verify we are on "Child Profile" Page
    And Verify i can click on child name edit pencil
    And Verify i can click on Gender edit pencil
    And Verify i can click on Race edit pencil
    And Verify i can click on Ethnicity edit pencil
    And Verify i can click on Instruction Language edit pencil
    And Verify i can click on Date of Birth edit pencil
    And Verify i can click on Grade edit pencil
    And Verify i can click on Educational Journey edit pencil
    And Verify i can click on Family Member edit pencil
    And Verify i can click on Gold Setting Match edit pencil
    And Verify i can click on Gold Setting Language edit pencil
    And Verify i can click on Basic info Side button and navigate to "Basic Info" section
    And Verify i can click on Educational Journey Side button and navigate to "Educational Journey" section
    And Verify i can click on Family Member Side button and navigate to "Family Members" section
    And Verify i can click on Gold Setting Side button if the org is TSG enabled and navigate to "GOLD Settings" section
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

  @TeacherRosterAccount_LogOut @IQA-308 @PEG_16366
  Scenario: Teacher Roster : Verify LogOut button from Account Subsection
    Then Verify child popup appears and close the child pop up
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
