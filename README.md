# 🎯 Project Objective:
To design and build a robust, cleanly architected backend system for an e-commerce platform, with a focus on demonstrating solid knowledge of Java, Spring Boot, REST APIs, Docker, PostgreSQL, and beginner-friendly Spring Security. This project is intended for portfolio use, job-readiness, and learning scalability from first principles.

🧰 Tech Stack:
Language: Java (17+)

+ Framework: Spring Boot

+ Spring Web (for REST APIs)

+ Spring Data JPA (for DB interaction)

+ Spring Security (for authentication & authorization – foundational level)

+ Database: PostgreSQL (via Docker container)

+ Containerization: Docker

+ Version Control: Git + GitHub

+ Testing: Basic unit and integration tests with JUnit + Mockito (optional for now)

+ Frontend (later): HTML, CSS, JavaScript, Next.js (not part of MVP, but architecture should support future integration)
  
# 🧑‍🤝‍🧑 User Roles:
+ Customer

+ Can register and log in

+ Can browse products

+ Can place orders

+ Can view their own order history

+ Vendor

+ Can register and log in

+ Can list/manage their own products

+ Can view orders for their products

+ Each role will have access to specific API routes controlled via Spring Security + Role-based Authorization (RBAC)

# 📦 Core Features (MVP Scope):
**🔐 Authentication & Authorization:**

+ User registration & login

+ Password hashing

+ Role assignment (Customer or Vendor)

+ JWT-based or Session-based auth (we’ll choose the simplest approach for learning)

# 🛍️ Product Management:
+ **Vendors can:**

  + Create, update, delete products

  + View their own product listings
  

+ **Customers can:**

  + View all available products

# 🧾 Order Management:
+ **Customers can:**

  + Place orders

  + View order history
  

+ **Vendors can:**

  + View orders related to their products

# 📦 Database Schema:
+ User (id, username, email, password, role)

+ Product (id, name, description, price, vendor_id)

+ Order (id, customer_id, created_at)

+ OrderItem (id, order_id, product_id, quantity)

# 🧱 Architecture:
+ **Clean, layered architecture:**

  + **Controller → Service → Repository**

  + Separate DTOs, Entities, Mappers where relevant

+ Use of Spring Boot Starters to simplify configuration

+ Project will be structured in a way that frontend and services can be integrated later

# 🐳 Docker Integration:

+ Dockerize the app and connect to a PostgreSQL container

+ Use docker-compose.yml to spin up both app and DB in one command

+ Store DB credentials securely (e.g., .env file or application properties)

# ✅ Testing Strategy (Basic):
+  Write simple unit tests for key service layer methods

+ Mock database access where applicable using Mockito

+ Verify security configuration via integration test (optional for now)

# 🔮 Future Enhancements (Post-MVP):
+ Payment integration (e.g., Stripe or mock service)

+ Admin role

+ Frontend integration with Next.js

+ Pagination & filtering for product listings

+ File/image uploads for product thumbnails

+ CI/CD with GitHub Actions

+ Email notifications