Feature: Org Admin IGNITE REPORTS Test

  @orgadmin_IGNITEREPORTS_login @run
  Scenario Outline: Org Admin IGNITE REPORTS - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on org admin home page

    Examples: 
      | url                                   | username                    | password |
      | https://rmssg.hatchearlylearning.com/ | tsgigniteadmin@inboxeen.com |   123456 |

  @OrgAdmin_Report_MegaMenu @Sprint3 @IQA_75
  Scenario: Org Admin IGNITE REPORTS -Verify user should see the menus in the subsection.
    When I navigate to top menu bar "IGNITE REPORTS" ""
    Then verify given menus present on subsection
      | School Progress | Class Progress | Child Progress | School Play Time | Class Play Time | Child Play Time | Support Needed | Growth Report | Device Ignite Version | Utilization | Play Log | Child Time | School Entry Report | Class Entry Report | Child Entry Report |
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  #Old code
  #@OrgAdmin_Growth_Report_Page @Sprint3 @IQA_82
  #Scenario Outline: Verify Growth report page functionality
  #Given I am on org admin home page
  #When I navigate to top menu bar "IGNITE REPORTS" "Growth Report"
  #Then Verify i select School "<SchoolName>" from school dropdown
  #And Verify i select Class "<ClassName>" from Class dropdown
  #And Verify i select Child "<ChildName>" from child dropdown
  #And Verify i see a List of Domains with the progress bar of Entry and Exit Session
  #| Social-Emotional Development | Language & Communication Development | Literacy | Mathematics |
  #Then I navigate to top menu bar "DASHBOARD" ""
  #
  #Examples:
  #| SchoolName   | ClassName   | ChildName | ChildName01 |
  #| ele School | ele class | Vikram H  | Joan W|
  @OrgAdmin_IGNITEREPORTS_School_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15820
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "School Play Time"
    Then I checked for the Popup
    Then Verify we are on "School Play Time" Page
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
    And Verify i Select Show play time for "This Week"
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_School_Play_Time_Last_Week @Sprint3 @IQA_77 @PEG-15820
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Play Time - Last Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "School Play Time"
    Then I checked for the Popup
    Then Verify we are on "School Play Time" Page
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
    And Verify i Select Show play time for "Last Week"
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_School_Play_Time_School_Year @Sprint3 @IQA_77 @PEG-15820 @uncommented
  Scenario Outline: Org Admin IGNITE REPORTS - Verify IGNITE REPORTS - School Play Time - School Year page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "School Play Time"
    Then I checked for the Popup
    Then Verify we are on "School Play Time" Page
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
    And Verify i Select Show play time for "Current School Year (Aug-Jul)"
    And I am able to see playtime with respective colors for school years
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_School_Play_Time_CustomRange @Sprint3 @IQA_77 @PEG-15820
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Play Time - custom page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "School Play Time"
    Then I checked for the Popup
    Then Verify we are on "School Play Time" Page
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
    And Verify i Select Show play time for Custom Range
    And I am able to see playtime with respective colors for custom "<start_date>" "<end_date>"
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name | start_date  | end_date    | Start_time | End_time |
      | ele School  | 01/Aug/2022 | 31/Jul/2023 | 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_Class_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15821
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - Class Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "ele School" from School dropdown
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
      | ele teacher |
    Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_Class_Play_Time_Last_Week @Sprint3 @IQA_77 @PEG_15821
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - Class Play Time - Last Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "ele School" from School dropdown
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
      | ele teacher |
    Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_Class_Play_Time_School_Year @Sprint3 @IQA_77 @PEG_15821
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - Class Play Time - School Year page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "ele School" from School dropdown
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
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | ele teacher |
    Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_Class_Play_Time_CustomRange @Sprint3 @IQA_77 @PEG_15821
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - Class Play Time - Custom Range page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "ele School" from School dropdown
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
      | ele teacher |
    Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name | start_date  | end_date    | Start_time | End_time |
      | ele School  | 01/Aug/2022 | 31/Aug/2023 | 12:00 AM   | 11.59 PM |

  @OrgAdmin_IGNITEREPORTS_School_Progress_This_week @PEG-15816 @test
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Progress This week
    When I navigate to top menu bar "IGNITE REPORTS" "School Progress"
    Then I checked for the Popup
    Then I checked the Loader
    Then Verify we are on "School Progress" Page
    And I am able to select schools from dropdown "schooldropdown" "<schoolname>"
    Then I checked the Loader
    And Select Domain from list in dropdown on School Progress
      | Language & Communication Development | Science & Technology |
    Then I checked the Loader
    And I am able to select schools subdomains dropdown "Academic Vocabulary"
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
    And Verify i Select Show play time for "This Week"
    And Verify i see a list of classes as per the selected school
    Then I checked the Loader
    And Verify i should able to sort the list of children
    Then I checked the Loader
    # Then I clicked on School name and naviagted to the Class Progress Page
    #Then I checked the Loader
    # And Verify on clicking the Entry Progress I should navigated to the "School Journey Through Entry Experiences" page
    #Then I checked the Loader
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schoolname |
      | ele School |

  @OrgAdmin_IGNITEREPORTS_School_Progress_Last_week @PEG-15816
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Progress Last week
    When I navigate to top menu bar "IGNITE REPORTS" "School Progress"
    Then I checked for the Popup
    Then I checked the Loader
    Then Verify we are on "School Progress" Page
    And I am able to select schools from dropdown "schooldropdown" "<schoolname>"
    Then I checked the Loader
    And Select Domain from list in dropdown on School Progress
      | Language & Communication Development | Science & Technology |
    Then I checked the Loader
    And I am able to select schools subdomains dropdown "Academic Vocabulary"
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
    And Verify i Select Show play time for "Last Week"
    And Verify i see a list of classes as per the selected school
    Then I checked the Loader
    And Verify i should able to sort the list of children
    Then I checked the Loader
    # Then I clicked on School name and naviagted to the Class Progress Page
    #Then I checked the Loader
    # And Verify on clicking the Entry Progress I should navigated to the "School Journey Through Entry Experiences" page
    #Then I checked the Loader
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schoolname | childsubdomaindropdown |
      | ele School | Academic Vocabulary    |

  @OrgAdmin_IGNITEREPORTS_School_Progress_Current_School_year @PEG-15816
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Progress Current School year
    When I navigate to top menu bar "IGNITE REPORTS" "School Progress"
    Then I checked for the Popup
    Then I checked the Loader
    Then Verify we are on "School Progress" Page
    And I am able to select schools from dropdown "schooldropdown" "<schoolname>"
    Then I checked the Loader
    And Select Domain from list in dropdown on School Progress
      | Language & Communication Development | Science & Technology |
    Then I checked the Loader
    And I am able to select schools subdomains dropdown "Academic Vocabulary"
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
    And Verify i Select Show play time for "Current School Year (Aug-Jul)"
    And Verify i see a list of classes as per the selected school
    Then I checked the Loader
    And Verify i should able to sort the list of children
    Then I checked the Loader
    # Then I clicked on School name and naviagted to the Class Progress Page
    #Then I checked the Loader
    # And Verify on clicking the Entry Progress I should navigated to the "School Journey Through Entry Experiences" page
    #Then I checked the Loader
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schoolname | childsubdomaindropdown |
      | ele School | Academic Vocabulary    |

  @OrgAdmin_IGNITEREPORTS_School_Progress_Custom_range @PEG-15816
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Progress Custom range
    When I navigate to top menu bar "IGNITE REPORTS" "School Progress"
    Then I checked for the Popup
    Then I checked the Loader
    Then Verify we are on "School Progress" Page
    And I am able to select schools from dropdown "schooldropdown" "<schoolname>"
    Then I checked the Loader
    And Select Domain from list in dropdown on School Progress
      | Language & Communication Development | Science & Technology |
    Then I checked the Loader
    And I am able to select schools subdomains dropdown "Academic Vocabulary"
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
    And Verify i see a list of classes as per the selected school
    Then I checked the Loader
    And Verify i should able to sort the list of children
    Then I checked the Loader
    # Then I clicked on School name and naviagted to the Class Progress Page
    #Then I checked the Loader
    # And Verify on clicking the Entry Progress I should navigated to the "School Journey Through Entry Experiences" page
    #Then I checked the Loader
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schoolname | childsubdomaindropdown | start_date  | end_date    |
      | ele School | Academic Vocabulary    | 01/Aug/2021 | 31/Jul/2022 |

  #Old code
  #@orgadmin_verifyschoolprogressreportpage @Sprint3 @IQA_79
  #Scenario Outline: IGNITE REPORTSPage-VerifySchoolProgressReport
  #When I navigate to the "IGNITE REPORTS" "School Progress"
  #And I am able to see school progress page "<schoolprogress>"
  #And I am able to select schools from dropdown "schooldropdown" "<schoolname>"
  #And I am able to select schools subdomains dropdown "subdomaindropdown"
  #And I am able to select langauge
  #And I am able to see list of schools with progress bar "schoollist"
  #Then I navigate to top menu bar "DASHBOARD" ""
  #Then I am on org admin home page
  #
  #Examples:
  #| schoolprogress  | schoolname   |
  #| School Progress | ele School |
  #
  #@orgadmin_verifyclassprogressreportpage @Sprint3 @IQA_80
  #Scenario Outline: ReportPage- VerifyClassProgressReport
  #When I navigate to the "IGNITE REPORTS" "Class Progress"
  #And I am able to see class progress page "<classprogress>"
  #And I am able to select schools dropdown from classprogress "<clsschooldropdown>"
  #And I am able to select class subdomain dropdown "<clssubdomaindropdown>"
  #And I am able to select langauge
  #And I am able to see list of class with progress bar "classlist"
  #Then I navigate to top menu bar "DASHBOARD" ""
  #Then I am on org admin home page
  #
  #Examples:
  #| classprogress  | clsschooldropdown | clssubdomaindropdown |
  #| Class Progress | ele class       | Academic Vocabulary  |
  @orgadmin_verifychildprogressreportpage @Sprint33 @IQA_81 @PEG-15819
  Scenario Outline: Org Admin Child progress ReportPage- VerifyChildProgressReport
    When I navigate to the "IGNITE REPORTS" "Child Progress"
    Then I checked for the Popup
    Then I checked the Loader
    And I am able to see child progress page "<childprogress>"
    And I am able to select schools dropdown from childprogress "<childschooldropdown>"
    And I am able to select class from dropdown "<classdropdown>"
    Then I checked the Loader
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
      | ele teacher |
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
      | Child Progress | ele class     | Academic Vocabulary    | ele School          |

  @orgadmin_verifychildprogressreportpage @Sprint33 @IQA_81 @PEG-15819
  Scenario Outline: Org Admin Child progress ReportPage- VerifyChildProgressReport
    When I navigate to the "IGNITE REPORTS" "Child Progress"
    Then I checked for the Popup
    Then I checked the Loader
    And I am able to see child progress page "<childprogress>"
    And I am able to select schools dropdown from childprogress "<childschooldropdown>"
    And I am able to select class from dropdown "<classdropdown>"
    Then I checked the Loader
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
      | ele teacher |
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
      | Child Progress | ele class     | Academic Vocabulary    | ele School          |

  @orgadmin_verifychildprogressreportpage @Sprint33 @IQA_81 @PEG-15819
  Scenario Outline: Org Admin Child progress ReportPage- VerifyChildProgressReport
    When I navigate to the "IGNITE REPORTS" "Child Progress"
    Then I checked for the Popup
    Then I checked the Loader
    And I am able to see child progress page "<childprogress>"
    And I am able to select schools dropdown from childprogress "<childschooldropdown>"
    And I am able to select class from dropdown "<classdropdown>"
    Then I checked the Loader
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
      | ele teacher |
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
      | Child Progress | ele class     | Academic Vocabulary    | ele School          |

  @orgadmin_verifychildprogressreportpage @Sprint33 @IQA_81 @PEG-15819
  Scenario Outline: Org Admin Child progress ReportPage- VerifyChildProgressReport
    When I navigate to the "IGNITE REPORTS" "Child Progress"
    Then I checked for the Popup
    Then I checked the Loader
    And I am able to see child progress page "<childprogress>"
    And I am able to select schools dropdown from childprogress "<childschooldropdown>"
    And I am able to select class from dropdown "<classdropdown>"
    Then I checked the Loader
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
      | ele teacher |
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
      | Child Progress | ele class     | Academic Vocabulary    | ele School          | 01/Aug/2021 | 31/Jul/2022 |

  @OrgAdmin_IGNITEREPORTS_Child_Play_Time_This_Week
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - Child Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    #Then Verify i Select "ele School" from School dropdown for child Playtime
    #And I am able to select class from class dropdown "ele class" for child playtime
    #And I am able to select subdomain from subdomain dropdown "Self-Identity" for child playtime
    #Then Verify i click on demographic dropdown button for child playtime
    #And I select option for age of children
    #| 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    #And I select option for grade of children
    #| Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    #And I select option for Language of children
    #| English | Spanish |
    #And I select option for Race of children
    #| American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    #And I select option for Ethnicity of children
    #| Hispanic or Latino | Not Hispanic or Latino | Not specified |
    #Then i click on demographic filter apply button
    #And Verify i Select Show play time for "This Week" for child Playtime
    #And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    #And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    #Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | Alistair Mooncrest | Amanda Davis |
    Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_Child_Play_Time_Last_Week @Sprint3 @IQA_77 @PEG_15826 @run
  Scenario: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - Child Play Time - Last Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    #Then I checked for the Popup
    #Then Verify we are on "Child Play Time" Page
    #Then Verify i Select "ele School" from School dropdown for child Playtime
   # And I am able to select class from class dropdown "ele class" for child playtime
   And I am able to select subdomain from subdomain dropdown "Self-Identity" for child playtime
    #Then Verify i click on demographic dropdown button for child playtime
    #And I select option for age of children
      #| 1 | 2 | 3 | 4 | 5 | 6 | 7 |
    #And I select option for grade of children
      #| Toddler (2 yrs) | Preschool (3 yrs) | Pre-K (4 yrs) | Kindergarten (5 yrs) | Mixed Age Pre-school | Not specified |
    #And I select option for Language of children
      #| English | Spanish |
    #And I select option for Race of children
      #| American Indian or Alaska Native | Asian | Black or African American | Hispanic or Latino | Native Hawaiian or other Pacific Islander | White | Two or More Races | Not specified |
    #And I select option for Ethnicity of children
      #| Hispanic or Latino | Not Hispanic or Latino | Not specified |
    #Then i click on demographic filter apply button
    #And Verify i Select Show play time for "Last Week" for child Playtime
    #And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    #And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    #Then I checked the Loader
    #And Verify i can select Teacher from the Teachers dropdown
      #| ele teacher |
    #Then I checked the Loader
    #And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    #And Verify i see a list of classes as per the selected school
    #Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    #Examples: 
      #| Start_time | End_time |
      #| 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_Child_Play_Time_School_Year @Sprint3 @IQA_77 @PEG_15826
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - Child Play Time - School year page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "ele School" from School dropdown for child Playtime
    And I am able to select class from class dropdown "ele class" for child playtime
    And I am able to select subdomain from subdomain dropdown "Self-Identity" for child playtime
    Then Verify i click on demographic dropdown button for child playtime
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
    And Verify i Select Show play time for "Current School Year (Aug-Jul)" for child Playtime
    And I am able to see playtime with respective colors for school years
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | ele teacher |
    Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @OrgAdmin_IGNITEREPORTS_Child_Play_Time_CustomRange @Sprint3 @IQA_77 @PEG_15826
  Scenario Outline: Org Admin IGNITE REPORTS -Verify IGNITE REPORTS - Child Play Time - Custom Range page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "ele School" from School dropdown for child Playtime
    And I am able to select class from class dropdown "ele class" for child playtime
    And I am able to select subdomain from subdomain dropdown "Self-Identity" for child playtime
    Then Verify i click on demographic dropdown button for child playtime
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
    And Verify i Select Show play time for Custom Range for child playtime
    And I am able to see playtime with respective colors for custom "<start_date>" "<end_date>"
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | ele teacher |
    Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name | start_date  | end_date    | Start_time | End_time |
      | ele School  | 01/Aug/2022 | 31/Aug/2023 | 12:00 AM   | 11.59 PM |

  #Old code - The page has removed
  #@orgadmin_verifysetuputiliationpage @Sprint3 @IQA_87
  #Scenario Outline: Org Admin IGNITE REPORTS -Report Page- VerifySetupUtilizationPage
  #When I navigate to the "IGNITE REPORTS" "Setup Status"
  #Then I checked for the Popup
  #And I am able to see school set up and utilization page "<title>"
  #And I am able to see setup remaining table "<tablename>"
  #And I am able to see children count
  #And I am able to see the text ready to play "<text>"
  #And I am able to see text "<textpage>"
  #And I am able to see view teachers button
  #And I am able to see training options button
  #And I am able to see school header
  #And I am able to see total teacher header
  #And I am able to see total classes header
  #And I am able to see %teachers trained this year header
  #And I am able to see %teachers visited insights
  #And I am able to see % of estimated children addded
  #And I am able to see % of children with parents
  #And I am able to see % of children with photos
  #And I am able to see % of children started play
  #And I am able to see list of schools "schoolnamelist"
  #And I am able to see school utilization table "<headertablename>"
  #And I am able to see average playtime "<playtimecount>"
  #And I am able to see average playtime per child last week text "<avgtext>"
  #And I am able to see text on page "text2"
  #And I am able to see setup school name header
  #And I am able to see setup total classes header
  #And I am able to see setup active children header
  #And I am able to see setup gold docs sent header
  #And I am able to see setup total reports login per class header
  #And I am able to see setup child playtime header
  #And I am able to see setup child sessions header
  #And I am able to see setup child skill level header
  #Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #
  #Examples:
  #| text                              | textpage           | headertablename    | playtimecount | avgtext                              | title                      | tablename       |
  #| have photos and are ready to play | School Utilization | School Utilization | 0 minutes     | average playtime per child last week | School Setup & Utilization | Setup Remaining |
  @Sprint3_shweta @orgadmin_Verify_IGNITEREPORTS_SupportNeeded_Page @Sprint3 @IQA83
  Scenario Outline: Org Admin IGNITE REPORTS -IGNITE REPORTS - Verify Support Needed
    When I am navigated on "IGNITE REPORTS" "Support Needed"
    Then I checked for the Popup
    Then verify Support Needed page "<Support_Title>"
    And verify the schools with score less than eighty "<ScoreEighty>"
    And verify the schools with score less than fifty "<Scorefifty>"
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    And I am on org admin home page

    Examples: 
      | Support_Title  | ScoreEighty  | Scorefifty   |
      | Support Needed | Scores < 80% | Scores < 50% |

  #Old code
  #@IGNITE REPORTS_School_Play_Time_this_week @Sprint3 @IQA_76
  #Scenario Outline: IGNITE REPORTS - Verify School Play Time this week
  #When I am navigated to the "IGNITE REPORTS" "School Play Time"
  #Then Verify This Week button is selected
  #And Verify the List of schools with playtime bar
  #And Display the time for this week
  #And Verify the time "<Green>" "<Orange>" "<Red>"
  #And I navigate to top menu bar "DASHBOARD" ""
  #And I am on org admin home page
  #
  #Examples:
  #| Green   | Orange    | Red      |
  #| 30+ min | 10-29 min | < 10 min |
  #
  #@IGNITE REPORTS_School_Play_Time_last_week @Sprint3 @IQA_208
  #Scenario Outline: IGNITE REPORTS - Verify School Play Time last week
  #When I am navigated to the "IGNITE REPORTS" "School Play Time"
  #Then Verify last Week button is selected
  #And Verify the List of schools with playtime bar
  #And Display the time for this week
  #And Verify the time "<Green>" "<Orange>" "<Red>"
  #And I navigate to top menu bar "DASHBOARD" ""
  #And I am on org admin home page
  #
  #Examples:
  #| Green   | Orange    | Red      |
  #| 30+ min | 10-29 min | < 10 min |
  #
  #@IGNITE REPORTS_School_Play_Time_School_Year @Sprint3 @IQA_211
  #Scenario Outline: IGNITE REPORTS - Verify School Play Time School Year
  #When I am navigated to the "IGNITE REPORTS" "School Play Time"
  #Then Verify School Year button is selected
  #And Verify the List of schools with playtime bar
  #And Display the time for this week
  #And I am able to select play time as school year on School Playtime Page
  #And I am able to see playtime with respective colors for school years
  #And I navigate to top menu bar "DASHBOARD" ""
  #And I am on org admin home page
  #
  #Examples:
  #| Green     | Orange       | Red       |
  #| 1140+ min | 380-1102 min | < 380 min |
  #
  #@IGNITE REPORTS_School_Play_Time_Custom_dates @Sprint3 @IQA_210
  #Scenario Outline: IGNITE REPORTS - Verify School Play Time Custom dates
  #When I am navigated to the "IGNITE REPORTS" "School Play Time"
  #Then Verify dates is selected from the calender
  #And Verify the List of schools with playtime bar4
  #And Display the time for this week
  #And I am able to select play time as custom on School playtime page
  #And I am able to see playtime with respective colors for custom "<start_date>" "<end_date>"
  #And I navigate to top menu bar "DASHBOARD" ""
  #And I am on org admin home page
  #
  #Examples:
  #| Green    | Orange      | Red       | start_date  | end_date    |
  #| 450+ min | 150-435 min | < 150 min | 01/Aug/2021 | 31/Jul/2022 |
  @orgadmin_verifyplaylogreportpage @Sprint3 @IQA_84
  Scenario Outline: Org Admin IGNITE REPORTS -ReportPage- VerifyPlaylogReport
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
    And I am able to select langauge from filter by demographic data section "langdropdown" "<langaugedropdown>"
    And I am able to select child from filter within organization section "chidropdown" "<chiname>"
    And I am able to select race from dropdown "racdropdown" "<racedropdown>"
    And I am able to select ethinicity from dropdown "ethdropdown" "<ethinicitydropdown>"
    And I am able to select experinece type from filter by subject matter section "exptype" "<experinectype>"
    And I am able to select domain type from filter by subject matter section "domname" "<domaindropdown>"
    And I am able to select hatch sync documentaion type "<hatchsyncdocumentation>"
    And I am able to see download report button
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on org admin home page

    Examples: 
      | playlog  | startdate  | schname    | clsname   | chidropdown | agedropdown | gradedropdown   | langaugedropdown | racedropdown                     | ethinicitydropdown     | experinectype | domaindropdown                       | hatchsyncdocumentation  | enddate    | chiname  |
      | Play Log | 8/Aug/2021 | ele School | ele class | Vikram H    |           2 | Toddler (2 yrs) | English          | American Indian or Alaska Native | Not Hispanic or Latino | Core          | Language & Communication Development | HatchSync Documentation | 4/Apr/2022 | Vikram H |

  @OrgAdmin_Child_Time_&_Progress_Export @Sprint3 @IQA_85 @failed
  Scenario: Org Admin IGNITE REPORTS -Verify Child Time & Progress Export page functionality
    When I navigate to the and "IGNITE REPORTS" "Child Time & Progress Export"
    Then I checked for the Popup
    Then Verify we are on "Child Time & Progress Export" Page
    And Click On filtering option on the Child Time & Progress Export
    And Enter the start date "12/Jan/2021" and end Date "15/Aug/2021"
    And Set the duration format of data to download
    And Set Age for Demograghic data
      | 2 | 3 | 4 | 5 |
    And Select School Name from list of schools in dropdown
      | ele School |
    And Select Class Name from list of Class in dropdown
      | ele class |
    And Select Child Name from list of Children in dropdown
      | Vikram H |
    And Select Domain from list in dropdown
      | Language & Communication Development | Science & Technology |
    And Set Grade for Demograghic data
      | Preschool (3 yrs) |
    And Set Language for Demograghic data
      | English | Spanish |
    And Set Race for Demograghic data
      | Asian |
    And Set Ethnicity for Demograghic data
      | Not Hispanic or Latino |
    And Click on Download Report button
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @OrgADminIGNITEREPORTS_School_Play_Time_Device_Ignite_Version @Sprint3 @IQA_86
  Scenario Outline: Org Admin IGNITE REPORTS -IGNITE REPORTS - Verify Status IGNITE REPORTS-Device Ignite Version
    When I navigate to top menu bar "IGNITE REPORTS" "Device Ignite Version"
    Then I checked for the Popup
    And I am able to see device ignite version page "<deviceversionpage>"
    And I am able to see last sync header
    And I am able to see app version header
    And I am able to see school or home device header
    And I am able to see teacher or parent name header
    And I am able to see detail list
    And I am able to select schools name from dropdown
      | ele School |
    And I am able to select teacher name from dropdown
      | Kunal teacher |
    And I am able to select parent name from dropdown
      | parent IQA |
    And I am able to select device type from dropdown
      | ACER |
    And I am able to see device type header
    And I am able to see id number header
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | deviceversionpage     |
      | Device Ignite Version |

  @OrgAdmin_SchoolEntryReportPage @PEG_17457
  Scenario Outline: Org Admin Ignite Report - School Entry Report - 	Verify the Functionality of ignite School Entry Page
    When I navigate to top menu bar "IGNITE REPORTS" "School Entry Report"
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
    And The user should be able to see the list of schools
    And User should be able to see the skill demonstrated after hovering over on dots present on the page
    And Users should be able to see skill emerging, Skill Demonstrated and Not Offered text on the school entry report page
    And The user should be able to see the entry completion by school bar
    And The user should be able to see the number of schools completed entry count
    And I checked for the entry Loader
    And After clicking on school names user should be able to navigate to the class entry report page
    And I navigate to top menu bar "DASHBOARD" "Ignite"

    Examples: 
      | select_Domain                        | select_Subdomain                | school_Name |
      | Language & Communication Development | Receptive Language & Vocabulary | ele School  |

  @OrgAdmin_ClassEntryReportPage @PEG_17458
  Scenario Outline: Org Admin Ignite Report - Class Entry Report - 	Verify the Functionality of ignite clas Entry Page
    When I navigate to top menu bar "IGNITE REPORTS" "Class Entry Report"
    Then I checked for the Popup
    Then Verify we are on "Entry Reports" Page
    And The user should be able to click on load more button
    And The user should be able to select a domain "<select_Domain>" from the domain dropdown
    And User should be able to select a subdomain "<select_Subdomain>" from the subdomain dropdown
    And User should be able to select schools "<school_Name>" from the school dropdown
    And User should be able to select class "<class_Name>" from the class dropdown
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
    And The user should be able to see the list of schools
    And User should be able to see the skill demonstrated after hovering over on dots present on the page
    And Users should be able to see skill emerging, Skill Demonstrated and Not Offered text on the school entry report page
    And The user should be able to see the entry completion by class bar
    And The user should be able to see the number of classes completed entry count
    And After clicking on class names user should be able to navigate to the child entry report page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | select_Domain                        | select_Subdomain                | school_Name | class_Name |
      | Language & Communication Development | Receptive Language & Vocabulary | ele School  | ele class  |

  @OrgAdmin_childEntryReportPage @PEG_17596
  Scenario Outline: Org Admin Ignite Report - child Entry Report - 	Verify the Functionality of ignite child Entry Page
    When I navigate to top menu bar "IGNITE REPORTS" "Child Entry Report"
    Then I checked for the Popup
    Then Verify we are on "Entry Reports" Page
    And The user should be able to click on load more children button
    And The user should be able to see the list of children
    And The user should be able to select a domain "<select_Domain>" from the domain dropdown
    And User should be able to select a subdomain "<select_Subdomain>" from the subdomain dropdown
    And User should be able to select schools "<school_Name>" from the school dropdown
    And User should be able to select class "<class_Name>" from the class dropdown
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
    And User should be able to see the skill demonstrated after hovering over on dots present on the page
    And Users should be able to see skill emerging, Skill Demonstrated and Not Offered text on the school entry report page
    And The user should be able to see the entry completion by child bar
    And The user should be able to see the number of children completed entry count
    And After clicking on child names user should be able to navigate to the child skill details page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | select_Domain                        | select_Subdomain                | school_Name | class_Name |
      | Language & Communication Development | Receptive Language & Vocabulary | ele School  | ele class  |

  @OrgAdmin_ChildSkillDetails_ConferenceReport @PEG_18014
  Scenario: Org Admin Ignite Report - Child Skill Details - Conference Report
    When I navigate to top menu bar "IGNITE REPORTS" "Child Skill Detail Report"
    Then I checked for the Popup
    Then Verify we are on "Child Skill Detail - Conference Reports" Page
    Then The user should be able to see the child name column
    Then The user should be able to see Ignite report column
    Then The user should be able to see the IgniteTable report column
    And The user should be able to see the child name list
    And The user should be able to click on view from Ignite reports column
    And The user should be able to navigate to the Ignite child skill detail report page of that child
    And The user should be able to navigate to the IgniteTable child skill detail report page of that child
    And The user should be able to click on the print button
    When Select classes from the filter
      | ele class |
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @Orgadmin_school_setup_page_functionalty @Sprint_74 @PEG-18146
  Scenario: Org Admin school setup report page - Verify the school setup report page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "School Setup"
    Then I checked for the Popup
    And I am able to see school setup report page "School Setup Report"
    And Verify text in blue banner "Setup Report"
    And I am able to click on learn more link
    And I am able to see Ignite Tab "IGNITE"
    And I am able to see school setup report page "School Setup Report"
    And I am able to see IgniteTable Tab "IGNITETABLE"
    And I navigate to top menu bar "IGNITE REPORTS" "School Setup"
    Then I checked for the Popup
    And I am able to see Ignite Tab "IGNITE"
    And I am able to see the teachers column "Teachers"
    And I am able to see the children column "Children"
    And I am able to see the school name column "School Name"
    And I am able to see of classes name column "# Of Classes"
    And I am able to see Total name column"Total"
    And I am able to see accessed insights name column"Accessed Insights"
    And I am able to see children Total column"Total"
    And I am able to see ignite assigned column"Ignite Assigned"
    And I am able to see children with family members column"With Family Members"
    And I am able to see with photos column"With Photos"
    And I am able to see children playing column"Children Playing"
    And I am able list school name
    Then I am able to click on School name and navigate class setup page "Class Setup Report"
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @Orgadmin_Class_setup_page_functionalty @Sprint_75 @PEG-18357
  Scenario: Org Admin class setup report page - Verify the Class setup report page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Setup"
    Then I checked for the Popup
    And I am able to see class setup report page "Class Setup Report"
    And Verify text in blue banner "Setup Report"
    And I am able to click on learn more link on class setup page
    And I am able to see Ignite Tab "IGNITE"
    And I am able to see class setup report page "Class Setup Report"
    And I am able to see IgniteTable Tab "IGNITETABLE"
    And I navigate to top menu bar "IGNITE REPORTS" "Class Setup"
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

  @Orgadmin_School_Utiliazation_Report_page_functionalty @Sprint_78 @PEG-18758
  Scenario: Org Admin School Utiliazation report page - Verify the School Utiliazation report functionality
    When I navigate to top menu bar "IGNITE REPORTS" "School Utilization"
    Then I checked for the Popup
    And I am able to see School utilization report page"Utilization Report - Ignite"
    And I am able to click on learn more link on School Utilization page
    And I am able to see Ignite Tab "IGNITE"
    And I am able to see School utilization report page"Utilization Report - Ignite"
    And I am able to see IgniteTable Tab "IGNITETABLE"
    Then I checked for the Popup
    And I am able to see School utilization report page"Utilization Report - IgniteTable"
    And I navigate to top menu bar "IGNITE REPORTS" "School Utilization"
    And I am able to list Class name
    And I am able to see the class name column of School utilization report page "# of Classes"
    And I am able to see the ChildrenPlaying column of School utilization report page "# of Children playing"
    And I am able to see the TotalGamePlayed column of School utilization report page "Total Games Played"
    And I am able to see the  TotalAvgSkilllevel column of School utilization report page "Avg Child Skill Level"
    And I am able to see the AvgChildPlaytime column of School utilization report page "Avg Child Playtime"
    And I am able to see the TotalInsightsLogins column of School utilization report page "Total Insights Logins"

  @Orgadmin_Class_Utilization_page_functionalty @Sprint_78 @PEG-18759
  Scenario: Org Admin Class utilization report page - Verify the Class utilization report page functionality
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
      | ele School |
    And I am able to see the class name column "Class Name"
    And I am able to list Class name
    And I am able to see the Ignite Usage column "Ignite Usage"
    And I am able to see the Teachers column "Teachers"
    And Verify subcolumns names under the Ignite Usage column
      | # of Children Playing | Total Games Played | Avg Child Skill Level | Avg Child Playtime |
    And I am able to sort the subcolumns under the Ignite Usage column
      | # of Children Playing | Total Games Played | Avg Child Skill Level | Avg Child Playtime |
    And Verify subcolumns names under the Teachers column
      | Name | Total Insights Logins | Last Login |
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @orgadmin_IGNITEREPORTS_logout @Sprint5 @IQA_55 @PEG-15816
  Scenario: Verify Org Admin IGNITE REPORTS - LogOut button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
