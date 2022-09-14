package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;

    public String getText() {
        return text;
    }

    private Integer likes;

    public Integer getLikes() {
        return likes;
    }

    private Date creationDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public Post(String text, Date creationDate) {
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }
}
