package com.observer;
import java.util.ArrayList;
import java.util.List;

public class Blogger {
    private String post;
    private List<Channel> channels = new ArrayList<>();
 
    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }
 
    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }
 
    public void setPost(String post) {
        this.post = post;
        for (Channel channel : this.channels) {
            channel.update(this.post);
        }
    }
}
