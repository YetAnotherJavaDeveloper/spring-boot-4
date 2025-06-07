# Spring Boot 4 Demo

This project is a modular demo of **Spring Boot 4** (snapshot version), showcasing new features — notably API versioning via native Spring annotations.

---

## Project Structure

- **spring-boot-4** (parent, packaging `pom`)
- **api-versioning** (child module): versioned REST API with validation

---

## Requirements

- JDK 17+
- Maven 3.8+

---

## Installation & Running

### Clone the repository

```bash
git clone https://github.com/YetAnotherJavaDeveloper/spring-boot-4.git
cd spring-boot-4
```

### Build and run
```bash
./mvnw clean install
./mvnw spring-boot:run -pl api-versioning
```
The application listens on http://localhost:8090.