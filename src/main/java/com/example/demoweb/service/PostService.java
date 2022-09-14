package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class PostService {

    private ArrayList<Post> posts;

    public PostService() {
        this.posts  = new ArrayList<>();
        addPost("What is love", Date.valueOf(LocalDate.now()));
        addPost("Baby don't hurt me", Date.valueOf(LocalDate.now()));
        addPost("Don't hurt me", Date.valueOf(LocalDate.now()));
        addPost("No more", Date.valueOf(LocalDate.now()));
    }

    public ArrayList<Post> listAllPosts(){
        return posts;
   }


    public void addPost(String text, Date date){
        posts.add(new Post(text, date));
    }

}
