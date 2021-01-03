Feature: Scholastic Create Account By ZipCode




  Scenario: When user clicks on create new account and follows prompts will create an account via zipcode.
    Given  When user gets to landing page
      Then Teacher clicks on create new account
      Then Teacher enters Personal information
      Then Teacher puts in zipcode information
      Then Teacher selects their school
      Then Teacher selects their teaching role
      Then Teacher selects class reading level
      Then Teacher must close dropdown page
      Then The teacher will verify class code in their profile



