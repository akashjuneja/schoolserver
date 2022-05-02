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


### Exception
1. We used ResourceNotFound when the db does not have record
2. Make a class ResourceNotFound which extends Runtime exception which implements from serializable interface and we have declared serialVersionUID
above this , we have used ResponseStatus annotation
@ResponseStatus(value = HttpStatus.NOT_FOUND)

### Controller

here we create a class StudentController
and add
1. @RestController annotation
2. @RequestMapping("/api/v1/") annotation
above the class

here we make StudentRepository object and add @Autowired annotation

now for the APIs,

For the Get APIs we add @GetMapping Annotation
````
@GetMapping("/employees")
public List<Student> getAllStudents(){
return studentrepository.findAll();
}
````

For The Post API , we add @PostMapping and for getting the Request we add @RequestBody
````
 @PostMapping("/employees")
    public Student createEmployee(@RequestBody  Student student){
        return studentrepository.save(student);
    }
````









