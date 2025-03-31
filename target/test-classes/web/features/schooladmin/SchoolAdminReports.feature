Feature: SchoolAdmin Report Test Suit

  @schooladmin_Reports_Login @PEG-15830 @run
  Scenario Outline: School Admin Reports - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo

    #Then I am on school admin home page
    Examples: 
      | url                                  | username                     | password |
      | https://rms.hatchearlychildhood.com/ | iqa_schooladmin@inboxeen.com |   123456 |

  @schooladmin_verifyReportsMenu @IQA_258 @Sprint7
  Scenario: Reports Menu Verification- Verify Reports Menu
    And I am able to verify mega menu "IGNITE REPORTS" ""
    Then I verify menus present in the subsections
      | School Progress | Class Progress | Child Progress | School Play Time | Class Play Time | Child Play Time | Growth Report | Device Ignite Version | Utilization | Play Log | Child Time | School Entry Report | Class Entry Report | Child Entry Report |

  #@schooladmin_verifychildplaytimepage @IQA_263 @Sprint7 @run
  #Scenario Outline: Child Playtime Page Verification- Verify Child Playtime Page
    #When I navigate to top menu bar "REPORTS" "Child Play Time"
    #And I am able to see child play time page "<childplaytime>"
    #And I am able to select school from dropdown child playtime "<schdrp>"
    #And I am able to select class from dropdown child playtime "<clsdrp>"
    #And I am able to select subdomain from dropdown "<subdrp>"
    #And I am able to see playtime with respective colors "<greencolor>" "<orangecolor>" "<redcolor>"
    #And I am able to select play time as last week
    #And I am able to see playtime with respective colors "<greencolor>" "<orangecolor>" "<redcolor>"
    #And I am able to select play time as school year
    #And I am able to see playtime with respective colors for school years
    #And I am able to select play time as custom
    #And I am able to see playtime with respective colors for custom "<start_date>" "<end_date>"
    #And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
     #Then I checked the Loader
    #And Verify i can select Teacher from the Teachers dropdown
      #| Sc_admin teacher |
       #Then I checked the Loader
    #And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    #And I navigate to top menu bar "DASHBOARD" ""
    #Then I am on school admin home page
#
    #Examples: 
      #| greencolor | orangecolor | redcolor | expectedGreenBar | expectedOrangeBar | expectedRedBar | start_date | end_date    | childplaytime   | schdrp         | clsdrp        | subdrp        | start_date | end_date |
      #| 30+ min    | 10-29 min   | < 10 min | 1110+ min        | 370-1073 min      | < 370 min      | 1/Aug/2021 | 18/Apr/2022 | Child Play Time | Scadmin_school | Scadmin_class | Self-Identity | 12:00 AM   | 11:59 PM |


