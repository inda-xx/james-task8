![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-BvcE5UmLWQB3kELNpWk4CvfZ.png?st=2024-11-01T13%3A21%3A15Z&se=2024-11-01T15%3A21%3A15Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-01T01%3A25%3A08Z&ske=2024-11-02T01%3A25%3A08Z&sks=b&skv=2024-08-04&sig=vhHcLJe00dtcYWTAsFIO/e6XUrfyJNuo6II7wASvbQU%3D)

## 🎮 Create a Simple Game Application

### Overview

In this task, you will develop a simple game application that encompasses several fundamental programming concepts. The game will include functionalities such as player movement, a scoring system, and interactions with enemies. Through this task, you will explore using data from files to instantiate objects, designing classes efficiently, and creatively programming a cohesive game system.

### Learning Objectives

1. **Using Data from Files to Instantiate Objects**
   - Understand file formats and parsing techniques for data extraction.
   - Use file I/O classes to read data and convert it into object attributes.
   - Handle exceptions and ensure data integrity during object instantiation.

2. **Designing Classes**
   - Identify class responsibilities and define clear interfaces.
   - Implement cohesive class structures with appropriate fields and methods.
   - Leverage design patterns to enhance class design.

3. **Programming Creatively**
   - Explore different approaches to problem-solving and algorithm design.
   - Encourage experimentation and iteration to refine solutions.
   - Integrate user feedback and testing to improve program effectiveness and usability.

### Task Breakdown

---

#### 🌱 Exercise 1: Understanding File I/O and Object Instantiation (Conceptual)

**Objective:** Deepen your understanding of how to read data from files and use it to instantiate objects.

1. **Question:** Explain the process of reading a file in Java and converting its data into objects. Discuss file formats and parsing techniques.
2. **Question:** What are the common exceptions you might encounter when working with file I/O in Java, and how can you handle them?

*No coding is required in this exercise. Focus on the theoretical aspects.*

---

#### 🗂️ Exercise 2: Class Design Principles (Conceptual)

**Objective:** Explore the principles of designing robust and maintainable classes.

1. **Question:** What are the key principles of effective class design in Java? How do design patterns contribute to this process?
2. **Question:** Explain the importance of encapsulation and clear interfaces in object-oriented programming.

*This exercise is about developing a solid conceptual understanding.*

---

#### 💻 Exercise 3: Initial Game Setup – Player and Enemy Classes

**Objective:** Implement basic classes for the player and enemies, utilizing data from files for instantiation.

- **Task:** Create a `Player` class and an `Enemy` class with attributes such as name, position, and health.
- **Implementation:** Read player and enemy details from separate files (e.g., `player.txt` and `enemies.txt`) at the start of your program and instantiate objects accordingly.
  
```java
public class Player {
    private String name;
    private int positionX;
    private int positionY;
    private int health;

    public Player(String name, int positionX, int positionY, int health) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.health = health;
    }
    
    // Getters, setters, and other methods
}
```

*This exercise integrates file I/O with object instantiation.*

---

#### 🎮 Exercise 4: Scoring System

**Objective:** Implement a simple scoring system for the game.

- **Task:** Create a `Score` class that tracks the player's score. The score should be updated based on interactions with enemies (e.g., defeating an enemy adds points).
  
```java
public class Score {
    private int score;

    public Score() {
        this.score = 0;
    }

    public void addPoints(int points) {
        this.score += points;
    }

    public int getScore() {
        return score;
    }
}
```

*Here, focus on designing the class with appropriate methods to update the score.*

---

#### 🧩 Exercise 5: Implementing Player Movement and Enemy Interaction

**Objective:** Add functionality for player movement and interactions with enemies.

- **Task:** Define methods in the `Player` class to move in different directions (e.g., up, down, left, right).
- **Task:** Implement interactions between the player and enemies, affecting health and score.

```java
public void move(String direction) {
    switch (direction.toLowerCase()) {
        case "up":
            positionY -= 1;
            break;
        case "down":
            positionY += 1;
            break;
        case "left":
            positionX -= 1;
            break;
        case "right":
            positionX += 1;
            break;
    }
}

// Example interaction method
public void interactWithEnemy(Enemy enemy) {
    if (isCollidingWith(enemy)) {
        // Reduce player health or enemy health based on game logic
        // Update score if enemy is defeated
    }
}

// Define collision logic
private boolean isCollidingWith(Enemy enemy) {
    return this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY();
}
```

*This exercise builds upon previous classes and adds gameplay mechanics.*

---

#### 🎨 Exercise 6: Creative Expansion – Power-ups and Advanced Features

**Objective:** Encourage creativity by expanding the game with additional features.

- **Task:** Introduce a `PowerUp` class that players can collect to temporarily enhance their abilities (e.g., increase speed, gain extra health).
- **Task:** Incorporate new enemy types with unique behaviors or strengths.
- **Task:** Design and implement a basic game loop that runs continuously, updating the game state.

```java
public class PowerUp {
    private String type;
    private int duration; // Effect duration

    public PowerUp(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    // Methods to apply power-up effects
}

// Simplified game loop
while (gameIsRunning) {
    player.move(getPlayerInput());
    player.interactWithEnemy(enemy);
    // Handle power-ups and enemy behavior
    // Render game state to the user
}
```

*This final exercise challenges you to integrate multiple components creatively.*

---

### ✅ Submission Checklist

- Understand the process of using data from files for object instantiation.
- Demonstrate well-structured class design with clear responsibilities and interfaces.
- Apply creative thinking to expand game functionalities beyond the basics.
- Ensure your code is well-documented and handles exceptions gracefully.

By completing these exercises, you'll gain valuable hands-on experience in designing and implementing a simple game, which can serve as a foundation for more complex projects in the future. Enjoy the process and have fun with the creative expansion of your game! 🕹️