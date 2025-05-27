Here is your task

Now that you have built a basic RESTful web service that manages a list of employees, your manager has asked you to expand your system so that it supports the upload of JSON data.

To add a new Employee to your system, you should be able to send a POST command to http://localhost:8080/employees, structured as follows:

{

    “employee_id”: “string”,

    “first_name”: “string”,

    “last_name”: “string”,

    “email”: “string”,

    “title”: “string”

}

You will need to edit your EmployeeController.java file to add this function. Following this change, your application should continue to support querying the full list of Employees by sending an HTTP GET request to http://localhost:8080/employees. 

At the end of this task, you’ll have expanded your web service to support requests to query Employees and add new Employees. For more information about how to add HTTP POST request functionality in order to add JSON data, review the Resources section below.

To complete the task, follow the steps below:

Step 1: Begin by reviewing how to download and upload files with Spring Boot in the Resources section below. This will give you an overview of how HTTP POST service calls work. Then, review Creating a RESTful HTTP Server in Spring Boot (Java) for a more detailed tutorial describing how to add this functionality.

Step 2: Create getter and setter functions for the private variables first_name, last_name, employee_id, email, and title.

Step 3: Create a resource controller that supports an HTTP POST request to http://localhost:8080/employees. Sending a request to this address should add an Employee to the system.

Step 4: Build an executable version of your application, and then launch the executable file.

Step 5: Send an HTTP POST request to http://localhost:8080/employees with example employee data to test that the data is added to the employee list as expected.
