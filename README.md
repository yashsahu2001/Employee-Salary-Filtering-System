# Employee-Salary-Filtering-System
This Java application allows you to manually input employee details (name and salary) and then filter the employees based on a specified salary range using Java Streams.

## Features
- Manually enter the number of employees and their details (name and salary).
- Specify a salary range (minimum and maximum) to filter employees.
- Outputs the list of employees whose salaries fall within the given range.

## Requirements
- Java 8 or higher (for Stream API support).
- Eclipse IDE or any other Java IDE to run the project.

## How to Run the Project

### Step 1: Clone or Download the Repository

Clone this repository or download the project files to your local machine.

```bash
git clone <repository-url>
```

## Step 2: Import the Project in Eclipse
Open Eclipse IDE.
1. Go to File > Import.
2. Select Existing Projects into Workspace.
3. Choose the directory where you saved the project.
4. Click Finish to import the project.

## Step 3: Run the Program
1. In Eclipse, right-click on the EmployeeSalaryFilter.java file.
2. Select Run As > Java Application.
3. The program will prompt you to enter the number of employees, their names, salaries, and the salary range for filtering.

## Example Interaction
```
mathematica
Copy
Edit
Enter number of employees: 3
Enter details for employee 1
Enter name: Alice
Enter salary: 50000
Enter details for employee 2
Enter name: Bob
Enter salary: 70000
Enter details for employee 3
Enter name: Charlie
Enter salary: 90000
Enter minimum salary for filtering: 60000
Enter maximum salary for filtering: 80000

Employees with salary between 60000.0 and 80000.0:
Employee{name='Bob', salary=70000.0}
```

## Code Explanation
- Employee Class: Represents an employee with a name and salary.
- EmployeeSalaryFilter Class: Handles input and filtering using Java Streams.
- Filtering Logic:
     - The program first collects employee data.
     - Then, it filters the list of employees based on the specified salary range using the Stream API's .filter() method.
     - Finally, it displays the filtered employees.

## Contributions
Feel free to contribute to this project by submitting pull requests or reporting issues.

## License
This project is open source and available under the MIT License.
