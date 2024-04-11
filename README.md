# News Room - Spring Boot Project
The News Room project is a Spring Boot application that simulates a social media platform where users can register, post news articles, and manage their profiles.

**Features**

User registration and login

Create, edit, and delete news articles

View all news articles on the home page

User profile management

# Project Structure

### Project Directory Structure
```
News-Room-Spring-Boot-project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.devil.NewsBroadcast/
│   │   │   │   ├── controller/
│   │   │   │   │   ├── NewsController.java
│   │   │   │   │   └── UserController.java
│   │   │   │   ├── model/
│   │   │   │   │   ├── News.java
│   │   │   │   │   └── User.java
│   │   │   │   ├── repository/
│   │   │   │   │   ├── NewsRepository.java
│   │   │   │   │   └── UserRepository.java
│   │   │   │   ├── service/
│   │   │   │   │   └── NewsService
|   |   |   |   ├── NewsBroadcastApplication.java
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   │   ├── AddNews.html
│   │   │   │   ├── SignUp.html
│   │   │   │   ├── UserProfile.html
│   │   │   │   ├── contact.html
│   │   │   │   ├── demo.html
│   │   │   │   ├── editNews.html
│   │   │   │   ├── index.html
│   │   │   │   ├── login.html
│   │   │   │   ├── newsPage.html
│   │   │   │   └── newsPage01.html
│   │   │   └── application.properties
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

# Getting Started

**Prerequisites:**

Java 8 or higher

MySQL database (create a schema named news_room_db)

**Clone the Repository**

**git clone https://github.com/shainkyain/News-Room-Spring-Boot-project.git**

**cd News-Room-Spring-Boot-project**

**Configure Database:**

Update the application.properties file with your MySQL database credentials.


**Build and Run**

**./mvnw spring-boot:run**

**Access the Application:**

Open your browser and go to **http://localhost:8080**

# Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

# License

This project is licensed under the MIT License - see the LICENSE file for details.


# ScreenShot's


![Screenshot 2024-04-11 133942](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/3c776990-d808-4602-be8d-0a61e7dfdf2a)

![Screenshot 2024-04-11 133704](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/f45d8844-9e2e-4518-9e20-e3ec28d8ee94)

![Screenshot 2024-04-11 133731](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/68a8ccdd-6b47-4505-bb26-f9babf46f3e9)
![Screenshot 2024-04-11 133758](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/30db8644-0419-4c87-ac3a-02c19a702184)

![Screenshot 2024-04-11 133457](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/f4827f8b-1395-4f7f-92fb-f1fc17ba84a0)
![Screenshot 2024-04-11 133538](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/3068520b-34dd-4bfe-954a-e1afd6355a0a)

![Screenshot 2024-04-11 133420](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/ded418fb-b605-4605-8fb4-4d576a87973b)

![Screenshot 2024-04-11 133310](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/4480009f-9a0a-44df-bc0e-fff2c6233b1c)

![Screenshot 2024-04-11 133237](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/7ee5bbdf-6190-42b2-b2c9-22604e327236)

![Screenshot 2024-04-11 133611](https://github.com/shainkyain/News-Room-Spring-Boot-project-/assets/116502451/05c8b30f-511c-4864-a656-d59f838aa5cc)













