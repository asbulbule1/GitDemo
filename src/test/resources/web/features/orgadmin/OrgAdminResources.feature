Feature: Org Admin Resources Test

  @orgadmin_resource_login @IQA_248 @Sprint_7 @run
  Scenario Outline: Org Admin Resources - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on org admin home page

    Examples: 
      | url                                  | username                  | password |
      | https://rms.hatchearlychildhood.com/ | iqa_orgadmin@inboxeen.com |   123456 |

  @OrgAdmin_Resources_Subsection_Menu @IQA_248 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Org Admin Resources - Verify user should see the menus in the subsection.
    When I navigate to top menu bar "RESOURCES" ""
    And verify given menus present on Roster subsection with and
      | Research Backed | Alignments & Standards | Success Stories | Blog | Webinars | Videos | Help Center & Knowledge Base | Paid Product Training | Professional Development | Ignite - What does it mean to Ignite? | Ignite - App Installation | IgniteTable - Getting Started | Submit a Support Ticket |
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    
  @orgadmin_Resources_Research_Backed_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: Org Admin Resources -Org admin: Resources-  Research Backed  
  Then I navigate to top menu bar "RESOURCES" "Research Backed"
  Then Verify we are on resources Research Backed "Digital Learning Tools Backed by Research" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
  @orgadmin_Resources_Alignments_Standards_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: Org Admin Resources -Org admin: Resources-  Alignments & Standards 
  Then I navigate to top menu bar "RESOURCES" "Alignments & Standards"
  Then Verify we are on resources Alignments & Standards "Alignments & Correlations" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
 
  @orgadmin_Resources_Success_Stories_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: Org Admin Resources -Org admin: Resources-  Success Stories
  Then I navigate to top menu bar "RESOURCES" "Success Stories"
  Then Verify we are on resources Success Stories "Success Stories & Partnerships" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
  @orgadmin_Resources_Blog_Menu_Navigation @PEG-18942 @Sprint-79 
  Scenario: Org Admin Resources -Org admin: Resources-  Blog
  Then I navigate to top menu bar "RESOURCES" "Blog"
  Then Verify we are on resources Blog "The Hatch Early Learning Blog" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
   @orgadmin_Resources_Webinars_Menu_Navigation @IQA_249 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Org Admin Resources -Org admin: Resources-  Webinars
  Then I navigate to top menu bar "RESOURCES" "Webinars"
  Then Verify we are on resources Webinars "Hatch On-Demand Webinars" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
    @orgadmin_Resources_Videos_Menu_Navigation @IQA_250 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Org Admin Resources -Org admin: Resources- Videos
    Then I navigate to top menu bar "RESOURCES" "Videos"
    Then Verify we are on resources Videos "Engaging Content & Proven Results" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    

    
   @orgadmin_Resources_Paid_Product_Training_Menu_Navigation @PEG-18942 @Sprint-79
  Scenario: Org Admin Resources -Org admin: Resources-  Paid Product Training 
  Then I navigate to top menu bar "RESOURCES" "Paid Product Training"
  Then Verify we are on resources Paid Product Training "Product Training" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
   @orgadmin_Resources_Professional_Development_Menu_Navigation @IQA_249 @Sprint_7  @PEG-18942 @Sprint-79 @run
  Scenario: Org Admin Resources -Org admin: Resources-  Professional Development  
  Then I navigate to top menu bar "RESOURCES" "Professional Development"
  Then Verify we are on resources Professional Development "Professional Development" Page
  And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
    @orgadmin_Resources_Ignite_What_does_it_mean_to_Ignite?_Menu_Naviagation @IQA_257 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Org Admin : Resources- Ignite - What does it mean to Ignite? Mega menu functionality
  Then I navigate to top menu bar "RESOURCES" "Ignite - What does it mean to Ignite?"
    Then Verify we are on resources what does it mean to ignite "Login" Page
    And Naviagate back to orgadmin Home page
    Then I am on org admin home page
    
     @orgadmin_Resources_Ignite_App_InstallationMenu_Naviagation @IQA_255 @Sprint_7 @PEG-18942 @Sprint-79
  Scenario: Org Admin : Resources-Ignite - App Installation menu functionality
    Then I navigate to top menu bar "RESOURCES" "Ignite - App Installation"
    Then Verify we are on "Get your head in the game!" Page
    And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on org admin home page
    
   #failing due to human verification issue
  #@OrgAdmin_Resources_Help_Center_Knowldege_Menu_Navigation @IQA_327 @Sprint_8
  #Scenario: Org Admin : Resources- Help Center and knowledge base
    #Then I navigate to the and "RESOURCES" "Help Center & Knowledge Base"
    #Then Verify we are on resources Help Center & Knowledge Base "Click Here For Back To School Resources" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
#Getting failed due to Human verification error  
     #@orgadmin_Resources_IgniteTable_Getting_Started_Menu_Navigation @PEG-18942 @Sprint-79
  #Scenario: Org Admin Resources -Org admin: Resources-  IgniteTable - Getting Started
  #Then I navigate to top menu bar "RESOURCES" "IgniteTable - Getting Started"
  #Then Verify we are on resources IgniteTable - Getting Started "Introducing IgniteTable by Hatch™ (Previously WePlaySmart)" Page
  #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #
  #Getting failed due to Human verification error 
       #@orgadmin_Resources_Submit_a_Support_Ticket_Menu_Navigation @PEG-18942 @Sprint-79 
  #Scenario: Org Admin Resources -Org admin: Resources-  Submit a Support Ticket 
  #Then I navigate to top menu bar "RESOURCES" "Submit a Support Ticket"
  #Then Verify we are on resources Submit a Support Ticket  "Submit a request" Page
  #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  #
  
  
  
  
  
  
#==============================================================================
#Old Test Cases
  #failing due to human verification issue
  #@schoolAdmin_Resources_Help_Center_Knowldege_Menu_Navigation @IQA_327 @Sprint_8
  #Scenario: School Admin : Resources- Help Center and knowledge base
     #When I close child window if any and navigate back to parent window
    #Then I navigate to the and "RESOURCES" "Help Center & Knowledge Base"
    #Then Verify we are on resources Help Center & Knowledge Base "Ignite by Hatch" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
  #@orgadmin_Resources_The_Hatch_Hub_Menu_Navigation @IQA_249 @Sprint_7
  #Scenario: Org Admin Resources -Org admin: Resources- The Hatch Hub
  #Then I navigate to top menu bar "RESOURCES" "The Hatch Hub"
  #Then Verify we are on resources The Hatch Hub "Your Hatch Knowledge Base" Page
  #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
  
  #@orgadmin_Resources_Device_Ignite_Menu_Naviagation @IQA_256 @Sprint_7 @run
  #Scenario: Org Admin : Resources- Device Ignite Version menu functionality
    #Then I navigate to a top menu bar "RESOURCES" "Device Ignite Version"
    #Then I checked for the Popup
    #Then Verify we are on "Device Ignite Version" Page
    #And I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    #Then I am on org admin home page

  @Account_LogOut @Sprint5 @IQA_46
  Scenario: Org Admin Resources -Verify LogOut button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
