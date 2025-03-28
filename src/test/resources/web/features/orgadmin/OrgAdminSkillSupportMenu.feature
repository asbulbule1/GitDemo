@RegressionTest01
Feature: Org Admin Skill Support MegaMenu Test

  @orgadmin_skillsupport_menu_login @Sprint33 @IQA_46 @run
  Scenario Outline: Org Admin Skill Support Menu  - Login
    Given I am on "<env>" environment "<url>"
    When I enter username "<username>"
    And I enter password "<password>"
    And I click letsgo
    Then I am on org admin home page

    Examples: 
      | url                                  | username                  | password | nontsguser              |
      | https://rms.hatchearlychildhood.com/ | iqa_orgadmin@inboxeen.com |   123456 | shivanjali@inboxeen.com |

  @orgadmin_VerifySkillSupportMenu @Sprint1 @IQA_56 @run
  Scenario Outline: Org Admin  Skill Support-Verify Skill Support Menus
    When I navigate to the menu "SKILL SUPPORT" "Recommended Curricular Experiences"
    Then I checked for the Popup
    #And I am able to see data driven instruction menu "<DataDrivenInstruction>"
    And I am able to see recommended curricular experience menu "<RecommendedCurricularExperiences>"
    And I am able to see all curricular experience menu "<AllCurricularExperiences>"
    Then I am able to see support needed menu "<SupportNeeded>"

    Examples: 
      | DataDrivenInstruction   | RecommendedCurricularExperiences   | AllCurricularExperiences       | SupportNeeded  |
      | Data-Driven Instruction | Recommended Curricular Experiences | Curricular Experiences Library | Support Needed |

  @orgadmin_VerifyAllCurricularExperience @Sprint1 @IQA_58
  Scenario Outline: Org Admin  Skill Support-Verify All Curricular Experience
    When I navigate to menu "SKILL SUPPORT" "Curricular Experiences Library"
    Then I checked for the Popup
    And I am able to see All Curricular Experince page "<AllCurricularExperiences>"
    And I am able to click on recommended for your class
    And I am able to see curricular experience recommendation page "<CurricularExperiencesRecommendations>"
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
    Then I am on org admin home page

    Examples: 
      | AllCurricularExperiences   | CurricularExperiencesRecommendations   |
      | All Curricular Experiences | Curricular Experiences Recommendations |

  @orgadmin_VerifySupportPage @IQA_59
  Scenario Outline: Org Admin Support Needed- Verify Support Needed
    When I am on the menu "SKILL SUPPORT" "Support Needed"
    Then I checked for the Popup
    Then I am able to see Support Needed page "<Support_Title>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    And I am on org admin home page

    Examples: 
      | Support_Title  |
      | Support Needed |

  @orgadmin_VerifyRecommendedPage @IQA_57
  Scenario Outline: Org Admin  Recommended Curricular- Verify Recommended Page
    When I am on the menu "SKILL SUPPORT"  "Recommended Curricular Experiences"
    Then I checked for the Popup
    And I am able to see recommended curricular experience page "<recommendecurricular>"
    Then I navigate to top menu bar "DASHBOARD" "Ignite Dashboard"
    Then I am on org admin home page

    Examples: 
      | Dashboardtitle | recommendecurricular                   |
      | Welcome,       | Curricular Experiences Recommendations |

  @orgadmin_skillsupport_menu_logout @Sprint5 @IQA_55
  Scenario: Verify Org Admin Skill Support Menu - LogOut button from Account Subsection
    Then I hover over Account menu
    Then Click on Log Out Menu
    Then I am on Login Window with Title "Login"
