# RESTFul-WebService

In this project a RESTful Web Service has been built using Spring Framework.

## Modules Used

* Spring Boot
* Spring Web
* Spring Security
* Spring Data JPA

The RESTful service is used to manage two resources - courses and topics. One or more courses can belong to a particular. The client can request
information regarding any speciffic course or topic by send HTTP requests to the server. The API of HTTP requests is given below

## API
For topic resource

|Method Type| URL | Description|
|---|---|---|
|GET | server/topics | Get the list of all topics taught|
|POST |server/topics | Add a new topic from the request body to the server|
|PUT | server/topics/topic_id | Update an existing topic by pulling in data from the request body|
|DELETE | server/topics/topic_id | Delete the topic identified by topic_id|

For course resource

|Method Type| URL | Description|
|---|---|---|
|GET | server/topics/topic_id/courses | Get the list of all courses taught|
|POST |server/topics/topic_id/courses | Add a new course from the request body to the server|
|PUT | server/topics/topic_id/courses/course_id | Update an existing course by pulling in data from the request body|
|DELETE | server/topics/topic_id/courses/course_id | Delete the course identified by course|

Both the topics and courses requests are protected by Spring Security. Use username (sayan) and password (password) to access these resources

### Database
The Database used is H2.

### Installation
This is an eclipse project . You can easily compile it with maven.

### Running
After building with maven, locate the jar filed created and simple run it using java -jar command. As simple as that :)



