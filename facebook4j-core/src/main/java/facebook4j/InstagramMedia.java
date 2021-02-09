package facebook4j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import facebook4j.internal.http.HttpParameter;

public class InstagramMedia implements Serializable {
	
	public enum MediaType {IMAGE,VIDEO}

	private static final long serialVersionUID = 6473467391238422272L;

	private String mediaUrl;
	private MediaType mediaType;
	private String caption;
	
	public String getMediaUrl() {
		return mediaUrl;
	}
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}
	public MediaType getMediaType() {
		return mediaType;
	}
	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}

    /*package*/ HttpParameter[] asHttpParameterArray() {
        List<HttpParameter> params = new ArrayList<HttpParameter>();
        if (mediaType.equals(MediaType.VIDEO)) {
        	params.add(new HttpParameter("media_type", "VIDEO"));
            params.add(new HttpParameter("video_url", mediaUrl));
        } else {
            params.add(new HttpParameter("image_url", mediaUrl));        	
        }
        if (caption != null) {
            params.add(new HttpParameter("caption", caption));
        }
        return params.toArray(new HttpParameter[params.size()]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InstagramMedia)) return false;
        
        InstagramMedia that = (InstagramMedia) o;

        if (mediaUrl != null ? !mediaUrl.equals(that.mediaUrl) : that.mediaUrl != null) return false;
        if (mediaType != null ? !mediaType.equals(that.mediaType) : that.mediaType != null) return false;
        if (caption != null ? !caption.equals(that.caption) : that.caption != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (mediaUrl != null) ? mediaUrl.hashCode() : 0;
        result = 31 * result + (mediaType != null ? mediaType.hashCode() : 0);
        result = 31 * result + (caption != null ? caption.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InstagramMedia{" +
                "mediaUrl=" + mediaUrl +
                '}';
    }
}
