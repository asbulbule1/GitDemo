@ThreeUser
Feature: SchoolAdmin Roster Page Test Suit

  @schooladmin_Roster_Page_Login @run
  Scenario Outline: School Admin Roster Page - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on school admin home page

    Examples: 
      | url                                  | username                     | password |
      | https://rms.hatchearlychildhood.com/ | iqa_schooladmin@inboxeen.com |   123456 |

  @schooladmin_Verify_View_and_Edit_School_Pages @IQA-290 @Sprint_8
  Scenario Outline: RosterPage-VerifyViewandEditSchoolPage
    When I navigate to the and "ROSTER" "View & Edit Schools"
    Then I checked for the Popup
    And I am able to see view all schools page "<schpagetitle>"
    And I am able to see schoolname "school_namelist"
    And I am able to see teachers count "teacher_count"
    And I am able to see classes count "class_count"
    And I am able to see a children count "children_count"
    And I am able to click on edit info button
    And I am able to see edit school page "<title>"
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schpagetitle     | title       |
      | View All Schools | Edit School |

  @SchholAdmin_ROSTER_View_And_Edit_Users @IQA-331 @Sprint_8
  Scenario Outline: Roster Page- View and Edit Users
    When I navigate to the and "ROSTER" "View & Edit Educators"
    Then I checked for the Popup
    And Verify we are on "View All Users" Page
    And Verify list of user displayed under header name
    And Verify header Activation "Activation" displayed on Page
    And Verify reset password icon displayed on Page
    And Verify resend invite icon displayed on Page
    And Verify header "Edit" diaplayed on Page
    And Verify i can select "<Class_Name>" from class dropdown
    And Verify i can select "<Status>" from status dropdown
    And verify i can search user by name "<User_Name>" from search box
    And verify i can search user by email adress "<Email_Address>" from search box
    And Verify header Name "Name" is present and able to sort user after clicking on it
    And Verify header Email "Email Address" is present and able to sort user after clicking on it
    And Verify header School "School" is present and able to sort user after clicking on it
    And Verify header Role with filter "<Filter by role>"
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Filter by role | School_Name | Class_Name | Status | User_Name   | Email_Address           |
      | Lead Teacher   | Scadmin_school  | Scadmin_class | Active | Sc_admin teacher | Sc_admin_teach@inboxeen.com |

  @SchoolAdmin_ROSTER_Add_New_User @IQA-332 @Sprint_8
  Scenario Outline: Roster- Add New User Page
    When I navigate to the "ROSTER" "Add New Educator"
    Then I checked for the Popup
    Then Verify we are on "Add Users" Page
    And Verify i can select user role "<User_Role>" from dropdown
    And Verify i can select School or schools from dropdown
      | Scadmin_school |
    And Verify i can enter user first name to add user
    And Verify i can enter user last name to add user
    And Verify i can enter user email to add user
    And Verify i can select Class or Classes from class DropDown
      | Scadmin_class |
    And Verify i can click on Add user button
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | User_Role |
      | Teacher   |

  @Schooladmin_Roster_Cancel_button_of_add_new_user @IQA-332 @Sprint_8
  Scenario Outline: ROster - Verify Cancel button on Add User Page
    When I navigate to the "ROSTER" "Add New Educator"
    Then I checked for the Popup
    Then I click on cancel button "<Cancelbutton>"
    Then Verify we are on "View All Users" Page
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Cancelbutton |
      | Cancel       |

  @SchoolAdmi_Roster_View_and_edit_classes @IQA-333 @Sprint_8
  Scenario Outline: Reports - Verify roster view and edit classes
    When I navigate to the and "ROSTER" "View & Edit Classes"
    Then I checked for the Popup
    Then I verify the view class page title "<viewTitle>"
    And Verify list of Classes displayed under header name
    And Verify Edit info button for listed classes "<EditTitle>"
    And I am able to see filter classes name with School "<School>"
    And I am able to filter classes with the status "<Status>"
    And Verify list of Classes displayed under header name
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School     | viewTitle        | ChildrenTitle | EditTitle | Status   |
      | Scadmin_school | View All Classes | Children      | Edit      | Inactive |

  @SchoolAdmin_Roster_Add_new_class_button @IQA-334 @Sprint_8
  Scenario Outline: Reports - Verify ROSTER- Add New Class button
    When I navigate_Top_MenuBar "ROSTER" "Add New Class"
    Then I checked for the Popup
    Then I select school from the dropdown "<Expected_SchoolName>"
    And I enter Name this class text "<Expected_ClassName>"
    And I select Assign teacher to this class dropdown "<Expected_Assignteacher>"
    And I select curriculam class dropdown "<Expected_curriculum>"
    And I select the picture
    And I click on create class button
    And I verify added school is displayed with all details "<Expected_ClassName>"
    And I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | CreateClass  | Expected_SchoolName | Expected_ClassName | Expected_Assignteacher | Expected_curriculum |  |
      | Create Class | Scadmin_school         | Scadmin_class          | Sc_admin teacher            | custom curriculum   |  |

  @schoolAdmin_ROSTER_View_All_Children_Page @IQA-335 @Sprint_8 
  Scenario Outline: ROSTER- Add New Child displayed on View all children
    When I navigate to the and "ROSTER" "View & Edit Children"
    Then I checked for the Popup
    And I am able to see view all children page "<pagename>"
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

    Examples: 
      | School_Name | Class_Name | Child_Name | pagename          | drp    | sdrp     | Child_Skill_Page   |
      | Scadmin_school  | Scadmin_class  | Sc_admin child  | View All Children | Active | Inactive | Child Skill Detail |

  @schoolAdmin_ROSTER_View_All_Children_Page @IQA-336 @Sprint_8
  Scenario Outline: ROSTER- Add New Child Edit info button and back button
    When I navigate to the and "ROSTER" "View & Edit Children"
    Then I checked for the Popup
    Then Verify we are on "View All Children" Page
    And I am able to select Status from dropdown "<drp>"
    And Verify i can select School "<School_Name>" from DropDown
    And Verify i can select Class "<Class_Name>" from DropDown
    And Verify i can edit the child info
    Then Verify we are on "Child Profile" Page
    And i click on back button
    Then Verify we are on "View All Children" Page
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name | Class_Name | drp    |
      | Scadmin_school  | Scadmin_class  | Active |

  @schooladmin_ViewAdnEditParentsPage @IQA-337 @Sprint_8 
  Scenario Outline: Roster-View and Edit Parents Page
    When I navigate to the and "ROSTER" "View & Edit Family Members"
    Then I checked for the Popup
    Then Verify we are on "View All Family Members" Page
    And I am able to see parent name header
    And I am able to see email address header
    And I am able to see child header
    And I am able to see activation header
    And I am able to see edit header
    And Verify i can select School Name "<School_Name>" from DropDown
    And Verify i can select Class Name "<Class_Name>" from DropDown
    And Verify i can select Status "Active" from DropDown
    And Verify i can see list of parent present on View All Parent Page
    And Verify i can search parent by name "<Parent_Name>" from search box
    And Verify i can search parent by email "<Parent_Email>" from search box
    And verify i can Deactivate Parent user
    And Verify i can select Status "Inactive" from DropDown
    And Verify i can search parent by email "<Parent_Email>" from search box
    And verify i can Activate Parent user
    And I am able to select Status from dropdown "<drp>"
    And Verify i can search parent by email "<Parent_Email>" from search box
    And Verify i can Reset Parent user passowrd
    And Verify i can resend invite to parent user
    And Verify i can search parent by name "<Parent_Name>" from search box
    And verify i can edit parent user info
    Then Verify we are on "Child Profile" Page
    And i click on back button
    Then Verify we are on "View All Family Members" Page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name | Class_Name | Parent_Name | Parent_Email              | drp    |
      | Scadmin_school | Scadmin_class  | Sc_admin fmembers  |sc-adminFmembers@inboxeen.com| Active |

  @SchoolAdmin_ROSTER_Add_New_Child @PEG_16359 @IQA_111 @OrgAdmin_ROSTER_Add_New_Child_Displayed_On_View_Page @IQA_113 @Sprint5 
  Scenario Outline: School Admin Roster : ROSTER- Add New Child page functionality
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
    And Verify i can click on Done button
    And Verify we are on "<ChildrenPAgeTitle>" Page
    And Verify the added child is displayed on View all children page
    And Verify added child can be deleted
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name  | Class_Name  | Birth_Date  | Gender | Race  | Ethnicity          | Language | Grade             | ChildrenPAgeTitle |
      | Scadmin_school | Scadmin_class | 16/May/2019 | Male   | Asian | Hispanic or Latino | English  | Preschool (3 yrs) | View All Children |

  @OrgAdmin_ROSTER_Add_New_Child @PEG_16358 @IQA_111 @OrgAdmin_ROSTER_Add_New_Child_Displayed_On_View_Page @IQA_113  @Sprint5 
  Scenario Outline: ROSTER- Add New Child page functionality
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
    And Verify we are on "<ChildrenPAgeTitle>" Page
    And Verify the added child is displayed on View all children page
    And Verify added child can be deleted
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name | Class_Name | Birth_Date  | Gender | Race  | Ethnicity          | Language | Grade             | ChildrenPAgeTitle |
      | Scadmin_school  | Scadmin_class  | 16/May/2019 | Male   | Asian | Hispanic or Latino | English  | Preschool (3 yrs) | View All Children |

  @OrgAdmin_ROSTER_Add_New_Child @PEG_16358 @IQA_111 @OrgAdmin_ROSTER_Add_New_Child_Displayed_On_View_Page @IQA_113 @Sprint5
  Scenario Outline: ROSTER- Add New Child page functionality
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
    And I navigate to the and "ROSTER" "View & Edit Children"
    And Verify the added child is displayed on View all children page
    And Verify added child can be deleted
    Then Verify we are on "View All Children" Page
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name | Class_Name | Birth_Date  | Gender | Race  | Ethnicity          | Language | Grade             | ChildrenPAgeTitle |
      | Scadmin_school  | Scadmin_class  | 16/May/2019 | Male   | Asian | Hispanic or Latino | English  | Preschool (3 yrs) | View All Children |

  @OrgAdmin_ROSTER_Add_New_Child_Side_Panel @IQA_112 @PEG_16362 
  Scenario: ROSTER- Add New Child Page side panel
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
    Then Verify we are on "View All Children" Page
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

  @SchoolAdmin_Roster_Child_Profile_Page_Functionality @PEG_16365 @run
  Scenario: School Admin - Roster Child Profile Page Functionality
    When I navigate to the and "ROSTER" "View & Edit Children"
    Then I checked for the Popup
    And I am able to select Status from dropdown "Active"
    Then Verify we are on "View All Children" Page
    And Verify i can search child by name "Sc_admin child" through search box
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
     
   
       
  #@SchoolAdmin_ROSTER_Add_New_Child_Vaidation_msg @IQA-339 @Sprint_8
  #Scenario Outline: ROSTER- Add New Child validation messages
  #When I navigate to the and "ROSTER" "Add New Child"
  #Then Verify we are on "Add Child" Page
  #And Verify i can click on Done button
  #And Verify validation message dislayed for mandatory name field "<Child_Name_ValidationMessage>"
  #And Verify validation message dislayed for mandatory dropdown field "<DropDown_Validation_Message>"
  #Then I navigate to the "DASHBOARD" ""
  #
  #Examples:
  #| Child_Name_ValidationMessage | DropDown_Validation_Message |
  #| Please enter a valid name    | Please select a option      |
  
  @schooladmin_Rsoter_Page_Logout @IQA-339 @PEG_16365
  Scenario: Verify School Admin Roster Page - LogOut button from Account Subsection
    When I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
