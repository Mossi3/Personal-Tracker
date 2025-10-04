# Personal Growth Tracker Microservices

A comprehensive multi-module Spring Boot microservices architecture for tracking personal growth across different life domains.

## 🏗️ Architecture Overview

This project follows a microservices architecture pattern with:
- **API Gateway**: Centralized entry point for all services
- **Domain Services**: Specialized services for each life area
- **AI Integration**: Intelligent insights and recommendations
- **Modern Tech Stack**: Java 21, Spring Boot 3.2+, Spring Cloud

## 📁 Project Structure

```
personal-tracker-ms/
├── pom.xml                    # Root Maven configuration
├── gateway-service/           # API Gateway (Spring Cloud Gateway)
├── financial-service/         # Financial health tracking
├── physical-service/          # Physical health & fitness
├── emotional-service/         # Emotional wellness
├── career-service/            # Career development
├── spiritual-service/         # Spiritual growth
├── social-service/            # Social relationships
└── ai-service/               # AI-powered insights (Spring AI + OpenAI)
```

## 🛠️ Tech Stack

- **Java**: 21 (OpenJDK)
- **Spring Boot**: 3.2.10
- **Spring Cloud**: 2023.0.3
- **Spring AI**: 1.0.0-M3 (with OpenAI integration)
- **Build Tool**: Maven 3.9.9
- **Database**: H2 (for development)
- **API Gateway**: Spring Cloud Gateway

## 🚀 Getting Started

### Prerequisites
- Java 21+
- Maven 3.9+

### Build the Project
```bash
cd personal-tracker-ms
mvn clean compile
```

### Run Individual Services
```bash
# Gateway Service
cd gateway-service
mvn spring-boot:run

# Financial Service
cd financial-service
mvn spring-boot:run

# Physical Service
cd physical-service
mvn spring-boot:run

# ... and so on for other services
```

## 📋 Service Details

### Gateway Service
- **Port**: 8080 (default)
- **Purpose**: API Gateway and routing
- **Dependencies**: Spring Cloud Gateway, Actuator

### Domain Services (Financial, Physical, Emotional, Career, Spiritual, Social)
- **Ports**: 8081-8086 (configurable)
- **Purpose**: Domain-specific business logic
- **Dependencies**: Spring Web, Spring Data JPA, H2 Database, Actuator
- **Database**: Individual H2 databases per service

### AI Service
- **Port**: 8087 (configurable)
- **Purpose**: AI-powered insights and recommendations
- **Dependencies**: Spring Web, Spring AI OpenAI Starter, Actuator
- **Integration**: OpenAI GPT models via Spring AI

## 🎯 Next Steps

1. **Configure Service Ports**: Set unique ports for each service
2. **Implement REST APIs**: Add controllers and business logic
3. **Database Schema**: Design domain-specific entities
4. **Gateway Routing**: Configure route mappings
5. **AI Integration**: Set up OpenAI API keys and prompts
6. **Service Discovery**: Add Eureka or Consul for service registration
7. **Configuration Management**: Implement Spring Cloud Config
8. **Monitoring**: Add distributed tracing and metrics

## 📝 Development Guidelines

- Follow microservices principles (loose coupling, high cohesion)
- Implement proper error handling and circuit breakers
- Use event-driven architecture where appropriate
- Ensure each service has its own database
- Implement proper logging and monitoring
- Add comprehensive tests (unit, integration, contract)

## 🔧 Configuration

Each service can be configured independently through `application.yml` files. The root `pom.xml` manages all dependencies through centralized dependency management.

---
**Built with ❤️ using Spring Boot and Spring AI**