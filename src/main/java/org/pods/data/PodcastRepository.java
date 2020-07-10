package org.pods.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;;
@Repository
public interface PodcastRepository extends CrudRepository<Podcast, Integer> {
	/* 
		custom query, i believe having nativeQuery set to true is unsafe because of sql injection attacks.
		To make it secure, i would use a prepared statement, or in the service class pass it into a function that checks to make sure
		it's valid sql that we want to execute. 
	*/
	@Query(value = "select * from podcast where genre = ?1 and region = ?2", nativeQuery = true)
	List<Podcast> findByGenreInAndRegionIn(String genre, String region);
	
	@Query(value = "select * from podcasttobestpodcast where podcastid = ?1", nativeQuery = true)
	List<PodcastToBestPodcast> findBestpodcastIdByPodcastId(Integer podcastid);
}
