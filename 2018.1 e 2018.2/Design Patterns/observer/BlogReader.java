package com.observer;

public class BlogReader implements Channel{
    private String post;
    
    @Override
    public void update(Object post) {
        this.setPost((String) post);
    } 
    
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
