Feature: Scholastic Create Account By ZipCode




  Scenario: User clicks on create new account and follows prompts will create an account via zipcode.
    Given  When user gets to landing page
      Then Teacher clicks on create new account
      Then Teacher enters Personal information
      Then Teacher puts in zipcode information
      Then Teacher selects their school
      Then Teacher selects their teaching role
      Then Teacher selects class reading level
      Then Teacher must close dropdown page
      Then The teacher will verify class code in their profile


  Scenario: User clicks on create new account and follows prompts will create an account via school name.
    Given  User opens Scholastic landing page
      Then Teacher clicks new account button then selects education role
      Then Teacher inputs personal information
      Then Teacher searches for school by state
      Then Teacher will find school by name
      Then Teacher inputs their role in teaching
      Then Teacher will select the classes reading level
      Then Teacher must close dropdown page to interacti with landing page
      Then Teacher will verify class code in profile page


