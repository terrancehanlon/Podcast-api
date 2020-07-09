package org.pods;

import org.pods.service.PodcastService;
import org.pods.util.PodcastRequest;
import org.pods.util.PodcastResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class PodcastController {
	
	@Autowired
	private PodcastService podcastService;
	
	@RequestMapping(value="best_podcast", method= RequestMethod.GET)
	public @ResponseBody PodcastResponse getBestPodcasts(	@RequestParam("genre_id") String genreId,
														@RequestParam("page") String page,
														@RequestParam("region") String region,
														@RequestParam("safe_mode") String safeMode
													  )
	{					
			podcastService.incrementClicks();
			PodcastRequest fullRequest = podcastService.formRequest(genreId, region);
			return podcastService.getResponse(fullRequest);
	}
	
}
