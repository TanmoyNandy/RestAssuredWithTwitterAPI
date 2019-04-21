package resources.pojoForResponsePayloads;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StatusFromHomeTimelinePOJO {

	private boolean possibly_sensitive_appealable;
	Quoted_status Quoted_statusObject;
	private String in_reply_to_status_id_str = null;
	private String in_reply_to_status_id = null;
	private String created_at;
	private String in_reply_to_user_id_str = null;
	private String source;
	private float quoted_status_id;
	private float retweet_count;
	private boolean retweeted;
	private String geo = null;
	private String in_reply_to_screen_name = null;
	private boolean is_quote_status;
	private String id_str;
	private String in_reply_to_user_id = null;
	private float favorite_count;
	private float id;
	private String text;
	private String place = null;
	private String lang;
	private boolean favorited;
	private boolean possibly_sensitive;
	private String coordinates = null;
	private boolean truncated;
	Entities EntitiesObject;
	private String quoted_status_id_str;
	private String contributors = null;
	User UserObject;

	// Getter Methods

	public boolean getPossibly_sensitive_appealable() {
		return possibly_sensitive_appealable;
	}

	public Quoted_status getQuoted_status() {
		return Quoted_statusObject;
	}

	public String getIn_reply_to_status_id_str() {
		return in_reply_to_status_id_str;
	}

	public String getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public String getIn_reply_to_user_id_str() {
		return in_reply_to_user_id_str;
	}

	public String getSource() {
		return source;
	}

	public float getQuoted_status_id() {
		return quoted_status_id;
	}

	public float getRetweet_count() {
		return retweet_count;
	}

	public boolean getRetweeted() {
		return retweeted;
	}

	public String getGeo() {
		return geo;
	}

	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}

	public boolean getIs_quote_status() {
		return is_quote_status;
	}

	public String getId_str() {
		return id_str;
	}

	public String getIn_reply_to_user_id() {
		return in_reply_to_user_id;
	}

	public float getFavorite_count() {
		return favorite_count;
	}

	public float getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getPlace() {
		return place;
	}

	public String getLang() {
		return lang;
	}

	public boolean getFavorited() {
		return favorited;
	}

	public boolean getPossibly_sensitive() {
		return possibly_sensitive;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public boolean getTruncated() {
		return truncated;
	}

	public Entities getEntities() {
		return EntitiesObject;
	}

	public String getQuoted_status_id_str() {
		return quoted_status_id_str;
	}

	public String getContributors() {
		return contributors;
	}

	public User getUser() {
		return UserObject;
	}

	// Setter Methods

	public void setPossibly_sensitive_appealable(boolean possibly_sensitive_appealable) {
		this.possibly_sensitive_appealable = possibly_sensitive_appealable;
	}

	public void setQuoted_status(Quoted_status quoted_statusObject) {
		this.Quoted_statusObject = quoted_statusObject;
	}

	public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
		this.in_reply_to_status_id_str = in_reply_to_status_id_str;
	}

	public void setIn_reply_to_status_id(String in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
		this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setQuoted_status_id(float quoted_status_id) {
		this.quoted_status_id = quoted_status_id;
	}

	public void setRetweet_count(float retweet_count) {
		this.retweet_count = retweet_count;
	}

	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}

	public void setGeo(String geo) {
		this.geo = geo;
	}

	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}

	public void setIs_quote_status(boolean is_quote_status) {
		this.is_quote_status = is_quote_status;
	}

	public void setId_str(String id_str) {
		this.id_str = id_str;
	}

	public void setIn_reply_to_user_id(String in_reply_to_user_id) {
		this.in_reply_to_user_id = in_reply_to_user_id;
	}

	public void setFavorite_count(float favorite_count) {
		this.favorite_count = favorite_count;
	}

	public void setId(float id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public void setPossibly_sensitive(boolean possibly_sensitive) {
		this.possibly_sensitive = possibly_sensitive;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}

	public void setEntities(Entities entitiesObject) {
		this.EntitiesObject = entitiesObject;
	}

	public void setQuoted_status_id_str(String quoted_status_id_str) {
		this.quoted_status_id_str = quoted_status_id_str;
	}

	public void setContributors(String contributors) {
		this.contributors = contributors;
	}

	public void setUser(User userObject) {
		this.UserObject = userObject;
	}
}