#Old code 
  #@schooladmin_verifyschoolprogresspage @IQA_264 @IQA_279 @Sprint7
  #Scenario Outline: School Progress Page Verification- Verify School Progress Page
  #When I navigate to top menu bar "REPORTS" "School Progress"
  #And I am able to see school progress page "<schoolprogress>"
  #And I am able to select schools from school dropdown school progress "<schdrp>"
  #And I am able to select subdomain from subdomain dropdown form school progress "<subdrp>"
  #And I am able to select langauge from progress page
  #And I am able to see list of schools with progress bar
  #And I navigate to top menu bar "DASHBOARD" ""
  #Then I am on school admin home page
  
   @SchoolAdmin_IGNITEREPORTS_School_Progress_This_Week @PEG-15830
  Scenario Outline: School Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Progress This week
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
    #Then I clicked on School name and naviagted to the Class Progress Page
    #Then I checked the Loader
    #And Verify on clicking the Entry Progress I should navigated to the "Child Journey Through Entry Experiences" page
    #Then I checked the Loader
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schoolname | 
      | Scadmin_school | 
      
      
       @SchoolAdmin_IGNITEREPORTS_School_Progress_Last_Week @PEG-15830
  Scenario Outline: School Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Progress Last Week
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
    #Then I clicked on School name and naviagted to the Class Progress Page
    #Then I checked the Loader
    #And Verify on clicking the Entry Progress I should navigated to the "Child Journey Through Entry Experiences" page
    #Then I checked the Loader
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schoolname | 
      | Scadmin_school |
      
      
       @SchoolAdmin_IGNITEREPORTS_School_Progress_Current_School_year @PEG-15830
  Scenario Outline: School Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Progress Current School Year
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
    #Then I clicked on School name and naviagted to the Class Progress Page
    #Then I checked the Loader
    #And Verify on clicking the Entry Progress I should navigated to the "Child Journey Through Entry Experiences" page
    #Then I checked the Loader
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | schoolname | 
      | Scadmin_school | 
      
      
      
      
       @SchoolAdmin_IGNITEREPORTS_School_Progress_Custom_range @PEG-15830
  Scenario Outline: School Admin IGNITE REPORTS -Verify IGNITE REPORTS - School Progress Custom range
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
      | schoolname  |start_date  | end_date    |
      | Scadmin_school   |01/Aug/2021 | 31/Jul/2022 |
  
  
  
  
  #Old code 
  #Examples:
  #| schoolprogress  | schdrp       | subdrp     |
  #| School Progress | grace school | 2-D Shapes |
  #@schooladmin_verifyclassprogresspage @IQA_265 @IQA_280 @Sprint7
  #Scenario Outline: Class Progress Page Verification- Verify Class Progress Page
  #When I navigate to top menu bar "REPORTS" "Class Progress"
  #And I am able to see class progress page "<classparogress>"
  #And I am able to select schools from school dropdown class progress "<schdrp>"
  #And I am able to select subdomain from subdomain dropdown class progress "<subdrp>"
  #And I am able to select langauge from progress page
  #And I am able to see list of class with progress bar
  #And I navigate to top menu bar "DASHBOARD" ""
  #Then I am on school admin home page
  #
  #Examples:
  #| classparogress | schdrp       | subdrp        |
  #| Class Progress | grace school | Earth Science |
  #@schooladmin_verifychildprogresspage @IQA_266 @IQA_281 @Sprint7
  #Scenario Outline: Child Progress Page Verification- Verify Child Progress Page
  #When I navigate to top menu bar "REPORTS" "Child Progress"
  #And I am able to see child progress page "<childprogress>"
  #And I am able to select schools from child progress dropdown "<schdrp>"
  #And I am able to select class from child progress dropdown "<clsdrp>"
  #And I am able to select subdomain from child progress dropdown "<subdrp>"
  #And I am able to select langauge from progress page
  #And I am able to see list of child with progress bar
  #And I navigate to top menu bar "DASHBOARD" ""
  #Then I am on school admin home page
  #
  #Examples:
  #| childprogress  | schdrp       | clsdrp      | subdrp     |
  #| Child Progress | grace school | grace class | 2-D Shapes |
  #@schooladmin_verifyschoolplaytimepage @IQA_267 @Sprint7
  #Scenario Outline: School Playtime Page Verification- Verify School Playtime Page
  #When I navigate to top menu bar "REPORTS" "School Play Time"
  #And I am able to see school play time page "<schoolplaytime>"
  #And Verify the List of schools with playtime bar
  #And I am able to see playtime with respective colors "<greencolor>" "<orangecolor>" "<redcolor>"
  #And I am able to select school play time as last week
  #And I am able to see playtime with respective colors "<greencolor>" "<orangecolor>" "<redcolor>"
  #And I am able to select school play time as school year
  #And I am able to see playtime with respective colors for school years
  #And I am able to select school play time as custom
  #And I am able to see playtime with respective colors for custom "<start_date>" "<end_date>"
  #And I navigate to top menu bar "DASHBOARD" ""
  #
  #Examples:
  #| greencolor | orangecolor | redcolor | greencolor | orangecolor  | redcolor  | schoolplaytime   | start_date | end_date   |
  #| 30+ min    | 10-29 min   | < 10 min | 1140+ min  | 380-1102 min | < 380 min | School Play Time | 1/Aug/2021 | 1/Apr/2022 |
  
  @Schooladmin_verifychildprogressreportpage @IQA_266 @IQA_281 @Sprint7 @PEG-15828
  Scenario Outline: School Admin Child progress ReportPage- VerifyChildProgressReport
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
      | Sc_admin teacher |
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
      | Child Progress | Scadmin_class | Academic Vocabulary    | Scadmin_school      |

  @Schooladmin_verifychildprogressreportpage @IQA_266 @IQA_281 @Sprint7 @PEG-15828
  Scenario Outline: School Admin Child progress ReportPage- VerifyChildProgressReport
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
      | Sc_admin teacher |
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
      | Child Progress | Scadmin_class | Academic Vocabulary    | Scadmin_school      |

  @Schooladmin_verifychildprogressreportpage @IQA_266 @IQA_281 @Sprint7 @PEG-15828
  Scenario Outline: School Admin Child progress ReportPage- VerifyChildProgressReport
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
      | Sc_admin teacher |
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
      | Child Progress | Scadmin_class | Academic Vocabulary    | Scadmin_school      |

  @Schooladmin_verifychildprogressreportpage @IQA_266 @IQA_281 @Sprint7 @PEG-15828
  Scenario Outline: School Admin Child progress ReportPage- VerifyChildProgressReport
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
      | Sc_admin teacher |
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
      | Child Progress | Scadmin_class | Academic Vocabulary    | Scadmin_school      | 01/Aug/2021 | 31/Jul/2022 |

  @SchoolAdmin_REPORTS_School_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15827
  Scenario Outline: School Admin Verify REPORTS - School Play Time - This Week page functionality
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

  @Schooladmin_REPORTS_Child_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15825
  Scenario Outline: School adminVerify REPORTS - Child Play Time - This Week page functionality
    Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "Scadmin_school" from School dropdown for child Playtime
    And I am able to select class from class dropdown "Scadmin_class" for child playtime
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
      Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | Sc_admin teacher |
       Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_School_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15827
  Scenario Outline: School Admin Verify REPORTS - School Play Time - This Week page functionality
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

  @SchoolAdmin_REPORTS_School_Play_Time_School_Year @Sprint3 @IQA_77 @PEG_15827
  Scenario Outline: School Admin Verify REPORTS - School Play Time - This Week page functionality
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
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And I am able to see playtime with respective colors for school years
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_School_Play_Time_CustomRange @Sprint3 @IQA_77 @PEG_15827
  Scenario Outline: School Admin Verify REPORTS - School Play Time - This Week page functionality
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
      | School_Name    | start_date  | end_date    | Start_time | End_Time |
      | Scadmin_school | 01/Aug/2021 | 31/Jul/2022 | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_Class_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15822
  Scenario Outline: School Admin Verify REPORTS - Class Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "Scadmin_school" from School dropdown
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
      | Sc_admin teacher |
       Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_Class_Play_Time_Last_Week @Sprint3 @IQA_77 @PEG_15822 
  Scenario Outline: School Admin Verify REPORTS - Class Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "Scadmin_school" from School dropdown
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
      | Sc_admin teacher |
       Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_Class_Play_Time_School_Year @Sprint3 @IQA_77 @PEG_15822 
  Scenario Outline: School Admin Verify REPORTS - Class Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "Scadmin_school" from School dropdown
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
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
     Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | Sc_admin teacher |
       Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And I am able to see playtime with respective colors for school years
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_Class_Play_Time_CustomRange @Sprint3 @IQA_77 @PEG_15822 
  Scenario Outline: School Admin Verify REPORTS - Class Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Class Play Time"
    Then I checked for the Popup
    Then Verify we are on "Class Play Time" Page
    Then Verify i Select "Scadmin_school" from School dropdown
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
    And Verify i can select Teacher from the Teachers dropdown
      | Sc_admin teacher |
       Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name    | start_date  | end_date    | Start_Time | End_Time |
      | Scadmin_school | 01/Aug/2021 | 31/Jul/2022 | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_Child_Play_Time_This_Week @Sprint3 @IQA_77 @PEG_15826 
  Scenario Outline: School Admin Verify REPORTS - Child Play Time - This Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "Scadmin_school" from School dropdown for child Playtime
    And I am able to select class from class dropdown "Scadmin_class" for child playtime
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
    And Verify i Select Show play time for "This Week" for child Playtime
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
     Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | Sc_admin teacher |
       Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_Child_Play_Time_Last_Week @Sprint3 @IQA_77 @PEG_15826 
  Scenario Outline: School Admin Verify REPORTS - Child Play Time - Last Week page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "Scadmin_school" from School dropdown for child Playtime
    And I am able to select class from class dropdown "Scadmin_class" for child playtime
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
    And Verify i Select Show play time for "Last Week" for child Playtime
    And Verify "30+ min" for green "10-29 min" for orange "< 10 min" for red color progress bar
    And I am able to see playtime with StartTime and EndTime"<Start_time>""<End_time>" with Exclude Weekends checkbox
     Then I checked the Loader
    And Verify i can select Teacher from the Teachers dropdown
      | Sc_admin teacher |
       Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_Child_Play_Time_School_Year @Sprint3 @IQA_77 @PEG_15826 
  Scenario Outline: School Admin Verify REPORTS - Child Play Time - School Year page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "Scadmin_school" from School dropdown for child Playtime
    And I am able to select class from class dropdown "Scadmin_class" for child playtime
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
      | Sc_admin teacher |
       Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | Start_time | End_time |
      | 12:00 AM   | 11:59 PM |

  @SchoolAdmin_REPORTS_Child_Play_Time_CustomRange @Sprint3 @IQA_77 @PEG_15826 
  Scenario Outline: School Admin Verify REPORTS - Child Play Time - Custom Range page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "Child Play Time"
    Then I checked for the Popup
    Then Verify we are on "Child Play Time" Page
    Then Verify i Select "Scadmin_school" from School dropdown for child Playtime
    And I am able to select class from class dropdown "Scadmin_class" for child playtime
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
     And Verify i can select Teacher from the Teachers dropdown
      | Sc_admin teacher |
       Then I checked the Loader
    And I am able to verify access play type filter"All""Teacher Login""Family Member Login"
    And Verify i see a list of classes as per the selected school
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | School_Name    | start_date  | end_date    |
      | Scadmin_school | 01/Aug/2021 | 31/Jul/2022 |

  @schooladmin_verifysupportneededpage @IQA_283 @Sprint_8
  Scenario Outline: School Admin Support Needed Page Verification- Verify Support Needed Page
    When I navigate to top menu bar "IGNITE REPORTS" "Support Needed"
    Then I checked for the Popup
    And I am able to see support needed page "<supportneededpage>"
    And I am able to see class header
    And I am able to see scores less than 80 percentage
    And I am able to see scores less than 50 percentage
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on school admin home page

    Examples: 
      | supportneededpage |
      | Support Needed    |

  @schooladmin_verifyplaylogreportpage @Sprint_8 @IQA_284 
  Scenario Outline: School Admin Play log Report Page Verification- Verify Play Log Report Page
    When I navigate to top menu bar "IGNITE REPORTS" "Play Log"
    Then I checked for the Popup
    And I am able to see play log page "<playlogpage>"
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
    Then I am on school admin home page

    Examples: 
      | playlogpage | startdate  | schname        | clsname       | chiname    | agedropdown | gradedropdown   | langaugedropdown | racedropdown                     | ethinicitydropdown     | experinectype | domaindropdown                       | hatchsyncdocumentation  | enddate    |
      | Play Log    | 8/Aug/2022 | Scadmin_school | Scadmin_class | Sc_admin c |           2 | Toddler (2 yrs) | English          | American Indian or Alaska Native | Not Hispanic or Latino | Core          | Language & Communication Development | HatchSync Documentation | 1/Nov/2022 |

  @schooladmin_verifychildtimeandprogressexportpage @Sprint_8 @IQA_285
  Scenario: School Admin Child Time and Progress Export Page Verification- Verify Child Time and Progress Export Page
    When I navigate to top menu bar "IGNITE REPORTS" "Child Time"
    Then I checked for the Popup
    Then Verify we are on "Child Time & Progress Export" Page
    And Click On filtering option on the Child Time & Progress Export
    And Enter the start date "12/Jan/2022" and end Date "1/Aug/2022"
    And Set the duration format of data to download
    And Select School Name from list of schools in dropdown
      | Scadmin_school |
    And Select Class Name from list of Class in dropdown
      | Scadmin_class |
    And Select Child Name from list of Children in dropdown
      | Sc_admin c |
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
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on school admin home page

  @schooladmin_verifydeviceigniteversionpage @Sprint_8 @IQA_286
  Scenario Outline: School Admin Device Ignite Version Page Verification- Verify Device Ignite Version Page
    When I navigate to top menu bar "IGNITE REPORTS" "Device Ignite Version"
    Then I checked for the Popup
    And I am able to see device ignite version page "<deviceversionpage>"
    And I am able to see last sync header
    And I am able to see app version header
    And I am able to see school or home device header
    And I am able to see teacher or parent name header
    And I am able to see device type header
    And I am able to see id number header
    And I am able to see detail list
    And I am able to select schools name from dropdown
      | Scadmin_school |
    And I am able to select teacher name from dropdown
      | Sc_admin teacher |
    And I am able to select parent name from dropdown
      | Sc_admin fmembers |
    And I am able to select device type from dropdown
      | ACER |
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on school admin home page

    Examples: 
      | deviceversionpage     |
      | Device Ignite Version |

