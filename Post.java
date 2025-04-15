package models;

import java.util.*;

public class Post {
    private String content;
    private User author;
    private int likes = 0;
    private List<String> comments = new ArrayList<>();

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
    }

    public void like() {
        likes++;
    }

    public void comment(String comment) {
        comments.add(comment);
    }

    public void showPost() {
        System.out.println(author.getUsername() + ": " + content);
        System.out.println("❤ " + likes + " | 💬 " + comments.size());
        if (!comments.isEmpty()) {
            System.out.println("Comments:");
            for (String c : comments) {
                System.out.println("- " + c);
            }
        }
    }

    public User getAuthor() {
        return author;
    }
}
