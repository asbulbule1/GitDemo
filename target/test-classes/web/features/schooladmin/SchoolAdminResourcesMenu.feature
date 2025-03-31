#
#Feature: SchoolAdmin Resources Menu Test Suit
#
  #@schooladmin_Resources_Menu_Login @IQA_326 @run
  #Scenario Outline: School Admin Resources Menu - Login
    #Given I am on "<env>" environment "<url>"
    #When I enter username "<username>"
    #And I enter password "<password>"
    #And I click letsgo
    #Then I am on school admin home page
#
    #Examples: 
      #| url                                  | username                     | password |
      #| https://rms.hatchearlychildhood.com/ | iqa_schooladmin@inboxeen.com |   123456 |
#
  #@schooladmin_verifyResourcesMenus @IQA_261 @Sprint7 
  #Scenario: Resources Menus Verification- Verify Resources Menus
    #And I am able to verify "RESOURCES" ""
    #And I am able to verify the "RESOURCES" "The Hatch Hub"
    #And I am able to verify the "RESOURCES" "Videos"
    #And I am able to verify the "RESOURCES" "PDFs and Printables"
    #And I am able to verify the "RESOURCES" "Discussion Boards"
    #And I am able to verify the "RESOURCES" "Webinars"
    #And I am able to verify the "RESOURCES" "Help Center"
    #And I am able to verify the "RESOURCES" "Install Ignite"
    #And I am able to verify the "RESOURCES" "Device Ignite Version"
    #Then I am able to verify the "RESOURCES" "What does it mean to Ignite?"
#
  #@schooladmin_verifyvideospage @IQA_323 @Sprint_8 
  #Scenario Outline: Videos Page Verification - Verify Video Page
    #Then I navigate to top menu bar "RESOURCES" "Videos"
    #And I am able to see product videos page "<pgname>"
    #And I am able to see ignite by hatch accordian
    #And I am able to see istartsmart tablet and computer accordian
    #And I am able to see weplaysmart multi touch table accordian
    #And I am able to see teach smart display and board accordian
    #And I am able to click on hatch insights text
    #Then I am on school admin home page
#
    #Examples: 
      #| pgname         | childtext      |
      #| Product Videos | Product Videos |
#
  #@schooladmin_verifyPDFSandPrintablesMenu @IQA_324 @Sprint_8 
  #Scenario Outline: PDFs and Pritables Page Verification - Verify PDFs and Pintables page
      #When I close child window if any and navigate back to parent window
    #When I navigate to top menu bar "RESOURCES" "PDFs and Printables"
    #And I am able to see product guides page "<pagename>"
    #And I am able to see ignite by hatch accordian
    #And I am able to see istartsmart tablet and computer accordian
    #And I am able to see weplaysmart multi touch table accordian
    #And I am able to see teach smart display and board accordian
    #And I am able to click on hatch insights text
    #Then I am on school admin home page
#
    #Examples: 
      #| pagename       |
      #| Product Guides |
#
  #@schooladmin_verifyDiscussionBoardMenu @IQA_325 @Sprint_8 
  #Scenario Outline: Discussion Board Page Verification- Verify Discussion Board Page
        #When I close child window if any and navigate back to parent window
  #
    #Then I navigate to top menu bar "RESOURCES" "Discussion Boards"
    #And I am able to see discussion page "<pgname>"
    #And I am able to discussion topics list
    #And I am able to click on hatch insights text
    #Then I am on school admin home page
#
    #Examples: 
      #| pgname     |
      #| Discussion |
#
  #@schooladmin_verifyWebinarsMenu @IQA_326 @Sprint_8 @run
  #Scenario Outline: Webinars Page Verification- Verify Webinars Page
        #When I close child window if any and navigate back to parent window
  #
    #Then I navigate to top menu bar "RESOURCES" "Webinars"
    #And I am able to see expert webinars page "<title>"
    #Then I am on school admin home page
#
    #Examples: 
      #| title           |
      #| Expert Webinars |
 #failing due to human verification
  #@schooladmin_verifyHelpCentreandKnowldgeBaseMenu @IQA_327 @Sprint_8
  #Scenario Outline: Help Centre and Knowldge Base Page Verification- Verify Help Centre and Knowldge Base Page
  #When I navigate to top menu bar "RESOURCES" "Help Center"
  #And I am able to see ignite by hatch page "<Title>"
  #Then I am on school admin home page
  #
  #Examples:
  #| Title            |
  #| Ignite by Hatch	|
  #
  #@schooladmin_verifyTheHatchHubPage @IQA_322 @Sprint_8
  #Scenario Outline: School Admin The Hatch Hub Page Verification- Verify Hatch Hub Page
        #When I close child window if any and navigate back to parent window
  #
    #Then I navigate to top menu bar "RESOURCES" "The Hatch Hub"
    #And I am able to see your hatch knowledge base "<page_title>"
    #And I am able to see header learn
    #And I am able to see header discuss
    #And I am able to see header my info
    #And I am able to see header team
    #And I am able to see header support
    #And I am able to see header hatch insights
    #And I am able to click on profile link
    #And I am able to see profile page "<profilepage>"
    #And I am able to see logout button
    #And I am able to click on hatch insights text
    #Then I am on school admin home page
#
    #Examples: 
      #| page_title                | profilepage      |
      #| Your Hatch Knowledge Base | School admin_iqa |
#
  #@schooladmin_Resources_Menu_Logout @IQA_326
  #Scenario: Verify Scholld Admin Resources Menu - LogOut button from Account Subsection
        #When I close child window if any and navigate back to parent window
  #
    #Then I hover over Account menu
    #Then Click on Log Out Menu
    #Then I am on Login Window with Title "Login"
