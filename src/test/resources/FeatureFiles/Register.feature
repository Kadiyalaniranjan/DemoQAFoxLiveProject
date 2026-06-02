Feature: Registration functionality scenarios
  @Register @One
  Scenario: Verify whether the user is able to register into the application by providing all the details
       Given I Launch the application
       And I navigate to Account Registration page
       When I provided all the below valid details
              | FirstName        | Ravi                    |
              |LastName          | Kiran                   |
              | Email            | Ravi.kiran2@gmail.com   |
              | Telephone        | 9212347855              |
              | Password         | rkiran                  |
       And I select the Privacy policy
       And I click on Continue button
       Then I should see that the User Account has successfully created      
        
            
  
