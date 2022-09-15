package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private Long id;

    public Long getId() {
        return id;
    }

    private String text;

    public String getText() {
        return text;
    }

    private Integer likes;

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    private Date creationDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }
}
