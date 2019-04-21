package resources.pojoForResponsePayloads;

public class DeleteATweetPOJO {

	private String in_reply_to_status_id_str = null;
	private String in_reply_to_status_id = null;
	private String coordinates = null;
	private String created_at;
	private boolean truncated;
	private String in_reply_to_user_id_str = null;
	private String source;
	private float retweet_count;
	private boolean retweeted;
	private String geo = null;
	private String in_reply_to_screen_name = null;
	private boolean is_quote_status;
	Entities EntitiesObject;
	private String id_str;
	private String in_reply_to_user_id = null;
	private float favorite_count;
	private String id;
	private String text;
	private String place = null;
	private String contributors = null;
	private String lang;
	User UserObject;
	private boolean favorited;

	// Getter Methods

	public String getIn_reply_to_status_id_str() {
		return in_reply_to_status_id_str;
	}

	public String getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public String getCreated_at() {
		return created_at;
	}

	public boolean getTruncated() {
		return truncated;
	}

	public String getIn_reply_to_user_id_str() {
		return in_reply_to_user_id_str;
	}

	public String getSource() {
		return source;
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

	public Entities getEntities() {
		return EntitiesObject;
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

	public String getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getPlace() {
		return place;
	}

	public String getContributors() {
		return contributors;
	}

	public String getLang() {
		return lang;
	}

	public User getUser() {
		return UserObject;
	}

	public boolean getFavorited() {
		return favorited;
	}

	// Setter Methods

	public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
		this.in_reply_to_status_id_str = in_reply_to_status_id_str;
	}

	public void setIn_reply_to_status_id(String in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}

	public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
		this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	}

	public void setSource(String source) {
		this.source = source;
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

	public void setEntities(Entities entitiesObject) {
		this.EntitiesObject = entitiesObject;
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

	public void setId(String id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setContributors(String contributors) {
		this.contributors = contributors;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public void setUser(User userObject) {
		this.UserObject = userObject;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

}
