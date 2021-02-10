package facebook4j.api;

import facebook4j.FacebookException;
import facebook4j.InstagramMedia;
import facebook4j.PageBackedInstagramAccount;

public interface InstagramMethods {
	
	PageBackedInstagramAccount getInstagramBusinessAccount(String pageId) throws FacebookException;

	String postInstagramMedia(String instagramAccountId, InstagramMedia instagramMedia) throws FacebookException;
	
}
