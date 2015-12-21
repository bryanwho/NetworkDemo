package com.beginnerprogrammers.bryan.retrofitdemo.data;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Repo {

    private int id;
    private String name;
    private String full_name;
    private Owner owner;
    private boolean _private;
    private String html_url;
    private String description;
    private boolean fork;
    private String url;
    private String forks_url;
    private String keys_url;
    private String collaborators_url;
    private String teams_url;
    private String hooks_url;
    private String issue_events_url;
    private String events_url;
    private String assignees_url;
    private String branches_url;
    private String tags_url;
    private String blobs_url;
    private String git_tags_url;
    private String git_refs_url;
    private String trees_url;
    private String statuses_url;
    private String languages_url;
    private String stargazers_url;
    private String contributors_url;
    private String subscribers_url;
    private String subscription_url;
    private String commits_url;
    private String git_commits_url;
    private String comments_url;
    private String issue_comment_url;
    private String contents_url;
    private String compare_url;
    private String merges_url;
    private String archive_url;
    private String downloads_url;
    private String issues_url;
    private String pulls_url;
    private String milestones_url;
    private String notifications_url;
    private String labels_url;
    private String releases_url;
    private String created_at;
    private String updated_at;
    private String pushed_at;
    private String git_url;
    private String ssh_url;
    private String clone_url;
    private String svn_url;
    private Object homepage;
    private int size;
    private int stargazers_count;
    private int watchers_count;
    private Object language;
    private boolean has_issues;
    private boolean has_downloads;
    private boolean has_wiki;
    private boolean has_pages;
    private int forks_count;
    private Object mirror_url;
    private int open_issues_count;
    private int forks;
    private int open_issues;
    private int watchers;
    private String default_branch;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Repo() {
    }

    /**
     *
     * @param has_issues
     * @param teams_url
     * @param compare_url
     * @param releases_url
     * @param keys_url
     * @param has_pages
     * @param _private
     * @param description
     * @param milestones_url
     * @param has_wiki
     * @param events_url
     * @param archive_url
     * @param subscribers_url
     * @param contributors_url
     * @param pushed_at
     * @param fork
     * @param svn_url
     * @param collaborators_url
     * @param subscription_url
     * @param clone_url
     * @param trees_url
     * @param homepage
     * @param url
     * @param size
     * @param notifications_url
     * @param updated_at
     * @param branches_url
     * @param owner
     * @param issue_events_url
     * @param language
     * @param forks_count
     * @param contents_url
     * @param watchers_count
     * @param blobs_url
     * @param commits_url
     * @param has_downloads
     * @param git_commits_url
     * @param default_branch
     * @param open_issues
     * @param id
     * @param downloads_url
     * @param mirror_url
     * @param comments_url
     * @param name
     * @param created_at
     * @param stargazers_count
     * @param assignees_url
     * @param pulls_url
     * @param watchers
     * @param stargazers_url
     * @param hooks_url
     * @param languages_url
     * @param issues_url
     * @param git_tags_url
     * @param merges_url
     * @param git_refs_url
     * @param open_issues_count
     * @param ssh_url
     * @param html_url
     * @param forks
     * @param statuses_url
     * @param forks_url
     * @param issue_comment_url
     * @param labels_url
     * @param tags_url
     * @param git_url
     * @param full_name
     */
    public Repo(int id, String name, String full_name, Owner owner, boolean _private, String html_url, String description, boolean fork, String url, String forks_url, String keys_url, String collaborators_url, String teams_url, String hooks_url, String issue_events_url, String events_url, String assignees_url, String branches_url, String tags_url, String blobs_url, String git_tags_url, String git_refs_url, String trees_url, String statuses_url, String languages_url, String stargazers_url, String contributors_url, String subscribers_url, String subscription_url, String commits_url, String git_commits_url, String comments_url, String issue_comment_url, String contents_url, String compare_url, String merges_url, String archive_url, String downloads_url, String issues_url, String pulls_url, String milestones_url, String notifications_url, String labels_url, String releases_url, String created_at, String updated_at, String pushed_at, String git_url, String ssh_url, String clone_url, String svn_url, Object homepage, int size, int stargazers_count, int watchers_count, Object language, boolean has_issues, boolean has_downloads, boolean has_wiki, boolean has_pages, int forks_count, Object mirror_url, int open_issues_count, int forks, int open_issues, int watchers, String default_branch) {
        this.id = id;
        this.name = name;
        this.full_name = full_name;
        this.owner = owner;
        this._private = _private;
        this.html_url = html_url;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forks_url = forks_url;
        this.keys_url = keys_url;
        this.collaborators_url = collaborators_url;
        this.teams_url = teams_url;
        this.hooks_url = hooks_url;
        this.issue_events_url = issue_events_url;
        this.events_url = events_url;
        this.assignees_url = assignees_url;
        this.branches_url = branches_url;
        this.tags_url = tags_url;
        this.blobs_url = blobs_url;
        this.git_tags_url = git_tags_url;
        this.git_refs_url = git_refs_url;
        this.trees_url = trees_url;
        this.statuses_url = statuses_url;
        this.languages_url = languages_url;
        this.stargazers_url = stargazers_url;
        this.contributors_url = contributors_url;
        this.subscribers_url = subscribers_url;
        this.subscription_url = subscription_url;
        this.commits_url = commits_url;
        this.git_commits_url = git_commits_url;
        this.comments_url = comments_url;
        this.issue_comment_url = issue_comment_url;
        this.contents_url = contents_url;
        this.compare_url = compare_url;
        this.merges_url = merges_url;
        this.archive_url = archive_url;
        this.downloads_url = downloads_url;
        this.issues_url = issues_url;
        this.pulls_url = pulls_url;
        this.milestones_url = milestones_url;
        this.notifications_url = notifications_url;
        this.labels_url = labels_url;
        this.releases_url = releases_url;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.pushed_at = pushed_at;
        this.git_url = git_url;
        this.ssh_url = ssh_url;
        this.clone_url = clone_url;
        this.svn_url = svn_url;
        this.homepage = homepage;
        this.size = size;
        this.stargazers_count = stargazers_count;
        this.watchers_count = watchers_count;
        this.language = language;
        this.has_issues = has_issues;
        this.has_downloads = has_downloads;
        this.has_wiki = has_wiki;
        this.has_pages = has_pages;
        this.forks_count = forks_count;
        this.mirror_url = mirror_url;
        this.open_issues_count = open_issues_count;
        this.forks = forks;
        this.open_issues = open_issues;
        this.watchers = watchers;
        this.default_branch = default_branch;
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

    public Repo withId(int id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Repo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     * The full_name
     */
    public String getFull_name() {
        return full_name;
    }

    /**
     *
     * @param full_name
     * The full_name
     */
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Repo withFull_name(String full_name) {
        this.full_name = full_name;
        return this;
    }

    /**
     *
     * @return
     * The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     *
     * @param owner
     * The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Repo withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    /**
     *
     * @return
     * The _private
     */
    public boolean isPrivate() {
        return _private;
    }

    /**
     *
     * @param _private
     * The private
     */
    public void setPrivate(boolean _private) {
        this._private = _private;
    }

    public Repo with_private(boolean _private) {
        this._private = _private;
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

    public Repo withHtml_url(String html_url) {
        this.html_url = html_url;
        return this;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Repo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     *
     * @return
     * The fork
     */
    public boolean isFork() {
        return fork;
    }

    /**
     *
     * @param fork
     * The fork
     */
    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public Repo withFork(boolean fork) {
        this.fork = fork;
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

    public Repo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     *
     * @return
     * The forks_url
     */
    public String getForks_url() {
        return forks_url;
    }

    /**
     *
     * @param forks_url
     * The forks_url
     */
    public void setForks_url(String forks_url) {
        this.forks_url = forks_url;
    }

    public Repo withForks_url(String forks_url) {
        this.forks_url = forks_url;
        return this;
    }

    /**
     *
     * @return
     * The keys_url
     */
    public String getKeys_url() {
        return keys_url;
    }

    /**
     *
     * @param keys_url
     * The keys_url
     */
    public void setKeys_url(String keys_url) {
        this.keys_url = keys_url;
    }

    public Repo withKeys_url(String keys_url) {
        this.keys_url = keys_url;
        return this;
    }

    /**
     *
     * @return
     * The collaborators_url
     */
    public String getCollaborators_url() {
        return collaborators_url;
    }

    /**
     *
     * @param collaborators_url
     * The collaborators_url
     */
    public void setCollaborators_url(String collaborators_url) {
        this.collaborators_url = collaborators_url;
    }

    public Repo withCollaborators_url(String collaborators_url) {
        this.collaborators_url = collaborators_url;
        return this;
    }

    /**
     *
     * @return
     * The teams_url
     */
    public String getTeams_url() {
        return teams_url;
    }

    /**
     *
     * @param teams_url
     * The teams_url
     */
    public void setTeams_url(String teams_url) {
        this.teams_url = teams_url;
    }

    public Repo withTeams_url(String teams_url) {
        this.teams_url = teams_url;
        return this;
    }

    /**
     *
     * @return
     * The hooks_url
     */
    public String getHooks_url() {
        return hooks_url;
    }

    /**
     *
     * @param hooks_url
     * The hooks_url
     */
    public void setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
    }

    public Repo withHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
        return this;
    }

    /**
     *
     * @return
     * The issue_events_url
     */
    public String getIssue_events_url() {
        return issue_events_url;
    }

    /**
     *
     * @param issue_events_url
     * The issue_events_url
     */
    public void setIssue_events_url(String issue_events_url) {
        this.issue_events_url = issue_events_url;
    }

    public Repo withIssue_events_url(String issue_events_url) {
        this.issue_events_url = issue_events_url;
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

    public Repo withEvents_url(String events_url) {
        this.events_url = events_url;
        return this;
    }

    /**
     *
     * @return
     * The assignees_url
     */
    public String getAssignees_url() {
        return assignees_url;
    }

    /**
     *
     * @param assignees_url
     * The assignees_url
     */
    public void setAssignees_url(String assignees_url) {
        this.assignees_url = assignees_url;
    }

    public Repo withAssignees_url(String assignees_url) {
        this.assignees_url = assignees_url;
        return this;
    }

    /**
     *
     * @return
     * The branches_url
     */
    public String getBranches_url() {
        return branches_url;
    }

    /**
     *
     * @param branches_url
     * The branches_url
     */
    public void setBranches_url(String branches_url) {
        this.branches_url = branches_url;
    }

    public Repo withBranches_url(String branches_url) {
        this.branches_url = branches_url;
        return this;
    }

    /**
     *
     * @return
     * The tags_url
     */
    public String getTags_url() {
        return tags_url;
    }

    /**
     *
     * @param tags_url
     * The tags_url
     */
    public void setTags_url(String tags_url) {
        this.tags_url = tags_url;
    }

    public Repo withTags_url(String tags_url) {
        this.tags_url = tags_url;
        return this;
    }

    /**
     *
     * @return
     * The blobs_url
     */
    public String getBlobs_url() {
        return blobs_url;
    }

    /**
     *
     * @param blobs_url
     * The blobs_url
     */
    public void setBlobs_url(String blobs_url) {
        this.blobs_url = blobs_url;
    }

    public Repo withBlobs_url(String blobs_url) {
        this.blobs_url = blobs_url;
        return this;
    }

    /**
     *
     * @return
     * The git_tags_url
     */
    public String getGit_tags_url() {
        return git_tags_url;
    }

    /**
     *
     * @param git_tags_url
     * The git_tags_url
     */
    public void setGit_tags_url(String git_tags_url) {
        this.git_tags_url = git_tags_url;
    }

    public Repo withGit_tags_url(String git_tags_url) {
        this.git_tags_url = git_tags_url;
        return this;
    }

    /**
     *
     * @return
     * The git_refs_url
     */
    public String getGit_refs_url() {
        return git_refs_url;
    }

    /**
     *
     * @param git_refs_url
     * The git_refs_url
     */
    public void setGit_refs_url(String git_refs_url) {
        this.git_refs_url = git_refs_url;
    }

    public Repo withGit_refs_url(String git_refs_url) {
        this.git_refs_url = git_refs_url;
        return this;
    }

    /**
     *
     * @return
     * The trees_url
     */
    public String getTrees_url() {
        return trees_url;
    }

    /**
     *
     * @param trees_url
     * The trees_url
     */
    public void setTrees_url(String trees_url) {
        this.trees_url = trees_url;
    }

    public Repo withTrees_url(String trees_url) {
        this.trees_url = trees_url;
        return this;
    }

    /**
     *
     * @return
     * The statuses_url
     */
    public String getStatuses_url() {
        return statuses_url;
    }

    /**
     *
     * @param statuses_url
     * The statuses_url
     */
    public void setStatuses_url(String statuses_url) {
        this.statuses_url = statuses_url;
    }

    public Repo withStatuses_url(String statuses_url) {
        this.statuses_url = statuses_url;
        return this;
    }

    /**
     *
     * @return
     * The languages_url
     */
    public String getLanguages_url() {
        return languages_url;
    }

    /**
     *
     * @param languages_url
     * The languages_url
     */
    public void setLanguages_url(String languages_url) {
        this.languages_url = languages_url;
    }

    public Repo withLanguages_url(String languages_url) {
        this.languages_url = languages_url;
        return this;
    }

    /**
     *
     * @return
     * The stargazers_url
     */
    public String getStargazers_url() {
        return stargazers_url;
    }

    /**
     *
     * @param stargazers_url
     * The stargazers_url
     */
    public void setStargazers_url(String stargazers_url) {
        this.stargazers_url = stargazers_url;
    }

    public Repo withStargazers_url(String stargazers_url) {
        this.stargazers_url = stargazers_url;
        return this;
    }

    /**
     *
     * @return
     * The contributors_url
     */
    public String getContributors_url() {
        return contributors_url;
    }

    /**
     *
     * @param contributors_url
     * The contributors_url
     */
    public void setContributors_url(String contributors_url) {
        this.contributors_url = contributors_url;
    }

    public Repo withContributors_url(String contributors_url) {
        this.contributors_url = contributors_url;
        return this;
    }

    /**
     *
     * @return
     * The subscribers_url
     */
    public String getSubscribers_url() {
        return subscribers_url;
    }

    /**
     *
     * @param subscribers_url
     * The subscribers_url
     */
    public void setSubscribers_url(String subscribers_url) {
        this.subscribers_url = subscribers_url;
    }

    public Repo withSubscribers_url(String subscribers_url) {
        this.subscribers_url = subscribers_url;
        return this;
    }

    /**
     *
     * @return
     * The subscription_url
     */
    public String getSubscription_url() {
        return subscription_url;
    }

    /**
     *
     * @param subscription_url
     * The subscription_url
     */
    public void setSubscription_url(String subscription_url) {
        this.subscription_url = subscription_url;
    }

    public Repo withSubscription_url(String subscription_url) {
        this.subscription_url = subscription_url;
        return this;
    }

    /**
     *
     * @return
     * The commits_url
     */
    public String getCommits_url() {
        return commits_url;
    }

    /**
     *
     * @param commits_url
     * The commits_url
     */
    public void setCommits_url(String commits_url) {
        this.commits_url = commits_url;
    }

    public Repo withCommits_url(String commits_url) {
        this.commits_url = commits_url;
        return this;
    }

    /**
     *
     * @return
     * The git_commits_url
     */
    public String getGit_commits_url() {
        return git_commits_url;
    }

    /**
     *
     * @param git_commits_url
     * The git_commits_url
     */
    public void setGit_commits_url(String git_commits_url) {
        this.git_commits_url = git_commits_url;
    }

    public Repo withGit_commits_url(String git_commits_url) {
        this.git_commits_url = git_commits_url;
        return this;
    }

    /**
     *
     * @return
     * The comments_url
     */
    public String getComments_url() {
        return comments_url;
    }

    /**
     *
     * @param comments_url
     * The comments_url
     */
    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public Repo withComments_url(String comments_url) {
        this.comments_url = comments_url;
        return this;
    }

    /**
     *
     * @return
     * The issue_comment_url
     */
    public String getIssue_comment_url() {
        return issue_comment_url;
    }

    /**
     *
     * @param issue_comment_url
     * The issue_comment_url
     */
    public void setIssue_comment_url(String issue_comment_url) {
        this.issue_comment_url = issue_comment_url;
    }

    public Repo withIssue_comment_url(String issue_comment_url) {
        this.issue_comment_url = issue_comment_url;
        return this;
    }

    /**
     *
     * @return
     * The contents_url
     */
    public String getContents_url() {
        return contents_url;
    }

    /**
     *
     * @param contents_url
     * The contents_url
     */
    public void setContents_url(String contents_url) {
        this.contents_url = contents_url;
    }

    public Repo withContents_url(String contents_url) {
        this.contents_url = contents_url;
        return this;
    }

    /**
     *
     * @return
     * The compare_url
     */
    public String getCompare_url() {
        return compare_url;
    }

    /**
     *
     * @param compare_url
     * The compare_url
     */
    public void setCompare_url(String compare_url) {
        this.compare_url = compare_url;
    }

    public Repo withCompare_url(String compare_url) {
        this.compare_url = compare_url;
        return this;
    }

    /**
     *
     * @return
     * The merges_url
     */
    public String getMerges_url() {
        return merges_url;
    }

    /**
     *
     * @param merges_url
     * The merges_url
     */
    public void setMerges_url(String merges_url) {
        this.merges_url = merges_url;
    }

    public Repo withMerges_url(String merges_url) {
        this.merges_url = merges_url;
        return this;
    }

    /**
     *
     * @return
     * The archive_url
     */
    public String getArchive_url() {
        return archive_url;
    }

    /**
     *
     * @param archive_url
     * The archive_url
     */
    public void setArchive_url(String archive_url) {
        this.archive_url = archive_url;
    }

    public Repo withArchive_url(String archive_url) {
        this.archive_url = archive_url;
        return this;
    }

    /**
     *
     * @return
     * The downloads_url
     */
    public String getDownloads_url() {
        return downloads_url;
    }

    /**
     *
     * @param downloads_url
     * The downloads_url
     */
    public void setDownloads_url(String downloads_url) {
        this.downloads_url = downloads_url;
    }

    public Repo withDownloads_url(String downloads_url) {
        this.downloads_url = downloads_url;
        return this;
    }

    /**
     *
     * @return
     * The issues_url
     */
    public String getIssues_url() {
        return issues_url;
    }

    /**
     *
     * @param issues_url
     * The issues_url
     */
    public void setIssues_url(String issues_url) {
        this.issues_url = issues_url;
    }

    public Repo withIssues_url(String issues_url) {
        this.issues_url = issues_url;
        return this;
    }

    /**
     *
     * @return
     * The pulls_url
     */
    public String getPulls_url() {
        return pulls_url;
    }

    /**
     *
     * @param pulls_url
     * The pulls_url
     */
    public void setPulls_url(String pulls_url) {
        this.pulls_url = pulls_url;
    }

    public Repo withPulls_url(String pulls_url) {
        this.pulls_url = pulls_url;
        return this;
    }

    /**
     *
     * @return
     * The milestones_url
     */
    public String getMilestones_url() {
        return milestones_url;
    }

    /**
     *
     * @param milestones_url
     * The milestones_url
     */
    public void setMilestones_url(String milestones_url) {
        this.milestones_url = milestones_url;
    }

    public Repo withMilestones_url(String milestones_url) {
        this.milestones_url = milestones_url;
        return this;
    }

    /**
     *
     * @return
     * The notifications_url
     */
    public String getNotifications_url() {
        return notifications_url;
    }

    /**
     *
     * @param notifications_url
     * The notifications_url
     */
    public void setNotifications_url(String notifications_url) {
        this.notifications_url = notifications_url;
    }

    public Repo withNotifications_url(String notifications_url) {
        this.notifications_url = notifications_url;
        return this;
    }

    /**
     *
     * @return
     * The labels_url
     */
    public String getLabels_url() {
        return labels_url;
    }

    /**
     *
     * @param labels_url
     * The labels_url
     */
    public void setLabels_url(String labels_url) {
        this.labels_url = labels_url;
    }

    public Repo withLabels_url(String labels_url) {
        this.labels_url = labels_url;
        return this;
    }

    /**
     *
     * @return
     * The releases_url
     */
    public String getReleases_url() {
        return releases_url;
    }

    /**
     *
     * @param releases_url
     * The releases_url
     */
    public void setReleases_url(String releases_url) {
        this.releases_url = releases_url;
    }

    public Repo withReleases_url(String releases_url) {
        this.releases_url = releases_url;
        return this;
    }

    /**
     *
     * @return
     * The created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     *
     * @param created_at
     * The created_at
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Repo withCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
    }

    /**
     *
     * @return
     * The updated_at
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     *
     * @param updated_at
     * The updated_at
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Repo withUpdated_at(String updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    /**
     *
     * @return
     * The pushed_at
     */
    public String getPushed_at() {
        return pushed_at;
    }

    /**
     *
     * @param pushed_at
     * The pushed_at
     */
    public void setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
    }

    public Repo withPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
        return this;
    }

    /**
     *
     * @return
     * The git_url
     */
    public String getGit_url() {
        return git_url;
    }

    /**
     *
     * @param git_url
     * The git_url
     */
    public void setGit_url(String git_url) {
        this.git_url = git_url;
    }

    public Repo withGit_url(String git_url) {
        this.git_url = git_url;
        return this;
    }

    /**
     *
     * @return
     * The ssh_url
     */
    public String getSsh_url() {
        return ssh_url;
    }

    /**
     *
     * @param ssh_url
     * The ssh_url
     */
    public void setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
    }

    public Repo withSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
        return this;
    }

    /**
     *
     * @return
     * The clone_url
     */
    public String getClone_url() {
        return clone_url;
    }

    /**
     *
     * @param clone_url
     * The clone_url
     */
    public void setClone_url(String clone_url) {
        this.clone_url = clone_url;
    }

    public Repo withClone_url(String clone_url) {
        this.clone_url = clone_url;
        return this;
    }

    /**
     *
     * @return
     * The svn_url
     */
    public String getSvn_url() {
        return svn_url;
    }

    /**
     *
     * @param svn_url
     * The svn_url
     */
    public void setSvn_url(String svn_url) {
        this.svn_url = svn_url;
    }

    public Repo withSvn_url(String svn_url) {
        this.svn_url = svn_url;
        return this;
    }

    /**
     *
     * @return
     * The homepage
     */
    public Object getHomepage() {
        return homepage;
    }

    /**
     *
     * @param homepage
     * The homepage
     */
    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public Repo withHomepage(Object homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     *
     * @return
     * The size
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(int size) {
        this.size = size;
    }

    public Repo withSize(int size) {
        this.size = size;
        return this;
    }

    /**
     *
     * @return
     * The stargazers_count
     */
    public int getStargazers_count() {
        return stargazers_count;
    }

    /**
     *
     * @param stargazers_count
     * The stargazers_count
     */
    public void setStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public Repo withStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
        return this;
    }

    /**
     *
     * @return
     * The watchers_count
     */
    public int getWatchers_count() {
        return watchers_count;
    }

    /**
     *
     * @param watchers_count
     * The watchers_count
     */
    public void setWatchers_count(int watchers_count) {
        this.watchers_count = watchers_count;
    }

    public Repo withWatchers_count(int watchers_count) {
        this.watchers_count = watchers_count;
        return this;
    }

    /**
     *
     * @return
     * The language
     */
    public Object getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     * The language
     */
    public void setLanguage(Object language) {
        this.language = language;
    }

    public Repo withLanguage(Object language) {
        this.language = language;
        return this;
    }

    /**
     *
     * @return
     * The has_issues
     */
    public boolean isHas_issues() {
        return has_issues;
    }

    /**
     *
     * @param has_issues
     * The has_issues
     */
    public void setHas_issues(boolean has_issues) {
        this.has_issues = has_issues;
    }

    public Repo withHas_issues(boolean has_issues) {
        this.has_issues = has_issues;
        return this;
    }

    /**
     *
     * @return
     * The has_downloads
     */
    public boolean isHas_downloads() {
        return has_downloads;
    }

    /**
     *
     * @param has_downloads
     * The has_downloads
     */
    public void setHas_downloads(boolean has_downloads) {
        this.has_downloads = has_downloads;
    }

    public Repo withHas_downloads(boolean has_downloads) {
        this.has_downloads = has_downloads;
        return this;
    }

    /**
     *
     * @return
     * The has_wiki
     */
    public boolean isHas_wiki() {
        return has_wiki;
    }

    /**
     *
     * @param has_wiki
     * The has_wiki
     */
    public void setHas_wiki(boolean has_wiki) {
        this.has_wiki = has_wiki;
    }

    public Repo withHas_wiki(boolean has_wiki) {
        this.has_wiki = has_wiki;
        return this;
    }

    /**
     *
     * @return
     * The has_pages
     */
    public boolean isHas_pages() {
        return has_pages;
    }

    /**
     *
     * @param has_pages
     * The has_pages
     */
    public void setHas_pages(boolean has_pages) {
        this.has_pages = has_pages;
    }

    public Repo withHas_pages(boolean has_pages) {
        this.has_pages = has_pages;
        return this;
    }

    /**
     *
     * @return
     * The forks_count
     */
    public int getForks_count() {
        return forks_count;
    }

    /**
     *
     * @param forks_count
     * The forks_count
     */
    public void setForks_count(int forks_count) {
        this.forks_count = forks_count;
    }

    public Repo withForks_count(int forks_count) {
        this.forks_count = forks_count;
        return this;
    }

    /**
     *
     * @return
     * The mirror_url
     */
    public Object getMirror_url() {
        return mirror_url;
    }

    /**
     *
     * @param mirror_url
     * The mirror_url
     */
    public void setMirror_url(Object mirror_url) {
        this.mirror_url = mirror_url;
    }

    public Repo withMirror_url(Object mirror_url) {
        this.mirror_url = mirror_url;
        return this;
    }

    /**
     *
     * @return
     * The open_issues_count
     */
    public int getOpen_issues_count() {
        return open_issues_count;
    }

    /**
     *
     * @param open_issues_count
     * The open_issues_count
     */
    public void setOpen_issues_count(int open_issues_count) {
        this.open_issues_count = open_issues_count;
    }

    public Repo withOpen_issues_count(int open_issues_count) {
        this.open_issues_count = open_issues_count;
        return this;
    }

    /**
     *
     * @return
     * The forks
     */
    public int getForks() {
        return forks;
    }

    /**
     *
     * @param forks
     * The forks
     */
    public void setForks(int forks) {
        this.forks = forks;
    }

    public Repo withForks(int forks) {
        this.forks = forks;
        return this;
    }

    /**
     *
     * @return
     * The open_issues
     */
    public int getOpen_issues() {
        return open_issues;
    }

    /**
     *
     * @param open_issues
     * The open_issues
     */
    public void setOpen_issues(int open_issues) {
        this.open_issues = open_issues;
    }

    public Repo withOpen_issues(int open_issues) {
        this.open_issues = open_issues;
        return this;
    }

    /**
     *
     * @return
     * The watchers
     */
    public int getWatchers() {
        return watchers;
    }

    /**
     *
     * @param watchers
     * The watchers
     */
    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public Repo withWatchers(int watchers) {
        this.watchers = watchers;
        return this;
    }

    /**
     *
     * @return
     * The default_branch
     */
    public String getDefault_branch() {
        return default_branch;
    }

    /**
     *
     * @param default_branch
     * The default_branch
     */
    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    public Repo withDefault_branch(String default_branch) {
        this.default_branch = default_branch;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Repo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}

