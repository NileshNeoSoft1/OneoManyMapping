# 🏙️ Customer API - Spring Boot Project

This is a Spring Boot application that demonstrates how to fetch a list of customers based on their city using a **One-to-Many relationship**. 
Specifically, it retrieves customers whose city is **Yavatmal**.

---

## 📦 Project Overview

- Built with **Spring Boot**
- Uses **JPA/Hibernate** for ORM
- Implements **One-to-Many mapping** between `Address` and `Customer`
- Exposes a REST API to fetch customers by city
- Organized into three main entity classes and a controller
- Includes a main application class to bootstrap the project

---

## 🧱 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 / MySQL (configurable)
- Maven

---

## 🗂️ Project Structure
src/
├── main/
│   ├── java/
│   │   └── com.example.customerapi/
│   │       ├── Customer.java
│   │       ├── Address.java
│   │       ├── CustomerController.java
│   │       └── CustomerApiApplication.java
│   │       
│   │      
│   └── resources/
│       └── application.properties

