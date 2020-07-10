
First run the mysql-scripts.sql file to create and populate the database

To run:
  - `./mvnw compile`
  - `./mvnw package`
  - `java -jar target/BestPodcasts-0.0.1-SNAPSHOT.jar` # Or whatever the snapshot id is

Then go to link http://localhost:8080/api/best_podcasts?genre_id=web&page=1&region=us&safe_mode=1

API layer -> <a href="https://github.com/terrancehanlon/Podcast-api/blob/master/src/main/java/org/pods/PodcastController.java"> PodcastController </a>
Service Layer -> <a href="https://github.com/terrancehanlon/Podcast-api/tree/master/src/main/java/org/pods/service"> Main Service </a>
                 <a href="https://github.com/terrancehanlon/Podcast-api/tree/master/src/main/java/org/pods/mappers"> Mappers </a>
                 
Domain Layer -> <a href="https://github.com/terrancehanlon/Podcast-api/tree/master/src/main/java/org/pods/util"> Domain Objects </a>
Data Layer -> <a href="https://github.com/terrancehanlon/Podcast-api/tree/master/src/main/java/org/pods/data"> Data Objects </a>


The PodcastController takes in the raw request from the client. Sends it to the service layer for business logic, then to the mapper to transform into the correct domain object. 
The domain object is then mapped to the correct Entity/Data object to be saved into the data layer or to be retrieved.

Mapping to a domain object prevents the client from communicating directly with the data layer. 

I included unnecessary inheritance and interfaces just to show how I would continue this project. I.E <a href="https://github.com/terrancehanlon/Podcast-api/blob/master/src/main/java/org/pods/util/BaseResponseObject.java"> BaseResponseObject </a>

