# das
# Simple Social Media Console App

This is a basic social media application built in Java that demonstrates core object-oriented programming concepts. The application supports user registration, login, post creation, feed display, and the ability to follow other users. It is designed for educational purposes and serves as an example of how to structure a small console-based project.

## Features

- **User Registration and Login:**  
  Create an account with a username and password, and log in with your credentials.

- **Creating Posts:**  
  Users can create text-based posts that are stored and displayed in a global feed.

- **Viewing a Feed:**  
  The feed displays posts from the logged-in user as well as posts from users they follow.

- **Following Users:**  
  Users can follow each other. When a user follows another user, they will see that user's posts on their feed.

- **Basic Social Interactions:**  
  Posts include simple interaction metrics such as a like counter and a comment list.

## Project Structure

- **User.java:**  
  Contains the `User` class that manages user credentials, posts, followers, and following relationships.

- **Post.java:**  
  Contains the `Post` class that manages post content, likes, and comments.

- **UserService.java:**  
  Implements user-related operations such as registration, login, and user lookup using a `HashMap`.

- **PostService.java:**  
  Implements post-related operations, including creating posts and displaying the feed for the user.

- **Main.java:**  
  Contains the `Main` class with the entry point of the application. This class handles user interactions via a text-based menu.

## Getting Started

### Prerequisites

- **Java:**  
  Ensure that you have Java (JDK 8 or later) installed on your system. You can verify your Java installation by running:
  ```bash
  java -version
