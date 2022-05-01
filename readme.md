# Important Points To Remember while making Spring Boot Application

### Configuring Application.properties
1. Go to src/main/resources , configure 

````
spring.datasource.url=jdbc:mysql://localhost:3306/emp?useSSL=false
spring.datasource.username=root
spring.datasource.password=root


spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto=update
````

### Organizing folder structure

1. Make src/main/java/com.name.controller
2. Make src/main/java/com.name.model
3. Make src/main/java/com.name.repository
4. Make src/main/java/com.name.exception

### Model 
Make a class for Eg: Student , define variables , getters setters
parameterized constructor and default constructor

Now to Map this class with RDBMS , we need 
1. @Entity 
2. @Table(name="student)

3. @ID and @GeneratedValue(strategy=GenerationType.IDENTITY)

4. @Column(name="column name") for every column

You can refer model entity once

### Repository

here create an interface of StudentRepository

***Imp:***
Extends this interface to JpaRepository<Model,Id>
which will provide the save ,findById,findALL. etc methods etc.

Also Provide @RepositoryEntity 





