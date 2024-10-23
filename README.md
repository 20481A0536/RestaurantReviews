Restaurant Reviews Application
Project Overview
This project is a Spring Boot application for managing and reviewing restaurants. It provides a RESTful API to handle CRUD operations for restaurants and reviews. The application uses Spring Data JPA to interact with a database and offers endpoints for adding, updating, retrieving, and deleting restaurants and their reviews.

Technologies Used
Java 22
Spring Boot 3.x
Spring Data JPA
Hibernate (for ORM)
MySQL/PostgreSQL/Any JPA-supported database
RESTful APIs
Jackson for JSON serialization/deserialization
Project Structure
Model: Contains the entities representing database tables.
Controller: Exposes endpoints for handling HTTP requests.
Service: Contains business logic to interact with repositories.
Repository: Contains interfaces extending JpaRepository to interact with the database.
Modules Overview
1. Models
Restaurant.java: Represents a restaurant with attributes like id, name, cusine, and a list of Review objects.
Review.java: Represents a review with attributes like id, reviewerName, rating, comment, and an associated Restaurant.


2. Controllers
RestaurantController.java: Handles endpoints related to restaurant operations such as:

GET /restaurants - Retrieves all restaurants.
GET /restaurants/{id} - Retrieves a specific restaurant by its ID.
POST /restaurants/additem - Adds a new restaurant.
PUT /restaurants/update - Updates an existing restaurant.
DELETE /restaurants/{id} - Deletes a restaurant by its ID.
ReviewController.java: Handles endpoints related to review operations such as:

GET /reviews - Retrieves all reviews.
GET /reviews/{id} - Retrieves a specific review by its ID.
POST /reviews/additem - Adds a new review.
PUT /reviews/update/{id} - Updates an existing review based on its ID.
DELETE /reviews/{id} - Deletes a review by its ID.


3. Services
RestaurantService.java: Contains methods for retrieving, adding, updating, and deleting restaurants.
ReviewService.java: Contains methods for retrieving, adding, updating, and deleting reviews.


5. Repositories
RestaurantRepo.java: Extends JpaRepository for interacting with the Restaurant table.
ReviewRepo.java: Extends JpaRepository for interacting with the Review table.

How to Run the Project

Prerequisites
Java 17 or higher installed on your machine.
An SQL database like MySQL or PostgreSQL configured (you can also use H2 for testing).
Maven or Gradle installed.
Steps to Set Up the Project

1.Clone the Repository
git clone https://github.com/20481A0536/RestaurantReviews.git
cd RestaurantReviews

2.Configure the Database Open src/main/resources/application.properties and set up your database configuration. Example for MySQL:
spring.datasource.url=jdbc:mysql://localhost:3306/restaurantdb
spring.datasource.username=root
spring.datasource.password=rootpassword
spring.jpa.hibernate.ddl-auto=update

3.Build and Run the Application
mvn clean install
mvn spring-boot:run

4.Access the API You can test the API using tools like Postman or cURL. The application should be running at http://localhost:8080.

API Endpoints
Restaurant Endpoints
GET /restaurants - Get all restaurants.
GET /restaurants/{id} - Get a restaurant by its ID.
POST /restaurants/additem - Add a new restaurant.
PUT /restaurants/update - Update an existing restaurant.
DELETE /restaurants/{id} - Delete a restaurant by its ID.
Review Endpoints
GET /reviews - Get all reviews.
GET /reviews/{id} - Get a review by its ID.
POST /reviews/additem - Add a new review.
PUT /reviews/update/{id} - Update a review by its ID.
DELETE /reviews/{id} - Delete a review by its ID.
Entity Relationships
A Restaurant can have multiple Review entries, establishing a One-to-Many relationship between Restaurant and Review.
Restaurant and Review are linked using JPA annotations such as @OneToMany, @ManyToOne, and cascade operations are enabled for seamless management of relationships.
Future Improvements
Add authentication and authorization using Spring Security.
Implement pagination for retrieving large datasets of reviews and restaurants.
Enhance exception handling to provide more user-friendly error messages.
Integrate Swagger for API documentation.
Contributing
Feel free to submit issues or pull requests if you have suggestions for improvements. Contributions are always welcome!

License
This project is licensed under the MIT License.






