package models;

import java.util.*;

public class User {
    private String username;
    private String password;
    private List<Post> posts = new ArrayList<>();
    private Set<User> followers = new HashSet<>();
    private Set<User> following = new HashSet<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public boolean checkPassword(String pass) { return password.equals(pass); }
    public List<Post> getPosts() { return posts; }

    public void follow(User user) {
        following.add(user);
        user.followers.add(this);
    }

    public Set<User> getFollowing() { return following; }
    public Set<User> getFollowers() { return followers; }

    public void addPost(Post post) {
        posts.add(post);
    }
}
