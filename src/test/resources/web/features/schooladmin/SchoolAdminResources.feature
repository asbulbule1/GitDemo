Feature: School Admin Resources

  @schooladmin_Resources_Login @IQA_328
  Scenario Outline: School Aadmin Resources - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on school admin home page

    Examples: 
      | url                                  | username                     | password |
      | https://rms.hatchearlychildhood.com/ | iqa_schooladmin@inboxeen.com |   123456 |
      
       @SchoolAdmin_Resources_Subsection_Menu @IQA_248 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: School Admin Resources - Verify user should see the menus in the subsection.
    When I navigate to top menu bar "RESOURCES" ""
    And verify given menus present on Roster subsection with and
      | Research Backed | Alignments & Standards | Success Stories | Blog | Webinars | Videos | Help Center & Knowledge Base | Paid Product Training | Professional Development | Ignite - What does it mean to Ignite? | Ignite - App Installation | IgniteTable - Getting Started | Submit a Support Ticket |
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    
  @SchoolAdmin_Resources_Research_Backed_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: School Admin Resources -School Admin: Resources-  Research Backed  
  Then I navigate to top menu bar "RESOURCES" "Research Backed"
  Then Verify we are on resources Research Backed "Digital Learning Tools Backed by Research" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
  @SchoolAdmin_Resources_Alignments_Standards_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: School Admin Resources -School Admin: Resources-  Alignments & Standards 
  Then I navigate to top menu bar "RESOURCES" "Alignments & Standards"
  Then Verify we are on resources Alignments & Standards "Alignments & Correlations" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
 
  @SchoolAdmin_Resources_Success_Stories_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: School Admin Resources -School Admin: Resources-  Success Stories
  Then I navigate to top menu bar "RESOURCES" "Success Stories"
  Then Verify we are on resources Success Stories "Success Stories & Partnerships" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
  @SchoolAdmin_Resources_Blog_Menu_Navigation @PEG-18942 @Sprint-79 
  Scenario: School Admin Resources -School Admin: Resources-  Blog
  Then I navigate to top menu bar "RESOURCES" "Blog"
  Then Verify we are on resources Blog "The Hatch Early Learning Blog" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
   @SchoolAdmin_Resources_Webinars_Menu_Navigation @IQA_249 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: School Admin Resources -School Admin: Resources-  Webinars
  Then I navigate to top menu bar "RESOURCES" "Webinars"
  Then Verify we are on resources Webinars "Hatch On-Demand Webinars" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
    @SchoolAdmin_Resources_Videos_Menu_Navigation @IQA_250 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: School Admin Resources -School Admin: Resources- Videos
    Then I navigate to top menu bar "RESOURCES" "Videos"
    Then Verify we are on resources Videos "Engaging Content & Proven Results" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    

    
   @SchoolAdmin_Resources_Paid_Product_Training_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: School Admin Resources -School Admin: Resources-  Paid Product Training 
  Then I navigate to top menu bar "RESOURCES" "Paid Product Training"
  Then Verify we are on resources Paid Product Training "Product Training" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
   @SchoolAdmin_Resources_Professional_Development_Menu_Navigation @IQA_249 @Sprint_7  @PEG-18942 @Sprint-79 @run
  Scenario: School Admin Resources -School Admin: Resources-  Professional Development  
  Then I navigate to top menu bar "RESOURCES" "Professional Development"
  Then Verify we are on resources Professional Development "Professional Development" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
    @SchoolAdmin_Resources_Ignite_What_does_it_mean_to_Ignite?_Menu_Naviagation @IQA_257 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: School Admin : Resources- Ignite - What does it mean to Ignite? Mega menu functionality
  Then I navigate to top menu bar "RESOURCES" "Ignite - What does it mean to Ignite?"
    Then Verify we are on resources what does it mean to ignite "Login" Page
   And Naviagate back to orgadmin Home page
    Then I am on org admin home page
    
     @SchoolAdmin_Resources_Ignite_App_InstallationMenu_Naviagation @IQA_255 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: School Admin : Resources-Ignite - App Installation menu functionality
    Then I navigate to top menu bar "RESOURCES" "Ignite - App Installation"
    Then Verify we are on "Get your head in the game!" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on org admin home page
    
    
   #failing due to human verification issue
  #@SchoolAdmin_Resources_Help_Center_Knowldege_Menu_Navigation @IQA_327 @Sprint_8
  #Scenario: School Admin : Resources- Help Center and knowledge base
    #Then I navigate to the and "RESOURCES" "Help Center & Knowledge Base"
    #Then Verify we are on resources Help Center & Knowledge Base "Click Here For Back To School Resources" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
#Getting failed due to Human verification error  
     #@SchoolAdmin_Resources_IgniteTable_Getting_Started_Menu_Navigation @PEG-18942 @Sprint-79
  #Scenario: School Admin Resources -School Admin: Resources-  IgniteTable - Getting Started
  #Then I navigate to top menu bar "RESOURCES" "IgniteTable - Getting Started"
  #Then Verify we are on resources IgniteTable - Getting Started "Introducing IgniteTable by Hatch™ (Previously WePlaySmart)" Page
  #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #
  #Getting failed due to Human verification error 
       #@SchoolAdmin_Resources_Submit_a_Support_Ticket_Menu_Navigation @PEG-18942 @Sprint-79 
  #Scenario: School Admin Resources -School Admin: Resources-  Submit a Support Ticket 
  #Then I navigate to top menu bar "RESOURCES" "Submit a Support Ticket"
  #Then Verify we are on resources Submit a Support Ticket  "Submit a request" Page
  #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
   
   
   
      
#===============================================================================================
#Old Test Cases

  #@SchoolAdmin_Resources_Device_Ignite_Menu_Naviagation @Sprint_8 @IQA_328
  #Scenario Outline: School Admin : Resources- Device Ignite Version menu functionality
    #Then I navigate to a top menu bar "RESOURCES" "Device Ignite Version"
    #Then I checked for the Popup
    #Then I am able to see device ignite page "<page>"
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then I am on school admin home page
#
    #Examples: 
      #| page                  |
      #| Device Ignite Version |
#
  #@SchoolAdmin_Resources_What_Ignite_Menu_Naviagation @Sprint_8 @IQA_329
  #Scenario: School Admin : Resources- What does it mean to ignite Mega menu functionality
    #Then I navigate to top menu bar "RESOURCES" "What does it mean to Ignite?"
    #Then Verify we are on resources what does it mean to ignite "What does it mean to Ignite?" Page
    #And Naviagate back to school admin Home page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then I am on school admin home page
#failing due to human verification issue
  #@schoolAdmin_Resources_Help_Center_Knowldege_Menu_Navigation @IQA_327 @Sprint_8
  #Scenario: School Admin : Resources- Help Center and knowledge base
     #When I close child window if any and navigate back to parent window
    #Then I navigate to the and "RESOURCES" "Help Center & Knowledge Base"
    #Then Verify we are on resources Help Center & Knowledge Base "Ignite by Hatch" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
#
  #@AccountMegaMenuUI @IQA_330
  #Scenario: Verify when hover over Account Icon mega menu option displays in subsection.
     #When I close child window if any and navigate back to parent window
    #Then I hover over Account menu
    #Then Verify Account subsection
     #| My Account | Notification Settings | Log Out |

  @schooladmin_Resources_Logout @IQA_287
  Scenario: Verify School Admin Resources - Logout button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
