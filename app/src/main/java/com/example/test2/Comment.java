package com.example.test2;

import com.google.gson.annotations.SerializedName;

public class Comment {
    public int getPostID() {
        return postID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }

    private int postID;

    private int id;

    private String name;

    private String email;

    @SerializedName("body")
    private String text;



}
