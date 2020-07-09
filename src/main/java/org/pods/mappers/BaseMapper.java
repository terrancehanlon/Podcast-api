package org.pods.mappers;

import org.pods.util.*;
import org.pods.data.*;
import java.util.List;

//base mapper interface, this way we could have a mapper class for each different type of request.
public interface BaseMapper {
    
    public PodcastResponse finalizeResponse(List<Podcast> podcasts);
    public PodcastRequest finalizeRequest(String genre, String region);
	
}
