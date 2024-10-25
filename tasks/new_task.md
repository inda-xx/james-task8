## 🎮 Task: Develop a Simple Game Application

In this task, you will be designing and building a simple game application. Your game should incorporate player movement, scoring systems, and interactions with enemies. The objective is to create an engaging and interactive game that reads and uses data from files, employs well-structured classes, and demonstrates creative programming skills.

### Learning Goals

- **Using Data from Files to Instantiate Objects**
  - Understand file formats and parsing techniques for data extraction.
  - Utilize file I/O classes to read data, converting it into object attributes.
  - Handle exceptions and ensure data integrity during object instantiation.

- **Designing Classes**
  - Identify class responsibilities and define clear interfaces.
  - Implement cohesive class structures with appropriate fields and methods.
  - Leverage design patterns to solve common problems and enhance class design.

- **Programming Creatively**
  - Explore different approaches to problem-solving and algorithm design.
  - Encourage experimentation and iteration to refine solutions.
  - Integrate user feedback and testing to improve program effectiveness and usability.

---

### 🔍 Exercise 1: Understanding File Formats and Parsing Techniques

**Description**: Investigate different file formats (e.g., CSV, JSON, XML) and parsing techniques. Answer the following questions to solidify your understanding:

1. What are the advantages and disadvantages of using CSV, JSON, and XML for storing game data?
2. How would you approach parsing data from a JSON file in Java? Describe the process step-by-step.

**Deliverable**: Submit a written report detailing your findings and answers.

--- 

### 📜 Exercise 2: Designing Class Structures with Clarity

**Description**: Explore the principles of class design. Consider the following situations and offer your design solutions:

1. You need to design a `Player` class and an `Enemy` class for your game. What fields and methods should each class have? Why?
2. How can design patterns like Singleton or Factory be useful in your game application? Provide an illustrative example.

**Deliverable**: Create UML diagrams for the `Player` and `Enemy` classes, accompanied by a brief textual explanation.

---

### 🛠 Exercise 3: Implementing File-Based Object Instantiation

**Description**: Write code to read game configuration data from a file and instantiate game objects accordingly.

1. Create a `GameConfigReader` class that reads a JSON file containing player and enemy data.
2. Implement methods for parsing the file and using the data to instantiate `Player` and `Enemy` objects.

**Code Snippet**:

```java
public class GameConfigReader {
    private List<Player> players;
    private List<Enemy> enemies;

    public GameConfigReader(String filename) {
        // Implement file reading and parsing logic here
    }

    // Additional methods to return players and enemies
}
```

**Deliverable**: Submit the code along with a JSON sample file used.

---

### 🕹 Exercise 4: Implementing Basic Game Mechanics

**Description**: Develop basic functionalities involving player movement and scorekeeping.

1. Implement player movement logic within the `Player` class.
2. Design a scoring system that tracks player points, potentially stored in a `ScoreTracker` class.
3. Ensure player movements and scoring updates are reflected in real-time.

**Code Snippet**:

```java
public class Player {
    private int xPosition;
    private int yPosition;
    private int score;

    public void move(String direction) {
        // Implement movement logic based on direction
    }

    public void updateScore(int points) {
        // Update score logic
    }
}

// Continue with appropriate methods and logic as necessary.
```

**Deliverable**: Code implementation and demonstration via screenshots or a short video.

---

### ⚔️ Exercise 5: Advanced Enemy Interactions

**Description**: Implement enemy interaction logic and ensure robust exception handling.

1. Create enemy interaction logic where enemies can "attack" or "evade" the player.
2. Introduce file-driven enemy behavior data to dynamically control enemy actions.
3. Handle exceptions appropriately to avoid game crashes with incorrect file data.

**Code Snippet**:

```java
public class Enemy {
    // Fields for position, behavior, etc.
    
    public void interact(Player player) {
        // Implement logic for enemy interactions with player
    }
    
    // Additional methods as necessary
}
```

**Deliverable**: Code alongside test cases to verify enemy interactions.

---

### 🏆 Exercise 6: Polishing the Game with Creative Solutions

**Description**: Add creative elements to enhance the game's fun factor and user experience.

1. Introduce level progression or power-ups that players can collect.
2. Implement a basic UI using Java Swing or JavaFX for game interactions.
3. Conduct user testing and gather feedback. Use this to iterate your design.

**Deliverable**: A video demo showcasing the game features, along with a report on user feedback and subsequent improvements made.

---

By the end of these exercises, you will have developed a simple, yet engaging game application that showcases your ability to work with files, design effective class structures, and apply creativity in programming. Good luck, and have fun coding! 😊