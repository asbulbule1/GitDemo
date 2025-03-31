@RegressionTest 
Feature: Teacher Resources Menu

  @TeacherResources_login @IQA_315 @Sprint_9 @INS_TCH_TC_039
  Scenario Outline: Teacher Resources  - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on teacher home page

    Examples: 
      | url                                  | username                 | password | prod                          |
      | https://rms.hatchearlychildhood.com/ | iqa_teacher@inboxeen.com |   123456 | chris@hatchearlychildhood.com |


 @Teacher_Resources_Subsection_Menu @IQA_248 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Teacher Resources - Verify user should see the menus in the subsection.
    When I navigate to top menu bar "RESOURCES" ""
    And verify given menus present on Roster subsection with and
      | Research Backed | Alignments & Standards | Success Stories | Blog | Webinars | Videos | Help Center & Knowledge Base | Paid Product Training | Professional Development | Ignite - What does it mean to Ignite? | Ignite - App Installation | IgniteTable - Getting Started | Submit a Support Ticket |
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    
  @Teacher_Resources_Research_Backed_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: Teacher Resources -Teacher: Resources-  Research Backed  
  Then I navigate to top menu bar "RESOURCES" "Research Backed"
  Then Verify we are on resources Research Backed "Digital Learning Tools Backed by Research" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
  @Teacher_Resources_Alignments_Standards_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: Teacher Resources -Teacher: Resources-  Alignments & Standards 
  Then I navigate to top menu bar "RESOURCES" "Alignments & Standards"
  Then Verify we are on resources Alignments & Standards "Alignments & Correlations" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
 
  @Teacher_Resources_Success_Stories_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: Teacher Resources -Teacher: Resources-  Success Stories
  Then I navigate to top menu bar "RESOURCES" "Success Stories"
  Then Verify we are on resources Success Stories "Success Stories & Partnerships" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
  @Teacher_Resources_Blog_Menu_Navigation @PEG-18942 @Sprint-79 
  Scenario: Teacher Resources -Teacher: Resources-  Blog
  Then I navigate to top menu bar "RESOURCES" "Blog"
  Then Verify we are on resources Blog "The Hatch Early Learning Blog" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
   @Teacher_Resources_Webinars_Menu_Navigation @IQA_249 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Teacher Resources -Teacher: Resources-  Webinars
  Then I navigate to top menu bar "RESOURCES" "Webinars"
  Then Verify we are on resources Webinars "Hatch On-Demand Webinars" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
    @Teacher_Resources_Videos_Menu_Navigation @IQA_250 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Teacher Resources -Teacher: Resources- Videos
    Then I navigate to top menu bar "RESOURCES" "Videos"
    Then Verify we are on resources Videos "Engaging Content & Proven Results" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    

    
   @Teacher_Resources_Paid_Product_Training_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: Teacher Resources -Teacher: Resources-  Paid Product Training 
  Then I navigate to top menu bar "RESOURCES" "Paid Product Training"
  Then Verify we are on resources Paid Product Training "Product Training" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
   @Teacher_Resources_Professional_Development_Menu_Navigation @IQA_249 @Sprint_7  @PEG-18942 @Sprint-79 @run
  Scenario: Teacher Resources -Teacher: Resources-  Professional Development  
  Then I navigate to top menu bar "RESOURCES" "Professional Development"
  Then Verify we are on resources Professional Development "Professional Development" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
    @Teacher_Resources_Ignite_What_does_it_mean_to_Ignite?_Menu_Naviagation @IQA_257 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Teacher : Resources- Ignite - What does it mean to Ignite? Mega menu functionality
  Then I navigate to top menu bar "RESOURCES" "Ignite - What does it mean to Ignite?"
    Then Verify we are on resources what does it mean to ignite "Login" Page
   And Naviagate back to orgadmin Home page
    Then I am on org admin home page
    
     @Teacher_Resources_Ignite_App_InstallationMenu_Naviagation @IQA_255 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Teacher : Resources-Ignite - App Installation menu functionality
    Then I navigate to top menu bar "RESOURCES" "Ignite - App Installation"
    Then Verify we are on "Get your head in the game!" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on org admin home page
    
   #failing due to human verification issue
  #@Teacher_Resources_Help_Center_Knowldege_Menu_Navigation @IQA_327 @Sprint_8
  #Scenario: Teacher : Resources- Help Center and knowledge base
    #Then I navigate to the and "RESOURCES" "Help Center & Knowledge Base"
    #Then Verify we are on resources Help Center & Knowledge Base "Click Here For Back To School Resources" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
#Getting failed due to Human verification error  
     #@Teacher_Resources_IgniteTable_Getting_Started_Menu_Navigation @PEG-18942 @Sprint-79
  #Scenario: Teacher Resources -Teacher: Resources-  IgniteTable - Getting Started
  #Then I navigate to top menu bar "RESOURCES" "IgniteTable - Getting Started"
  #Then Verify we are on resources IgniteTable - Getting Started "Introducing IgniteTable by Hatch™ (Previously WePlaySmart)" Page
  #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #
  #Getting failed due to Human verification error 
       #@Teacher_Resources_Submit_a_Support_Ticket_Menu_Navigation @PEG-18942 @Sprint-79 
  #Scenario: Teacher Resources -Teacher: Resources-  Submit a Support Ticket 
  #Then I navigate to top menu bar "RESOURCES" "Submit a Support Ticket"
  #Then Verify we are on resources Submit a Support Ticket  "Submit a request" Page
  #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"






