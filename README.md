    Employee Management System
        Overview
          This is a Spring Boot application for managing departments and employees in an organization. The application provides RESTful APIs to perform CRUD (Create, Read, Update, Delete) operations on department and employee data.

        Project Structure
            Models
              Department: Entity class representing a department with attributes such as id, name, established date, and a list of employees.
              Employee: Entity class representing employees (referenced in Department but not shown in the provided code).
            Repository
              DepartmentRepo: JPA repository interface for Department entity that extends JpaRepository to provide CRUD operations.
            Service
              DepartmentService: Service class that handles business logic for department operations.
                  Gets all departments
                  Gets a department by ID
            Controller
              DepartmentController: REST controller that handles HTTP requests for department operations.
                  GET /dept - Retrieves all departments
                  GET /dept/{id} - Retrieves a specific department by ID
                  (Commented out) POST, PUT, DELETE operations for departments

        Database Configuration
            The application uses MySQL database with the following configuration:

                Database URL: jdbc:mysql://localhost:3307/employeedb
                Username: root
                Password: (empty)
                Hibernate DDL Auto: update (creates/updates tables automatically)
            How to Run
                Ensure you have Java 11 or higher installed
                Install MySQL and create a database named 'employee'
                Configure the database connection in application.properties
                Build the project using Maven: mvn clean install
                Run the application: mvn spring-boot:run
        API Endpoints
            Department Endpoints
                GET /dept: Retrieves all departments

                    Response: List of Department objects
                    Status codes: 200 OK

                    
![Screenshot (83)](https://github.com/user-attachments/assets/406ba977-402e-4858-bed2-223c7befd052)

                GET /dept/{id}: Retrieves a specific department by ID

                    Path variable: id (Department ID)
                    Response: Department object
                    Status codes: 200 OK (if found), 404 NOT_FOUND (if not found)

![Screenshot (85)](https://github.com/user-attachments/assets/0fc5142b-c08b-4e83-be5a-8da76c506be7)


![Screenshot (84)](https://github.com/user-attachments/assets/a83d051e-5e0a-49eb-a2c0-ee2cf74590e5)
