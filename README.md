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
+ The application will use a PostgreSQL database containerized via Docker, following this extended schema:

# 👤 USERS
+ id (PK)

+ email (UK)

+ password

+ first_name, last_name, phone_number

+ created_at, updated_at

+ active (boolean)

+ role (enum: CUSTOMER | VENDOR)

# 📍 ADDRESSES
+ id (PK)

+ user_id (FK → USERS)

+ street, city, state, country, postal_code

+ is_default (boolean)

# 🛍️ PRODUCTS
+ id (PK)

+ vendor_id (FK → USERS)

+ category_id (FK → CATEGORIES)

+ name, description, price, stock_quantity, sku

+ created_at, updated_at

+ active (boolean)

# 🗂️ CATEGORIES
+ id (PK)

+ name, description

+ parent_id (FK → CATEGORIES for hierarchy)

# 🖼️ PRODUCT_IMAGES
+ id (PK)

+ product_id (FK → PRODUCTS)

+ image_url

+ display_order (int)

+ is_primary (boolean)

# 🛒 CART_ITEMS
+ id (PK)

+ user_id (FK → USERS)

+ product_id (FK → PRODUCTS)

+ quantity

+ added_at (timestamp)

# 📦 ORDERS
+ id (PK)

+ user_id (FK → USERS)

+ shipping_address_id (FK → ADDRESSES)

+ billing_address_id (FK → ADDRESSES)

+ total_amount (decimal)

+ order_date (timestamp)

+ payment_method (string)

+ payment_status (string)

# 🧾 ORDER_ITEMS
+ id (PK)

+ order_id (FK → ORDERS)

+ product_id (FK → PRODUCTS)

+ quantity, price_per_unit, subtotal

# 🚚 ORDER_STATUS
+ id (PK)

+ order_id (FK → ORDERS)

+ status (enum: PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELED)

+ status_date (timestamp)

+ notes (string)

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