package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private String creationDate;

    public Post() {

    }
    public Post(Date creationDate, Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Post(long id, String text) {
        this.id = id;
        this.text = text;
        this.creationDate = new Date().toString();
        this.likes = new Integer(0);
    }

    public Long getId() {
        return id;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    public String getCreationDate() { return creationDate; }
}
