package com.dhanraj.mymvvmapp.ui.home;

public class User {

    private String username;
    private String email;
    private String comment;

    public User(String username, String email, String comment) {
        this.username = username;
        this.email = email;
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
