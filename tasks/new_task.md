# 🎮 Simple Game Application Development

## Task Overview

In this task, you will develop a simple game application featuring player movement, a scoring system, and interactions with enemies. This project will help you master key programming concepts such as using data from files to instantiate objects, designing classes, and programming creatively. You'll progress through a series of exercises that increase in complexity and build upon each other.

### Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Understand file formats and parsing techniques for data extraction.
   - Use file I/O classes to read data and convert it into object attributes.
   - Handle exceptions and ensure data integrity during object instantiation.

2. **Designing Classes**
   - Identify class responsibilities and define clear interfaces.
   - Implement cohesive class structures with appropriate fields and methods.
   - Leverage design patterns to solve common problems and enhance class design.

3. **Programming Creatively**
   - Explore different approaches to problem-solving and algorithm design.
   - Encourage experimentation and iteration to refine solutions.
   - Integrate user feedback and testing to improve program effectiveness and usability.

## Exercises

### Exercise 1: 📘 Understanding the Role of External Data

**Task:** Explain the significance of using data from files in game development. Discuss how external data can be used to instantiate objects dynamically in a game application.

**Guiding Questions:**
- Why is it beneficial to read game configuration data or game levels from external files?
- How can you ensure the data from these files is used effectively within game objects?

**Expected Output:** A brief essay (300 words) explaining file usage in game development, highlighting the advantages and potential pitfalls.

### Exercise 2: 📜 Theoretical Class Design

**Task:** Outline a class design for a simple game involving a player, enemies, and a scoring system. Focus on identifying class responsibilities and defining interfaces.

**Guiding Questions:**
- What responsibilities should the `Player`, `Enemy`, and `Score` classes have?
- How should these classes interact with each other?

**Expected Output:** A class diagram or detailed description of the class structure and interactions.

### Exercise 3: 🗃 Reading Game Data from Files

**Objective:** Use data from a file to instantiate game objects.

**Task:** Implement a `GameDataLoader` class to read player and enemy data from a file, then use this data to create a list of `Player` and `Enemy` objects.

```java
public class GameDataLoader {
    public static List<Player> loadPlayers(String filename) { /* Implementation */ }
    public static List<Enemy> loadEnemies(String filename) { /* Implementation */ }
}
```

**Hints:**
- Consider using a CSV format for the file data.
- Handle potential file I/O exceptions properly.

### Exercise 4: 🧩 Implementing Basic Player Movement

**Objective:** Use class design concepts to implement player movement.

**Task:** Create a `Player` class with methods for player movement. Implement basic movement functionalities such as `moveLeft()`, `moveRight()`, `jump()`, and `crouch()`.

```java
public class Player {
    private int xPosition;
    private int yPosition;
    
    public void moveLeft() { /* Implementation */ }
    public void moveRight() { /* Implementation */ }
    public void jump() { /* Implementation */ }
    public void crouch() { /* Implementation */ }
}
```

**Hints:**
- Use integer variables to track the player's position.
- Ensure that boundary conditions are respected (e.g., the player shouldn’t move off-screen).

### Exercise 5: 🎯 Scoring System Integration

**Complexity:** Moderate

**Objective:** Enhance the game with a scoring system that is affected by player actions and interactions.

**Task:** Create a `Score` class and integrate it with player actions. Update the score based on predefined rules, such as collecting items or defeating enemies.

```java
public class Score {
    private int currentScore;

    public void addPoints(int points) { /* Implementation */ }
    public void reset() { /* Implementation */ }
}
```

**Step-by-Step:**
1. Define rules for scoring in your game.
2. Implement the `addPoints()` method to update the score.
3. Make sure the `Player` class can interact with the `Score` class to increment scores based on player actions.

### Exercise 6: 🦹‍♂️ Implementing Enemy Interaction

**Complexity:** High

**Objective:** Create and integrate enemies that interact with the player dynamically.

**Task:** Develop an `Enemy` class and design interactions with the player. Implement features such as chasing the player or reducing the player's score on collision.

```java
public class Enemy {
    private int xPosition;
    private int yPosition;

    public void chasePlayer(Player player) { /* Implementation */ }
}
```

**Step-by-Step:**
1. Define enemy behavior and movement patterns.
2. Implement collision detection with the player.
3. Integrate these interactions within the game loop, considering both the player's and enemies' positions.

**Hints:**
- Use a simple algorithm for chasing, such as moving towards the player's position.
- Carefully test the interaction logic to ensure smooth gameplay.

### Submission and Testing Guidelines

1. **Code Quality:** Ensure that your code is well-documented, with comments explaining key sections.
2. **Testing:** Perform thorough testing of each component individually and as part of the whole game system.
3. **Feedback Loop:** Gather feedback on your game’s functionality and user experience, and iteratively improve the application based on this feedback.

This structured progression will guide you through the creation of a simple yet functional game application. Engage with the exercises creatively and utilize the learning points provided to enhance your development skills. Good luck, and most importantly, have fun! 🎉