#Old code --- The page has removed 
  #@schooladmin_verifysetupandutilizationpage @Sprint_8 @IQA_287
  #Scenario Outline: School Admin SetUp and Utilization Page Verification- Verify SetUp and Utilization Page
  #When I navigate to top menu bar "IGNITE REPORTS" "Setup Status"
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
  #And I am able to see average playtime
  #And I am able to see average playtime per child last week text "<avgtext>"
  #And I am able to see text on page
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
  @SchoolAdmin_SchoolEntryReportPage @PEG_17457
  Scenario Outline: School Admin Ignite Report - School Entry Report - 	Verify the Functionality of ignite School Entry Page
    When I navigate to top menu bar "IGNITE REPORTS" "School Entry Report"
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
    And The user should be able to see the list of schools
    And User should be able to see the skill demonstrated after hovering over on dots present on the page
    And Users should be able to see skill emerging, Skill Demonstrated and Not Offered text on the school entry report page
    And The user should be able to see the entry completion by school bar
    And The user should be able to see the number of schools completed entry count
    And User should be able to select schools "<school_Name>" from the school dropdown
    And After clicking on school names user should be able to navigate to the class entry report page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | select_Domain                        | select_Subdomain                | school_Name    |
      | Language & Communication Development | Receptive Language & Vocabulary | Scadmin_school |

  @Schooladmin_ClassEntryReportPage @PEG_17720
  Scenario Outline: school admin Ignite Report - School Entry Report - 	Verify the Functionality of ignite School Entry Page
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
      | select_Domain                        | select_Subdomain                | school_Name    | class_Name    |
      | Language & Communication Development | Receptive Language & Vocabulary | Scadmin_school | Scadmin_class |

  @Schooladmin_SchoolEntryReportPage @PEG_17597
  Scenario Outline: School Admin Ignite Report - School Entry Report - 	Verify the Functionality of ignite School Entry Page
    When I navigate to top menu bar "IGNITE REPORTS" "School Entry Report"
    Then I checked for the Popup
    Then Verify we are on "Entry Reports" Page
    And The user should be able to click on load more children button
    And The user should be able to see the list of children
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
    And User should be able to see the skill demonstrated after hovering over on dots present on the page
    And Users should be able to see skill emerging, Skill Demonstrated and Not Offered text on the school entry report page
    And The user should be able to see the entry completion by child bar
    And The user should be able to see the number of children completed entry count
    And After clicking on school names user should be able to navigate to the class entry report page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | select_Domain                        | select_Subdomain                | school_Name    |
      | Language & Communication Development | Receptive Language & Vocabulary | Scadmin_school |

  @Schooladmin_childEntryReportPage @PEG_17721
  Scenario Outline: School Admin Ignite Report - School Entry Report - 	Verify the Functionality of ignite School Entry Page
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
    Then I checked for the Popup
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

    Examples: 
      | select_Domain                        | select_Subdomain                | school_Name    | class_Name    |
      | Language & Communication Development | Receptive Language & Vocabulary | Scadmin_school | Scadmin_class |

  @SchoolAdmin_ChildSkillDetails_ConferenceReport @PEG_18015
  Scenario: School Admin Ignite Report - Child Skill Details - Conference Report
    When I navigate to top menu bar "IGNITE REPORTS" "Child Skill Detail Report"
    Then I checked for the Popup
    Then Verify we are on "Child Skill Detail - Conference Reports" Page
    Then The user should be able to see the child name column
    Then The user should be able to see Ignite report column
    Then The user should be able to see the IgniteTable report column
    And The user should be able to see the child name list
    And The user should be able to click on view from Ignite reports column
    And The user should be able to navigate to the Ignite child skill detail report page of that child
    Then I checked for the Popup
    And The user should be able to navigate to the IgniteTable child skill detail report page of that child
    Then I checked for the Popup
    And The user should be able to click on the print button
    When Select classes from the filter
      | Scadmin_class |
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @SchoolAdmin_school_setup_page_funvtionalty @Sprint_75 @PEG-18356
  Scenario: School Admin school setup report page - Verify the school setup report page functionality
    When I navigate to top menu bar "IGNITE REPORTS" "School Setup"
    Then I checked for the Popup
    And I am able to see school setup report page "School Setup Report"
    And Verify text in blue banner "Setup Report"
    And I am able to click on learn more link
    And I am able to see Ignite Tab "IGNITE"
    And I am able to see school setup report page "School Setup Report"
    And I am able to see IgniteTable Tab "IGNITETABLE"
    Then I checked for the Popup
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
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"

  @SchoolAdmin_School_Utiliazation_Report_page_functionalty @Sprint_78 @PEG-18762
  Scenario: School Admin School Utiliazation report page - Verify the School Utiliazation report functionality
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

  @SchoolAdmin_Class_Utilization_page_functionalty @Sprint_78 @PEG-18760
  Scenario: School Admin Class utilization report page - Verify the Class utilization report page functionality
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
      | Scadmin_school |
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

  @schooladmin_Reports_Logout @PEG-15830
  Scenario: Verify School Admin Reports - Logout button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
