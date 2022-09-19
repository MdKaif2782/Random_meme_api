package com.example.random_meme_api;

public class Post {
    private String title;
    private String url;
    private String subreddit;
    private String author;
    private String permalink;
    private String postLink;
    private String postTime;
    private String Rating;
    private String postType;
    private Boolean over_18;
    private Boolean spoiler;

    public Post(String title, String url, String subreddit, String author, String permalink, String postLink, String postTime, String rating, String postType, Boolean over_18, Boolean spoiler) {
        this.title = title;
        this.url = url;
        this.subreddit = subreddit;
        this.author = author;
        this.permalink = permalink;
        this.postLink = postLink;
        this.postTime = postTime;
        this.Rating = rating;
        this.postType = postType;
        this.over_18 = over_18;
        this.spoiler = spoiler;
    }

    public Post() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getOver_18() {
        return over_18;
    }

    public void setOver_18(Boolean over_18) {
        this.over_18 = over_18;
    }

    public Boolean getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(Boolean spoiler) {
        this.spoiler = spoiler;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getPostLink() {
        return postLink;
    }

    public void setPostLink(String postLink) {
        this.postLink = postLink;
    }

    public String getPostTime() {
        return postTime;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }
}
