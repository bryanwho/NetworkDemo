package com.beginnerprogrammers.bryan.retrofitdemo.data;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Owner {

    private String login;
    private int id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private boolean site_admin;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Owner() {
    }

    /**
     *
     * @param received_events_url
     * @param organizations_url
     * @param avatar_url
     * @param gravatar_id
     * @param gists_url
     * @param starred_url
     * @param site_admin
     * @param type
     * @param url
     * @param id
     * @param html_url
     * @param following_url
     * @param events_url
     * @param login
     * @param subscriptions_url
     * @param repos_url
     * @param followers_url
     */
    public Owner(String login, int id, String avatar_url, String gravatar_id, String url, String html_url, String followers_url, String following_url, String gists_url, String starred_url, String subscriptions_url, String organizations_url, String repos_url, String events_url, String received_events_url, String type, boolean site_admin) {
        this.login = login;
        this.id = id;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatar_id;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
        this.organizations_url = organizations_url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.received_events_url = received_events_url;
        this.type = type;
        this.site_admin = site_admin;
    }

    public Owner(JSONObject jsonObject) {
        this.login = jsonObject.optString("login");
        this.id = jsonObject.optInt("id");
        this.avatar_url = jsonObject.optString("login");
        this.gravatar_id = jsonObject.optString("gravatar_id");
        this.url = jsonObject.optString("url");
        this.html_url = jsonObject.optString("html_url");

    }

    /**
     *
     * @return
     * The login
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     * The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    public Owner withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

    public Owner withId(int id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The avatar_url
     */
    public String getAvatar_url() {
        return avatar_url;
    }

    /**
     *
     * @param avatar_url
     * The avatar_url
     */
    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public Owner withAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
        return this;
    }

    /**
     *
     * @return
     * The gravatar_id
     */
    public String getGravatar_id() {
        return gravatar_id;
    }

    /**
     *
     * @param gravatar_id
     * The gravatar_id
     */
    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public Owner withGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
        return this;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public Owner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     *
     * @return
     * The html_url
     */
    public String getHtml_url() {
        return html_url;
    }

    /**
     *
     * @param html_url
     * The html_url
     */
    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public Owner withHtml_url(String html_url) {
        this.html_url = html_url;
        return this;
    }

    /**
     *
     * @return
     * The followers_url
     */
    public String getFollowers_url() {
        return followers_url;
    }

    /**
     *
     * @param followers_url
     * The followers_url
     */
    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public Owner withFollowers_url(String followers_url) {
        this.followers_url = followers_url;
        return this;
    }

    /**
     *
     * @return
     * The following_url
     */
    public String getFollowing_url() {
        return following_url;
    }

    /**
     *
     * @param following_url
     * The following_url
     */
    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public Owner withFollowing_url(String following_url) {
        this.following_url = following_url;
        return this;
    }

    /**
     *
     * @return
     * The gists_url
     */
    public String getGists_url() {
        return gists_url;
    }

    /**
     *
     * @param gists_url
     * The gists_url
     */
    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public Owner withGists_url(String gists_url) {
        this.gists_url = gists_url;
        return this;
    }

    /**
     *
     * @return
     * The starred_url
     */
    public String getStarred_url() {
        return starred_url;
    }

    /**
     *
     * @param starred_url
     * The starred_url
     */
    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public Owner withStarred_url(String starred_url) {
        this.starred_url = starred_url;
        return this;
    }

    /**
     *
     * @return
     * The subscriptions_url
     */
    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    /**
     *
     * @param subscriptions_url
     * The subscriptions_url
     */
    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    public Owner withSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
        return this;
    }

    /**
     *
     * @return
     * The organizations_url
     */
    public String getOrganizations_url() {
        return organizations_url;
    }

    /**
     *
     * @param organizations_url
     * The organizations_url
     */
    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public Owner withOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
        return this;
    }

    /**
     *
     * @return
     * The repos_url
     */
    public String getRepos_url() {
        return repos_url;
    }

    /**
     *
     * @param repos_url
     * The repos_url
     */
    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public Owner withRepos_url(String repos_url) {
        this.repos_url = repos_url;
        return this;
    }

    /**
     *
     * @return
     * The events_url
     */
    public String getEvents_url() {
        return events_url;
    }

    /**
     *
     * @param events_url
     * The events_url
     */
    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public Owner withEvents_url(String events_url) {
        this.events_url = events_url;
        return this;
    }

    /**
     *
     * @return
     * The received_events_url
     */
    public String getReceived_events_url() {
        return received_events_url;
    }

    /**
     *
     * @param received_events_url
     * The received_events_url
     */
    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public Owner withReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
        return this;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Owner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     * The site_admin
     */
    public boolean isSite_admin() {
        return site_admin;
    }

    /**
     *
     * @param site_admin
     * The site_admin
     */
    public void setSite_admin(boolean site_admin) {
        this.site_admin = site_admin;
    }

    public Owner withSite_admin(boolean site_admin) {
        this.site_admin = site_admin;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Owner withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}