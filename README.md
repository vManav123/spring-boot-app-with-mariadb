# spring-boot-app-with-mariadb
I will discuss Spring Boot integration for MariaDB. MariaDB started off as an offshoot of MySQL due to concerns of Oracle’s acquisition of MySQL. Led by the original developers of MySQL, MariaDB has become one of the fastest growing open source databases.

## Maven Dependencies

for making this application you need these following dependencies.
1) Lombok
2) mariadb-java-client
3) data-jpa
4) spring-web

here below all dependencies are there,

```javascript
<dependencies>
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-data-jpa</artifactId>
   </dependency>
   <dependency>
       <groupId>org.mariadb.jdbc</groupId>
       <artifactId>mariadb-java-client</artifactId>
   </dependency>
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-web</artifactId>
   </dependency>
   <dependency>
       <groupId>org.projectlombok</groupId>
       <artifactId>lombok</artifactId>
       <optional>true</optional>
   </dependency>
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-test</artifactId>
       <scope>test</scope>
   </dependency>
</dependencies>
```

## Configuration 

Add condfiguration of Data-JPA and MariaDB in application.properties file.
You can add update this with your data.

```javascript
server.port=8081
spring.datasource.url=jdbc:mariadb://localhost:3306/testing?useSSL=false
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true
```

## Conclusion
1) Now Run your MariaDb and setup your Database and Tables. 
2) Setup your code according to table.
3) run application 
4) test it with postman or web tool.
