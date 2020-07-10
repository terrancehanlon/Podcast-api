
First run the mysql-scripts.sql file to create and populate the database

To run:
  - `./mvnw compile`
  - `./mvnw package`
  - `java -jar target/BestPodcasts-0.0.1-SNAPSHOT.jar` # Or whatever the snapshot id is

Then go to link http://localhost:8080/api/best_podcasts?genre_id=web&page=1&region=us&safe_mode=1

API layer -> <a href="https://github.com/terrancehanlon/Podcast-api/blob/master/src/main/java/org/pods/PodcastController.java"> PodcastController </a>
