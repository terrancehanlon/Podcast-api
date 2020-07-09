package org.pods.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;;
@Repository
public interface PodcastRepository extends CrudRepository<Podcast, Integer> {
	
	@Query(value = "select * from podcast where genre = ?1 and region = ?2", nativeQuery = true)
	List<Podcast> findByGenreInAndRegionIn(String genre, String region);
}
