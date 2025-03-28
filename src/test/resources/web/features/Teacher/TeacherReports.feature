@Regression_Test
Feature: Teacher Report Menus/Pages Test

  @TeacherReports_login @PEG-18761 @PEG-15829 @failed
  Scenario Outline: Teacher Reports - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on teacher home page

    Examples: 
      | url                                  | username                 | password |
      | https://rms.hatchearlychildhood.com/ | iqa_teacher@inboxeen.com |   123456 |

  @Teacher_REPORTS_Class_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15822 @run
  Scenario Outline: Teacher Verify REPORTS - Class Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "teach_School" from School dropdown
    Then Verify i click on demographic dropdown button
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And Verify i Select Show play time for "This Week" for class playtime
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
       Then I checked the Loader
       And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
         Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @Teacher_REPORTS_Class_Play_Time_Last_Week @Sprint3 @IQA_77 @PEG_15822 @run
  Scenario Outline: Teacher Verify REPORTS - Class Play Time - Last Week page functionality
    Then Verify child popup appears and close the child pop up
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "teach_School" from School dropdown
    Then Verify i click on demographic dropdown button
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And Verify i Select Show play time for "Last Week" for class playtime
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
     Then I checked the Loader
       And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
         Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @Teacher_REPORTS_Class_Play_Time_School_Year @Sprint3 @IQA_77 @PEG_15822 @run
  Scenario: Teacher Verify REPORTS - Class Play Time - School Year page functionality
    Then Verify child popup appears and close the child pop up
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "teach_School" from School dropdown
    Then Verify i click on demographic dropdown button
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And Verify i Select Show play time for "Current School Year (Aug-Jul)" for class playtime
    And I am able to see playtime with respective colors for school years
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_REPORTS_Class_Play_Time_CustomRange @Sprint3 @IQA_77 @PEG_15822
  Scenario Outline: Teacher Verify REPORTS - Class Play Time - Custom Range page functionality
    Then Verify child popup appears and close the child pop up
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "teach_School" from School dropdown
    Then Verify i click on demographic dropdown button
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And Verify i Select Show play time for Custom Range for class playtime
    And I am able to see playtime with respective colors for custom "<start_date>" "<end_date>"
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
     Then I checked the Loader
       And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
         Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | School_Name  | start_date  | end_date    | Start_time | End_time |
      | teach_School | 01/Aug/2021 | 31/Jul/2022 | 12:00 AM   | 11:59 PM |

  @Teacher_REPORTS_Child_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15826 @run
  Scenario Outline: Teacher Verify REPORTS - Child Play Time - This Week page functionality
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "teach_School" from School dropdown for child Playtime
    And I am able to select class from class dropdown "teach_Class" for child playtime
    And I am able to select subdomain from subdomain dropdown "Self-Identity" for child playtime
    Then Verify i click on demographic dropdown button for child playtime
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And Verify i Select Show play time for "This Week" for child Playtime
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @Teacher_REPORTS_Class_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15823 @run
  Scenario Outline: Teacher Verify REPORTS - Class Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "teach_School" from School dropdown
    Then Verify i click on demographic dropdown button
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And Verify i Select Show play time for "This Week" for class playtime
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
       Then I checked the Loader
       And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
         Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @Teacher_REPORTS_Child_Play_Time_Last_Week @Sprint3 @IQA_77 @PEG_15826
  Scenario Outline: Teacher Verify REPORTS - Child Play Time - Last Week page functionality
    Then Verify child popup appears and close the child pop up
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "teach_School" from School dropdown for child Playtime
    And I am able to select class from class dropdown "teach_Class" for child playtime
    And I am able to select subdomain from subdomain dropdown "Self-Identity" for child playtime
    Then Verify i click on demographic dropdown button for child playtime
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And Verify i Select Show play time for "Last Week" for child Playtime
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    Then I checked the Loader
       And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
         Then I checked the Loader
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @Teacher_REPORTS_Child_Play_Time_School_Year @Sprint3 @IQA_77 @PEG_15826 @run
  Scenario: Teacher Verify REPORTS - Child Play Time - School year page functionality
    Then Verify child popup appears and close the child pop up
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "teach_School" from School dropdown for child Playtime
    And I am able to select class from class dropdown "teach_Class" for child playtime
    And I am able to select subdomain from subdomain dropdown "Self-Identity" for child playtime
    Then Verify i click on demographic dropdown button for child playtime
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And Verify i Select Show play time for "Current School Year (Aug-Jul)" for child Playtime
    And I am able to see playtime with respective colors for school years
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_REPORTS_Child_Play_Time_CustomRange @Sprint3 @IQA_77 @PEG_15826 @run
  Scenario Outline: Teacher Verify REPORTS - Child Play Time - Custom Range page functionality
    Then Verify child popup appears and close the child pop up
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "teach_School" from School dropdown for child Playtime
    And I am able to select class from class dropdown "teach_Class" for child playtime
    And I am able to select subdomain from subdomain dropdown "Self-Identity" for child playtime
    Then Verify i click on demographic dropdown button for child playtime
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And Verify i Select Show play time for Custom Range for child playtime
    And I am able to see playtime with respective colors for custom "<start_date>" "<end_date>"
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
     Then I checked the Loader
       And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
         Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | School_Name | start_date  | end_date    | Start_date | End_time |
      | adad        | 01/Aug/2021 | 31/Jul/2022 | 12:00 AM   | 11:59 PM |

  #@Teacher_verifyclassprogressreportpage @IQA_299 @Sprint_8
  #Scenario Outline: ReportPage- VerifyClassProgressReport
  #When I navigate to the "REPORTS" "Class Progress"
  #And I am able to see class progress page "<classprogress>"
  #And I am able to select schools dropdown from classprogress "<clsschooldropdown>"
  #And I am able to select class subdomain dropdown "<clssubdomaindropdown>"
  #And I am able to select langauge
  #And I am able to see list of class with progress bar "classlist"
  #Then I navigate to top menu bar "DASHBOARD" ""
  #Then Verify child popup appears and close the child pop up
  #
  #Examples:
  #| classprogress  | clsschooldropdown | clssubdomaindropdown |
  #| Class Progress | 12.0             | Academic Vocabulary  |
  #@Teacher_verifychildprogressreportpage @IQA_300 @Sprint_8
  #Scenario Outline: ReportPage- VerifyChildProgressReport
  #When I navigate to the "REPORTS" "Child Progress"
  #And I am able to see child progress page "<childprogress>"
  #And I am able to select schools dropdown from childprogress "<childschooldropdown>"
  #And I am able to select class from dropdown "<classdropdown>"
  #And I am able to select child subdomain dropdown "<childsubdomaindropdown>"
  #And I am able to select langauge
  #And I am able to see list of children with progress bar "childlist"
  #Then I navigate to top menu bar "DASHBOARD" ""
  #Then Verify child popup appears and close the child pop up
  #
  #Examples:
  #| childprogress  | classdropdown | childsubdomaindropdown | childschooldropdown |
  #| Child Progress | classImage      | Academic Vocabulary    | 12.0               |
  @Teacher_verifychildprogressreportpage_This_week @IQA_300 @Sprint_8 @PEG-15829
  Scenario Outline: Teacher child progress ReportPage- VerifyChildProgressReport This week
    When I navigate to the "IGNITE REPORTS" "Child Progress"
    Then I checked for the Popup
    Then I checked the Loader
    And I am able to see child progress page "<childprogress>"
    And I am able to select schools dropdown from childprogress "<childschooldropdown>"
    And I am able to select class from dropdown "<classdropdown>"
    And I am able to select child subdomain dropdown "<childsubdomaindropdown>"
    Then I checked the Loader
    Then Verify i click on demographic dropdown button
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    Then I checked the Loader
    And Verify i Select Show play time for "This Week" for child Playtime
    Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
    Then I checked the Loader
    And Verify i see a list of classes as per the selected school
    And Verify i should able to sort the list of children
    Then I checked the Loader
    Then I clicked on Child name and naviagted to the child skill details page
    Then I checked the Loader
    Then I clicked on Child name and naviagted to the child skill details page
    Then I checked the Loader
    And Verify on clicking the Entry Progress I should navigated to the "Child Journey Through Entry Experiences" page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | childprogress  | classdropdown | childsubdomaindropdown | childschooldropdown |
      | Child Progress | teach_Class   | Academic Vocabulary    | teach_School        |

  @Teacher_verifychildprogressreportpage_Last_week @IQA_300 @Sprint_8 @PEG-15829
  Scenario Outline: Teacher child progress ReportPage- VerifyChildProgressReport Last week
    When I navigate to the "IGNITE REPORTS" "Child Progress"
    Then I checked for the Popup
    Then I checked the Loader
    And I am able to see child progress page "<childprogress>"
    And I am able to select schools dropdown from childprogress "<childschooldropdown>"
    And I am able to select class from dropdown "<classdropdown>"
    And I am able to select child subdomain dropdown "<childsubdomaindropdown>"
    Then I checked the Loader
    Then Verify i click on demographic dropdown button
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    Then I checked the Loader
    And Verify i Select Show play time for "Last Week" for child Playtime
    Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
    Then I checked the Loader
    And Verify i see a list of classes as per the selected school
    And Verify i should able to sort the list of children
    Then I checked the Loader
    Then I clicked on Child name and naviagted to the child skill details page
    Then I checked the Loader
    And Verify on clicking the Entry Progress I should navigated to the "Child Journey Through Entry Experiences" page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | childprogress  | classdropdown | childsubdomaindropdown | childschooldropdown |
      | Child Progress | teach_Class   | Academic Vocabulary    | teach_School        |

  @Teacher_verifychildprogressreportpage_Current_School_year @IQA_300 @Sprint_8 @PEG-15829
  Scenario Outline: Teacher child progress ReportPage- VerifyChildProgressReport current School Year
    When I navigate to the "IGNITE REPORTS" "Child Progress"
    Then I checked for the Popup
    Then I checked the Loader
    And I am able to see child progress page "<childprogress>"
    And I am able to select schools dropdown from childprogress "<childschooldropdown>"
    And I am able to select class from dropdown "<classdropdown>"
    And I am able to select child subdomain dropdown "<childsubdomaindropdown>"
    Then I checked the Loader
    Then Verify i click on demographic dropdown button
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    Then I checked the Loader
    And Verify i Select Show play time for "Current School Year (Aug-Jul)" for child Playtime
    Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
    Then I checked the Loader
    And Verify i see a list of classes as per the selected school
    And Verify i should able to sort the list of children
    Then I checked the Loader
    And Verify on clicking the Entry Progress I should navigated to the "Child Journey Through Entry Experiences" page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | childprogress  | classdropdown | childsubdomaindropdown | childschooldropdown |
      | Child Progress | teach_Class   | Academic Vocabulary    | teach_School        |

  @Teacher_verifychildprogressreportpage_Custom_range @IQA_300 @Sprint_8 @PEG-15829
  Scenario Outline: Teacher child progress ReportPage- VerifyChildProgressReport custom range
    When I navigate to the "IGNITE REPORTS" "Child Progress"
    Then I checked for the Popup
    Then I checked the Loader
    And I am able to see child progress page "<childprogress>"
    And I am able to select schools dropdown from childprogress "<childschooldropdown>"
    And I am able to select class from dropdown "<classdropdown>"
    And I am able to select child subdomain dropdown "<childsubdomaindropdown>"
    Then I checked the Loader
    Then Verify i click on demographic dropdown button
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    Then I checked the Loader
    And Verify i Select Show play time for Custom Range for child playtime
    And I am able to set custom date range "<start_date>" "<end_date>"
    Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | teach teacher |
    Then I checked the Loader
    And Verify i see a list of classes as per the selected school
    And Verify i should able to sort the list of children
    Then I checked the Loader
    Then I clicked on Child name and naviagted to the child skill details page
    Then I checked the Loader
    And Verify on clicking the Entry Progress I should navigated to the "Child Journey Through Entry Experiences" page
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | childprogress  | classdropdown | childsubdomaindropdown | childschooldropdown | start_date  | end_date    |
      | Child Progress | teach_Class   | Academic Vocabulary    | teach_School        | 01/Aug/2021 | 31/Jul/2022 |

  @Teacher_verifyplaylogreportpage @IQA_304 @Sprint_8
  Scenario Outline: Teacher ReportPage- VerifyPlaylogReport
    Then Verify child popup appears and close the child pop up
    When I navigate to the "IGNITE REPORTS" "Play Log"
    Then I checked for the Popup
    And I am able to see play log page "<playlog>"
    And I am able to expand the accordian
    And I am able to select start date from time range section "<startdate>"
    And I am able to select end date from time range section "<enddate>"
    And I am able to select time from display time as section "displaytimeas"
    And I am able to select school from filter within organization section "schdropdown" "<schname>"
    And I am able to select age from filter by demographic data section "agdropdown" "<agedropdown>"
    And I am able to select class from filter within organization section "clsdropdown" "<clsname>"
    And I am able to select grade from filter by demographic data section "gradropdown" "<gradedropdown>"
    And I am able to select child from filter within organization section "chidropdown" "<chiname>"
    And I am able to select langauge from filter by demographic data section "langdropdown" "<langaugedropdown>"
    And I am able to select race from dropdown "racdropdown" "<racedropdown>"
    And I am able to select ethinicity from dropdown "ethdropdown" "<ethinicitydropdown>"
    And I am able to select experinece type from filter by subject matter section "exptype" "<experinectype>"
    And I am able to select domain type from filter by subject matter section "domname" "<domaindropdown>"
    And I am able to select hatch sync documentaion type "<hatchsyncdocumentation>"
    And I am able to see download report button
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | playlog  | startdate  | schname      | clsname     | chidropdown | agedropdown | gradedropdown   | langaugedropdown | racedropdown                     | ethinicitydropdown     | experinectype | domaindropdown                       | hatchsyncdocumentation  | enddate    | chiname |
      | Play Log | 8/Aug/2021 | teach_School | teach_Class | teach c     |           2 | Toddler (2 yrs) | English          | American Indian or Alaska Native | Not Hispanic or Latino | Core          | Language & Communication Development | HatchSync Documentation | 4/Apr/2022 | teach c |

  @Teacher_Child_Time_&_Progress_Export @IQA_305 @Sprint_8 @ChildTIme
  Scenario: Teacher Verify Child Time & Progress Export page functionality
    Then Verify child popup appears and close the child pop up
    When I navigate to top menu bar "IGNITE REPORTS" "Child Time"
    Then I checked for the Popup
    Then Verify we are on "Child Time & Progress Export" Page
    And Click On filtering option on the Child Time & Progress Export
    And Enter the start date "12/Jan/2021" and end Date "15/Aug/2021"
    And Set the duration format of data to download
    And Select School Name from list of schools in dropdown
      | teach_School |
    And Select Class Name from list of Class in dropdown
      | teach_Class |
    And Select Child Name from list of Children in dropdown
      | teach c |
    And Select Domain from list in dropdown
      | Language & Communication Development | Science & Technology |
    And Set Age for Demograghic data
      | 2 | 3 | 4 | 5 |
    And Set Grade for Demograghic data
      | Preschool (3 yrs) |
    And Set Language for Demograghic data
      | English | Spanish |
    And Set Race for Demograghic data
      | Asian |
    And Set Ethnicity for Demograghic data
      | Not Hispanic or Latino |
    And Click on Download Report button
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

  @Teacher_classEntryReportPage @PEG_17720
  Scenario Outline: Teacher Ignite Report - Class Entry Report - 	Verify the Functionality of ignite School Entry Page
    When I navigate to top menu bar "IGNITE REPORTS" "Class Entry Report"
    Then I checked for the Popup
    Then Verify we are on "Entry Reports" Page
    And The user should be able to click on load more button
    And The user should be able to select a domain "<select_Domain>" from the domain dropdown
    And User should be able to select a subdomain "<select_Subdomain>" from the subdomain dropdown
    And User should be able to select fields from the demographics dropdown
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And User should be able to select schools "<school_Name>" from the school dropdown
    And User should be able to select class "<class_Name>" from the class dropdown
    And The user should be able to see the list of classes
    And User should be able to see the skill demonstrated after hovering over on dots present on the page
    And Users should be able to see skill emerging, Skill Demonstrated and Not Offered text on the school entry report page
    And The user should be able to see the entry completion by class bar
    And The user should be able to see the number of classes completed entry count
    And After clicking on class names user should be able to navigate to the child entry report page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | select_Domain                        | select_Subdomain                | school_Name  | class_Name  |
      | Language & Communication Development | Receptive Language & Vocabulary | teach_School | teach_Class |

  @Teacher_ChilsEntryReportPage @PEG_17890 @failed
  Scenario Outline: Teacher Ignite Report - School Entry Report - 	Verify the Functionality of ignite School Entry Page
    When I navigate to top menu bar "IGNITE REPORTS" "Child Entry Report"
    Then I checked for the Popup
    Then Verify we are on "Entry Reports" Page
    And The user should be able to click on load more children button
    And The user should be able to see the list of children
    #And The user should be able to see the entry completion by child bar
    And The user should be able to select a domain "<select_Domain>" from the domain dropdown
    And User should be able to select a subdomain "<select_Subdomain>" from the subdomain dropdown
    And User should be able to select fields from the demographics dropdown
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And User should be able to select schools "<school_Name>" from the school dropdown
    And User should be able to select class "<class_Name>" from the class dropdown
    And User should be able to see the skill demonstrated after hovering over on dots present on the page
    And Users should be able to see skill emerging, Skill Demonstrated and Not Offered text on the school entry report page
        And User should be able to select class "<class_Name>" from the class dropdown
    
    And The user should be able to see the number of children completed entry count
    And After clicking on child names user should be able to navigate to the child skill details page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | select_Domain                        | select_Subdomain                | school_Name  | class_Name  |
      | Language & Communication Development | Receptive Language & Vocabulary | teach_School | teach_Class |

  @Teacher_ClassEntryReportPage @PEG_17889
  Scenario Outline: Teacher Ignite Report - School Entry Report - 	Verify the Functionality of ignite School Entry Page
    When I navigate to top menu bar "IGNITE REPORTS" "Class Entry Report"
    Then I checked for the Popup
    Then Verify we are on "Entry Reports" Page
    And The user should be able to click on load more button
    And The user should be able to select a domain "<select_Domain>" from the domain dropdown
    And User should be able to select a subdomain "<select_Subdomain>" from the subdomain dropdown
    And User should be able to select fields from the demographics dropdown
    And I select option for age of children
      | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    And I select option for grade of children
      | Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    And I select option for Language of children
      | English | Spanish |
    And I select option for Race of children
      | American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    And I select option for Ethnicity of children
      | Hispanic or Latino | Not Hispanic or Latino | Not specified |
    Then i click on demographic filter apply button
    And User should be able to select schools "<school_Name>" from the school dropdown
    And User should be able to select class "<class_Name>" from the class dropdown
    And The user should be able to see the list of classes
    And User should be able to see the skill demonstrated after hovering over on dots present on the page
    And Users should be able to see skill emerging, Skill Demonstrated and Not Offered text on the school entry report page
    And The user should be able to see the entry completion by class bar
    And The user should be able to see the number of classes completed entry count
    And After clicking on class names user should be able to navigate to the child entry report page
    Then I checked for the Popup
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | select_Domain                        | select_Subdomain                | school_Name  | class_Name  |
      | Language & Communication Development | Receptive Language & Vocabulary | teach_School | teach_Class |

  @Teacher_child_skill_detail_conference_page @PEG-18145 @Sprint74
  Scenario Outline: Teacher child skill detail-Conference report page- Verify Teacher child skill detail conference report page functionality
    When I navigate to the and "IGNITE REPORTS" "Child Skill Detail Report"
    Then I checked for the Popup
    And I am able to see conference report page "<page>"
    And Select classes from the filter
      | teach_Class |
    And I am able to see child name column
    And I am able to see Ignite reports column
    And I am able to see IgniteTable reports column
    And I am able to see IgniteTable gameplay reports column
    And I am able to see the child name lists
    And I am able to navigate to ignite child skill detail page "<ignitepage>"
    And I am able to navigate to ignitetble child skill detail page "<ignitetablepage>"
    And I am able to navigate to gameplay report "<gamplaypage>"
    And I am able to click on print button
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | page                                    | ignitepage           | ignitetablepage           | gamplaypage                   |
      | Child Skill Detail - Conference Reports | Ignite Child Details | IgniteTable Child Details | Gameplay Report - IgniteTable |

  @Teacher_Class_setup_page_functionalty @Sprint_76 @PEG-18486
  Scenario: Teacher class setup report page - Verify the Class setup report page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Setup"
    Then I checked for the Popup
    And I am able to see class setup report page "Class Setup Report"
    And Verify text in blue banner "Setup Report"
    And I am able to click on learn more link on class setup page
    And I am able to see Ignite Tab "IGNITE"
    And I am able to see class setup report page "Class Setup Report"
    And I am able to see IgniteTable Tab "IGNITETABLE"
    Then I checked for the Popup
    And I navigate to top menu bar "IGNITE REPORTS" "Class Setup"
    Then I checked for the Popup
    And I am able to list Class name
    And I am able to see the children column on class setup page "Children"
    And I am able to see the class name column "Class Name"
    And I am able to see the Teacher name column "Teacher Name"
    And I am able to see the Accessed insights column "Accessed Insights"
    And I am able to see children Total column on class setup page "Total"
    And I am able to see ignite assigned column on class setup page "Ignite Assigned"
    And I am able to see children with family members column on Class setup "With Family Members"
    And I am able to see with photos column On Class Setup"With Photos"
    And I am able to see children playing column On Class Setup"Children Playing"
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @Teacher_Class_Utilization_page_functionalty @Sprint_78 @PEG-18761
  Scenario: Teacher Class utilization report page - Verify the Class utilization report page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Utilization"
    Then I checked for the Popup
    Then Verify we are on "Utilization Report - Ignite" Page
    And I am able to click on learn more link on class setup page
    And I am able to see Ignite Tab "IGNITE"
    Then I checked for the Popup
    And I am able to see IgniteTable Tab "IGNITETABLE"
    Then I checked for the Popup
    Then Verify we are on "Utilization Report - IgniteTable" Page
    And I navigate to top menu bar "IGNITE REPORTS" "Class Utilization"
    And I am able to select schools name from dropdown
      | teach_School |
    And I am able to see the class name column "Class Name"
    And I am able to list Class name
    And I am able to see the Ignite Usage column "Ignite Usage"
    And Verify subcolumns names under the Ignite Usage column
      | # of Children Playing | Total Games Played | Avg Child Skill Level | Avg Child Playtime |
    And I am able to sort the subcolumns under the Ignite Usage column
      | # of Children Playing | Total Games Played | Avg Child Skill Level | Avg Child Playtime |
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @TeacherReportsAccount_LogOut @PEG-15829
  Scenario: Teacher Reports Verify LogOut button from Account Subsection
    Then Verify child popup appears and close the child pop up
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
