@Regression_Test
Feature: Teacher Skill support Test
  @TeacherSkillSupport_login @IQA_312 @Support
  Scenario Outline: Teacher Skill Support  - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on teacher home page

    Examples: 
      | url                                  | username                 | password |
      | https://rms.hatchearlychildhood.com/ | iqa_teacher@inboxeen.com |   123456 |

  @Teacher_VerifyRecommendedPage @Sprint9 @IQA_312
  Scenario Outline: Teacher Recommended Curricular- Verify Recommended Page
    Then Verify child popup appears and close the child pop up
    Then I am on the menu "SKILL SUPPORT"  "Recommended Curricular Experiences"
    Then I checked for the Popup
    And I am able to see recommended curricular experience pages "<recommendecurricular>"
    And I am able to select schools name from dropdown
      | teach_School  |
    And I am able to select class name from dropdown
      | teach_Class  |
    And i am able to see listed tiles and childrens on page
    And I clicked on the Browse the Full Experience Library button
    Then I checked for the Popup
    And I am able to see All Curricular Experince page "<AllCurricularExperiences>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | recommendecurricular                   | AllCurricularExperiences   |
      | Curricular Experiences Recommendations | All Curricular Experiences |

  @Teacher_VerifyAllCurricularExperience @Sprint9 @IQA_313
  Scenario Outline: Teacher Skill Support-Verify All Curricular Experience
    Then Verify child popup appears and close the child pop up
    Then I navigate to menu "SKILL SUPPORT" "Curricular Experiences Library"
    Then I checked for the Popup
    And I am able to see All Curricular Experince page "<AllCurricularExperiences>"
    And I am able to see all domain
      | Social Studies | Science & Technology | Social-Emotional Development | Language & Communication Development | Literacy | Physical Development | Mathematics |
    And I am able to click on accordian "Social Studies"
    And I am able to see social studies subdomains
      | Self-Identity | Community Awareness |
    And I am able to click on to accordian "Science & Technology"
    And I am able to see science and technology subdomains
      | Life Science | Physical Science | Earth Science | Simple Tools |
    And I am able to click "Language & Communication Development"
    And I am able to see langauge and communication development subdomains
      | Listening and Understanding | Receptive Language | Vocabulary | Academic Vocabulary | Conventions of Language |
    And I am able to click into "Literacy"
    And I am able to see literacy subdomains
      | Concepts of Print | Writing Development | Segmenting | Alliteration | Alphabet Knowledge | Blending | Rhyming | Key Ideas and Details | Letter-Sound Correspondence | Decoding | Comprehension - Fiction | Comprehension - Non-Fiction | High-Frequency Words |
    And I am able to click in to "Physical Development"
    And I am able to see physical development subdomains
      | Self-Care | Nutrition | Health & Safety |
    And I am able to click into the "Mathematics"
    And I am able to see mathematics subdomains
      | Set Counting | Comparing Quantities | Ordinal Numbers | Addition | Subtraction | Spatial Relationships | 2-D Shapes | Measurement | Classification and Data | Patterns | Subitizing | Number Sequencing | Composing Shapes | Composing | Decomposing |
    And I am able to click onto "Social-Emotional Development"
    And I am able to see social emotional development subdomains
      | Identifying Emotions | Solving Social Problems | Responding to Emotions | Executive Functioning |
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | AllCurricularExperiences   |
      | All Curricular Experiences |

  @Teacher_VerifyAllCurricularExperience_0 @Sprint9 @IQA_313 @Support
  Scenario Outline: Teacher Skill Support-Verify All Curricular Experience
    Then Verify child popup appears and close the child pop up
    Then I navigate to menu "SKILL SUPPORT" "Curricular Experiences Library"
    Then I checked for the Popup
    And I am able to see All Curricular Experince page "<AllCurricularExperiences>"
    And I am able to click on recommended for your class
    Then I checked for the Popup
    And I am able to see curricular experience recommendation page "<CurricularExperiencesRecommendations>"
    #Then Verify child popup appears and close the child pop up
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | AllCurricularExperiences   | CurricularExperiencesRecommendations   |
      | All Curricular Experiences | Curricular Experiences Recommendations |

  @Teacher_VerifySupportPage @Sprint9 @IQA_314 @Support
  Scenario Outline: Teacher Support Needed- Verify Support Needed
    Then Verify child popup appears and close the child pop up
    Then I am on menu of "SKILL SUPPORT"  "Support Needed"
    Then I checked for the Popup
    Then I am able to see Support Needed page title "<Support_Title>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then Verify child popup appears and close the child pop up

    Examples: 
      | Support_Title |
      | Weekly Status |

  @TeacherSkillSupportAccount_LogOut @Sprint9 @IQA_314 @Support
  Scenario: Teacher Skill Support Verify LogOut button from Account Subsection
    Then Verify child popup appears and close the child pop up
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
