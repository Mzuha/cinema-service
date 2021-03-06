# Cinema Service
The goal of this project was to move from low-level technologies to frameworks. In this project I have :
* User registration, authorization using basic authentication
* Ability to create movies, cinema halls, movie sessions, tickets on these sessions. Also, you can add tickets to shopping cart and then complete your order
* Display user by email, shopping cart by user, order history. You can see all available sessions for a specific movie on a specific day
* Some links are available only for `ADMIN` , some only for `USER`, `/register` available for all

## Technologies
* Spring (Core / Web MVC / Security)
* Hibernate (Core, Validator)
* MySQL
* Maven
* Tomcat

## How to run a project
1. Clone project and open it in the IDE
2. Download Tomcat 9.0.50
3. Download MySQL and MySQL Workbench
4. Enter your password, login and database link to `db.properties`
5. Configure Tomcat and deploy on cinema:war exploded. Also, do not forget to delete Application context
6. To test this project you can enter `admin@i.ua` login and password to enter as `ADMIN`, and `user@i.ua` to login as `USER`


