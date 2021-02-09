package facebook4j.api;

import facebook4j.FacebookException;
import facebook4j.InstagramMedia;

public interface InstagramMethods {

	String postInstagramMedia(String igAccountId, InstagramMedia instagramMedia) throws FacebookException;
	
}
