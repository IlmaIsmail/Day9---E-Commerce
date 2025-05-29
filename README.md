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
