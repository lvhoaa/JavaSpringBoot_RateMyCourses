# RATE MY COURSES -- See reviews, get advice, and rate your college courses 

RateMyCourses is a web application built with Java Spring Boot to serve as a platform for students to see and create reviews about university courses.

## Table of Contents

- [Project Overview](#project-overview)
- [Illustrations](#illustrations)
- [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)

## Project Overview 

Knowing choosing the right course in college is difficult, RateMyCourses aims to help students find their best-fit courses by reading reviews and advice from past students. 

Key features of RateMyCourses project includes: 
- Spring MVC architecture for handling web requests, reading and writing course reviews.
- Designed database with one-to-many relationships using Spring Data JPA and PostgreSQL. 
- Integration with OpenAI API for crafting high-quality summary from course reviews.
- Thymeleaf integration for server-side rendering of views and SEO optimization
- Support profanity detection to obtain comments of highest quality
- Support Google OAuth/login/logout/registration system to validate users

## Illustrations

![image](https://github.com/lvhoaa/RateMyCourses/assets/87745938/66926dba-4887-4c44-83cc-6a860a65f53c)

![image](https://github.com/lvhoaa/RateMyCourses/assets/87745938/6759cffa-f29c-4d0e-85b0-4bdba3f97f94)

![image](https://github.com/lvhoaa/RateMyCourses/assets/87745938/d5050169-050b-41d8-8c31-7e9614c0205a)

![image](https://github.com/lvhoaa/RateMyCourses/assets/87745938/d3ed05a5-b416-49c3-8cba-3548990b4c01)

## Installation

1. Clone the repository or download the source code.
   ```bash
   git clone https://github.com/lvhoaa/JavaSpringBoot_RateMyCourses.git
2. Install Java Development Kit (JDK) on your machine and activate your code editor
3. Build the project using Maven.
    ```bash
    mvn clean install
4. Perform any additional setup steps required, such as setting up a Postgres database and configuring local environment variables

## Usage

To run the RateMyCourses server, follow these steps:

1. Execute the JAR file generated by Maven to run the development server 
    ```bash
    java -jar target/myproject.jar

4. Open a web browser and visit http://localhost:8000 to access the application.


## Configuration
- The RateMyCourse project requires certain configurations to ensure proper functioning.

1. Configuration: The project utilizes a database for storing user information, entities, and other data. By default, it is configured to use an embedded H2 database. If you prefer to use a different database, such as MySQL or PostgreSQL, you need to update the database settings in the application.properties file. Set the appropriate database URL, username, and password to establish the connection.

2. Security Configuration: User authentication and authorization are crucial for your application. The project includes basic security configurations using Spring Security. You may need to modify the security settings based on your requirements. For example, you can customize the login page, configure access rules for different endpoints, or integrate additional security features such as OAuth2 authentication.

- Ensure that you review and update the relevant configuration files (application.properties, application-dev.properties, etc.) based on your specific project requirements. It's essential to keep sensitive information like database credentials, API keys, or secret tokens in a secure and private location, away from version control.

## Contributing
- Contributions to this project are welcome! If you encounter any issues or have suggestions for improvements, please open an issue or submit a pull request. For major changes, please discuss them first in the project's issue tracker.

## License
- This project is licensed under the MIT License. You can find the full license text in the LICENSE file.
