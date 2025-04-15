import models.*;
import services.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        PostService postService = new PostService();

        User currentUser = null;
        boolean running = true;

        while (running) {
            System.out.println("\n📱 Social Media App");
            if (currentUser == null) {
                System.out.println("1. Register\n2. Login\n3. Exit");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    System.out.print("Username: ");
                    String u = sc.nextLine();
                    System.out.print("Password: ");
                    String p = sc.nextLine();
                    if (userService.register(u, p)) {
                        System.out.println("✅ Registered successfully!");
                    } else {
                        System.out.println("❌ Username already taken.");
                    }
                } else if (choice == 2) {
                    System.out.print("Username: ");
                    String u = sc.nextLine();
                    System.out.print("Password: ");
                    String p = sc.nextLine();
                    currentUser = userService.login(u, p);
                    if (currentUser != null) {
                        System.out.println("✅ Logged in as " + currentUser.getUsername());
                    } else {
                        System.out.println("❌ Invalid credentials.");
                    }
                } else {
                    running = false;
                }
            } else {
                System.out.println("\nWelcome, " + currentUser.getUsername());
                System.out.println("1. Create Post\n2. View Feed\n3. Follow User\n4. Logout");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Write your post: ");
                        String content = sc.nextLine();
                        postService.createPost(currentUser, content);
                        break;
                    case 2:
                        postService.showFeed(currentUser);
                        break;
                    case 3:
                        System.out.print("Enter username to follow: ");
                        String uname = sc.nextLine();
                        User toFollow = userService.findUser(uname);
                        if (toFollow != null && toFollow != currentUser) {
                            currentUser.follow(toFollow);
                            System.out.println("✅ Now following " + uname);
                        } else {
                            System.out.println("❌ User not found or invalid.");
                        }
                        break;
                    case 4:
                        currentUser = null;
                        break;
                }
            }
        }
        sc.close();
    }
}
