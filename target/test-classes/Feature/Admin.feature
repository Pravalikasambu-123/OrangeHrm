Feature:Verify Admin for Orange HRM
Author:Pravalika
Scenario:Clicking Admin and fill details
Given Click the Admin button and Add
When enter valid Userrole "Admin",EmployeeName "Peter Mac Anderson",Status "Enabled",Username "Radhika",Password "rak@123"
And Click Save button
Then Save Successful
