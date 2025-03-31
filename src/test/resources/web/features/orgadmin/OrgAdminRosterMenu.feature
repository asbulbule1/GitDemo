@RegressionTest
Feature: Org Admin Roster Menu Test


  @orgadmin_roster_menu_login @class @run @pending
  Scenario Outline: Org Admin Roster Menu  - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on org admin home page

    Examples: 
      | url                                   | username                    | password |
      | https://rmssg.hatchearlylearning.com/ | tsgigniteadmin@inboxeen.com |   123456 |

  @orgadmin_verifyviewandeditschoolpages @Sprint4 @IQA_95
  Scenario Outline: Org Admin Roster :RosterPage-VerifyViewandEditRosterPage
    When I navigate to the and "ROSTER" "View & Edit Schools"
    Then I checked for the Popup
    And I am able to see view all schools page "<schpagetitle>"
    And I am able to see schoolname "school_namelist"
    And I am able to see teachers count "teacher_count"
    And I am able to see classes count "class_count"
    And I am able to see a children count "children_count"
    And I am able to click on edit info button
    And I am able to see edit school page "<title>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schpagetitle     | title         |
      | View All Schools | Edit school : |

  @orgadmin_verifyviewallclassespages @Sprint4 @IQA_96 @school @run
  Scenario Outline: Org Admin Roster :RosterPage-VerifyViewandEditClassPage
    When I navigate to the and "ROSTER" "View & Edit Schools"
    Then I checked for the Popup
    And I am able to see view all schools page "<schpagetitle>"
    And I am able to click on a school name
    And I am able to see view all classes page "<pagename>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schpagetitle     | pagename         |
      | View All Schools | View All Classes |

  @orgadmin_verifyvieweditschoolpage @Sprint4 @IQA_97 @school
  Scenario Outline: Org Admin Roster : RosterPage-VerifyEditSchoolPage
    When I navigate to the and "ROSTER" "View & Edit Schools"
    Then I checked for the Popup
    And I am able to see view all schools page "<schpagetitle>"
    And I am able to click on edit info button
    And I am able to see edit school page "<title>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schpagetitle     | title         |
      | View All Schools | Edit school : |

  @orgadmin_verifyaddnewschoolpageerrormessage @Sprint4 @IQA_99
  Scenario Outline: Org Admin Roster : RosterPage-VerifyAddNewSchoolPageErrorMessage
    When I navigate into menu "ROSTER" "Add New School"
    And I am able to click on add school button
    Then I am able to see error message for school name "<schnameerrormsg>"
    Then I am able to see error message for zip code "<zipcodeerrormsg>"

    Examples: 
      | schnameerrormsg        | zipcodeerrormsg        |
      | This field is required | This field is required |

  @orgadmin_verifyviewallschoolpage @Sprint4 @IQA_98, @IQA_100
  Scenario Outline: Org Admin Roster : RosterPage-VerifyViewAllSchoolPage
    When I navigate into menu "ROSTER" "Add New School"
    Then I checked for the Popup
    And I am able to see add school page "<pagenametitle>"
    And I am able to enter a school name
    And I am able to enter a city name "<entercityname>"
    And I am able to select a state "<statedrp>"
    And I am able to enter a zip code "<zipcode>"
    And I am able to see active school checkbox
    And I am able to click on add school button
    And I am able to see sucess message on page "<message>"
    And I am able to click on view all schools button
    And I am able to see view all schools page "<schpagetitle>"
    And I am able to see added school on view all school page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | pagenametitle | entercityname | statedrp | zipcode | schpagetitle     | message  |
      | Add a School  | Pune          | HI       |  444041 | View All Schools | SUCCESS! |

  @orgadmin_verifycanclebuttononaddnewschoolpage @Sprint4 @IQA_101
  Scenario Outline: Org Admin Roster : RosterPage-VerifyCancleButton
    When I navigate into menu "ROSTER" "Add New School"
    Then I checked for the Popup
    And I am able to see add school page "<pagenametitle>"
    And I am able to click on cancle link of add school page
    And I am able to see view all schools page "<schpagetitle>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | pagenametitle | schpagetitle     |
      | Add a School  | View All Schools |

  @REPORTS_View_and_edit_classes @Sprint4 @IQA_102 @class
  Scenario Outline: Org Admin Roster : Reports - Verify roster view and edit classes
    When I navigate to the and "ROSTER" "View & Edit Classes"
    Then I checked for the Popup
    Then I am able to see list of classes and Teacher
    #  And I am able to see count of children and devices below the headers "<ChildrenTitle>" "<DeviceTitle>"
    #And I am able to see filter classes name with School "<School>"
    And Verify Status dropdown "<Status>"
    And I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | ChildrenTitle | DeviceTitle | School | Status |
      | Children      | Devices     |      1 | Active |

  @REPORTS_View_and_edit_classes @sprint4 @IQA_103 @class
  Scenario Outline: Org Admin Roster : Reports - Verify roster view and edit classes
    When I navigate to the and "ROSTER" "View & Edit Classes"
    Then I checked for the Popup
    Then I verify the view class page title "<viewTitle>"
    And I click on edit info button of class "<EditInfo>"
    And I verify the edit class page title "<EditTitle>"
    And I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | EditInfo  | viewTitle        | EditTitle  |
      | Edit Info | View All Classes | Edit Class |

  @REPORTS_Add_new_class @Sprint4 @IQA_104
  Scenario Outline: Org Admin Roster : Reports - Verify ROSTER- Add New Class
    When I navigate_Top_MenuBar "ROSTER" "Add New Class"
    Then I checked for the Popup
    Then verify title Create Your Class "<CreateClass>"
    And verify see Back button "<back>"
    And verify School dropdown "<Schooldropdown>"
    And verify Name this class "<Nameclass>"
    And verify Assign a Teacher to this class "<TeacherClass>"
    #And verify How many children are in this class? "<ChildrenClass>"
    And verify What curriculum does this class use? "<CurriculumClass>"
    And verify Choose a picture to represent this class "<PictureClass>"
    And verify Create Class button "<CreateClassbtn>"
    And verify Cancel button "<Cancelbutton>"
    And I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | CreateClass       | CreateClassbtn | back | Schooldropdown | Nameclass       | TeacherClass                    | CurriculumClass                      | PictureClass                              | Cancelbutton |
      | Create Your Class | Create Class   | Back | School         | Name this class | Assign a Teacher to this class. | What curriculum does this class use? | Choose a picture to represent this class. | Cancel       |

  @REPORTS_Add_new_class_error_messages @Sprint4 @IQA_105 
  Scenario Outline: Org Admin Roster : Reports - Verify ROSTER- Add New Class error messages
    When I navigate_Top_MenuBar "ROSTER" "Add New Class"
    Then I checked for the Popup
    Then I click on create class button "<CreateClass>"
    And Verify error message for school "<Errorschool>"
    And Verify error message is displayed for Name this class "<Errorclass>"
    #And Verify error message is displayed for What curriculum does this class cause "<Errorcurriculum>"
    #And Verify error message is displayed for Choose a picture to represent this class. "<Errorpicture>"
    And I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | CreateClass  | Errorschool            | Errorclass                 | Errorchildren          | Errorcurriculum        | Errorpicture                      |
      | Create Class | This field is required | Class name cannot be blank | This field is required | This field is required | Please select icon for your class |

  @REPORTS_Add_new_class_button @Sprint4 @IQA_106
  Scenario Outline: Org Admin Roster : Reports - Verify ROSTER- Add New Class button
    When I navigate_Top_MenuBar "ROSTER" "Add New Class"
    Then I checked for the Popup
    Then I select school from the dropdown "<Expected_SchoolName>"
    And I enter Name this class text "<Expected_ClassName>"
    #And I select Assign teacher to this class dropdown "<Expected_Assignteacher>"
    #And I select count of children in the class dropdown "<Expected_Childrencount>"
    And I select curriculam class dropdown "<Expected_curriculum>"
    And I select the picture
    And I click on create class button
    Then I verify added class is displayed with all details
    And I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | CreateClass  | Expected_SchoolName | Expected_ClassName | Expected_Assignteacher | Expected_curriculum |
      | Create Class | alden school1       | Morning Class      | Kunal teacher          | custom curriculum   |

  @REPORTS_Add_new_class @sprint4 @IQA_107 
  Scenario Outline: Org Admin Roster : Reports - Verify ROSTER- Add New Class Cancel button
    When I navigate_Top_MenuBar "ROSTER" "Add New Class"
    Then I checked for the Popup
    Then I click on cancel button "<Cancelbutton>"
    And I verify View all classes page is displayed "<ViewClassPage>"
    And I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Cancelbutton | ViewClassPage    |
      | Cancel       | View All Classes |

  @OrgAdmin_Report_MegaMenu @Sprint4 @IQA_88
  Scenario: Verify user should see the menus in the subsection of Roster.
    When I navigate to top menu bar "ROSTER" ""
    And verify given menus present on Roster subsection with and
      | View & Edit Schools | Add New School | View & Edit Classes | Add New Class | Roster CSV | ChildPlus XML | Import History | View & Edit Educators | Add New Educator | View & Edit Children | View & Edit Family Members | Add New Child | Carryover Last Year's Children | Organization Settings | Hatchsync Connections |
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @OrgAdmin_ROSTER_View_And_Edit_Users @Sprint4 @IQA_89 @IQA_90
  Scenario Outline: Org Admin Roster : Roster Page- View and Edit Users
    When I navigate to the and "ROSTER" "View & Edit Educators"
    Then I checked for the Popup
    And Verify we are on "View All Users" Page
    And Verify list of user displayed under header name
    And Verify header Activation "Activation" displayed on Page
    And Verify reset password icon displayed on Page
    And Verify resend invite icon displayed on Page
    And Verify header "Edit" diaplayed on Page
    And Verify i can select "<School_Name>" from school dropdown
    And Verify i can select "<Class_Name>" from class dropdown
    And Verify i can select "<Status>" from status dropdown
    And verify i can search user by name "<User_Name>" from search box
    And verify i can search user by email adress "<Email_Address>" from search box
    And Verify header Name "Name" is present and able to sort user after clicking on it
    And Verify header Email "Email Address" is present and able to sort user after clicking on it
    And Verify header School "School" is present and able to sort user after clicking on it
    # And Verify header Role with filter "<Filter by role>"
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Filter by role | School_Name              | Class_Name      | Status | User_Name       | Email_Address               |
      | Lead Teacher   | Bright Horizon Institute | Oak Haven Class | Active | Grace Ellington | graceellington@inboxeen.com |

  @OrgAdmin_ROSTER_Add_New_User @Sprint4 @IQA_91
  Scenario Outline: Org Admin Roster : Roster- Add New User Page
    When I navigate to the "ROSTER" "Add New Educator"
    Then I checked for the Popup
    Then Verify we are on "Add Users" Page
    And Verify i can select user role "<User_Role>" from dropdown
    And Verify i can select School or schools from dropdown
      | alden school1 | Ascend Academy |
    And Verify i can enter user first name to add user
    And Verify i can enter user last name to add user
    And Verify i can enter user email to add user
    And Verify i can click on Add user button
    And Verify after clicking on done adding user get redirect to view all user page with title "View All Users"
    Then Verify we are on "View All Users" Page
    And Verify added user should get displyed on view all user page using name
    And Verify added user should get displayed on view all user Page using email
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | User_Role    |
      | School Admin |

  @OrgAdmin_ROSTER_Add_New_User @Sprint4 @IQA_92 @IQA_94
  Scenario Outline: Org Admin Roster : Roster- Add New User Page error on mandatory field
    When I navigate to the "ROSTER" "Add New Educator"
    Then I checked for the Popup
    Then Verify we are on "Add Users" Page
    And click on Add user button without filling input box
    And Verify error message getting diaplyed "<Error_Message_On_Add_UserPage>"
    And Verify after clicking on cancel button reidrect to "View All Users" page
    Then I navigate to the "DASHBOARD" ""

    Examples: 
      | Error_Message_On_Add_UserPage |
      | This field is required        |

  #Duplicate test case
  #@OrgAdmin_ROSTER_Add_New_User @Sprint4 @IQA_93
  #Scenario Outline: Org Admin Roster : Roster- added user get displyed on View all user page
  #When I navigate to the "ROSTER" "Add New Educator"
  #Then Verify we are on "Add Users" Page
  #And Verify i can select user role "<User_Role>" from dropdown
  #And Verify i can select School or schools from dropdown
  #| 1 | grace school |
  #And Verify i can enter user first name
  #And Verify i can enter user last name
  #And Verify i can enter user email
  #And Verify i can click on Add user button
  #
  #Then I navigate to the "DASHBOARD" ""
  #
  #Examples:
  #| User_Role    |
  #| School Admin |
  @orgadmin_verifyimporthistorypage @Sprint5 @IQA_118
  Scenario Outline: Org Admin Roster : ImportHistoryPage -VerifyImportHistoryPage
    When I navigate "ROSTER" "Import History"
    Then I checked for the Popup
    And I am able to see import status page "<pagename>"
    And I am able to select filter import types "<impfilter>"
    And I am able to see import type header
    And I am able to see file name header
    And I am able to see status header
    And I am able to see started header
    And I am able to see list of import history
    And I am able to see row header for import summary window
    And I am able to see column header for import summary window
    And I am able to see issue header for import summary window
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | pagename        | impfilter                  |
      | Import Complete | Children and Parent Import |

  @orgadmin_verifyimportchildplusxml @Sprint5 @IQA_119
  Scenario Outline: Org Admin Roster : ImportChildPlusPage- VerifyImportChildPlusPage
    When I navigate "ROSTER" "ChildPlus XML"
    Then I checked for the Popup
    And I am able to see import data child plus page "<page_title>"
    And I am able to see video thumbnail
    And I am able to see choose childplus files button
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | page_title                 |
      | Import Data from ChildPlus |

  @orgadmin_verifyorganizationsettings @Sprint5 @IQA_120
  Scenario Outline: Org Admin Roster : OrganizationSettings- VerifyOrganizationSettingPage
    When I navigate "ROSTER" "Organization Settings"
    Then I checked for the Popup
    And I am able to see organization setting page "<pagename>"
    And I am able to see roster data management section "<section>"
    And I am able to toggle teachers from adding or editing classes
    And I am able to toggle teachers can belongs to up to 10 schools
    And I am able to see child photo managment header
    And I am able to see photo placeholder for children without photo toggle
    And I am able to see teacher approval for photos toggle
    And I am able to see invite parents to submit photo toggle
    And I am able to see Save Setting button
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | pagename              | section                |
      | Organization Settings | Roster Data Management |

  @orgadmin_verifycanclebuttonforganizationsetting @Sprint5 @IQA_121
  Scenario Outline: Org Admin Roster : OrganizationSettings- VerifyCancleButtonOfOrganizationSettingPage
    When I navigate "ROSTER" "Organization Settings"
    Then I checked for the Popup
    And I am able to see organization setting page "<pagename>"
    And I am able to click on save settings button and see save message "<msg>"
    And I am able to click on cancle button from organization setting page

    Examples: 
      | pagename              | msg                            |
      | Organization Settings | Settings saved & action logged |

  @orgadmin_verifyhatchsyncpage @Sprint5 @IQA_122
  Scenario Outline: Org Admin Roster : Hatchsync- VerifyHatchSyncPage
    When I navigate "ROSTER" "Hatchsync Connections"
    Then I checked for the Popup
    And I am able to see hatchsync page with name "<pagename>"
    And I am able to see connection cards
    And I am able to add connection card
    And I am able to see hatchsync pop up "<popup>"
    And I am able to add hatch sync card by entering "<hatchusername>" and "<hatchpassword>"
    And I am able to click on radio button
    And I am able to click on check box
    And I am able to click on save button
    And I am able to see message "<msg1>" or "<msg2>"
    And I am able to click on hatch sync cancle button
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | pagename                             | popup          | hatchpassword | hatchusername | msg1                                                   | msg2                                                         |
      | HatchSync - Teaching Strategies GOLD | HatchSync GOLD | Infogen@2022  | TestAmit04    | Connection already exist for entered user credentials. | Something went wrong when we tried to activate your service. |

  @OrgAdmin_ROSTER_Add_New_Child_Side_Panel @IQA_112 @PEG_16361
  Scenario: Org Admin Roster : ROSTER- Add New Child Page side panel
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

  @orgadmin_verifyhatchsyncpagesheader @Sprint5 @IQA_123
  Scenario Outline: Org Admin Roster : Hatchsync- VerifyHatchSyncPageHeader
    When I navigate "ROSTER" "Hatchsync Connections"
    Then I checked for the Popup
    And I am able to see hatchsync page with name "<pagename>"
    And I am able to see hatch sync table header school
    And I am able to see hatch sync table header number of teachers
    And I am able to see hatch sync table header number of children
    And I am able to see hatch sync table header percentage of children match to gold
    And I am able to see hatch sync table header documents sent
    And I am able to click on hatchsync school name
    And I am able to see teaching strategies gold report page "<reportpgname>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | reportpgname        | pagename                             |
      | Teaching Strategies | HatchSync - Teaching Strategies GOLD |

  @orgadmin_verifyroatercsvpage @Sprint5 @IQA_115
  Scenario Outline: Org Admin Roster : RosterCsv- VerifyRosterCsvPage
    #Given I close the popup if any opens
    When I navigate "ROSTER" "Roster CSV"
    Then I checked for the Popup
    And I am able to see import roster csv page "<pagename>"
    And I am able to see four accordian on page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | pagename          |
      | Import Roster CSV |

  @OrgAdmin_ROSTER_Add_New_Child @PEG_16358 @IQA_111 @OrgAdmin_ROSTER_Add_New_Child_Displayed_On_View_Page @IQA_113 @Sprint5 @pending
  Scenario Outline: Org Admin Roster : ROSTER- Add New Child page functionality
    When I navigate to the "ROSTER" "Add New Child"
    Then I checked for the Popup
    Then Verify we are on "Add Child" Page
    And Verify i can select school "<School_Name>" and Class "<Class_Name>" from given dropdown
    And verify i can enter Child first Name
    And verify i can enter Child last Name
    And verify i can enter Child Date of birth "<Birth_Date>" from calender
    Then Verify i can select Educational journey with "Ignite" with Language "English"
    Then Verify i can take photo of child by clicking on Camera button
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
      | School_Name | Class_Name | Birth_Date  | Gender | Race  | Ethnicity          | Language | Grade             | ChildrenPAgeTitle |
      | ele School  | ele class  | 16/May/2019 | Male   | Asian | Hispanic or Latino | English  | Preschool (3 yrs) | View All Children |

  #@OrgAdmin_ROSTER_Add_New_Child_Vaidation_msg @IQA_112 @Sprint5
  #Scenario Outline: ROSTER- Add New Child displayed on View all children
  #When I navigate to the and "ROSTER" "Add New Child"
  #Then Verify we are on "Add Children In Your Class" Page
  #And Verify i can click on Done button
  #And Verify validation message dislayed for mandatory name field "<Child_Name_ValidationMessage>"
  #And Verify validation message dislayed for mandatory dropdown field "<DropDown_Validation_Message>"
  #Then I navigate to the "DASHBOARD" ""
  #
  #Examples:
  #| Child_Name_ValidationMessage | DropDown_Validation_Message |
  #| Please enter a valid name    | Please select a option      |
  
  @OrgAdmin_ROSTER_View_All_Children_Page @OrgAdmin_ROSTER_Edit_Children_Page @IQA_108 @IQA_109 @Sprint5
  Scenario Outline: ROSTER- Add New Child displayed on View all children
    When I navigate to the and "ROSTER" "View & Edit Children"
    Then I checked for the Popup
    Then Verify we are on "View All Children" Page
    And Verify children list displayed on view all children page
    And Verify i can select Status "Active" from DropDown
    And Verify i can search child by name "<Child_Name>" through search box
    And Verify i can deactivate the child
    And Verify i can select Status "Inactive" from DropDown
    And Verify i can search child by name "<Child_Name>" through search box
    And Verify i can activate the child
    And Verify i can select School "<School_Name>" from DropDown
    And Verify i can select Class "<Class_Name>" from DropDown
    And Verify i can select Status "Active" from DropDown
    And Verify i can edit the child info
    Then I checked for the Popup
    Then Verify we are on "Child Profile" Page
    And i click on back button
    Then Verify we are on "View All Children" Page
    And Verify i can search child by name "<Child_Name>" through search box
    And Verify after clikcing on child name i redirect to Child Skill Detail page with titl "<Child_Skill_Page>"
    Then I navigate to the "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name | Class_Name | Status   | Child_Name | Child_Skill_Page   |
      | ele School  | ele class  | Inactive | Vikram H   | Child Skill Detail |

  @orgadmin_ViewAdnEditParentsPage @Sprint5 @IQA_110 
  Scenario Outline: Roster-View and Edit Parents Page
    When I navigate to the and "ROSTER" "View & Edit Family Members"
    Then I checked for the Popup
    Then Verify we are on "View All Family Members" Page
    And Verify i can see list of parent present on View All Parent Page
    And Verify i can search parent by name "<Parent_Name>" from search box
    And verify i can Deactivate Parent user
    And Verify i can select Status "Inactive" from DropDown
    And Verify i can search parent by email "<Parent_Email>" from search box
    And verify i can Activate Parent user
    And Verify i can select Status "Active" from DropDown
    And Verify i can sort by clicking on Parent Name header
    And Verify i can sort by clicking on Parent Email header
    And Verify i can sort by clicking on Parent Child header
    And Verify i can search parent by email "<Parent_Email>" from search box
    And Verify i can select School Name "<School_Name>" from DropDown
    And Verify i can select Class Name "<Class_Name>" from DropDown
    And Verify i can Reset Parent user passowrd
    And Verify i can resend invite to parent user
    And Verify i can search parent by name "<Parent_Name>" from search box
    And verify i can edit parent user info
    Then Verify we are on "Child Profile" Page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name     | Class_Name     | Status1 | Parent_Name | Parent_Email             | Status2  |
      | Primorks School | Primorks class | Active  | Ella        | parent.ella@inboxeen.com | Inactive |

  @Orgadmin_ROSTER_Add_New_Child_Page @PEG_16364 @Sprint68
  Scenario Outline: OrgAdmin : ROSTER- Add New Child Page side menu
    When I navigate to the and "ROSTER" "View & Edit Children"
    Then I checked for the Popup
    Then Verify we are on "View All Children" Page
    And I am able to click on edit info button
    And I am able to see child profile page "<page>"
    And I am able to click on basic info side menu
    And I am able to see basic info section
    And I am able to click on educational journey side menu
    And I am able to see educational joureny section
    And I am able to click on family member
    And I am able to see family member section
    And I am able to click on gold settings side menu
    And I am able to see gold settings section

    Examples: 
      | page          |
      | Child Profile |

  @orgadmin_roster_menu_logout @Sprint5 @IQA_55 @PEG_16361 @class 
  Scenario: Verify Org Admin Roster Menu - LogOut button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Hatch Insight"
