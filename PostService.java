package services;

import models.*;

import java.util.*;

public class PostService {
    private List<Post> posts = new ArrayList<>();

    public void createPost(User user, String content) {
        Post post = new Post(user, content);
        user.addPost(post);
        posts.add(post);
    }

    public void showFeed(User user) {
        System.out.println("\n📜 Feed:");
        for (Post post : posts) {
            if (user.getFollowing().contains(post.getAuthor()) || post.getAuthor() == user) {
                post.showPost();
                System.out.println();
            }
        }
    }
}