#==========================================================================
  #Old Test Cases
  #@Teacher_Resources_Videos_Menu_Navigation @INS_TCH_TC_033 @Sprint9
  #Scenario: Teacher: Resources- Product Video
    #When Verify child popup appears and close the child pop up
    #Given I navigate to top menu bar "RESOURCES" "Videos"
    #When Verify we are on resources Videos "Product Videos" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then Verify child popup appears and close the child pop up
#
  #@Teacher_Resources_PDF_Printables_Menu_Navigation @INS_TCH_TC_034 @Sprint9
  #Scenario: Teacher: Resources- PDF and Pritanbles
    #When I close child window if any and navigate back to parent window
    #When Verify child popup appears and close the child pop up
    #Given I navigate to top menu bar "RESOURCES" "PDFs and Printables"
    #When Verify we are on resources PDF and Printable "Product Guides" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then Verify child popup appears and close the child pop up
#
  #@Teacher_Resources_Discussion_Boards_Menu_Navigation @INS_TCH_TC_035 @Sprint9
  #Scenario: Teacher: Resources- Discussion Board
    #When I close child window if any and navigate back to parent window
    #When Verify child popup appears and close the child pop up
    #Given I navigate to top menu bar "RESOURCES" "Discussion Boards"
    #When Verify we are on resources Discussion Board "Discussion" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then Verify child popup appears and close the child pop up
#
  #@Teacher_Resources_Help_Center_Knowldege_Menu_Navigation @INS_TCH_TC_036 @Sprint9
  #Scenario: Teacher: Resources- Webinars
    #When I close child window if any and navigate back to parent window
    #When Verify child popup appears and close the child pop up
    #Given I navigate to top menu bar "RESOURCES" "Webinars"
    #When Verify we are on resources Webinars "Expert Webinars" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then Verify child popup appears and close the child pop up
#
  #@Teacher_Resources_Help_Center_Knowldege_Menu_Navigation @INS_TCH_TC_037 @Sprint9
  #Scenario: teacher: Resources- Help Center and knowledge base
    #When I close child window if any and navigate back to parent window
    #When Verify child popup appears and close the child pop up
    #Then I navigate to the and "RESOURCES" "Help Center & Knowledge Base"
    #And Verify we are on resources Help Center & Knowledge Base "Ignite by Hatch" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then Verify child popup appears and close the child pop up
#
  #@Teacher_Resources_Install_Ignite_GameMenu_Naviagation @INS_TCH_TC_038 @Sprint9
  #Scenario: teacher : Resources- Device Ignite Version menu functionality
    #When I close child window if any and navigate back to parent window
    #When Verify child popup appears and close the child pop up
    #Then I navigate to top menu bar "RESOURCES" "Install Ignite"
    #Then Verify we are on "Get your head in the game!" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then Verify child popup appears and close the child pop up
#
  #@Teacher_Resources_Device_Ignite_Menu_Naviagation @INS_TCH_TC_039 @Sprint9
  #Scenario: teacher : Resources- Device Ignite Version menu functionality
    #When I close child window if any and navigate back to parent window
    #When Verify child popup appears and close the child pop up
    #Then I navigate to top menu bar "RESOURCES" "Device Ignite Version"
    #Then I checked for the Popup
    #Then Verify we are on "Device Ignite Version" Page
    #And wait for 6 second on page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then Verify child popup appears and close the child pop up
#
  #@Teacher_Resources_What_Ignite_Menu_Naviagation @INS_TCH_TC_040 @Sprint9
  #Scenario: Teacher : Resources- What does it mean to ignite Mega menu functionality
    #When I close child window if any and navigate back to parent window
    #When Verify child popup appears and close the child pop up
    #Then I navigate to top menu bar "RESOURCES" "What does it mean to Ignite?"
    #Then Verify we are on resources what does it mean to ignite "Login" Page
    #And Naviagate back to Teacher Home page
    #Then Verify child popup appears and close the child pop up
#alrady commented
  #@Teacher_verifyTheHatchHubPage @Sprint_8 @IQA_315
  #Scenario Outline: Teacher Resources The Hatch Hub Page Verification- Verify Hatch Hub Page
  #Then I navigate to top menu bar "RESOURCES" "The Hatch Hub"
  #And I am able to see your hatch knowledge base "<page_title>"
  #And I am able to see header learn
  #And I am able to see header discuss
  #And I am able to see header my info
  #And I am able to see header support
  #And I am able to see header hatch insights
  #And I am able to click on profile link
  #And I am able to see profile page "<profilepage>"
  #And I am able to see logout button
  #And I am able to click on hatch insights text
  #When Verify child popup appears and close the child pop up
  #Examples:
  #| page_title                | profilepage           |
  #| Your Hatch Knowledge Base | 1-10 1class32 Teacher |
 
  @TeacherResorcesAccount_LogOut @INS_TCH_TC_040 @IQA_315
  Scenario: Teacher Resources Verify LogOut button from Account Subsection
    When Verify child popup appears and close the child pop up
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
